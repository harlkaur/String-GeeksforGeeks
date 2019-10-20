
public class Reversewordsinagivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pqr.mno"; // much.very.program.this.like.i
		reverseWords(str);
	}

	public static void reverseWords(String str) {
		String[] sd = str.split("\\.");
		
		for(int i = sd.length-1;i>0;i--) {
			System.out.print(sd[i] + ".");
		}
		System.out.print(sd[0]);
	}
}
