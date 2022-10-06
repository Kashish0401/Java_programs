package LeetCode_Solutions.DoublyLinkedList;

class MyLinkedList {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head=tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size)
            return -1;
        Node p=head;
        for(int i=0;i<=index-1;i++){
            p=p.next;
        }
        return p.element;
    }
    
    public void addAtHead(int val) {
        Node newest= new Node(val,null);
        if(size==0){
            tail=newest;
        }
        else{
            newest.next=head;
        }
        head=newest;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newest= new Node(val,null);
        if(size==0){
            head=newest;
        }
        else{
            tail.next=newest;
        }
        tail=newest;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)
            return;
        if(index==0){
            addAtHead(val);
        }
        else if(index==size){
            addAtTail(val);
        }
        else{
            Node newest= new Node(val,null);
            Node p=head;
            for(int i=0;i<index-1;i++){
                p=p.next;
            }
            newest.next=p.next;
            p.next=newest;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)
            return;
        if(size==1){
            head=tail=null;
            size--;
        }
        else if(index==0){
            head=head.next;
            size--;
        }
        else{
            Node p=head;
            for(int i=0;i<index-1;i++){
                p=p.next;
            }
            p.next=p.next.next;
            size--;
            if(size==index)
                tail=p;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
