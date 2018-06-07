package by.epam.JB25.lesson4;

public class Task_14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1;
		String str2 = "Hello";
		String str3 = new String(", World");
		String str4 = str2 + str3;

		System.out.println("str2 = " + str2);
		System.out.println("str2 = " + str2);
		System.out.println("str2 = " + str2);

		String str;
		str = "Hellp";
		int len = str.length();

		System.out.println("str = " + str + "; length = " + len);

		String str5 = "one", str6 = "one";
		if (str5.equals(str6)) {
			System.out.println("str5 = str6");
		} else {
			System.out.println("str5 <> str6");
		}

		String str7 = "one", str8 = "one";
		if (str7 == str8) { //true
			System.out.println("str7 = str8");
		} else {
			System.out.println("str7 <> str8");
		}
		
		String str9 = new String("one"), str10 = new String("one");
		if (str9 == str10) { //false
			System.out.println("str9 = str10");
		} else {
			System.out.println("str9 <> str10");
		}
		
	}

}
