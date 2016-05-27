package TennisKata;

import java.util.Scanner;

public class Tennis {

	private Integer server = 0;
	private Integer receiver = 0;
	private int advantage = 65;
	private int winner = 100;
	public boolean serverScored;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String []args) {
		Tennis game = new Tennis();
		game.whoScored();
		
		
	}
	
	private void whoScored() {
		
		int winner = scan.nextInt();
		switch(winner){
		case 1:
			serverScored = true;
			workoutScore(true);
			break;
		case 2:
			serverScored = false;
			workoutScore(false);
			break;
		}
		
	}

	public void workoutScore(Boolean serverScored){
		if (serverScored){
			if (server < 30){
				server += 15;
			}else if (server == 30){
				server +=10;
			}else if (server == 40 && receiver == 40){
				server = advantage;
			}else if (server == 40 && receiver == 65){
				receiver = 40;
			}else if (server == 40 && receiver >= 30){
				System.out.println("The server has won!");
				server = winner;
			}else if (server == 65 && receiver == 40){
				System.out.println("The server has won!");
				server = winner;
			}
		}else if (!serverScored){
			if (receiver < 30){
				receiver += 15;
			}else if (receiver == 30){
				receiver +=10;
			}else if (receiver == 40 && server == 40){
				receiver = advantage;
			}else if (receiver == 40 && server == 65){
				server = 40;
			}else if (receiver == 40 && server >= 30){
				System.out.println("The receiver has won!");
				receiver = winner;
			}else if (receiver == 65 && server == 40){
				System.out.println("The receiver has won!");
				receiver = winner;
			}
		}	
		System.out.println("The score is " + server + ":" + receiver);
		
	}
	
	public String getServerScore() {
		if (server == 65){
			return "A";
		}else if (server == 100){
			return "Winner";
		}

		return String.valueOf(server);
	}
	
	public String getReceiverScore() {
		if (receiver == 65){
			return "A";
		}else if (receiver == 100){
			return "Winner";
		}
		return String.valueOf(receiver);
	}

//	public String getWinner() {
//		if (server > 40 && receiver <= 30){
//			System.out.println("The server has won!");
//			server = winner;
//		}
//		return null;
//	}
}
