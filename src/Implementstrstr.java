
public class Implementstrstr {

	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		String target = "For";
		System.out.println(strstr(str,target));
	}

	static int strstr(String str, String target) {
		int result = 0;
		int n = str.length();
		int m = target.length();
		for(int i =0 ;i<=n-m;i++) {
			for(int j = 0;j<m;j++) {
				if(str.charAt(i+j) != target.charAt(j)) {
					break;
				}
				if(j == (m-1)) {
					result =  i;
					return result;
				}
			}
		}
		return result = -1;
	}
}
