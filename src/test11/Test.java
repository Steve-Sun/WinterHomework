package test11;

import java.util.Scanner;

/*
  从控制台接受一串字符串
	(1)将该字符串转换成字符数组
	(2)将该字符数组下标为偶数的字符打印倒控制台
	(3)将该字符数组的第一个元素与最后一个元素互换
 */
public class Test {

	public static void main(String[] args) {
		String input = inputString();
		operateString(input);
	}

	private static void operateString(String input) {
		//(1)将该字符串转换成字符数组
		char[] charArrar = input.toCharArray();
		int index = 0;
		//(2)将该字符数组下标为偶数的字符打印倒控制台
		System.out.println("下标为偶数的元素：");
		for (char ch : charArrar) {
			if (index % 2 == 0) {
				System.out.print(ch + " ");
			}
			index++;
		}
		System.out.println("");
		//(3)将该字符数组的第一个元素与最后一个元素互换
		char c = charArrar[0];
		charArrar[0] = charArrar[charArrar.length - 1];
		charArrar[charArrar.length - 1] = c ;
		System.out.println("第一个元素与最后一个元素互换");
		for (char i : charArrar) {
			System.out.print(i);
		}
	}

	//输入字符串
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String string = sc.nextLine();
		return string;	
	}
	
}
