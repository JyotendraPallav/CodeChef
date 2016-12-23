import java.util.*;

public class Transform {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			if(sc.hasNext()){
				int No_Tests=sc.nextInt();
				List<String> Expr=new ArrayList<String>();
				for(int i=1;i<=No_Tests;i++){
					Expr.add(sc.next());
				}
				System.out.println(Expr);
			}
		}finally{
			sc.close();
		}				
	}
	
}
