package lambda;

@FunctionalInterface
public interface Print<T> {
    public void print(T x);
}
