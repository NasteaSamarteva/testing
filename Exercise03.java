package dz1;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner ipt=new Scanner(System.in);
        System.out.println("entrt string");
        String asd=ipt.nextLine();
        asd=asd.replace(" ","");
        int vowel=0;
        int cons=0;
        char[] str=asd.toCharArray();
        for (int i=0;i<asd.length();i++){
            if(str[i]=='A'||str[i]=='O'||str[i]=='U'||str[i]=='E'||str[i]=='I'||str[i]=='a'||str[i]=='o'||str[i]=='u'||str[i]=='e'||str[i]=='i') vowel++;
            else cons++;

        }
        System.out.println("glasnaia"+vowel);
        System.out.println("solasnaia"+cons);

    }
}

