import java.util.*;


class Add_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To Add Two numbers: \n");
		try{
			if(sc.hasNextInt()){
				int iters=sc.nextInt();
				List<Long> numbers=new ArrayList<Long>();
				List<Integer> num_sum=new ArrayList<Integer>();
				for(int i=0;i<iters;i++){
					numbers.add(sc.nextLong());
					num_sum.add(Add_Number(Long.toString(numbers.get(i))));
				}
			}
		}finally{
			sc.close();
		}
	}

	static int Add_Number(String Value){
		int sum=0;
		List<String> Value_Str=new ArrayList<String>(Arrays.asList(Value.split("")));
		System.out.println(Value_Str);
		return sum;
	}
}
