package gerenciador_gabriel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

	JFrame menuFrame = new JFrame("Gerenciador e-commerce");

	private FormPanel formPanel;

	private JButton quitAppButton;
	private JButton homeAppButton;
	private JButton pagebackAppButton;

	public MainFrame() {
		gui();
	}

	public void gui() {

		Image icon = Toolkit.getDefaultToolkit().getImage("wayne3.jpg");
		menuFrame.setIconImage(icon);

		menuFrame.setLayout(new BorderLayout());

		formPanel = new FormPanel(menuFrame);

		menuFrame.add(formPanel, BorderLayout.CENTER);
		
		///// Início Toolbar /////
		JToolBar tb = new JToolBar();
		tb = new JToolBar();
		tb.setFloatable(false);
		
		homeAppButton = new JButton("Home");
		tb.add(homeAppButton);
		homeAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuFrame.dispose();
				new MainFrame();
			}
		});
		
		quitAppButton = new JButton("Fechar");
		tb.add(quitAppButton);
		quitAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		menuFrame.add(tb, BorderLayout.NORTH);
		menuFrame.setSize(900, 550);
		menuFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		menuFrame.setResizable(false);
		menuFrame.setLocationRelativeTo(null);
		menuFrame.setVisible(true);

	}
}
