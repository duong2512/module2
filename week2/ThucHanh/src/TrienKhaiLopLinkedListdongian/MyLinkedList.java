package TrienKhaiLopLinkedListdongian;

public class MyLinkedList {
    private int numNodes;
    private Node head;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index,Object data){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index-1 && temp.getNext() != null; i++) {
            temp = this.head.getNext();
        }
        holder = temp.getNext();
        temp.setNext( new Node(data));
        temp.getNext().setNext(holder);
        numNodes++;
    }



}
