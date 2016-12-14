import java.util.Scanner;

class SUMTRIAN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		//	System.out.println("How many numbers of test cases: \t");
			if(sc.hasNextInt()){
				
				int No_of_cases=sc.nextInt();
				for(int i=0;i<No_of_cases;i++){
			//		System.out.println("How many numbers of lines in Triangle: \t");
					int No_of_lines=sc.nextInt();
					int[][] triangle=new int[No_of_lines][];
					for(int row=0; row<No_of_lines;row++){
						triangle[row]=new int[row+1];
						for(int col=0;col<=row;col++){
							triangle[row][col]=sc.nextInt();
						}
					}
					int[] Max_Path=new int[No_of_cases];
					Max_Path[i]=Find_Path(triangle);
					System.out.println(Max_Path[i]);
				}
				
			}
		}finally {
			sc.close();
		}

	}

	static int Find_Path(int[][] SumTrian){
		//System.out.println(SumTrian.length);
		int[][] CalTrian=new int[SumTrian.length][];
		CalTrian[0]=new int[1];
		CalTrian[0][0]=SumTrian[0][0];
		for(int i=1;i<SumTrian.length;i++){
			CalTrian[i]=new int[i+1];
			for(int j=0;j<=i;j++){
				if(j==0){
					CalTrian[i][j]=CalTrian[i-1][0]+SumTrian[i][0];
				}else if(j==i){
					CalTrian[i][j]=CalTrian[i-1][j-1]+SumTrian[i][j];
				}else{
					int left_move=CalTrian[i-1][j-1]+SumTrian[i][j];
					int bot_move=CalTrian[i-1][j]+SumTrian[i][j];
					CalTrian[i][j]=Math.max(left_move,bot_move);
				}
			}
		}
		int path_value=0;
		for(int k=0;k<SumTrian.length;k++){
			path_value=Math.max(path_value, CalTrian[SumTrian.length-1][k]);
		}
		return path_value;
	}
}
