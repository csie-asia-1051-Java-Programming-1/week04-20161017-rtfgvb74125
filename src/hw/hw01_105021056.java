package hw;
/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )
1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 105021056 ���a��
 */
import java.util.Scanner;
public class hw01_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int a = 1;
		int b = 0;
		int sum = 1;
		for(int i = 0;i<v1;i++){
			
			System.out.print(sum);
			sum = a+b;
			
			b = a;
			a = sum;
					
		}
		

	}

}
