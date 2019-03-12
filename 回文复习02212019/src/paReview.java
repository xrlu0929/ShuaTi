import java.util.LinkedList;

public class paReview {
    /**
     * make a class for Singly linked list
     * so actually this class should be name as Singly Linked List
     */
    private Node head = null;

    /**
     * Node class is not provided
     */
    public static class Node {
        private int data;

        // singly linked list
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public static Node createNode(int value) {
        return new Node(value, null);
    }

    public void insertAfter(Node p, int value) {
        Node newNode = new Node(value, null);
        insertAfter(p, newNode);
    }

    public void insertAfter(Node p, Node newNode) {
        if (p == null) return;

        newNode.next = p.next;
        p.next = newNode;
    }





    /**
     * this is is the function to use
     */
    public boolean validation(String input){
        boolean result = true;
        LinkedList<Character> inputList = new LinkedList<>();

        int length = input.length();
//        convert to a linkedlist
        for(int i = 0; i < length; i++) {
            inputList.add(input.charAt(i));
            System.out.println(inputList.get(i));
        }



//        fast and slow to find mid
        Node fast;
        Node slow;
        while(){

        }



        return result;
    }

//    private int[] mid(LinkedList<Character> input){
//
//
//        return result;
//    }
//


    public static void main(String[] args) {
        paReview sample = new paReview();
        sample.validation("123");
    }
}
