import javax.swing.JFrame;
import javax.swing.JPanel;

public class CoinMain {

	public static void main(String[] args) {
		JFrame jf = new JFrame("Coin Flip");
		JPanel jp = new CoinFlip();
		jf.setContentPane(jp);
		jf.setSize(300,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}