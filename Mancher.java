public class Mancher {
    public static String longestPalindrome(String s)
    {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        StringBuilder sb = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            sb.append(c);
            sb.append('#');
        }
        int n = sb.length();
        int[] p = new int[n];

        int center = 0, right = 0;
        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            int a = i + (1 + p[i]);
            int b = i - (1 + p[i]);
            while (a < n && b >= 0 && sb.charAt(a) == sb.charAt(b)) {
                p[i]++;
                a++;
                b--;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > end - start) {
                start = (i - p[i]) / 2;
                end = start + p[i];
            }
        }
        return s.substring(start, end);
}
public static void main(String[] args) {
    String s = "babad";
    System.out.println(longestPalindrome(s));
}

}
