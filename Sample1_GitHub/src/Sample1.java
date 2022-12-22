public class Sample1 {
	
	public static boolean output(int a,int b) {
		if(a<b) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Havin some files edited");
		boolean op=output(10,22);
		System.out.println(op);
	}

}
