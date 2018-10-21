package inteface;

public class Sbi implements Rbi,Nabard{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi b1=new Sbi();
		b1.debitcard();
		b1.fundtransfer();
		b1.fixeddeposit();
		b1.creditcard();
		
		Rbi b2=new Sbi();
		b2.debitcard();
		b2.fundtransfer();
		b2.fixeddeposit();
		
		Sbi b3=new Sbi();
		b3.kisanbima();
		b3.kisancreditcard();
	}

	@Override
	public void fundtransfer() {
		// TODO Auto-generated method stub
		System.out.println("fund transfer");
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		System.out.println("debit card");
	}

	@Override
	public void fixeddeposit() {
		// TODO Auto-generated method stub
		System.out.println("fixeddeposit");
	}
	public void creditcard() {
		System.out.println("Credit Card");
	}

	@Override
	public void kisancreditcard() {
		// TODO Auto-generated method stub
		System.out.println("kisancreditcard");
	}

	@Override
	public void kisanbima() {
		// TODO Auto-generated method stub
		System.out.println("kisanbima");
	}

}
