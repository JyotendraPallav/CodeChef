import java.util.Scanner;
class TheLeadGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int p1=0,p2=0,p3=0,p4=0,lead1=0,lead2=0;
		short winner=0;
		while(lines > 0)
		{
			p3 = sc.nextInt();
			p4 = sc.nextInt();
			p1 += p3;
			p2 +=p4;
			if(p1 > p2)
			{
				if(lead1 < (p1-p2))
				{
					lead1 = p1-p2;
				}
			}
			else
			{
				if(lead2 < (p2-p1))
				{
					lead2 = p2-p1;
				}
			}
			lines--;
		}
		if(lead1>lead2)
			System.out.println("1 "+lead1);
		else
			System.out.println("2 "+lead2);
	}
} 