package List3;

public class DoubleLinkedList {
    // ================= Attributes ================
    Node head;
    Node tail;
    private int size;

    // ================= Constructor ================
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // ================= Getter && Setter ================
    // ================= Methods ================

    public boolean isEmpty() {
        return this.size == 0;
        // return this.head == null;
        // return this.tail == null;
    }

    // add 1 node at the first of the double linked list
    public void addFirst(int x) {
        Node newNode = new Node(x);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    // add 1 node at the last of the double linked list
    public void addLast(int x) {
        Node newNode = new Node(x);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    // add 1 node before k
    public void beforeK(int x, int k) {
        if (k < 0 || k > this.size) {
            System.out.println("INVALID INDEX");
            return;
        }
        if (k == 0) {
            this.addFirst(x);
            return;
        }
        if (k == this.size) {
            this.addLast(x);
            return;
        }
        Node current = this.head;
        int c = 0;
        while (current != null) {
            current = current.next;
            c++;
            if (c == k) {
                Node newNode = new Node(x);
                current.prev.next = newNode;
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev = newNode;
                this.size++;
            }
        }
    }

    // add 1 node after k
    public void afterK(int x, int k) {
        if (k < 0 || k > this.size - 1) {
            System.out.println("INVALID INDEX");
            return;
        }
        if (k == 0) {
            this.addFirst(x);
            return;
        }
        if (k == this.size - 1) {
            this.addLast(x);
            return;
        }
        Node current = this.tail;
        int c = 0;
        while (current != null) {
            current = current.next;
            c++;
            if (c == k) {
                Node newNode = new Node(x);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
                this.size++;
            }
        }
    }

    // browse the linked list
    public void traverse() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

}
