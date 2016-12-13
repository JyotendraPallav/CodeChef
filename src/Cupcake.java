import java.util.Scanner;

class Cupcake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("How many test case are there: ");
			int TestCases=sc.nextInt();
			int cupcakes[]=new int[TestCases];
			for(int i=0;i<TestCases;i++){
				cupcakes[i]=sc.nextInt();
			}
			for(int i=0;i<TestCases;i++){
				System.out.println(package_size(cupcakes[i]));
			}
		}finally{
			sc.close();
		}

	}

	static int package_size(int tot_cc){
		int package_size=0;
		for(int i=2;i<=tot_cc;i++){
			if((tot_cc%i)>=package_size){ 
				package_size=tot_cc%i;
			}
		}
		if(package_size==0){
			package_size=tot_cc;
		}else{
			package_size=tot_cc-package_size;
		}
		return package_size;
	}
	
}
