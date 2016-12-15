import java.util.*;

class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			if(sc.hasNextInt()){
				System.out.println("Length of permutation?:");
				int Permu_len=sc.nextInt();
				int iter=0;
				List<String> results=new ArrayList<String>();
				while(Permu_len>0){
					int[] perm = new int[Permu_len];
					for(int j=0; j<Permu_len;j++){
						perm[j]=sc.nextInt();
					}
					Permu_len=sc.nextInt();
					results.add(find_truth(perm));
					iter=iter+1;
				};
				
			}
		}finally{
			sc.close();
		}

	}
	
	static String find_truth(int[] Arr){
		String verdict="";
		Int tot_len=Arr.length;
		while(tot_len>0){
			for(int i=1;i<=tot_len;i++){
				if(Arr[i])
			}
		}
		return verdict;
	}

}
