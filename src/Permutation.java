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
					Permu_len=sc.nextInt();
				};
				for(int i=0;i<results.size();i++){
					System.out.println(results.get(i));
				}
			}
		}finally{
			sc.close();
		}

	}
	
	static String find_truth(List<Integer> Arr){
		String verdict="";
		for(int i=0;i<Arr.size();i++){
			if(Arr.indexOf(i+1)+1!=Arr.get(i)){
				verdict="not ambiguous";
			}else if(i==Arr.size()-1){
				verdict="ambiguous";
				}
			}
		return verdict;
	}

}
