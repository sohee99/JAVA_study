package Java_study.generic.Inherit_Implement;

    public interface Storage<T> {
        void add(T item, int index);

        T get(int index);
    }
