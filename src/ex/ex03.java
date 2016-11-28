package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021040 洪聖傑
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入一個正整數:");
		int n=scn.nextInt();
		fun(n);
	}
public static void fun(int a){
	int b=a/2;
	int count=0;
	for(int i=1;i<=b;i++){
		if(a%i == 0){
			System.out.println(i);
			count ++;
		}
	}
	if(count == 1){
		System.out.println("是質數");
	}else{
		System.out.println("不是質數");
	}
  }
}