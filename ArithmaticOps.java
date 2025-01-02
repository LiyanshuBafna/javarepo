import java.io.*;
import java.lang.*;
import java.util.*;
public class ArithmaticOps{
    public static void main(String ar[]){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=Sc.nextInt();
        System.out.print("Enter the second number:");
        int b=Sc.nextInt();
        System.out.println("SUM="+(a+b));
        System.out.println("DIFFERENCE="+(a-b));
        System.out.println("PRODUCT="+(a*b));
        System.out.println("DIVISION="+(a/b));
        System.out.println("REMAINDER="+(a%b));
    }
}
