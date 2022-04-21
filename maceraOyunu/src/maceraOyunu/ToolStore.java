package maceraOyunu;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player, "Maðaza");
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("-------------------------------------------------");
		this.getPlayer().charInfo();
		System.out.println("Oyuncu "+this.getPlayer().getName()+" Maðazaya Hoþgeldin.. Buradan Silah \nveya Zýrh Alabilirsin\n");
		
		
			int selection;
			System.out.println("Silah Almak için --> 1");
			
			System.out.println("Zýrh Almak için --> 2");
			
			System.out.println("Maðazadan Çýkmak için --> 3\n");
			
			System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçin: ");
			selection=this.scan.nextInt();
			System.out.println("-------------------------------------------------");
			Weapon[] weapons= {new Gun(),new Sword(),new Rifle()};
			Armor[] armors= {new Iron(),new Golden(),new Diamond()};
			switch(selection) {
				case 1:
					System.out.println("\tSilah Bölümüne Hoþgeldin\n");
					for(Weapon weapon: weapons ) {
						weapon.info();
					}
					System.out.println("\nÞuanki Silahýnýz: " +this.getPlayer().getInventory().getWeapon().getName() + "\n");
					selectWeapon(weapons);
					System.out.println("\nÞuanki Silahýnýz: " +this.getPlayer().getInventory().getWeapon().getName() + "\n");
					break;
				case 2:
					System.out.println("\tZýrh Bölümüne Hoþgeldin\n");
					for(Armor armor: armors) {
						armor.info();
					}
					System.out.println("\nÞuanki Zýrhýnýz: " +this.getPlayer().getInventory().getArmor().getName() + "\n");
					selectArmor(armors);
					System.out.println("\nÞuanki Zýrhýnýz: " +this.getPlayer().getInventory().getArmor().getName() + "\n");
					break;
				case 3:
					System.out.println("Görüþmek Üzere Tekrar Bekleriz.");
					break;
				default:
					System.out.println("Geçersiz Seçim Yaptýn");
			}
			
			
	
		
		
		return true;
	}
	
	public void selectWeapon(Weapon[] weapons) {
		
		System.out.println("-------------------------------------------------");
		System.out.println("Tabanca için --> 1");
		System.out.println("Kýlýç için --> 2");
		System.out.println("Tüfek için --> 3");
		System.out.println("Maðazadan Çýkmak için --> 4\n");
		
		System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçin: ");
		int selection = this.scan.nextInt();
		switch(selection) {
			case 1:
				if(this.getPlayer().getMoney()< weapons[0].getPrice()) {
					System.out.println("\nBu Silahý Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - weapons[0].getPrice();
					this.getPlayer().setMoney(newMoney);
					System.out.println("\n"+weapons[0].getName()+ " Kuþanýldý\n");
					this.getPlayer().getInventory().setWeapon(weapons[0]);
					this.getPlayer().charInfo(weapons[0]);
					
					
				}
				break;
			case 2:
				if(this.getPlayer().getMoney()< weapons[1].getPrice()) {
					System.out.println("\nBu Silahý Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - weapons[1].getPrice();
					this.getPlayer().setMoney(newMoney);
					
					System.out.println("\n"+weapons[1].getName()+ " Kuþanýldý\n");
					this.getPlayer().getInventory().setWeapon(weapons[1]);
					this.getPlayer().charInfo(weapons[1]);
					
					
				}
				break;
			case 3:
				if(this.getPlayer().getMoney()< weapons[2].getPrice()) {
					System.out.println("\nBu Silahý Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - weapons[2].getPrice();
					this.getPlayer().setMoney(newMoney);
					System.out.println("\n"+weapons[2].getName()+ " Kuþanýldý\n");
					this.getPlayer().getInventory().setWeapon(weapons[2]);
					this.getPlayer().charInfo(weapons[2]);
					
					
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Geçersiz Seçim Yaptýn");
			}
		
	}
	
	public void selectArmor(Armor[] armors) {
		System.out.println("-------------------------------------------------");
		System.out.println("Hafif Zýrh için --> 1");
		System.out.println("Orta Zýrh için --> 2");
		System.out.println("Aðýr Zýrh için --> 3");
		System.out.println("Maðazadan Çýkmak için --> 4\n");

		
		System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçin: ");
		int selection = this.scan.nextInt();
		switch(selection) {
			case 1:
				if(this.getPlayer().getMoney()< armors[0].getPrice()) {
					System.out.println("\nBu Zýrhý Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - armors[0].getPrice();
					this.getPlayer().setMoney(newMoney);
					this.getPlayer().getInventory().setArmor(armors[0]);
					System.out.println(armors[0].getName()+ " Kuþanýldý\n");
					this.getPlayer().charInfo(armors[0]);
					
					
				}
				break;
				
			case 2:
				if(this.getPlayer().getMoney()< armors[1].getPrice()) {
					System.out.println("\nBu Zýrhý Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - armors[1].getPrice();
					this.getPlayer().setMoney(newMoney);
					this.getPlayer().getInventory().setArmor(armors[1]);
					System.out.println(armors[1].getName()+ " Kuþanýldý\n");
					this.getPlayer().charInfo(armors[1]);
					
					
				}
				break;
			case 3:
				if(this.getPlayer().getMoney()< armors[2].getPrice()) {
					System.out.println("\nBu Zýrhý Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - armors[2].getPrice();
					this.getPlayer().setMoney(newMoney);
					this.getPlayer().getInventory().setArmor(armors[0]);
					System.out.println(armors[2].getName()+ " Kuþanýldý\n");
					this.getPlayer().charInfo(armors[2]);
					
				
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Geçersiz Seçim Yaptýn");
			}
		
	}
}
