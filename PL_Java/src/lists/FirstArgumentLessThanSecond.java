package lists;

public class FirstArgumentLessThanSecond implements TwoArgumentSelector<Integer, Integer> {

	@Override
	public boolean select(Integer argument1, Integer argument2) {
		return argument1 < argument2;
	}
}
