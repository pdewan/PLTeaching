package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import byteman.tools.AbstractBytemanIOTest;
import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.config.BasicStaticConfigurationUtils;
import grader.basics.execution.RunningProject;
import grader.basics.project.BasicClassDescription;
import grader.basics.project.BasicProject;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.CurrentProjectHolder;
import grader.basics.project.Project;
import gradingTools.basics.sharedTestCase.checkstyle.CheckStyleTestCase;
import gradingTools.utils.RunningProjectUtils;
import unc.checks.ComprehensiveVisitCheck;
import unc.symbolTable.STMethod;
import util.trace.Tracer;

public class TestGraderLibs {
	
	public static void testProcessBuilder() {
		Tracer.showInfo(true);
//		Tracer.setBufferTracedMessages(false);
		CurrentProjectHolder.setProject(".java");
		Project aProject = CurrentProjectHolder.getCurrentProject();
		List<String> aCommand = BasicStaticConfigurationUtils.getBasicCommand();
		List<String> aModifiedCommand = new ArrayList(aCommand);
		aModifiedCommand.add("-javaagent:.");
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setGraderBasicCommand(aModifiedCommand);
		
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().setEntryPoint(
				"tests.TestMain");
		RunningProject aRunningProject = RunningProjectUtils.runProject(aProject, 
				100, "");
		aRunningProject.await();
		String anOut = aRunningProject.getOutput();
		System.out.println("got output:" + anOut);
		BasicStaticConfigurationUtils.setBasicCommandToDefaultEntryTagCommand();
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().setEntryPoint(
				null);

		
	}
	
	
	public static void testClassSearch() {
		String[] aTags = BasicClassDescription.getTags(TaggedClass.class);
		System.out.println("Tags" + Arrays.toString(aTags));
		CurrentProjectHolder.setProject(".java");
		Project aProject = CurrentProjectHolder.getCurrentProject();
		Class aClass = BasicProjectIntrospection.findClassByTags("Tag1", "Tag2");		
		System.out.println("Class by Tag" + aClass);		
		aClass = BasicProjectIntrospection.findClassByExistingSupertype(aProject, TaggedInterface.class);				
		System.out.println("Class by Super Type" + aClass);		
		System.out.println(aProject);
	}
	public static void testSignatures() {		
		String aSignature = "add:int;int->int";
		STMethod anSTMethod = ComprehensiveVisitCheck.createMethodFromSignature(aSignature);
		System.out.println(anSTMethod);	
	}
	public static void testSignatures2() {		
		String aSignature = "sort:int\\[\\];int\\[\\]->int\\[\\]";
		String aNormalizedSignature = AbstractBytemanIOTest.removeEscapes(aSignature);
		STMethod anSTMethod = ComprehensiveVisitCheck.createMethodFromSignature(aNormalizedSignature);
		System.out.println(anSTMethod);	
	}
	public static void testClassRegistry() {
		String aConfigurationFileName = "D:\\dewan_backup\\Java\\Comp533\\Andrew533Assignment2\\ClassRegistry.csv";
		Map<String, List<String>> aMap = processConfigurationFileName(aConfigurationFileName);
		System.out.println(aMap);
		
				
	}
	public static Map<String, List<String>> processConfigurationFileName(String aConfigurationFileFullName) {
		  
	    Map<String, List<String>> aClassToConfiguredTags = new HashMap();
	    Scanner aScanner;
	    try {
	      aScanner = new Scanner(new File(aConfigurationFileFullName));
	      
	      while (aScanner.hasNext()) {
	        String aLine = aScanner.nextLine();
	        String[] aLineTokens = aLine.split(",");
	        if (aLineTokens.length != 2) {
	          return null;
	        }
	        String aClass = aLineTokens[0];
	        String aTag = aLineTokens[1];
	        List<String> aTags = aClassToConfiguredTags.get(aClass);
	        if (aTags == null) {
	          aTags = new ArrayList();
	          aClassToConfiguredTags.put(aClass, aTags);
	        }
	        if (!aTags.contains(aTag)) {
	        aTags.add(aTag);
	        }
	      
	        
//	        if (aClass.contains("lient")) {
//	          System.err.println("found class");
//	        }

	      }
	    } catch (FileNotFoundException e) {
	      return null;
	    }
	    return aClassToConfiguredTags;
	  }
	public static void main (String[] args) {
//		testClassSearch();
		testSignatures2();
//		testClassRegistry();
//		testProcessBuilder();
	}

}
