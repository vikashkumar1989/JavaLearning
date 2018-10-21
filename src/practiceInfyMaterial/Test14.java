package practiceInfyMaterial;

public class Test14 extends Test13{
	int j=1;
	final int k=102;
	public void getDetails() {
		System.out.println(i+j);
		//k=105;
		//super.k=j;
	}
	Test14(){
		super(1);
		System.out.println("in Test14");
	}
	public static void main(String arg[]) {
		Test14 onj=new Test14();
	}

}
