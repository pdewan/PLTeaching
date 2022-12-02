package pass.weka;
import pass.model.MVCPassUtil;
import pass.model.PassModelFactory;
import weka.classifiers.trees.J48;
public class WekaPassMain {
	public static void main (String[] args) {
		PassModelFactory.setPassModel(new AWekaPassModel(new J48(), "modelData/passExamples.arff"));
		MVCPassUtil.startPassMVC();
	}
}
