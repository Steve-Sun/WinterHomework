package test06;
/*
 检查QQ号码是否合法(5-10位纯数字组成，0不能开头)的正则表达式如何编写？
 */
public class Test {

	public static void main(String[] args) {
		String qqNumber = "1026212820";
		checkQQNumber(qqNumber);
	}

	private static void checkQQNumber(String qqNumber) {
		String regex = "[1-9][0-9]{4,9}";
		System.out.println(qqNumber.matches(regex));		
	}
	
}
