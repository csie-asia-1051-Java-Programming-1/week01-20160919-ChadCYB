 package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 1050210XX CYB
 */

public class ex01_1050210XX {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println( (new java.util.Scanner(System.in)).nextFloat()*(9f/5f)+32f);
	}
}
