package inheritance;

public class Son extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1=new Son();
		s1.method1();
		s1.method2();
		s1.method3();
		Parent p1=new Son();
		Son s=(Son) new Parent();
		p1.method1();
		s.method1();
		s.method2();
		s.method3();
	}
	public void method3() {
		System.out.println("method3");
	}

}
