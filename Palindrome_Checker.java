import java.util.Scanner;
public class Palindrome_Checker {
    public static boolean isPalindrome(String word){
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter word/phrase:");
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("the  word"+" "+ s +" "+"is palindrome");
        }
        else{
            System.out.println("the  word"+" "+ s +" "+"is not Palindrome");
        }

    }
}
