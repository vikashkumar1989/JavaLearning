package practiceInfyMaterial;

public class Test20 {
	enum designation {TE,TA,TL,PM,SPM,DM};
	
	public void roleDefined(designation d) {
		switch(d) {
		case TE:
			System.out.println("Role is :"+d);
			break;
		case TA:
			System.out.println("Role is :"+d);
			break;
		case TL:
			System.out.println("Role is :"+d);
			break;
		case PM:
			System.out.println("Role is :"+d);
			break;
		case SPM:
			System.out.println("Role is :"+d);
			break;
		case DM:
			System.out.println("Role is :"+d);
			break;
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test20 T=new Test20();
		T.roleDefined(designation.TL);

	}

}
