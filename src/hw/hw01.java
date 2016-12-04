package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fun1(n);
	}
	public static void fun1(int x){
		String str ="";
		int sum=0,count=0;
		for(int i=1;i<x;i++){
			sum=0;
			str=""+i;
			int j=i;
			while(sum<x){
				sum+=j++;
				if(sum<x){
					str+="+"+j;
				}
			}
			if(sum==x){
				count ++;
				System.out.println(str);
			}
		}
		if(count==0){
			System.out.println("No");
		}
	}
}
