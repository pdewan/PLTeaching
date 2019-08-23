package pass.weka;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
public class WekaUtil {	
	public static void buildTreeModel(Classifier aClassifier, String aFile)  {
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(aFile);
			Instances trainingSet = new Instances(new BufferedReader(new InputStreamReader(inputStream)));
			trainingSet.setClassIndex(trainingSet.numAttributes() - 1);
			aClassifier.buildClassifier(trainingSet);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String predictString(Classifier aClassifier, String[] aFeatureNames, 
			double[] anInputFeatureValues, String aResultAttributeName, String[] aResultValueNames) {
		String aPredictedString = null;
		
		Attribute aFeatureAttribute[] = new Attribute[aFeatureNames.length];
		try {
			for (int i = 0; i < aFeatureNames.length; i++) {
				aFeatureAttribute[i] = new weka.core.Attribute(
						aFeatureNames[i]);					
			}			FastVector aResultAttributeValueNames = new FastVector(aResultValueNames.length);
			for (String aResultVaueName:aResultValueNames) {
				aResultAttributeValueNames.addElement(aResultVaueName);
			}
			Attribute aResultAttribute = new Attribute(
					aResultAttributeName, aResultAttributeValueNames);			
			FastVector aFeatureAndResultVector = new FastVector(aFeatureAttribute.length + 1);
			for (weka.core.Attribute aWekaAttribute:aFeatureAttribute) {
				aFeatureAndResultVector.addElement(aWekaAttribute);
			}
			aFeatureAndResultVector.addElement(aResultAttribute);
			weka.core.Instances aTestingSet = new weka.core.Instances("Rel",
					aFeatureAndResultVector, 10); // why 10?
			// Set class index
			aTestingSet.setClassIndex(aFeatureNames.length); // index of result
			// Create the instance
			Instance anInputInstance = new Instance(aFeatureNames.length);
			for (int i = 0; i < aFeatureNames.length; i++) {
				String aFeatureName = aFeatureNames[i];
				double aFeatureValue = anInputFeatureValues[i];
				anInputInstance.setValue(
						(Attribute) aFeatureAndResultVector.elementAt(i),
						aFeatureValue);
			}
			aTestingSet.add(anInputInstance);			
			double aPredictedDouble = aClassifier.classifyInstance(aTestingSet
					.instance(0));
			aPredictedString = aTestingSet.classAttribute().value(
					(int) aPredictedDouble);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aPredictedString;
	}
}
