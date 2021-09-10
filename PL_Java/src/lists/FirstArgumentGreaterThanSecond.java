package lists;

public class FirstArgumentGreaterThanSecond implements TwoArgumentSelector<Integer, Integer> {

	@Override
	public boolean select(Integer argument1, Integer argument2) {
		return argument1 > argument2;
	}
}
