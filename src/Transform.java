import java.util.*;

public class Transform {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			if(sc.hasNext()){
				int No_Tests=sc.nextInt();
				List<String> Expr=new ArrayList<String>();
				List<String> Expr_Converted=new ArrayList<String>();
				for(int i=0;i<No_Tests;i++){
					Expr.add(sc.next());
					Expr_Converted.add(Transform_exp(Expr.get(i)));
				}
				//System.out.println(Expr);
				//Expr_Converted.forEach(System.out::println);
			}
		}finally{
			sc.close();
		}				 
	}
	
	static String Transform_exp(String Expression){
		String converted="";
		List<String> Exp=new ArrayList<String>(Arrays.asList(Expression.split("")));
		System.out.println(Exp.subList(0, Exp.indexOf(")")));
		System.out.println(Exp);
		return converted;
	}
}
