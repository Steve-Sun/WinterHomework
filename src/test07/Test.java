package test07;
/*
  Hello12345World6789012"�����������滻��
  String�෽��replaceAll(�������,�滻������ַ���)
 */
public class Test {

	public static void main(String[] args) {
		String s = "Hello12345World6789012";
		String regex = "[0-9]";
		//�滻����ƥ����
		String result = s.replaceAll(regex, "");
		System.out.println(result);
	}

}
