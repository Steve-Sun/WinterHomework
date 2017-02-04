package test04;

import java.util.Scanner;

/*
  分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)定义一个方法
		public Object[] deleteSubString(String str1,String str2) {
	
		}
	(3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
		* 该数组的第一个元素为删除所有的str2后的最终的字符串
		* 该数组的第二个元素为删除的str2的个数	
 */
public class Test {

	public static void main(String[] args) {
		String input = inputString();
		String delet = deleteString();
		Object[] objectArray = deleteSubString(input,delet);
		
	}

	//定义一个方法public Object[] deleteSubString(String str1,String str2)
	private static Object[] deleteSubString(String input, String delet) {
		Object[] object = new Object[2];
		int beginIndex = 0;
		int count =0;
		String inputString = input;
		while (inputString.contains("java")) {
			beginIndex = inputString.indexOf("java");
			inputString = inputString.substring(beginIndex + 4);
			count++;
		}
		object[0] = input.replaceAll(delet, "");
		object[1] = count;
		return object;
	}

	//输入需要删除的字符串
	private static String deleteString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要删除的字符串：");
		String string = sc.nextLine(); 
		return string;
	}

	//循环输入
	private static  String inputString() {
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
		return string.toString();
	}

}