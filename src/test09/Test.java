package test09;
/*
  有一个字符串"woaijavahahajavaaiwo"
  删除该字符串中所有的"java"并且统计删除了多少个“java
 */
public class Test {

	public static void main(String[] args) {
		String string = "woaijavahahajavaaiwo";
		deleteSubstring(string);
	}
	private static void deleteSubstring(String string) {
		//删除所有java
		String delete = string.replace("java", "");
		//计算删了多少个
		int beginIndex = 0;
		int count =0;
		StringBuffer buffer = new StringBuffer();
		while (string.contains("java")) {
			beginIndex = string.indexOf("java");
			string = string.substring(beginIndex + 4);
			count++;
		}
		System.out.println(delete);
		System.out.println(count);
	}
}
