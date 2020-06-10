package race;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] players = new Player[3];
		
		for (int i = 0; i < players.length; i++) {
			Player player = new Player();
			System.out.println("선수 : ");
			player.setName(scanner.next());
			System.out.println("100m 기록 : ");
			player.setRecord(scanner.nextInt());
			players[i]=player;
		}
		for (int i = 0; i < players.length; i++) {
			players[i].printStates();
		}		
		
		Player[] ranking = new Player[3];
		if(players[0].getRecord()<players[1].getRecord()) {
			if(players[0].getRecord()<players[2].getRecord()) {
				ranking[0]=players[0];
			}else {
				ranking[0] = players[1];
			}	
		}
		else {
			if(players[1].getRecord()<players[2].getRecord()) {
				ranking[0] = ranking[1];
			}else {
				ranking[0] = ranking[2];
			}
			
			
		}		
	}
}
/**
		System.out.println(players[0].getName()
					+"이"
					+players[1].getName()+"보다 빠르다"); 
					
		System.out.println(players[1].getName()
					+"가 "+players[0].getName()+"보다 빠르다");
* */
 