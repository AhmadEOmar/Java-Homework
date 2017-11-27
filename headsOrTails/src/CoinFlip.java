import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoinFlip extends JPanel
{
	private JPanel coinFlipPanel;
	private JButton jb1;
	private JTextField jtf1;
	private JLabel jl1;
	private JLabel jl2;
	private JTextField jtf2;
	private int countHead;
	private int countTail;
	
	public CoinFlip() 
	{
		coinFlip();
		add(coinFlipPanel);
	}
	
	private void coinFlip()
	{
		coinFlipPanel = new JPanel();
		jb1 = new JButton("Flip");
		coinFlipPanel.add(jb1);
		ActionListener flip = new FlipCoin();
		jb1.addActionListener(flip);
		jl1 = new JLabel("");
		jl2 = new JLabel("");
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);
		coinFlipPanel.add(jl1);
		coinFlipPanel.add(jl2);
		coinFlipPanel.add(jtf1);
		coinFlipPanel.add(jtf2);
	}
	
	class FlipCoin implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			Coin c1 = new Coin();
			c1.flip();

			if (c1.isHeads()){
				countHead++;
			}
			else if ( !c1.isHeads()){
				countTail++;
			}

			jl1.setText(String.valueOf(countHead)); 
			jtf1.setText(String.valueOf(countHead));
			jl2.setText(String.valueOf(countTail)); 
			jtf2.setText(String.valueOf(countTail));
			
			
		}
		
	}
	
}