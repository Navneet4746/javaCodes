import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0;
        System.out.println("Enter the numbers of grade:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the grade"+" "+(i+1)+":");
            double grade=sc.nextInt();
            total=total+grade;
        }
        double avg=total/n;
        System.out.println("The Average Grade of the student is:"+avg);

    }
}
