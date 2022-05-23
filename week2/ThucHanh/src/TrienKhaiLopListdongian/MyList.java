package TrienKhaiLopListdongian;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];


    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size, Object[] element) {
        this.size = size;
        this.element = element;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }

    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }




}
