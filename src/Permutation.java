import java.util.*;

class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Length of permutation?:");
			if(sc.hasNextInt()){
				int Permu_len=sc.nextInt();
				while(Permu_len>0){
					int[] perm=new int[Permu_len];
					int[] Inv=new int[Permu_len];
					for(int j=0; j<Permu_len;j++){
						perm[j]=sc.nextInt();
						Inv[perm[j]-1]=j+1;
					}
					if(perm==Inv){
						System.out.println("Checked");
					}else{
						System.out.println(Inv);
					}
					Permu_len=sc.nextInt();
				};
				
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
				break;
			}else if(i==Arr.size()-1){
				verdict="ambiguous";
				}
			}
		return verdict;
	}

}
