package practiceInfyMaterial;

public class Test19 {
	public int method(int d,int...a) {
		int b = 0;
		for(int c : a) {
			b=b+c;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test19 t=new Test19();
		int k=t.method(1,2,3,2,3);
		System.out.println(k);

	}

}
