package dz1;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner ipt=new Scanner(System.in);
        int number;
        int firstDigit;
        int lastDigit;
        int lenght;
        do {
            System.out.println("Enter a three-digit number:");
           number=ipt.nextInt();
           lenght=String.valueOf(number).length();
        }
        while(3!=lenght);{
            firstDigit=number/100;
        lastDigit=number%10;}

        if (firstDigit==lastDigit){
            System.out.println("polismom");
        }
        else System.out.println("ne polismom");
    }
}
