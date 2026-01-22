class Node {
    int data;
    Node next;
    Node Head , Tail ;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    int insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
        return data;
    }
    int append (int data){
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.next = newNode;
            Tail = newNode;
        }
        return data;
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        Node list = new Node(0);
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.append(30);
        list.append(40);

        Node current = list.Head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
