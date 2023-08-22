package Temptofarenheit;

import java.util.Scanner;

public class Temp2faren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temperature in celcius : ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in farenheit is :\n" + tempF);

    }
}
