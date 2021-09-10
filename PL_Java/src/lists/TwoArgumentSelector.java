package lists;

public interface TwoArgumentSelector<Argumen1Type, Argument2Type> {
	boolean select(Argumen1Type argument1, Argument2Type argument2);
}
