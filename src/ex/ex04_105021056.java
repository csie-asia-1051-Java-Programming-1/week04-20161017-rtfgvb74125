package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021056 王家恩
 */

import java.util.Scanner;

public class ex04_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = n;
		for (int i = 1;i<=n;i++){
			for(int j = 1;j<=m;j++){
				System.out.print("@");
				
			}

			m--;
			
		}

}
}

