package adt;

public interface QueueADT<E> {
    /**
     * Inserts item at the rear of the queue.
     *
     * @param item the data that is to be stored in the node.
     * @return true when the node is added to the queue.
     */
    //add method inserts item at the rear of the queue
    boolean add(E item);

    // remove method ,removes the entry from the front of the queue and also returns if the queue is empty or not
    E remove();

    //returns the entry at the front of the queue without removing it ; returns null if the queue is empty
    E peek();

    //poll method returns the entry at the front of the queue without removing it.
    E poll();

    //element method  returns the value at the front of the queue without removing it. throws NoSuchElementException if queue is empty
    E element();
}
