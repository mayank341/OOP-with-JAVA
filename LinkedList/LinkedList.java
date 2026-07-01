public class LinkedList{

    public static class Node{
        int data;
        Node next;
        public Node(int data){ // this is constructor 
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;



    // Methods to add FIRST Node in LinkedList ::

     public void addFirst(int data){
        // step 1 : create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2:Link 
        newNode.next=head;
        //step3: Update head:
        head=newNode;
        
    }
    // Method to Add LAST IN LINKEDLIST ::
    public void addLast(int data){
        // create ned Node :
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        // Step 2 :Link
        tail.next=newNode;

        // step 3:Update tail:
        tail=newNode;
    }

    // Print LinkedList :
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // ADD Specific Node or Middle :
    public void addSpecific(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        if(index==0){
            addFirst(data);
            return;
        }
        while(i<index-1 && temp!=null){
            i++;
            temp=temp.next;
        }
        if (temp == null) {
        System.out.println("Invalid Index");
        return;
    }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String args[]){
LinkedList ll=new LinkedList();
// ll.print();
ll.addFirst(2);
// ll.print();
ll.addFirst(1);
// ll.print();
ll.addSpecific(1, 9);
// ll.print();
ll.addLast(3);
// ll.print();
ll.addLast(4);
ll.print();

    }
}