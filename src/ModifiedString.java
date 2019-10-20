import java.sql.SQLException;

public class ModifiedString {
	
	static void operate( StringBuffer x, StringBuffer y)
	{
	x.append(y);
	y = x;
	System.out.println(x + "," + y);
	}

	public static void main(String[] args) {
		String str = "aaaaa";
		System.out.println(modified(str));
		int index = 2;
		String foo = "ABCDE";
		foo = foo.substring(3);
		foo = foo.concat("XYZ");
		System.out.println(foo);
		
		StringBuffer x = new StringBuffer("Sun");
		StringBuffer y = new StringBuffer("Java");
		operate(x,y);
		System.out.println(x + "," + y);
	}

	public static long modified(String a) {
		long result = 0;
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length-2; i++) {
			if(ch[i] == ch[i+1]) {
				if(ch[i+1] == ch[i+2]) {
					result++;
					i=i+1;
				}
			}
		}
		return result;
	}

}

class A {void p() throws Exception {}} // 1


class B extends A {B() throws Exception {}} // 2
class C extends A {
	
	C() {}
	
	void p() throws SQLException
	
	{}
	
	
} // 3