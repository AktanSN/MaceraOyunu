package maceraOyunu;

public abstract class Obstacle {
	
	private String name;
	private int award;
	private int id;
	private int damage;
	private int health;
	
	public Obstacle(String name,int award,int id,int damage,int health) {
		this.name=name;
		this.award=award;
		this.id =id;
		this.damage = damage;
		this.health=health;
		
	}
	
	public void obstacleInfo() {
		System.out.println("\t\t     "+this.getName()+"\n");
		System.out.println("ID: "+this.getId()+"\t Hasar: "+ this.getDamage()+"\t Saðlýk: "+ this.getHealth()+"\t Ödül Para: "+ this.getAward());
		System.out.println("-------------------------------------------------");
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



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		if(health <0) {
			this.health=0;
		}else {
			this.health = health;
		}
		
	}



	public int getAward() {
		return award;
	}



	public void setAward(int award) {
		this.award = award;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
