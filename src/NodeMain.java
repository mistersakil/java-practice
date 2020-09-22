public class NodeMain {
    public static void main(String[] args) {
        Node n1 = new Node(11, new Node());
        System.out.println(n1.toString());
        System.out.println(n1.getData());
        System.out.println(n1.getNext());
    }
}

