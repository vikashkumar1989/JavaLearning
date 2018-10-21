package practiceInfyMaterial;

enum Designation {
	TE(500),TA(200),TL(100),PM(10),SPM(5),DM(2);
	private int noOfENmployee;

	private Designation(int noOfENmployee) {
		this.noOfENmployee = noOfENmployee;
	}

	public int getNoOfENmployee() {
		return noOfENmployee;
	}
	
	

}
