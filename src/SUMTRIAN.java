import java.util.Scanner;

class SUMTRIAN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("How many numbers of test cases: \n");
			if(sc.hasNextInt()){
				
				int No_of_cases=sc.nextInt();
				for(int i=0;i<No_of_cases;i++){
					System.out.println("How many numbers of lines in Triangle: \n");
					int No_of_lines=sc.nextInt();
					int[][] triangle=new int[3][];
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
		int[][] CalTrian=new int[SumTrian.length][];
		int row,col,i,j;
		row=col=0;
		CalTrian[row]=new int[row+1];
		do while(col<=row){
			int x=0;
			for(i=0;i<row;i++){
				for(j=0;j<=i;j++){
					int x=x+SumTrian[i][j];
				}
			}
			CalTrian[row][col]=x;
		}
		
		
		int path_value=0;
		return path_value;
	}
}
