package week3.methodoverloading2;

public class Sports {
	public void acheiver(String name,int medalCount) {
		System.out.println("Acheiver Name			= "+name);
		System.out.println("Acheiver MedalCount		= "+medalCount);
	}
	public void acheiver(String country,String sportsName,long rank) {
		System.err.println("Acheiver Counytry		= "+country);
		System.out.println("Acheiver SportsName		= "+sportsName);
		System.out.println("Acheiver Rank			= "+rank);
	}
	public void acheiver(float weight,int height,long contactNum) {
		System.out.println("Acheiver Weight			= "+weight);
		System.out.println("Acheiver Height			= "+height);
		System.out.println("Acheiver ContactNumber		= "+contactNum);
	}
	public void acheiver(String tournamentName,long prizeMoney) {
		System.out.println("TournamentName			= "+tournamentName);
		System.out.println(" ");
		System.out.println("PrizeMoney= "+prizeMoney);
	}
	public static void main(String[] args) {
		Sports obj3=new Sports();
		obj3.acheiver("AJITH", 5);
		obj3.acheiver(60,175,6383715265L);
		obj3.acheiver("INDIA","Badminton",2);
		obj3.acheiver("NationalLevel", 1000000L);
	}

}