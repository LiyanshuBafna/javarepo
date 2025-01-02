import java.io.*;
import java.lang.*;
import java.util.*;
public class MultiplicationTable{
    public static void main(String ar[]){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table:");
        int num=Sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
}