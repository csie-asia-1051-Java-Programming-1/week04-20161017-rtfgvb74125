﻿package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex03_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i = n;i>=1;i--){
			for(int j = i;j<=n;j++){
				System.out.print("*");
				
			}
		

			
			System.out.println();
		}

	}

}
