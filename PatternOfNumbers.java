import java.io.*;
import java.lang.*;
import java.util.*;
public class PatternOfNumbers{
    public static void main(String ar[]){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=Sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        Sc.close();
    }
}