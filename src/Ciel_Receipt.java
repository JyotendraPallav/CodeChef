import java.util.*;
import java.util.stream.Collectors;

class Ciel_Receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			if(sc.hasNextInt()){
				int	Cases=sc.nextInt();
				List<Integer> Menu_items =new ArrayList<Integer>();
				List<Integer> Num_of_Menus=new ArrayList<Integer>();
				for(double i=0;i<=11;i++){
					Menu_items.add((int)Math.pow(2.0, i));
				}
				for(int i=0;i<Cases;i++){
					int amount=sc.nextInt();
					Num_of_Menus.add(cal_Menu(amount,Menu_items));
				}
				
				//Menu_items.forEach(System.out::println);
				Num_of_Menus.forEach(System.out::println);
			}
			
		}finally{
			sc.close();
		}
	}
	static int cal_Menu(int amount, List<Integer> Menu){
		int tot_Menus=0;
		int x=amount;
		
		List <Integer> filtered =Menu.stream()
				.filter(value -> value<=x)
				.collect(Collectors.toList());
		tot_Menus=(int)x/Collections.max(filtered);
		//System.out.println("Amount: "+ x + " Menu: "+ tot_Menus + " Max:"+ Collections.max(filtered));

		if((double)x/Collections.max(filtered)>1.0 && x%Collections.max(filtered)!=0 ){
			amount=x % Collections.max(filtered);
			tot_Menus+=cal_Menu(amount,filtered);
		}
		return tot_Menus;
	}
}
