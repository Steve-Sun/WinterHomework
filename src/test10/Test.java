package test10;

import java.util.Scanner;

/*
  输入一个字符串,分别统计出其中英文字母、空格、数字和其它字符的数量
 */
public class Test {

	public static void main(String[] args) {
		String string = inputString();
		countNumber(string);
	}
	
	//统计,用toCharArray方法迭代
	private static void countNumber(String string) {
		int countOfChar = 0;
		int countOfSpace = 0;
		int countOfNumber = 0;
		int countOfOthers = 0;
		char[] charArr = string.toCharArray();
		for (char ch : charArr) {
			if (ch >= 'a' && ch <= 'z' ) {
				countOfChar++;
			} else if (ch >= 'a' && ch <= 'z' ) {
				countOfChar++;
			} else if (ch >= '0' && ch <= '9' ) {
				countOfNumber++;
			} else if (ch == ' ') {
				countOfSpace++;
			} else {
				countOfOthers++;
			}
		}
		System.out.println("共有英文字母："+countOfChar+"个，数字："+countOfNumber
				+"个，空格符"+countOfSpace+"个，其他字符："+countOfOthers+"个");
	}

	//输入字符串
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String string = sc.nextLine();
		return string;
	}
}
