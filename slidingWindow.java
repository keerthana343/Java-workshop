public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {13, 12, 7, 4, 19, 6};
        int k = 3;
    //     int[] result = maxSlidingWindow(arr, k);
    //     for (int num : result) {
    //         System.out.print(num + " ");
    //     }
    // }
    // public static int[] maxSlidingWindow(int[] nums, int k) {
    //     if (nums == null || k <= 0) {
    //         return new int[0];
    //     }
    //     int n = nums.length;
    //     int[] result = new int[n - k + 1];
    //     int maxIndex = -1;
    //     for (int i = 0; i <= n - k; i++) {
    //         if (maxIndex < i) {
    //             maxIndex = i;
    //             for (int j = i; j < i + k; j++) {
    //                 if (nums[j] > nums[maxIndex]) {
    //                     maxIndex = j;
    //                 }
    //             }
    //         } else if (nums[i + k - 1] >= nums[maxIndex]) {
    //             maxIndex = i + k - 1;
    //         }
    //         result[i] = nums[maxIndex];
    //     }
    //     return result;
    // }
    int curr = 0;
    for(int i = 0; i < k; i++){
        curr += arr[i];
    }
    // System.out.println(curr);
    // for(int i = k; i < arr.length; i++){
    //     curr += arr[i] - arr[i - k];
    //     System.out.println(curr);
    // }
    for (int i = 1; i <=(arr.length-k); i++) {
        // System.out.println(curr);
        curr += arr[i+k-1] - arr[i - 1];
       // System.out.println(curr);
    }
    int maxsum =curr;
    for(int i =0; i <= k; i++){
        if(curr > maxsum){
            maxsum = curr;
        }
    }
    System.out.println(maxsum);
}
}