package test09;
/*
  ��һ���ַ���"woaijavahahajavaaiwo"
  ɾ�����ַ��������е�"java"����ͳ��ɾ���˶��ٸ���java
 */
public class Test {

	public static void main(String[] args) {
		String string = "woaijavahahajavaaiwo";
		deleteSubstring(string);
	}
	private static void deleteSubstring(String string) {
		//ɾ������java
		String delete = string.replace("java", "");
		//����ɾ�˶��ٸ�
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
