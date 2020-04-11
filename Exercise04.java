package Laba3;

import java.util.Scanner;

public class Exercise04 {

        public Exercise04(){

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number");
            int number = in.nextInt();
            System.out.println(number + " reversed :" + revers(number));
        }

        public static int revers(int value) {
            int reverse;
            int o1;
            int o2;
            if (value > 0 && value < 100) {
                o1 = value / 10;
                o2 = value % 10;
                reverse = o2 * 10 + o1;
                return reverse;
            } else {
                int o3;
                if (value >= 100 && value < 1000) {
                    o1 = value / 100;
                    o2 = value % 100 / 10;
                    o3 = value % 10;
                    reverse = o3 * 100 + o2 * 10 + o1;
                    return reverse;
                } else {
                    int o4;
                    if (value >= 1000 && value < 10000) {
                        o1 = value / 1000;
                        o2 = value % 1000 / 100;
                        o3 = value % 100 / 10;
                        o4 = value % 100 % 10;
                        reverse = o4 * 1000 + o3 * 100 + o2 * 10 + o1;
                        return reverse;
                    } else {
                        int o5;
                        if (value >= 10000 && value < 100000) {
                            o1 = value / 10000;
                            o2 = value / 1000 % 10;
                            o3 = value % 1000 / 100;
                            o4 = value % 100 / 10;
                            o5 = value % 100 % 10;
                            reverse = o5 * 10000 + o4 * 1000 + o3 * 100 + o2 * 10 + o1;
                            return reverse;
                        } else if (value >= 100000 && value < 1000000) {
                            o1 = value / 100000;
                            o2 = value / 10000 % 10;
                            o3 = value / 1000 % 10;
                            o4 = value % 1000 / 100;
                            o5 = value / 10 % 10;
                            int o6 = value % 100 % 10;
                            reverse = o6 * 100000 + o5 * 10000 + o4 * 1000 + o3 * 100 + o2 * 10 + o1;
                            return reverse;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
    }

