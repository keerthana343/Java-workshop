class FenwickTree {
    private int[] tree;
    private int size;

    FenwickTree(int size) {
        this.size = size;
        tree = new int[size + 1];
    }

    //update the value at index
    void update(int index, int value) {
        while (index <= size) {
            tree[index] += value;
            index += index & -index;
        }
    }
    int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }
        return sum;
    }
}
public class FenwickTreeDemo {
    public static void main(String[] args) {
        FenwickTree fenwickTree = new FenwickTree(10);
        fenwickTree.update(1, 1);
        fenwickTree.update(2, 2);
        fenwickTree.update(3, 3);
        fenwickTree.update(4, 4);
        fenwickTree.update(5, 5);
        fenwickTree.update(6, 6);
        fenwickTree.update(7, 7);
        System.out.println(fenwickTree.query(5));
    }
}
