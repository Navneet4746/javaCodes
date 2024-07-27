import java.util.Scanner;
public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Temperature:");
        double tem=sc.nextDouble();
        System.out.println("Enter the unit of Temperature(c for celsius,F for Fahrenheit):");
        String unit=sc.next();
        if(unit.charAt(0)=='c'|| unit.charAt(0)=='C'){
            double convert_temperature1=(tem*9/5)+32;
            System.out.println("The Temperature in Fahrenheit is:"+String.format("%.2f",convert_temperature1)+"f");

        }
        else if(unit.charAt(0)=='f'||unit.charAt(0)=='F'){
            double convert_temperature2=(tem-32)*5/9;
            System.out.println("The Temperature in Celsius is:"+String.format("%.2f",convert_temperature2)+"c");

        }
        else{
            System.out.println("Invalid unit");
        }


    }
}
