public class Planidromecheckerapp {

    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";
        boolean isPalindrome = true;
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPlaindrome = input.equals(reversed);
        System.out.println("Input text:" + input);
        System.out.println("Reversed text:" + reversed);
        System.out.println("Is is a palindrome?: " + isPalindrome);
    }
}



