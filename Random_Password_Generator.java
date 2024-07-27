import java.util.Random;
import java.util.Scanner;

public class Random_Password_Generator {
    private static final String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final  String lower= "abcdefghijklmnopqrstuvwxyz";
    private static final String Digits="0123456789";
    private static final String All_Characters  ="!@#$%^&*()-_+=";
    private static final String charSet=Upper+lower+Digits+All_Characters;
    public static String generatePassword(int length) {
        if(length<4){
            throw new IllegalArgumentException("Password length must be at least 4 to include all required character types.");

        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random();
        password.append(Upper.charAt(random.nextInt(Upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(Digits.charAt(random.nextInt(Digits.length())));
        password.append(All_Characters.charAt(random.nextInt(All_Characters.length())));

        for (int i = 3; i < length; i++) {
            int index = random.nextInt(charSet.length());
            password.append(charSet.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of password you want:");
        int length = sc.nextInt();
        String randomPassword = generatePassword(length);
        System.out.println("Generated Random Password: " + randomPassword);
      }
}
