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
                System.out.println("Cycle detected");
                break;
            }
        }
        // System.out.println(slow.value);
        }
        void createCycle(){
            tail.next = head;
}
//meeting both points at middle node
// void findMiddle2(){
//     Node meet1, meet2;
//     meet1 = meet2 = head;
//     int len = length();
//     int mid = len/2;
//     for(int i=0; i<mid; i++){
//         meet2 = meet2.next;
//     }
//     System.out.println(meet2.value);
// }
}
public class SLLMain{
   public static void main(String[] a){
       SLL sl = new SLL(5);
       sl.append(10);
       sl.append(15);
       sl.append(19);
       sl.printList();
        System.out.println("Length: " + sl.length());
        sl.createCycle();
         sl.findMiddle();
}
}
