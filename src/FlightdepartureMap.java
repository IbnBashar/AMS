import javax.swing.*;

public class FlightdepartureMap extends JFrame{
	private JLabel label1;
	private ImageIcon imageicon1;
	
	public FlightdepartureMap() {
		super("Flight Departure Map");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		imageicon1 = new ImageIcon("map.jpg");
		label1 = new JLabel(imageicon1);
		label1.setBounds(0,0,800,600);
		
		add(label1);
		pack();
	}

}
