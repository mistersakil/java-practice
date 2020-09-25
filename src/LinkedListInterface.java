public interface LinkedListInterface {
    boolean push(int data);
    boolean push(int data, int position);
    boolean delete();
    boolean delete(boolean lastIndex);
    boolean delete(long index);
    void get();
    void get(long start);
    void get(long start, long end);
    boolean contains(int data);
    boolean update(int data, long index);
    boolean update(int data, boolean lastIndex);
    boolean update(int data);
    boolean isEmpty();
    long count();
}
