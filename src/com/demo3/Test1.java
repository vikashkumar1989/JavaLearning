package com.demo3;

public class Test1 {
	private class Test2{
		private void method1() {
			if(method2()) {
				System.out.println("True Method1");
			}
			else {
				System.out.println("False Method1");
			}	
			
		}
		private boolean method2() {
			return true;
		}
	}
	public void method3() {
		Test2 t2=new Test2();
		t2.method1();
	}

}
