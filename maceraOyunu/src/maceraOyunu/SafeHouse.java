package maceraOyunu;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
		
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("-------------------------------------------------");
		if(!isWin(this.getPlayer().getInventory().getLocationAwards())) {
			System.out.println("Oyuncu "+this.getPlayer().getName()+" Güvenli Evdesin...\n");
			System.out.println("Saðlýðýn 18'in Altýna Düþtüðünde Burada \n"+"Can Yenileyebilirsin.\n");
			if(this.getPlayer().getHealth()<18) {
				this.getPlayer().setHealth(this.getPlayer().getHealth()+10);
				System.out.println("+10 Can Yenilendi !\n");
				this.getPlayer().charInfo();
			}
		}
		
		
		if(isWin(this.getPlayer().getInventory().getLocationAwards())) {
			System.out.println("Tebrikler " + this.getPlayer().getName()+" Macerayý Tamamladýn !!!");
			System.out.println("-------------------------------------------------");
			System.out.println("-------------------------------------------------");
			System.exit(0);
		}
		
		return true;
	}
	
	public boolean isWin(String[] awardList) {
		int water=0;
		int food=0;
		int firewood=0;
		
		for(String i: awardList) {
			if(i.equals("Su")) {
				water++;
			}else if(i.equals("Odun")) {
				firewood++;
			}else if(i.equals("Yemek")) {
				food++;
			}
		}
		if(water>0 && food>0 && firewood>0) {
			
			return true;
		}
		return false;
	}

}
