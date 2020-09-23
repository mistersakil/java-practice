class Node {
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
    }

}
class LinkedList {
    Node head;
    long totalNodes;
    public void insert(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }else{
            Node currentNode = this.head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        this.totalNodes++;
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
        this.totalNodes++;
    }
    public void insertAt(int data, int position){
        int startPosition = 1;
        Node node = new Node(data);
        Node currentNode = this.head;
        if(position ==1){
           this.insertFirst(data);
           return;
        }
        while (currentNode.next != null){
            if(startPosition == (position-1)){
                Node restingNodes = currentNode.next;
                currentNode.next = node;
                node.next = restingNodes;
                break;
            }
            currentNode = currentNode.next;
            startPosition++;
        }
        this.totalNodes++;
    }
    public void view(){
        if(this.isEmpty()) {
            System.out.println("LinkedListNodeNotFound:Total Nodes= " + this.count());
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);

    }
    public long totalNodes(){
        return this.totalNodes;
    }
    public long count(){
        long totalNodes = 0;
        if(this.isEmpty()) {
            return totalNodes;
        }
        if(this.head.next != null){
            Node currentNode = this.head;
            while (currentNode.next != null){
                totalNodes++;
                currentNode = currentNode.next;
            }
        }
        return ++totalNodes;

    }
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }
}

public class LinkedListExecutor {
    public static void main(String[] args) {
        LinkedList liLi1 = new LinkedList();
//        Example Data
//        liLi1.insert(11);
//        liLi1.insert(12);
//        liLi1.insert(13);
//        liLi1.insertFirst(10);
//        liLi1.insertAt(14, 2);
//        liLi1.insertAt(9, 1);
//        liLi1.view();
        System.out.println(liLi1.isEmpty());

    }
}

