package com.metanit;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 4 числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int result = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.print("Наименьшее: ");
        System.out.println(result);
    }
}
