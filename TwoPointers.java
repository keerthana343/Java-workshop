public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1, 0, 14, 6, 7, 20};
        int target = 13;
        //sort the array if not sorted
        java.util.Arrays.sort(arr);
        int p1 = 0;;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            int sum = arr[p1] + arr[p2];
            if (sum == target) {
                System.out.println("Pair found: (" + arr[p1] + ", " + arr[p2] + ")");
                return;
            } else if (sum < target) {
                p1++;
            } else {
                p2--;
            }
        }
        System.out.println("No pair found");
    }
}
