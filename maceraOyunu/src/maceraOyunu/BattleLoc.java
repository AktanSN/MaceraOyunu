package maceraOyunu;

import java.util.Random;

public abstract class BattleLoc extends Location {

	private Obstacle obstacle;
	private int maxObstacleNum = 6;
	private String LocationAward;

	public BattleLoc(Player player, String name, Obstacle obstacle,String LocationAward) {
		super(player, name);
		this.obstacle = obstacle;
		this.LocationAward=LocationAward;

	}

	public String getLocationAward() {
		return LocationAward;
	}

	public void setLocationAward(String locationAward) {
		LocationAward = locationAward;
	}

	public int randomObstacleNum() {
		Random rnd = new Random();
		if(this.getObstacle().getId()==4) {
			return rnd.nextInt(this.getMaxObstacleNum()) + 1;
		}
		return rnd.nextInt(3) + 1;
	}

	public Obstacle getObstacle() {
		return obstacle;
	}

	public int getMaxObstacleNum() {
		return maxObstacleNum;
	}

	public void setMaxObstacleNum(int maxObstacleNum) {
		this.maxObstacleNum = maxObstacleNum;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

	@Override
	public boolean onLocation() {
		System.out.println("Bulunduðunuz Yer " + this.getName() + " Dikkatli Ol !!\n");
		int randomObstacle = this.randomObstacleNum();
		System.out.println("Burada Karþýna " + randomObstacle + " tane -- " + this.getObstacle().getName()
				+ " -- Çýkabilir..\n");

		System.out.println("Savaþmak için --> S");
		System.out.println("Kaçmak için --> K");
		String selection;
		System.out.print("\nYapmak istediðiniz iþlemi seçin: ");
		selection = scan.nextLine();
		selection = selection.toLowerCase();

		if (selection.equals("s")) {
			System.out.println("Savaþ Baþlýyor..\n");
			if (combat(randomObstacle)) {
				System.out.println("Tebrikler " + this.getPlayer().getName() + " Tüm Canavarlarý Yendin...");
				this.getPlayer().getInventory().setLocationAwards(awardList());
				
				if(!this.getLocationAward().equals("")) {
					System.out.println(this.getLocationAward()+" Ödülün Envantere Eklendi Tebrikler !!");
				}
				
				return true;
			}

		}
		if (this.getPlayer().getHealth() <= 0) {
			System.out.println("Öldün !..");
			return false;
		}
		

		return true;
	}
	
	public void mineLocationAward() {
		Random rnd = new Random();

		int a= rnd.nextInt(100)+1;
		if(a<=15) {
			a=rnd.nextInt(100)+1;
			if(a<=20) {
				System.out.println("\n Ganimet Olarak Tüfek Kazandýn\n");

				this.getPlayer().getInventory().setWeapon(new Rifle());
			}else if(a>20 && a<=50) {
				System.out.println("\n Ganimet Olarak Kýlýç Kazandýn\n");

				this.getPlayer().getInventory().setWeapon(new Sword());
			}else {
				System.out.println("\n Ganimet Olarak Tabanca Kazandýn\n");

				this.getPlayer().getInventory().setWeapon(new Gun());
			}
			
		}else if(15>a && a<=30) {
			
			if(a<=20) {
				System.out.println("\n Ganimet Olarak Aðýr Elmas Zýrh Kazandýn\n");
				this.getPlayer().getInventory().setArmor(new Diamond());
			}else if(a>20 && a<=50) {
				System.out.println("\n Ganimet Olarak Orta Altýn Zýrh Kazandýn\n");
				this.getPlayer().getInventory().setArmor(new Golden());
			}else {
				System.out.println("\n Ganimet Olarak Hafif Demir Zýrh Kazandýn\n");
				this.getPlayer().getInventory().setArmor(new Iron());
			}
		}else if(a>30 && 55<=a) {
			
			if(a<=20) {
				System.out.println("\n Ganimet Olarak 10 Para Kazandýn\n");
				this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
			}else if(a>20 && a<=50) {
				System.out.println("\n Ganimet Olarak 5 Para Kazandýn\n");
				this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
			}else {
				System.out.println("\n Ganimet Olarak 1 Para Kazandýn\n");
				this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
			}
		}
		System.out.println("-------------------------------------------------");

		
		
	}

	public boolean combat(int obstacleNumber) {
		int defaultObstacleHealth = this.getObstacle().getHealth();

		for (int i = 0; i < obstacleNumber; i++) {
			this.getObstacle().setHealth(defaultObstacleHealth);
			System.out.println("-------------------------------------------------");
			System.out.println((i + 1) + ". " + this.getObstacle().getName() + " Sana Yaklaþýyor");
			this.getPlayer().charInfo();
			this.getObstacle().obstacleInfo();
			while (this.getPlayer().getHealth() > 0 && this.obstacle.getHealth() > 0) {
				Random rnd =new Random();
				int luck= rnd.nextInt(2);
				if(luck ==0) {
					System.out.println("Vurmak için --> V");
					System.out.println("Kaçmak için herhangi bir tuþa basýn.");
					String selection;
					System.out.print("\nYapmak istediðiniz iþlemi seçin: ");
					selection = scan.nextLine().toLowerCase();
					if (selection.equals("v")) {
						if (this.getObstacle().getHealth() > 0 && this.getPlayer().getHealth() > 0) {
							System.out.println("\n-------------------------------------------------");
							System.out.println("-------------------------------------------------");
							System.out.print("\n     " + this.getPlayer().getName() + " Saldýrdý ");
							this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());
							System.out.println();
							System.out.println("--------------------------");
							obstacleStats();
							System.out.println("--------------------------");
							System.out.println();
						}
						if (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
							System.out.print("\n     " + this.getObstacle().getName() + " Saldýrdý ");
							this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstacle().getDamage());
							System.out.println();
							playerStats();
							System.out.println("--------------------------");
						}
						System.out.println("\n-------------------------------------------------");
						System.out.println("-------------------------------------------------");
						

					} else {
						return false;
					}
				}
				if(luck == 1) {
					if (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
						System.out.println("\n-------------------------------------------------");
						System.out.println("-------------------------------------------------");
						System.out.print("\n     " + this.getObstacle().getName() + " Saldýrdý");
						this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstacle().getDamage());
						System.out.println();
						
						playerStats();
						System.out.println("--------------------------");
					}
					System.out.println("\nVurmak için --> V");
					System.out.println("Kaçmak için herhangi bir tuþa basýn.");
					String selection;
					System.out.print("\nYapmak istediðiniz iþlemi seçin: ");
					selection = scan.nextLine().toLowerCase();
					if (selection.equals("v")) {
						if (this.getObstacle().getHealth() > 0 && this.getPlayer().getHealth() > 0) {
							System.out.print("\n     " + this.getPlayer().getName() + " Saldýrdý");
							this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());
							System.out.println();
							obstacleStats();
							System.out.println("--------------------------");
							System.out.println();
						}
						
						

						System.out.println("\n-------------------------------------------------");
						System.out.println("-------------------------------------------------");
						

					} else {
						return false;
					}
				}
				
				

			}
			if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
				System.out.println("\nCanavarý Yendin...\n");
				if(this.getName().equals("Maden")) {
					mineLocationAward();
					return true;
				}
				System.out.println(this.getObstacle().getAward() + " Para Kazandýn.");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
				System.out.println("Güncel Paran: " + this.getPlayer().getMoney() + "\n");
			}else {
				return false;
			}

		}

		return true;
	}

	public void playerStats() {
		System.out.println(this.getPlayer().getName() + " Saðlýk: " + this.getPlayer().getHealth() + " (- "
				+ this.getObstacle().getDamage() + ")");
	}

	public void obstacleStats() {
		System.out.println(this.getObstacle().getName() + " Saðlýk: " + this.getObstacle().getHealth() + " (- "
				+ this.getPlayer().getDamage() + ")");
	}
	
	public String[] awardList() {
		String[] array= this.getPlayer().getInventory().getLocationAwards();
		
		if(this.getName().equals("Maðara")) {
			array[0] = this.getLocationAward();
		}else if(this.getName().equals("Orman")) {
			array[1] = this.getLocationAward();
		}else if(this.getName().equals("Nehir")) {
			array[2]= this.getLocationAward();
		}
		
		return array;
	}

}
