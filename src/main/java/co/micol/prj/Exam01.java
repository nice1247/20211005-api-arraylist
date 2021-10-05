package co.micol.prj;

public class Exam01 {
	private String str = "20001004"; // yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = " akcd*fg.jsp ";

	void stringTest() {
		System.out.println(str.toString());
		System.out.println(nstr.toString());
		System.out.println(nstr + mstr);

		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(mstr);
		System.out.println(n + m);

		if (str.equals(cstr)) { // str == cstr
			System.out.println(cstr);
		}
		String mm = str.substring(4, 6);
		String dd = str.substring(6);
		System.out.println("귀하의 생일은 " + mm + "월 " + dd + "일 입니다");

		int l = cstr.indexOf(".jsp");
		System.out.println(cstr.substring(0, l));
		System.out.println(cstr.replace("k", "B"));
		System.out.println(cstr.concat("xyz"));
		System.out.println(cstr.toUpperCase());
		System.out.println(cstr.getBytes());
		System.out.println(cstr.trim());

		char c = 'a';
		String cs = String.valueOf(c); // char type을 String type으로 변환
		String s = "a";
		if (s == cs) System.out.println(c);
		
		

	}

}
