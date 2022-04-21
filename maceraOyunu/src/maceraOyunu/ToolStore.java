package maceraOyunu;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player, "Ma�aza");
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("-------------------------------------------------");
		this.getPlayer().charInfo();
		System.out.println("Oyuncu "+this.getPlayer().getName()+" Ma�azaya Ho�geldin.. Buradan Silah \nveya Z�rh Alabilirsin\n");
		
		
			int selection;
			System.out.println("Silah Almak i�in --> 1");
			
			System.out.println("Z�rh Almak i�in --> 2");
			
			System.out.println("Ma�azadan ��kmak i�in --> 3\n");
			
			System.out.print("Yapmak �stedi�iniz ��lemi Se�in: ");
			selection=this.scan.nextInt();
			System.out.println("-------------------------------------------------");
			Weapon[] weapons= {new Gun(),new Sword(),new Rifle()};
			Armor[] armors= {new Iron(),new Golden(),new Diamond()};
			switch(selection) {
				case 1:
					System.out.println("\tSilah B�l�m�ne Ho�geldin\n");
					for(Weapon weapon: weapons ) {
						weapon.info();
					}
					System.out.println("\n�uanki Silah�n�z: " +this.getPlayer().getInventory().getWeapon().getName() + "\n");
					selectWeapon(weapons);
					System.out.println("\n�uanki Silah�n�z: " +this.getPlayer().getInventory().getWeapon().getName() + "\n");
					break;
				case 2:
					System.out.println("\tZ�rh B�l�m�ne Ho�geldin\n");
					for(Armor armor: armors) {
						armor.info();
					}
					System.out.println("\n�uanki Z�rh�n�z: " +this.getPlayer().getInventory().getArmor().getName() + "\n");
					selectArmor(armors);
					System.out.println("\n�uanki Z�rh�n�z: " +this.getPlayer().getInventory().getArmor().getName() + "\n");
					break;
				case 3:
					System.out.println("G�r��mek �zere Tekrar Bekleriz.");
					break;
				default:
					System.out.println("Ge�ersiz Se�im Yapt�n");
			}
			
			
	
		
		
		return true;
	}
	
	public void selectWeapon(Weapon[] weapons) {
		
		System.out.println("-------------------------------------------------");
		System.out.println("Tabanca i�in --> 1");
		System.out.println("K�l�� i�in --> 2");
		System.out.println("T�fek i�in --> 3");
		System.out.println("Ma�azadan ��kmak i�in --> 4\n");
		
		System.out.print("Yapmak �stedi�iniz ��lemi Se�in: ");
		int selection = this.scan.nextInt();
		switch(selection) {
			case 1:
				if(this.getPlayer().getMoney()< weapons[0].getPrice()) {
					System.out.println("\nBu Silah� Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - weapons[0].getPrice();
					this.getPlayer().setMoney(newMoney);
					System.out.println("\n"+weapons[0].getName()+ " Ku�an�ld�\n");
					this.getPlayer().getInventory().setWeapon(weapons[0]);
					this.getPlayer().charInfo(weapons[0]);
					
					
				}
				break;
			case 2:
				if(this.getPlayer().getMoney()< weapons[1].getPrice()) {
					System.out.println("\nBu Silah� Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - weapons[1].getPrice();
					this.getPlayer().setMoney(newMoney);
					
					System.out.println("\n"+weapons[1].getName()+ " Ku�an�ld�\n");
					this.getPlayer().getInventory().setWeapon(weapons[1]);
					this.getPlayer().charInfo(weapons[1]);
					
					
				}
				break;
			case 3:
				if(this.getPlayer().getMoney()< weapons[2].getPrice()) {
					System.out.println("\nBu Silah� Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - weapons[2].getPrice();
					this.getPlayer().setMoney(newMoney);
					System.out.println("\n"+weapons[2].getName()+ " Ku�an�ld�\n");
					this.getPlayer().getInventory().setWeapon(weapons[2]);
					this.getPlayer().charInfo(weapons[2]);
					
					
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Ge�ersiz Se�im Yapt�n");
			}
		
	}
	
	public void selectArmor(Armor[] armors) {
		System.out.println("-------------------------------------------------");
		System.out.println("Hafif Z�rh i�in --> 1");
		System.out.println("Orta Z�rh i�in --> 2");
		System.out.println("A��r Z�rh i�in --> 3");
		System.out.println("Ma�azadan ��kmak i�in --> 4\n");

		
		System.out.print("Yapmak �stedi�iniz ��lemi Se�in: ");
		int selection = this.scan.nextInt();
		switch(selection) {
			case 1:
				if(this.getPlayer().getMoney()< armors[0].getPrice()) {
					System.out.println("\nBu Z�rh� Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - armors[0].getPrice();
					this.getPlayer().setMoney(newMoney);
					this.getPlayer().getInventory().setArmor(armors[0]);
					System.out.println(armors[0].getName()+ " Ku�an�ld�\n");
					this.getPlayer().charInfo(armors[0]);
					
					
				}
				break;
				
			case 2:
				if(this.getPlayer().getMoney()< armors[1].getPrice()) {
					System.out.println("\nBu Z�rh� Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - armors[1].getPrice();
					this.getPlayer().setMoney(newMoney);
					this.getPlayer().getInventory().setArmor(armors[1]);
					System.out.println(armors[1].getName()+ " Ku�an�ld�\n");
					this.getPlayer().charInfo(armors[1]);
					
					
				}
				break;
			case 3:
				if(this.getPlayer().getMoney()< armors[2].getPrice()) {
					System.out.println("\nBu Z�rh� Alacak Paran Yok.");
				}else {
					int newMoney = (this.getPlayer().getMoney()) - armors[2].getPrice();
					this.getPlayer().setMoney(newMoney);
					this.getPlayer().getInventory().setArmor(armors[0]);
					System.out.println(armors[2].getName()+ " Ku�an�ld�\n");
					this.getPlayer().charInfo(armors[2]);
					
				
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Ge�ersiz Se�im Yapt�n");
			}
		
	}
}
