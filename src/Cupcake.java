import java.util.Scanner;

class Cupcake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			//System.out.println("How many test case are there: ");
			if(sc.hasNextInt()){
				int TestCases=sc.nextInt();
				int cupcakes[]=new int[TestCases];
				for(int i=0;i<TestCases;i++){
					cupcakes[i]=sc.nextInt();
				}
				for(int i=0;i<TestCases;i++){
					System.out.println(package_size(cupcakes[i]));
				}
			}
		}finally{
			sc.close();
		}
		
	}

	static int package_size(int tot_cc){
		int package_size;
		if(tot_cc%2==0){
			package_size=(tot_cc/2)+1;
		}else package_size=(tot_cc+1)/2;
		return package_size;
	}
	
}
