import java.util.*;

class Node{
    char ch;
    int freq;
    Node left,right;

    Node(char ch, int freq){
        this.ch = ch;
        this.freq = freq ;
        left = right = null;
    }
}
public class HuffmanCoding {
    public static void printCodes(Node root, String code){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.println(root.ch + ": " + code);
            return;
        }
        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }
    public static void HuffmanCoding(int[] charFreq, char[] chars){
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));

        for(int i = 0; i < chars.length; i++){
            pq.add(new Node(chars[i], charFreq[i]));
        }

        while(pq.size() > 1){
            Node left = pq.poll();
            Node right = pq.poll();

            Node newNode = new Node('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }

        Node root = pq.poll();
        printCodes(root, "");
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charFreq = {5, 9, 12, 13, 16, 45};

        HuffmanCoding(charFreq, chars);
    }
}
