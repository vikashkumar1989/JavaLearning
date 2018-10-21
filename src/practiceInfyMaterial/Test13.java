package practiceInfyMaterial;

public class Test13 {
	int i;
	final int k;
	public void getDetails() {
		System.out.println(i);
	}
	Test13(){
		i=100;
		System.out.println("in Test13");
		k=106;
	}
	//public final void method() {}
	Test13(int p){
		System.out.println("in test13 parametrized "+p);
		k=100;
	}

}
