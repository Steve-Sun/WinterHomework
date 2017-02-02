package test03;

import java.util.Scanner;

/*
  分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，
	其它字符用"*"代替,并统计字母的个数
		举例:
			键盘录入：Hello12345World
			输出结果：hELLO*****wORLD
					  总共10个字母
 */
public class Test {

	public static void main(String[] args) {
		StringBuffer input = inputString();
		changeCaseOfString(input.toString());
	}
	
	//大小写转换,其他用*填充
	private static void changeCaseOfString(String inputString) {
		StringBuffer string = new StringBuffer();
		int count = 0;
		for (int i=0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i); 
			if (ch>='A' && ch<='Z') {
				string.append((ch + "").toLowerCase());
				count++;
			} else if (ch>='a' && ch<='z') {
				string.append((ch + "").toUpperCase());
				count++;
			} else {
				string.append("*");
			}
		}
		System.out.println(string.toString());
		System.out.println("总共"+count+"个字母");
		return;
	}
	
	//循环输入
	private static  StringBuffer inputString() {
		StringBuffer string = new StringBuffer();
		Scanner sc = new Scanner(System.in);
        String str=null;  
		while (true) {
			System.out.println("请输入字符串 ："); 
			String input = sc.nextLine(); 
			if (input.equals("end")) {
				System.out.println("输入结束");
				break;
			}
			string.append(input);
		}
		return string;
	}

}
