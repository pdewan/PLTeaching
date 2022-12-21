package byteman.examples;

import byteman.tools.exampleTestCases.BytemanRegistry;

public class MyBytemanRegistry implements BytemanRegistry {

	@Override
	public Class<?> getMergeSort() {
		return BytemanMerge.class;
//		return BytemanBubble.class;
	}

	@Override
	public Class<?> getRunnable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getJoiner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getMVCParallelMain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getMVCSequentialMain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getFactorial() {
		return IterativeFactorial.class;
//		return RecursiveFactorial.class;
	}

	@Override
	public Class<?> getSequentialModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getParallelModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getAppletView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getTextView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getController() {
		// TODO Auto-generated method stub
		return null;
	}

}
