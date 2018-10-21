package practiceInfyMaterial;

public class Test18 {
	static String name;
	static int age;
	static{
		name="Virat";
	}
	static int getage() {
		age=30;
		return age;
	}

	public static void main(String[] args) {
		new Test18();
		// TODO Auto-generated method stub
		System.out.println(Test18.getage()+":"+name);

	}

}
