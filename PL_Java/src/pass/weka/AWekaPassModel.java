package pass.weka;
import pass.model.AnAbstractPassModel;
import weka.classifiers.Classifier;
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
	public Boolean isPass() {
		double[] anInputFeatureValues = {getTotalScore(), getFinalScore()};
		String aResultString = WekaUtil.predictString(classifier, featureNames, anInputFeatureValues, resultAttributeName, resultValueNames);
		return TRUE.equals(aResultString)?true:false;		
	}
//	public static void main(String[] args) {
//		PassModel aPassModel = new AWekaPassModel(new J48(), "modelData/passExamples.arff");
//		aPassModel.setScores(65.0, 60.0);
//		System.out.println(aPassModel.isPass());
//		aPassModel.setScores(30.0, 30.0);
//		System.out.println(aPassModel.isPass());
//		aPassModel.setScores(100.0, 100.0);
//		System.out.println(aPassModel.isPass());	
//	}
}
