package com.company;

import java.util.Scanner;

public class dowhile3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=10;
        int x=0;
        while ((a/10)<10 && a>9){
            a = in.nextInt();
            if((a/10)<10 && a>9)
                x=x+(a/10)+a%10;
        }
        System.out.println(x);
    }
}
