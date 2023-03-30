package studio7;

public class HockeyPlayer {
	String name;
	int number;
	boolean handedness;
	boolean shoot;
	int points;
	int assists;
	int goals;
	int games;
	
	public HockeyPlayer(String nam, int num, boolean hand, boolean shot, int point, int assist, int goal, int game) {
		name = nam;
		number = num;
		handedness = hand;
		shoot = shot;
		points = 0;
		assists = 0;
		goals = 0;
		games = 0;
		
	}
	
	public void statUpdate(int point, int assist, int goal, int game) {
		points = point;
		assists = assist;
		goals = goal;
		game++;		
	}
}
