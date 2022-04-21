package maceraOyunu;

public class Inventory {
	private Weapon weapon;
	private Armor armor;
	private String[] LocationAwards = {"","",""};
	
	public Inventory() {
		this.weapon= new Punch();
		this.armor= new DefaultArmor();
	}

	

	public String[] getLocationAwards() {
		return LocationAwards;
	}



	public void setLocationAwards(String[] locationAwards) {
		LocationAwards = locationAwards;
	}



	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
