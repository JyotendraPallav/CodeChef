import java.util.Scanner;

/**
 * 
 */

/**
 * @author A0262
 *
 */
class The_lead_Game {

	public static void main(String[] args) {
//		System.out.println("Let's play the game!!\n");
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			int No_of_Rounds=sc.nextInt();
			int Score_1=0;
			int Score_2=0;
			int Max_Diff=0;
			int Diff=0;
			int Winner=1;
			for(int i=0;i<No_of_Rounds;i++){
				Score_1+=sc.nextInt();
				Score_2+=sc.nextInt();
				Diff=Score_2 - Score_1;
				if(Math.abs(Diff)>Max_Diff){
					Max_Diff= Math.abs(Diff);
					if(Diff>0){
						Winner=2;
					}else Winner=1;
				}
			}
//			for(int i=0;i<No_of_Rounds;i++){
//				System.out.println("Round "+(i+1)+": "+Each_Round[i][0]+" - "+Each_Round[i][1]+" - "+Each_Round[i][2]+" - "+Each_Round[i][3]);
//			}
//			System.out.println("Winner is # "+Winner+" by "+Max_Diff+" margins!");
			System.out.println(Winner+" "+Max_Diff);
		}
	}
}
