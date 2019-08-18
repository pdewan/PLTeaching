package pass.weka;

import pass.AnAbstractPassModel;
import pass.PassModel;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Attribute;
import weka.core.FastVector;

public class AWekaPassModel extends AnAbstractPassModel{
	Classifier classifier;	
	public static final String TRUE = "true";
	public static final String FALSE = "false";
	public static String resultAttributeName = "pass";
	public static String[] resultValueNames = {TRUE, FALSE};
	public static String[] featureNames = {"totalScore", "finalScore"};
	public AWekaPassModel (Classifier aClassifier, String aWekaFile) {
		classifier = aClassifier;
		WekaUtil.buildTreeModel(aClassifier, aWekaFile);
	}
	@Override
	public boolean isPass() {
		double[] anInputFeatureValues = {getTotalScore(), getFinalScore()};
		String aResultString = WekaUtil.predictString(classifier, featureNames, anInputFeatureValues, resultAttributeName, resultValueNames);
		return TRUE.equals(aResultString)?true:false;		
	}
	public static void main(String[] args) {
		PassModel aPassModel = new AWekaPassModel(new J48(), "modelData/passExamples.arff");
		aPassModel.setTotalScore(65);
		aPassModel.setFinalScore(60);
		System.out.println(aPassModel.isPass());
		aPassModel.setTotalScore(30);
		aPassModel.setFinalScore(30);
		System.out.println(aPassModel.isPass());
		aPassModel.setTotalScore(100);
		aPassModel.setFinalScore(100);
		System.out.println(aPassModel.isPass());
	}
}
