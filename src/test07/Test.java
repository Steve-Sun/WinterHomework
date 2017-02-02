package test07;
/*
  Hello12345World6789012"将所有数字替换掉
  String类方法replaceAll(正则规则,替换后的新字符串)
 */
public class Test {

	public static void main(String[] args) {
		String s = "Hello12345World6789012";
		String regex = "[0-9]";
		//替换所有匹配项
		String result = s.replaceAll(regex, "");
		System.out.println(result);
	}

}
