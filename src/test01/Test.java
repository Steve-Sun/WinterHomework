package test01;

import java.util.Scanner;

/*
 分析以下需求，并用代码实现：
	(1)定义如下方法public static String getPropertyGetMethodName(String property);
	(2)该方法的参数为String类型，表示用户给定的成员变量的名字，
	返回值类型为String类型，返回值为成员变量对应的get方法的名字
	(3)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
*/
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the name of varibale :");
		String name = sc.next();
		String getName = getPropertyGetMethodName(name);
		System.out.println(getName);
	}

	private static String getPropertyGetMethodName(String name) {
		String start = name.substring(0,1);
		String end = name.substring(1);
		String big = start.toUpperCase();
		String small = end.toLowerCase();
		return "get"+big+small;
	}
}
