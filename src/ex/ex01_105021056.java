package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex01_105021056 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int sum = 0;
		
		float v1 = 0;
		while(a!=-1){
			sum = sum + a;v1++;
			a = scn.nextInt();
		}
		System.out.println("總和"+sum);
		System.out.println("平均"+sum/v1);
	}
	

}
