package Class16;

public class Task5 {
    public static void main(String[] args){

        //How would you check if String is palindrome or not?
        //example= aba>true aba
        //example2= Abbc>false cbba
        Task5 task=new Task5();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abac"));
    }

    boolean isPalindrome(String inputStr){
        String reversedStr=reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }

    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
