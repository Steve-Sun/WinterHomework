package test02;

import java.util.ArrayList;

/*
 分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称
	(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，
	并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数
	
	提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。
 */
public class Test {

	public static void main(String[] args) {
		String[] strArray = {"010","3223","666","7890987","123123"};
		checkSymmetry(strArray);
	}

	private static void checkSymmetry(String[] strArray) {
		int count = 0;
		for (String string : strArray) {
			//直接倒置check是否相等即可
			StringBuffer checkArray = new StringBuffer();
			checkArray.append(string);
			String check = checkArray.reverse().toString();
			if (string.equals(check)) {
				System.out.println(string+" 是对称的 ");
				count++;
				continue;
				
			}
			System.out.println(string+" 是不对称的 ");
		}
		System.out.println("对称的字符串有 " + count + " 个");
	}

}
