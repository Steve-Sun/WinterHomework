package test06;
/*
 ���QQ�����Ƿ�Ϸ�(5-10λ��������ɣ�0���ܿ�ͷ)��������ʽ��α�д��
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
