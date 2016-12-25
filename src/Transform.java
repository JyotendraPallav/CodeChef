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
		ListIterator<String> litr = null;
		litr=Exp.listIterator();
		List<String> Final=new ArrayList<String>();
		int start_index=0;
		int End_index=0;
		int i=0;
		while(litr.hasNext()){
			System.out.println(litr.next());
			if(litr.equals("(")){
				start_index=litr.nextIndex();
				System.out.println("( entered"+start_index);
			}
			if(litr.equals(")")){
				End_index=litr.previousIndex();
				System.out.println("( entered"+End_index);
				Final.add(i,Exp.get(start_index));
				Final.add(i+1,Exp.get(End_index));
				Final.add(i+2,Exp.get(End_index-1));
				i=i+3;
				Exp.subList(start_index-1, End_index+1).clear();
				Exp.add(start_index-1, Arrays.toString(Final.toArray()));
				System.out.println(Final);
				System.out.println(Exp);
				litr=Exp.listIterator();
			}
		}
		return converted;
	}
}
