/**
 * BracketStack.java
 *
 * Your Name: Feyza Yalçındağ
 * Your Student ID: 250444002
 * Your Date: 26.10.2026
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    public void push(char value) {
        Node newNode = new Node(value) ;
        newNode.next = top ;
        top = newNode ; // the new one will be the top
    }

    //  TODO 2: Remove and return the top element
    public char pop() {
        // stack cı-ould be empty
        if(isEmpty()){
            return '\0'; // boş küme
        }
        else {
            char value = top.data ;
            top = top.next ;
            return value ;
        }
    }
    public char peek() {
        if(isEmpty()){
            return '\0';
        }else{
            return top.data ;
        }
    }
    public boolean isEmpty() {
        return top == null ;
    }
}
