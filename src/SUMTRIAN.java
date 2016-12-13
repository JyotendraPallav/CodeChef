import java.util.Scanner;

class SUMTRIAN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("How many numbers of test cases: ");
			if(sc.hasNextInt()){
				
				int No_of_cases=sc.nextInt();
				for(int i=0;i<No_of_cases;i++){
					System.out.println("How many numbers of lines in Triangle: ");
					int No_of_lines=sc.nextInt();
					int[][] triangle=new int[3][];
					for(int row=0; row<No_of_lines;row++){
						triangle[row]=new int[row+1];
						for(int col=0;col<=row;col++){
							triangle[row][col]=sc.nextInt();
						}
					}
					int[] Max_Path=new int[No_of_cases];
					Max_Path[i]=Find_Path(Triangle);
				}
				
			}
		}finally {
			sc.close();
		}

	}

}
