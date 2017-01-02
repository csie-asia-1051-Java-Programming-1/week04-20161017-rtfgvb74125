package hw;

/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n

 * 
 * Date: 2016/10/17
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw03_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入數字");
		int v1 = scn.nextInt();
		int sum = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (v1 != 999) {
			v1 = scn.nextInt();
			if (v1 > 0) {
				a++;
			} else if (v1 < 0) {
				b++;
			} else if (v1 == 0) {
				c++;
			}
		}
		System.out.println("正數"+a+"負數"+b+"零"+c);
		System.out.println("請選擇Y/N");
		char ch1 = scn.next().charAt(0);
		if(ch1=='n'||ch1=='N'){
			System.out.println("謝謝使用");
			break;
		}
		}
		
	}
}
