import javax.swing.JFrame;

public class HamburgerStand
{
   //-----------------------------------------------------------------
   //  Creates the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Hamburger");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      HamburgerOrder ho = new HamburgerOrder();

      frame.getContentPane().add(new HamburgerPanel(ho));

      frame.pack();
      frame.setVisible(true);
   }
}
