package test12;

import java.util.Scanner;

/*
  模拟验证手机号的过程，按照以下要求实现相关代码（友情提示：不一定要用正则）
	a.	提示用户在控制台输入手机号，用一个字符串对其进行保存
	b.	判断该手机号位数是否是11位
	c.	判断该手机号，是否都是数字
	d.	判断改手机号最后3为数字如果是相同数字则认为是靓号
 */
public class Test {

	public static void main(String[] args) {
		String phoneNumber = inputString();
		checkNumber(phoneNumber);
	}
	
	//核对手机号是否符合提示规范
	private static void checkNumber(String input) {
		//判断是否为11位数字
		String regex = "[1][0-9]{10}";
		if (input.matches(regex)) {
			System.out.println("该手机号合规");
			char a = input.charAt(8);
			char b = input.charAt(9);
			char c = input.charAt(10);
			if (a == b && a == c) {
				System.out.println("该手机号为靓号");
			}
		} else {
			System.out.println("该手机号不合规");
		}
	}

	//输入手机号
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号：");
		String string = sc.nextLine();
		return string;	
	}
	
}
