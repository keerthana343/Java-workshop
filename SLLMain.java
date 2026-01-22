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
    int findNodeFromEnd(int n){
        Node slow, fast;
            slow = fast = head;

         while(fast.next != null){
              slow = slow.next;
              fast = fast.next;
              if(fast != null)
                fast = fast.next;
            else
                break;
        }
         return n;
}

public class SLLMain{
   public static void main(String[] a){
       SLL sl = new SLL(5);
       sl.append(10);
       sl.append(15);
       sl.printList();
        System.out.println(:"Length: " + sl.length());
   }
}
}