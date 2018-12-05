import java.util.ArrayList;
import java.util.List;

public class algorithm6_10 {
    public static void main(String[] args) {
        // 6.Z字形变换
        /*String str1 = "LEETCODEISHIRING";
        System.out.println(zConvert(str1, 3));
        String str2 = "LEETCODEISHIRING";
        System.out.println(zConvert(str2, 4));*/

        // 7.整数反转
        /*int i1 = 123;
        int i2 = -123;
        int i3 = 120;
        System.out.println(reverse(i1));
        System.out.println(reverse(i2));
        System.out.println(reverse(i3));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/

        // 8.字符串转换整数
        /*System.out.println(myAtoi("019"));*/

        // 9.回文数
        /*System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11));*/

        // 10.正则表达式匹配
        String s1 = "aa";
        String p1 = "a";
        System.out.println(isMatch(s1, p1));

        String s2 = "aa";
        String p2 = "a*";
        System.out.println(isMatch(s2, p2));

        String s3 = "ab";
        String p3 = ".*";
        System.out.println(isMatch(s3, p3));

        String s4 = "aab";
        String p4 = "c*a*b";
        System.out.println(isMatch(s4, p4));

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        System.out.println(isMatch(s5, p5));

    }

    // 6.Z字形变换
    public static String zConvert(String s, int numRows) {
        // 按行排序
        /*if(numRows == 1){
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0;i<Math.min(s.length(), numRows);i++){
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean goingDown = false;
        for(char c:s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows - 1){
                goingDown = !goingDown;
            }
            curRow += goingDown?1:-1;
        }

        StringBuilder ret = new StringBuilder();
        for(StringBuilder row : rows){
            ret.append(row);
        }

        return ret.toString();*/

        // 按行访问
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }

    // 7.整数反转
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 8)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -7)) return 0;

            rev = rev * 10 + pop;
        }

        return rev;
    }

    // 8.字符串转换整数
    public static int myAtoi(String str) {
        return 0;
    }

    // 9.回文数
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    // 10.正则表达式匹配
    public static boolean isMatch(String s, String p) {



        return false;
    }
}