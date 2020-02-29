public class Main {
    public static void main(String[] args) {
        System.out.println("returning recursive method that returns true if the string is a palindrome and false otherwise \n");
        System.out.println("Is \"a\" a palindrome? " + isPalindrome("a"));
        System.out.println("Is \"Apples\" a palindrome? " + isPalindrome("Apples"));
        System.out.println("Is \"madam\" a palindrome? " + isPalindrome("madam"));
        System.out.println("Is \"Cats\" a palindrome? " + isPalindrome("Cats"));
        System.out.println("Is \"racecar\" a palindrome? " + isPalindrome("racecar"));
        System.out.println("Is \"tocacat\" a palindrome? " + isPalindrome("tacocat"));
    }

    private static boolean isPalindrome(String text) {
        if(text.length() <= 1) {
            return true;
        }
        if(text.substring(0,1).equalsIgnoreCase(text.substring(text.length() - 1))){
            return isPalindrome(text.substring(1,text.length() -1));
        }
        return false;
    }
}
