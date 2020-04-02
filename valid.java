import java.util.Arrays;
import java.util.List;
class Valid {
	String[] m = new String[]{"()", "{}", "[]"};
	List<String> list = Arrays.asList(m);
	public boolean isValid(String s){
		if (s == "") {
			return true;
		}
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			char nextChar = (i + 1) < n ? s.charAt(i + 1) : 0;
			String k = "" + c + nextChar;
			if (!list.contains(k) ) {
				return false;
			}
			i++;
		}
		return true;

	}

	public static void main(String[] args) {
		Valid valid = new Valid();
		System.out.println(valid.isValid("()()"));
	}
}