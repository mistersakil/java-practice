public class Node {
    int data;
    Node next;
    Node(){
        this.data = 0;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }

}
