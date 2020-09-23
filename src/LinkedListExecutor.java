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
            Node oldNodes = this.head;
            node.next = oldNodes;
        }
        this.head = node;
        this.totalNodes++;
    }
    public void insertAt(int data, int position){
        int startPosition = 1;
        Node node = new Node(data);
        Node currentNode = this.head;
        while (currentNode.next != null){
            if(startPosition == (position-1)){
                System.out.println("position is " + startPosition + " and its data = "+currentNode.data);
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
        Node currentNode = this.head;
        while (currentNode.next != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);

    }
    public long countTotalNodes(){
        return this.totalNodes;
    }
}

public class LinkedListExecutor {
    public static void main(String[] args) {
        LinkedList liLi1 = new LinkedList();
        liLi1.insert(11);
        liLi1.insert(12);
        liLi1.insert(13);
        liLi1.insertFirst(10);
        liLi1.insertAt(14, 2);
        liLi1.view();
        System.out.println("Total Nodes: "+liLi1.countTotalNodes());

    }
}

