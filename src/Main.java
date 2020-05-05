import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		GamePlay gameplay = new GamePlay();

		jf.setBounds(10, 10, 905, 700);
		jf.setBackground(Color.DARK_GRAY);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(gameplay);
	}

}