import java.util.*;

class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Length of permutation?:");
			if(sc.hasNextInt()){
				int Permu_len=sc.nextInt();
				List<String> results=new ArrayList<String>();
				while(Permu_len>0){
					List<Integer> perm=new ArrayList<Integer>();
					for(int j=0; j<Permu_len;j++){
						perm.add(sc.nextInt());
					}
					results.add(find_truth(perm));
					System.out.println(results);
					Permu_len=sc.nextInt();
				};	
			}
		}finally{
			sc.close();
		}

	}
	
	static String find_truth(List<Integer> Arr){
		String verdict=Integer.toString(Arr.indexOf(1));
		return verdict;
	}

}
