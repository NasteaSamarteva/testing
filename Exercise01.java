package dz1;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        System.out.println("Enter a degree in celsiuc");
        double celsius=inpt.nextDouble();
        double farenheit=(9.0/5.0)*celsius+32.0;
        System.out.println(celsius+ " CELSIUS IS "+farenheit);

    }
}
