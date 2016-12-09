import java.util.Scanner;

/**
 * 
 */

/**
 * @author A0262
 *
 */
public class The_lead_Game {

	public static void main(String[] args) {
//		System.out.println("Let's play the game!!\n");
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			int No_of_Rounds=sc.nextInt();
			int Each_Round[][]=new int[No_of_Rounds][4];
			int Max_Diff=0;
			int Winner=1;
			for(int i=0;i<No_of_Rounds;i++){
				Each_Round[i][0]=sc.nextInt();
				Each_Round[i][1]=sc.nextInt();
				Each_Round[i][2]=Each_Round[i][1]-Each_Round[i][0];
				if(Each_Round[i][2]>0){
					Each_Round[i][3]=2;
				}else Each_Round[i][3]=1;
				if(Math.abs(Each_Round[i][2])>Max_Diff){
					Max_Diff= Math.abs(Each_Round[i][2]);
					Winner=Each_Round[i][3];
				}
			}
//			for(int i=0;i<No_of_Rounds;i++){
//				System.out.println("Round "+(i+1)+": "+Each_Round[i][0]+" - "+Each_Round[i][1]+" - "+Each_Round[i][2]+" - "+Each_Round[i][3]);
//			}
//			System.out.println("Winner is # "+Winner+" by "+Max_Diff+" margins!");
			System.out.println(Winner+Max_Diff);
		}
	}
}
