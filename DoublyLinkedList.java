//Student Name: Sarah Mohammed Althobiti  Student ID: 444004881
public class DoublyLinkedList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node( Node<E> p,E e, Node<E> n){
            element = e;
            prev = p;
            next = n;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setPrev(Node<E> p){
            prev = p;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(header,null,null);
        header.setNext(trailer);
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        if(isEmpty()){
            return null;
        }
        return header.getNext().getElement();
    }
    public E last(){
        if(isEmpty()){
            return null;
        }
        return trailer.getPrev().getElement();
    }
    public void print(){
        
     Node<E> c = header.getNext();
     while (c != trailer) {
      System.out.print(c.getElement() + " ");
      c = c.getNext();
     }
     System.out.println();
        
    }
    public void addFirst(E e){
        addBetween(e, header, header.getNext());
    }
    public void addLast(E e){
        addBetween(e, trailer.getPrev(), trailer);
    }
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        return remove(header.getNext());
    }
    public E removeLast(){
        if(isEmpty()){
            return null;
        }
        return remove(trailer.getPrev());
    }
    private void addBetween(E e, Node<E> predecessor, Node<E> successor){
        Node<E> newest = new Node<>(predecessor, e, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    private E remove(Node<E> node){
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
    public boolean isPalidrome(){
        if(isEmpty()){
            return false;
        }
        if(size % 2 == 0){
            System.out.println("not palidrom");
            return false;
        }
        else{
            Node c1 = header.getNext();
            Node c2 = trailer.getPrev();
            while(c1 != c2){
                if(c1.getElement()!= c2.getElement()){
                    return false;
                }else{
                    c1 = c1.getNext();
                    c2 = c2.getPrev();
                }
            }
            return true;
        }
    
    }
    public void printReverse(){
      if(isEmpty()){
        System.out.println("the list is empty");
      }else{
        Node<E> c = trailer.getPrev();
        while(c != header){
            System.out.print(c.getElement()+" ");
            c = c.getPrev();
        }
        System.out.println();
      }
    }

}