class Node {
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
    }

}
class LinkedList {
    Node head;
    /**
     * To insert new linked list node.
     * At the end.
     * Call push(data) method.
     * @author          Sakil Jomadder
     * @param data      Value to add
     * @return          Boolean true(on success) | false (on failure)
     */
    public boolean push(int data){
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
        return true;
    }
    /**
     * To insert new linked list node.
     * At the beginning.
     * Call push(data,true) method.
     * @author          Sakil Jomadder
     * @param data      Value to add
     *
     */

    private void push(int data, boolean firstIndex){
        Node node = new Node(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    /**
     * To insert node into linked list.
     * In specific position
     * Call push(data,position) method.
     * @author          Sakil Jomadder
     * @param data      Value to add
     * @param position  Where to add
     * @return          Boolean true(on success) | false (on failure)
     */
    public boolean push(int data, int position){
        long totalNodes = this.count();
        if(position <= 1){
           this.push(data,true);
        }else if(position > totalNodes){
            this.notFoundException("INDEX");
            return false;
        }else{
            int pushPosition = 1;
            Node newNode = new Node(data);
            Node currentNode = this.head;
            while (currentNode.next != null){
                if(pushPosition == (position-1)){
                    Node nextNode = currentNode.next;
                    currentNode.next = newNode;
                    newNode.next = nextNode;
                    break;
                }
                currentNode = currentNode.next;
                pushPosition++;
            }
        }
        return true;
    }
    /**
     * To delete linked list all nodes.
     * Call delete method.
     * @author          Sakil Jomadder
     * @return          Boolean True/False
     * @since           2020-09-24
     */
    public boolean delete(){
        this.head = null;
        return true;
    }
    /**
     * To delete linked list last node.
     * Call delete method.
     * @author          Sakil Jomadder
     * @return          Boolean True/False
     * @since           2020-09-24
     */
    public boolean delete(boolean lastIndex){
        long totalLength = this.count();
        long currentNodePosition = 1;
        Node currentNode = this.head;
        if(totalLength == 1){
            this.head = null;
            return true;
        }else if(totalLength <= 0 ){
            this.notFoundException("INDEX");
            return false;
        }
        while (currentNode.next != null){
            if(currentNodePosition == (totalLength-1)){
                currentNode.next = null;
                break;
            }
            currentNode = currentNode.next;
            currentNodePosition++;
        }
        return true;
    }
    /**
     * To delete linked list first node.
     * Call deleteFirstNode method.
     * @author          Sakil Jomadder
     * @return          Boolean True/False
     * @since           2020-09-24
     */
    private boolean deleteFirstNode(){
        long totalLength = this.count();
        if(totalLength < 1){
            this.notFoundException("INDEX");
            return false;
        }
        this.head = this.head.next;
        return true;
    }
    /**
     * To delete node from linked list.
     * Call delete(long index) method.
     * @author          Sakil Jomadder
     * @return          Boolean True(on success)/False(on failure)
     * @param index     Should provide valid position you want to delete
     * @since           2020-09-24
     */
    public boolean delete(long index){
        long totalLength = this.count();
        if(index <= 0 || index > totalLength){
            this.notFoundException("INDEX");
            return false;
        }else if(index == 1){
            return this.deleteFirstNode();
        }else if(index == totalLength){
            return this.delete(true);
        }else{
            long currentIndex = 1;
            Node currentNode = this.head;
            while (currentNode.next != null){
                if(currentIndex == (index - 1)){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
                currentIndex++;
            }
        }
        return true;
    }
    /**
     * To view linked list nodes.
     * Call get method.
     * @author          Sakil Jomadder
     * @since           2020-09-23
     */
    public void get(){
        if(this.isEmpty()) {
            this.notFoundException("LINKED_LIST");
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);

    }
    /**
     * To view linked list nodes.
     * Start with given index till end.
     * Call get method.
     * @author          Sakil Jomadder
     * @since           2020-09-23
     */
    public void get(long start){
        long totalLength = this.count();
        if(start <= 0 || start > totalLength){
            this.notFoundException("INDEX");
        }else {
            Node currentNode = this.head;
            long currentIndex = 1;
            while (currentNode.next != null) {
                if (currentIndex >= start) {
                    System.out.println(currentNode.data);
                }
                currentNode = currentNode.next;
                currentIndex++;
            }
            System.out.println(currentNode.data);
        }

    }
    /**
     * To view linked list nodes.
     * Start and End position should be given.
     * Call get(start,end) method.
     * @author          Sakil Jomadder
     * @return          Void
     * @since           2020-09-23
     */
    public void get(long start, long end){
        long totalLength = this.count();
        if(start <= 0 || start > totalLength || start > end || end > totalLength){
            this.notFoundException("INDEX");
        }else {
            Node currentNode = this.head;
            long currentIndex = 1;
            while (currentNode.next != null) {
                if (currentIndex >= start && currentIndex <=end) {
                    System.out.println(currentNode.data);
                }
                currentNode = currentNode.next;
                currentIndex++;
            }
            if(currentIndex == end)
            System.out.println(currentNode.data);
        }

    }
    /**
     * To count total linked list items.
     * Call count method.
     * @author         Sakil Jomadder
     * @return         Long
     * @since          2020-09-23
     */
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
    /**
     * To check any node available in linked list.
     * Call isEmpty method.
     * @author         Sakil Jomadder
     * @return         Boolean true | false
     * @since          2020-09-23
     */
    public boolean isEmpty(){
        return this.head == null ? true : false;
    }
    private void notFoundException(String errorType){
        String message = "NotFoundException";
        String type = "";
        switch (errorType){
            case "INDEX":
                type = "Index";
                break;
            case "LINKED_LIST":
                type = "LinkedListNode";
                break;
            default:
        }
        System.out.println(type+message);
    }
}

public class LinkedListExecutor {
    public static void main(String[] args) {
        LinkedList liLi1 = new LinkedList();
//        Example Data
//        liLi1.push(11);
        liLi1.push(10);
        liLi1.push(9,1);
//        liLi1.push(7, 1);
//        liLi1.push(6,1);
//        liLi1.push(8,3);
//        liLi1.push(5,-1);
//        liLi1.push(14);
//        liLi1.push(15);
//        liLi1.push(16);
//        liLi1.get();
//        liLi1.delete(1);
//        liLi1.delete(false);
        liLi1.get();
//        liLi1.get(1);
//        liLi1.get(3,5);

        System.out.println("Total Nodes = "+liLi1.count());

    }
}

