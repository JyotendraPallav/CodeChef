import java.util.*;


class Add_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("To Add Two numbers: \n");
		try{
			if(sc.hasNextInt()){
				int iters=sc.nextInt();
				List<Long> numbers=new ArrayList<Long>();
				List<Integer> num_sum=new ArrayList<Integer>();
				for(int i=0;i<iters;i++){
					numbers.add(sc.nextLong());
					List<String> Value_Str=new ArrayList<String>(Arrays.asList(Long.toString(numbers.get(i)).split("")));
					num_sum.add(Add_Number(Value_Str));
				}
				num_sum.forEach(System.out::println);
			}
		}finally{
			sc.close();
		}
	}

	static int Add_Number(List<String> Value){
		int sum=0;
		if(Value.size()>0){
			sum+=Integer.valueOf(Value.get(0));
			//System.out.println(sum);
			Value=Value.subList(1,Value.size());
			//System.out.println(Value);
			sum+=Add_Number(Value);
		}
		//System.out.println(sum);
		//System.out.println(Value);
		return sum;

	}
}
