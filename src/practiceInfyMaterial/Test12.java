package practiceInfyMaterial;

public class Test12 {
	public void display(String str) {
		System.out.println("String.."+str);
	}
	public void display(Object str) {
		System.out.println("Object.."+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test12 t1=new Test12();
		t1.display(t1);
		t1.display("abc");
		t1.display(null);
		

	}

}
