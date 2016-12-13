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
		int package_size=0;
		int Temp_size=0;
		int Diff=0;
		int i=1;
		do{
			Temp_size=tot_cc%(tot_cc-i);
			Diff=Temp_size-package_size;
			if(Temp_size>package_size) {package_size=Temp_size;}
			//System.out.println(Temp_size);
			i=i+1;
		}while(Diff>0);
		if(package_size==0){
			package_size=tot_cc;
		}else{
			package_size=tot_cc-package_size;
		}
		return package_size;
	}
	
}
