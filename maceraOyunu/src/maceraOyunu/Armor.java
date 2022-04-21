package maceraOyunu;

public abstract class Armor {
	private int id;
	private int block;
	private int price;
	private String name;
	public Armor(int id, int block, int price, String name) {
		
		this.id = id;
		this.block = block;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		
		System.out.println(this.getName()+"    ID: "+this.getId()+"\t Engelleme: "+this.getBlock()+"\t Para: "+this.getPrice());
		
	}
	
	
}
