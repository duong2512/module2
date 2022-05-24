package TrienKhaiStackSuDungLopLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T elment){
        stack.addFirst(elment);
    }

    public T pop() {
        if (isEmpty()==true) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }




}
