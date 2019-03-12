public class SinglyLinkedList {
    /**
     * 1）单链表的插入、删除、查找操作；
     * 2）链表中存储的是int类型的数据；
     *
     * Source Author：Zheng
     */

    private Node head = null;

    //SinglyLinkedList
    public static Node createNode(int value) {
        return new Node(value, null);
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public Node findByValue(int value) {
        Node p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }

        return p;
    }

    public void insertTail(int value){
        Node input = new Node(value, null);
        // if head is null -> insert directly
        if (head == null){
            head = input;
            input.next = null;
        } else {
            Node temp = head;
            // find the tail (last one)
            while(temp.next != null){
                // go to next until its own next is null
                temp = temp.next;
            }
            // when temp.next == null
            // perhaps without the following line, it still works
            // input.next = temp.next;
            temp.next = input;
        }
    }

    /**
     * DEMO prototype - 转写，把容易理解的东西放在外面
     * @param p
     * @param value
     */
    public void insertAfter(Node p, int value) {
        Node newNode = new Node(value, null);
        insertAfter(p, newNode);
    }

    public void insertAfter(Node p, Node newNode) {
        if (p == null) return;

        newNode.next = p.next;
        p.next = newNode;
    }


    public static void main(String[]args) {

        SinglyLinkedList link = new SinglyLinkedList();
        System.out.println("hello");

        int data[] = {1,2,5,3,1};

        for(int i = 0; i < data.length; i++){
            //link.insertToHead(data[i]);
            link.insertTail(data[i]);
        }

        // check if insert works
        Node reader = link.head;
        for(int i = 0; i < data.length; i++){
            //link.insertToHead(data[i])
            System.out.println(reader.data);
            reader = reader.next;
        }
    }


}
