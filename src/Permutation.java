import java.util.*;

class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			//System.out.println("Length of permutation?:");
			if(sc.hasNextInt()){
				int Permu_len=sc.nextInt();
				List<String> Results= new ArrayList<String>();
				while(Permu_len>0){
					int[] perm=new int[Permu_len];
					int[] Inv=new int[Permu_len];
					for(int j=0; j<Permu_len;j++){
						perm[j]=sc.nextInt();
						Inv[perm[j]-1]=j+1;
					}
					if(Arrays.equals(perm, Inv)){
						Results.add("ambiguous");
					}else{
						Results.add("not ambiguous");
					}
					Permu_len=sc.nextInt();
				};
				for(int j=0; j<Results.size();j++){
					System.out.println(Results.get(j));
					
				}
			}
		}finally{
			sc.close();
		}

	}

}
