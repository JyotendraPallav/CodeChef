import java.util.*;

class Transform {

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
				Expr_Converted.forEach(System.out::println);
			}
		}finally{
			sc.close();
		}				 
	}
	
	static String Transform_exp(String Expression){
		String converted="Dumb";
		List<String> Exp=new ArrayList<String>(Arrays.asList(Expression.split("")));
		ListIterator<String> litr = null;
		litr=Exp.listIterator();
		List<String> Final=new ArrayList<String>();
		int start_index=0;
		int End_index=0;
		String Temp="";
		while(litr.hasNext()){
			Temp=litr.next();
			//System.out.println(Temp);
			if(Temp.equals("(")){
				start_index=litr.nextIndex();
				//System.out.println("Start entered: "+start_index);
			}
			if(Temp.equals(")")){
				End_index=litr.nextIndex();
				//System.out.println("End entered: "+End_index);
				Final.add(0,Exp.get(start_index));
				Final.add(1,Exp.get(End_index-2));
				Final.add(2,Exp.get(End_index-3));
				Exp.subList(start_index-1, End_index).clear();
				converted=String.join("", Final);
				Final.clear();
				Exp.add(start_index-1, converted);
				//System.out.println(Final);
				//System.out.println(converted);
				litr=Exp.listIterator();
				//System.out.println(Exp);
			}
		}
		return converted;
	}
}
