package definition;

import adt.QueueADT;

public class MyQueue<E> implements QueueADT<E> {

    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    private boolean addFirst(E item) {
        return true;
    }

    private boolean addAfter(Node<E> node, E item) {
        return true;
    }

    private Node<E> getNode(int index) {
        return null;
    }

    public boolean add(int index, E item) {

    }

    @Override
    public boolean add(E item) {
        //Check for empty queue
        if (front == null){
            rear = new Node<E>(item);
            front = rear;
        }
        else {
            //allocate a new node at the end , store item into it ,
            rear.next = new Node<E>(item);
            rear = rear.next;
        }
        size++;
        return true;

    }

    private E removeFirst() {
        return null;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        if(size==0){
            return null;
        }
        else {
            return  front.data;
        }
    }

    @Override
    public E poll() {
        E item = peek(); //retrieve the item at the front
        if (item == null){
            return null;
        }
        front = front.next;
        size--;
        return item; //return the item at the front of the queue
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append("]");
        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> previous;
        private Node<E> next;

        private Node(E data, Node<E> previous, Node<E> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
        //check on this
        public Node(E item) {

        }

        private E getData() {
            return data;
        }

        private Node<E> getPrevious() {
            return previous;
        }

        private Node<E> getNext() {
            return next;
        }
    }

}
