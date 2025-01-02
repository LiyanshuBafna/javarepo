import java.lang.*;
import java.io.*;
import java.util.*;
public class SumAndAverage{
	public static void main{String[] args){
		Scanner Sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the five numbers");
		for(int i=0;i<5;i++){
			sum+=Sc.nextInt();
		}
		System.out.println("Sum=" +sum);
		float avg;
		avg=sum/5;
		System.out.println("Average=" +avg);
		Sc.close();
	}
}