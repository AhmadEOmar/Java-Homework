import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class HamburgerPanel extends JPanel {

	private HamburgerOrder order;
	private JPanel title;
	private JPanel size;
	private JPanel fixins;
	private JPanel combo;
	private JPanel price;
	private JRadioButton quarter;
	private JRadioButton half;
	private JLabel priceAmount;
	private JCheckBox wantsCombo;
	private JCheckBox lettuce;
	private JCheckBox tomato;
	private JCheckBox onion;

	public HamburgerPanel(HamburgerOrder theOrder) {
		order = theOrder;
		setLayout(new BorderLayout());
		setSize(400, 400);
		makeNorth();
		makeWest();
		makeSouth();
		makeEast();
		makeCenter();

		add(title, BorderLayout.NORTH);
		add(size, BorderLayout.WEST);
		add(price, BorderLayout.SOUTH);
		add(combo, BorderLayout.EAST);
		add(fixins, BorderLayout.CENTER);
		
		updateGui();
	}

	private void makeNorth() {
		title = new JPanel();
		title.add(new JLabel("Hamburger"));
	}

	private void makeWest() {
		size = new JPanel();
		size.setLayout(new GridLayout(2, 1));
		size.setBorder(BorderFactory.createTitledBorder("Size"));
		ActionListener al = new SizeHandler();
		quarter = new JRadioButton("QuarterPound");
		quarter.addActionListener(al);
		half = new JRadioButton("HalfPound");
		half.addActionListener(al);
		half.setSelected(true);
		order.setHalfPound(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(quarter);
		bg.add(half);
		size.add(quarter);
		size.add(half);
	}

	private void makeSouth() {
		price = new JPanel();
		price.setBorder(BorderFactory.createRaisedBevelBorder());
		JLabel priceLabel = new JLabel("Price ");
		priceAmount = new JLabel("$0.0");
		price.add(priceLabel);
		price.add(priceAmount);
	}
	
	private void makeEast() {
		combo = new JPanel();
		wantsCombo = new JCheckBox("Combo");
		combo.setBorder(BorderFactory.createTitledBorder("Fries?"));
		wantsCombo.addActionListener(new CheckBoxHandler());
		combo.add(wantsCombo);
	}
	
	private void makeCenter() {
		fixins = new JPanel();
		fixins.setLayout(new GridLayout(3, 1));
		TitledBorder fixTitle = BorderFactory.createTitledBorder("Fixins");
		fixins.setBorder(fixTitle);
		ActionListener al = new CheckBoxHandler();
		lettuce = new JCheckBox("Lettuce");
		tomato = new JCheckBox("Tomato");
		onion = new JCheckBox("Onion");
		// Since these don't affect the price, adding
		// these action listeners isn't really required
		lettuce.addActionListener(al);
		tomato.addActionListener(al);
		onion.addActionListener(al);
		fixins.add(lettuce);
		fixins.add(tomato);
		fixins.add(onion);
	}
	
	private class CheckBoxHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// We could look a e.getSource() to figure out what
			// widget fired the event.  Or we can ignore that an
			// just check everything.
			if (wantsCombo.isSelected()) order.setCombo(true);
			else order.setCombo(false);
			if (lettuce.isSelected()) order.setLettace(true);
			else order.setLettace(false);
			if (onion.isSelected()) order.setOnion(true);
			else order.setOnion(false);
			if (tomato.isSelected()) order.setTomato(true);
			else order.setTomato(false);
			updateGui();
		}
		
	}

	private class SizeHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (quarter.isSelected()) {
				order.setHalfPound(false);
			}
			if (half.isSelected()) {
				order.setHalfPound(true);
			}
			updateGui();

		}

	}

	private void updateGui() {
		double amt = order.getPrice();
		String s = String.valueOf(amt);
		priceAmount.setText("$" + s);
	}

}
