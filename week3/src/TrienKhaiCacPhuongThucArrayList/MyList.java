package TrienKhaiCacPhuongThucArrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private  Object elment[];

    public MyList() {
    }

    public MyList(int size, Object[] elment) {
        this.size = size;
        this.elment = elment;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElment() {
        return elment;
    }

    public void setElment(Object[] elment) {
        this.elment = elment;
    }

    public MyList(int capacity){

    }
}
