package practice_18.task5;

public interface Matrix<T extends Number> {

    Matrix<T> plus(Matrix<T> other);

    Matrix<T> subtraction(Matrix<T> other);

    Matrix<T> mult(Matrix<T> other);

    T get(int width, int height);

    void set(int width, int height, T value);

    long sum();
}
