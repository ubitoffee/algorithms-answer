public class ThePalindrome {
    public int find(String s) {
       	for (int i = 0; i < s.length(); i++) {
            if (i >= s.length() - i - 1) {
                break;
            }
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                s += s.charAt(i);
            }
        }
        
        return s.length();
    }
}
