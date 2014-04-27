public class Test {
	public static void main(String[] args) {
		String s = "";
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				s += "http://www.educator.com/media/lec/learn/calculus-bc-zhu/BC-" + i + "-" + j + "-Tablet-Lec.flv\n";
				s += "http://www.educator.com/media/lec/learn/calculus-bc-zhu/BC-" + i + "-" + j + "-Cam-Lec.flv\n";
			}
		}
		System.out.println(s);
	}
}
