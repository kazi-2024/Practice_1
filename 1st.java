package beginnerjava;

import java.util.Scanner;

public class C_To_F_TemperatureConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F;

        System.out.print("Enter Temperature in Celsius : ");
        C = input.nextDouble();
        F = (1.8 * C) + 32;
        System.out.println("Temperature in Fahrenheit : "+F);
        

    }

}