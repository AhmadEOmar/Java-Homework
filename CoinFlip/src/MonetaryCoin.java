import java.util.*;
public class MonetaryCoin extends Coin {

   private int value;
   
   public int returnValue()
   {
      return value;
   }
   
   public int getValue()
   {
      return value;
   }
   

   
   public MonetaryCoin()
   {
      flip();
      Random r = new Random();
      int type = r.nextInt(4);
      switch(type)
      {
         case 0:
            value = 1;
            break;
         case 1:
            value = 5;
            break;
         case 2:
            value = 10;
            break;
         case 3:
            value = 25;
            break;
         default:
            value = 1;
            break;
      }
   }
   
}
