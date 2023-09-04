package byteman.examples;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.jface.text.templates.GlobalTemplateVariables.Date;

import byteman.examples.concurrent.AdderRunnable;
import byteman.examples.concurrent.AddingJoiner;
import byteman.examples.controller.ControllerImpl;
import byteman.examples.mains.AdderMain;
//import byteman.examples.mains.AdderMain;
import byteman.examples.mains.ParallelAdderMain;
import byteman.examples.model.AbstractModel;
import byteman.examples.model.ParallelModel;
import byteman.examples.model.SequentialModel;
import byteman.examples.sorting.MergeSort;
import byteman.examples.view.AppletView;
import byteman.examples.view.TextView;

//import java.util.ArrayList;
//import java.util.LinkedList;

import byteman.tools.exampleTestCases.BytemanRegistry;
import scala.collection.mutable.LinkedList;

public class MyBytemanRegistry implements BytemanRegistry {
	
	@Override
	public Class<?> getMiscClass() {
//		return util.models.AListenableVectorTester.class;
		return BytemanList.class;
//		return ArrayList.class;
//		return HashSet.class;
//		return Thread.class;
//		return List.class;
//		return Date.class;
//		return int[].class;
//		return LinkedList.class;
//		return null;
	}
	@Override
	public Class<?> getMiscMain() {
		return null;
	}

	@Override
	public Class<?> getMergeSort() {
		return MergeSort.class;
//		return null;
	}

	@Override
	public Class<?> getRunnable() {
		return AdderRunnable.class;
//		return null;
	}

	@Override
	public Class<?> getJoiner() {
		return AddingJoiner.class;
//		return null;
	}

	@Override
	public Class<?> getMVCParallelMain() {
		return ParallelAdderMain.class;
//		return null;
	}

	@Override
	public Class<?> getMVCSequentialMain() {
		return AdderMain.class;
//		return null;
	}

	@Override
	public Class<?> getFactorial() {
		return RecursiveFactorial.class;
//		return null;
	}

	@Override
	public Class<?> getSequentialModel() {
//		return null;
		return SequentialModel.class;
//		return AbstractModel.class;
//		return null;
	}

	@Override
	public Class<?> getAppletView() {
		return AppletView.class;
//		return null;
	}

	@Override
	public Class<?> getTextView() {
		return TextView.class;
//		return null;
	}

	@Override
	public Class<?> getController() {
		return ControllerImpl.class;
//		return null;
	}

	@Override
	public Class<?> getParallelModel() {
		return ParallelModel.class;
//		return null;
	}
}
