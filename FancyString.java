/*
1957. Delete Characters to Make Fancy String
Difficulty: Easy
Link: https://leetcode.com/problems/delete-characters-to-make-fancy-string/
 */
public class FancyString {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0)).append(s.charAt(1));

        for (int i = 2; i < s.length(); i++) {
            char a = s.charAt(i - 2);
            char b = s.charAt(i - 1);
            char c = s.charAt(i);
            if (c != a || c != b) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
