public class ThePalindrome {
    public int find(String s) {
        int size = s.length();
        String reverse = new StringBuilder(s).reverse().toString();
       	for (int i = 0; i < reverse.length(); i++) {
            String palindrome = s + reverse.substring(reverse.length() - i, reverse.length());
            String half = null;
            String lastHalf = null;
            
            if (palindrome.length() % 2 == 0) {
                half = palindrome.substring(0, (int)(palindrome.length() / 2));
                lastHalf = palindrome.substring((int)(palindrome.length() / 2), palindrome.length());
                lastHalf = new StringBuilder(lastHalf).reverse().toString();
            } else {
                half = palindrome.substring(0, (int)(palindrome.length() / 2));
                lastHalf = palindrome.substring((int)(palindrome.length() / 2) + 2, palindrome.length());
                lastHalf = new StringBuilder(lastHalf).reverse().toString();
            }
                
            if (half.equals(lastHalf)) {
                size = palindrome.length();
                break;
            }
        }
        
        return size;
    }
}
