package maceraOyunu;

public abstract class Player {
	
	private Inventory inventory;
	private int id;
	private int damage;
	private int health;
	private int money;
	private String name;
	
	public Player(int damage,int health,int money,String name,int id) {
		this.damage=damage;
		this.health=health;
		this.money= money;
		this.name=name;
		this.id=id;
		this.inventory = new Inventory();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Inventory getInventory() {
		return inventory;
	}


	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}


	public int getDamage() {
		return damage + inventory.getWeapon().getDamage();
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getHealth() {
		return health + inventory.getArmor().getBlock();
	}


	public void setHealth(int health) {
		if(health <0) {
			this.health=0;
		}else {
			this.health = health;
		}
		
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
	public void charInfo() {
		
		System.out.println("\t\t     "+this.getName()+"\n");
		System.out.println("ID: "+this.getId()+"\t Hasar: "+ this.getDamage()+"\t Saðlýk: "+ this.getHealth()+"\t Para: "+this.getMoney());
		System.out.println("-------------------------------------------------");
	}
	public void charInfo(Weapon weapon) {
		
		System.out.println("\t\t     "+this.getName()+"\n");
		System.out.println("ID: "+this.getId()+"\t Hasar: "+ this.getDamage()+" (+ "+weapon.getDamage()+")"+"\t Saðlýk: "+ this.getHealth()+"\t Para: "+this.getMoney()+" (- "+weapon.getPrice()+")" );
		System.out.println("-------------------------------------------------");
	}
	public void charInfo(Armor armor) {
		
		System.out.println("\t\t     "+this.getName()+"\n");
		System.out.println("ID: "+this.getId()+"\t Hasar: "+ this.getDamage()+"\t Saðlýk: "+ this.getHealth()+" (+ "+armor.getBlock()+")"+"\t Para: "+this.getMoney()+" (- "+armor.getPrice()+")" );
		System.out.println("-------------------------------------------------");
	}
}
