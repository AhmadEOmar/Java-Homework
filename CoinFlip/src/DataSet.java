import java.util.ArrayList;

public class DataSet  {

   ArrayList<MonetaryCoin> coinList = new ArrayList<MonetaryCoin>();
   
   
   public void add(MonetaryCoin mc)
   {
      coinList.add(mc);

   
   }
   
   public int valueHeads(int cents)
   {
	   int totalValue = 0;
	   int counter = 0;
	   MonetaryCoin jj = new MonetaryCoin();
	   for (int i = 0; i < coinList.size(); i++) {
			jj = coinList.get(i);
			if(cents == jj.getValue() && jj.isHeads()){
				totalValue += cents;
				counter ++;
			}
			
		}
	   System.out.println(counter + " each with a value of " + cents + " are heads");
      return totalValue;
   }
   
   public int valueTails(int cents)
   {
	   int totalValue = 0;
	   int counter = 0;
	   MonetaryCoin jj = new MonetaryCoin();
	   for (int i = 0; i < coinList.size(); i++) {
			jj = coinList.get(i);
			if(cents == jj.getValue() && !jj.isHeads()){
				totalValue += cents;
				counter ++;
			}
			
		}
	   System.out.println(counter + " each with a value of " + cents + " are Tails");
      return totalValue;
   
   }
}

