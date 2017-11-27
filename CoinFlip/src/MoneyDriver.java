public class MoneyDriver {

   public static void main(String[] args) {
      MonetaryCoin coin1 = new MonetaryCoin();
      MonetaryCoin coin2 = new MonetaryCoin();
      DataSet coinage = new DataSet();

      coin1.flip();
      coin2.flip();
      
      coinage.add(coin1);
      coinage.add(coin2);
      
      System.out.println(coin1);
      System.out.println(coin2);
      System.out.println(coin1.getValue());
      System.out.println(coin2.getValue());
      
      coinage.valueHeads(1);
      coinage.valueHeads(5);
      coinage.valueHeads(10);
      coinage.valueHeads(25);

      coinage.valueTails(1);
      coinage.valueTails(5);
      coinage.valueTails(10);
      coinage.valueTails(25);

      
   }

}
