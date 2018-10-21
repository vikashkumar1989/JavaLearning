package practiceInfyMaterial;

public class Chocolate {
	int barcode;
	String name;
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	int Weight;
	int cost;
	public Chocolate(int barcode, String name, int weight, int cost) {
		super();
		this.barcode = barcode;
		this.name = name;
		Weight = weight;
		this.cost = cost;
	}
	public static void main(String[] args) {
		Chocolate c=new Chocolate(123,"abc",456,678);
		System.out.println(c.barcode);
		System.out.println(c.name);
		System.out.println(c.Weight);
		System.out.println(c.cost);
		c.setBarcode(111);
		c.setName("aaa");
		c.setWeight(222);
		c.setCost(333);
		System.out.println(c.getBarcode());
		System.out.println(c.getName());
		System.out.println(c.getWeight());
		System.out.println(c.getCost());
		
	}

}
