package final_practice.prog15;

@FunctionalInterface
public interface PredWithException<T> {
    boolean test(T t) throws Exception;
}
