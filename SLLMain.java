class SLL{
   
   Node head, tail;
   
   SLL(int value){
       Node nn = new Node(value);
       head = tail = nn;
   }
   
   class Node{
       int value;
       Node next;
       
       Node(int value){
           this.value = value;
           this.next = null;
       }
   }
   
   void printList(){
       if(head != null){
           
           Node temp = head;
           while(temp != null){
               System.out.print(temp.value + " ");
               temp = temp.next;
               
           }
       }
       else
           System.out.print("Empty");
   }
   
   void append(int value){
       Node nn = new Node(value);
       
       if(head != null){
           tail.next = nn;
           tail = tail.next;
       }
       else{
           head = tail = nn;
       }
   }
   int length(){
       int len = 0;
       Node temp = head;
       while(temp != null){
           len++;
           temp = temp.next;
       }
       return len;
   }
   //fast node and slow node approach
    void findMiddle(){
        Node slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                System.out.println("Loop exists");
                break;
            }
        }
        // System.out.println(slow.value);
        }
        void createLoop(){
            tail.next = head;
}
//meeting both points at middle node
void findMiddle2(){
    Node meet1, meet2;
    meet1 = meet2 = head;
    int len = length();
    int mid = len/2;
    for(int i=0; i<mid; i++){
        meet2 = meet2.next;
    }
    System.out.println(meet2.value);
}
//reverse a linked list
  int reverseList(int start, int end){
        Node prev = null;
        Node curr = null;
        Node next = null;
        prev = new Node(0);
        prev. next = head;
        for (int i=0; i<start-1; i++){
            prev = prev.next;
        }
        prev =prev.next;
        curr = prev.next;
        next = curr.next;
        for(int i= 0; i< end-start-1; i++){
            next= curr.next;
            curr.next.next = prev.next;
            prev.next = curr.next;
            curr.next = next;
        }
        return 0;
    }
    //   void reverseList(){
    //     Node prev = null;
    //     Node curr = head;
    //     Node next = null;
    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     head = prev;
//finding the kth node from the end
   void findKthFromEnd(int k){
       Node p1, p2;
       p1 = head;
       p2 = head;
       for(int i=0; i<k; i++){
              p1 = p1.next;
       }
         while(p1 != null){
              p1 = p1.next;
              p2 = p2.next;
         }
         if(p2 == null){
            System.out.println("out of bounds");
         }
            System.out.println(p2.value);
   }
}

public class SLLMain{
   public static void main(String[] a){
       SLL sl = new SLL(5);
       sl.append(10);
       sl.append(15);
       sl.append(19);
       sl.append (25);
       sl.printList();
        // System.out.println("Length: " + sl.length());
        // sl.createLoop();
        // sl.findMiddle();
        // sl.reverseList(2, 4);
        // sl.printList();
        System.out.println();
        sl.findKthFromEnd(2);
        
        

}
}
