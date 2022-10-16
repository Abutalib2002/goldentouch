package JavaExercise;

public class ClaculatingInvestement {
public static void main(String[] args) {
int investment_Amount = 14000;
int Years_for_Calculating = 4;

for(int i = 0;i < Years_for_Calculating;i++)
{
	if(i == 1)
	{
		// the total value of 40% is 5600
		investment_Amount = 5600  + investment_Amount;
	}
	
	if(i == 2)
	{
		investment_Amount -= 1500; 
	}
	
	if(i == 3)
	{
		investment_Amount += 1680;
	}
}
System.out.println("The value of investment amount after facing"+"\n"+" 40% increament "+"\n"+" loss of 1500 "+"\n"+" again 12% increament "+"\t"+":  "
		+ ""+investment_Amount);
}
}
