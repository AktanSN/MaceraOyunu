package maceraOyunu;

import java.util.Scanner;

public class Game {

	private Player player;
	private Location location;
	private Scanner scan = new Scanner(System.in);

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void start() {
		Player character;

		Player[] players = { new Samurai(), new Archer(), new Chivalry() };
		System.out.println("\t    Macera Oyununa Ho�geldiniz !");
		System.out.println("-------------------------------------------------");
		System.out.println("\t\t   Karakterler");
		System.out.println("-------------------------------------------------");
		for (Player player : players) {
			player.charInfo();
		}

		System.out.print("L�tfen karakterinizi se�in: ");

		String name = scan.nextLine();
		name = name.toLowerCase();

		while (selectChar(name) == null) {
			System.out.println();
			System.out.print("L�tfen karakterinizi se�in: ");

			name = scan.nextLine();
			name = name.toLowerCase();
		}

		character = selectChar(name);
		System.out.println(character.getName() + " karakterini se�tiniz.");
		while (true) {

			if (!selectLocation(character)) {
				System.out.println("\nGame over");
				System.exit(0);
			}
			
		}

	}
	
	public Player selectChar(String name) {
		switch (name) {
		case "samuray":

			Samurai samurai = new Samurai();

			return samurai;

		case "ok�u":

			Archer archer = new Archer();

			return archer;
		case "�ovalye":

			Chivalry chivalry = new Chivalry();

			return chivalry;
		default:
			System.out.println("Ge�ersiz karakter girdiniz...");
		}
		return null;
	}

	public boolean selectLocation(Player player) {
		int selection;
		System.out.println("-------------------------------------------------");
		System.out.println("\n**** Base B�lgeleri ****\n");
		System.out.println("\nG�venli Ev i�in --> 1\nMa�aza i�in --> 2\n");
		System.out.println("\n**** Sava� B�lgeleri ****\n");
		System.out.println("Ma�ara i�in --> 3\nOrman i�in --> 4\nNehir i�in --> 5\nMaden i�in --> 6\n");

		System.out.print("Gitmek istedi�iniz b�lgeyi se�in: ");
		selection = scan.nextInt();
		System.out.println();
		System.out.println("-------------------------------------------------");
		switch (selection) {
		case 1:
			SafeHouse safeHouse = new SafeHouse(player);
			return safeHouse.onLocation();
		case 2:
			ToolStore toolStore = new ToolStore(player);
			return toolStore.onLocation();
		case 3:
			BattleLoc cave = new Cave(player);
			return cave.onLocation();
		case 4:
			BattleLoc forest = new Forest(player);
			return forest.onLocation();
		case 5:
			BattleLoc river = new River(player);
			return river.onLocation();
		case 6:
			BattleLoc mine = new Mine(player);
			return mine.onLocation();
		default:
			System.out.println("Ge�ersiz B�lge..");
			return true;
		}
		
	}

}
