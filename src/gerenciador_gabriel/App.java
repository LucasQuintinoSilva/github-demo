package gerenciador_gabriel;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class App extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}

		});
	}

}
