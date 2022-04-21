package maceraOyunu;

public abstract class Weapon {
	private int id;
	private int damage;
	private int price;
	private String name;
	
	

	public Weapon(int id, int damage, int price, String name) {
		this.id = id;
		this.damage = damage;
		this.price = price;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
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
		System.out.println(this.getName()+"\t ID: "+this.getId()+"\t Hasar: "+this.getDamage()+"\t Para: "+this.getPrice());
		
	}
	
	
}
