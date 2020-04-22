package gerenciador_gabriel.copy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

	JFrame menuFrame = new JFrame("Gerenciador e-commerce");

	private Toolbar toolbar;
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

		toolbar = new Toolbar(menuFrame);
		formPanel = new FormPanel();

		menuFrame.add(formPanel, BorderLayout.CENTER);
		//menuFrame.add(toolbar, BorderLayout.NORTH);
		
		// Toolbar
		JToolBar tb = new JToolBar();
		tb = new JToolBar();
		tb.setFloatable(false);
		
		quitAppButton = new JButton("Exit");
		tb.add(quitAppButton);
		quitAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		homeAppButton = new JButton("Home");
		tb.add(homeAppButton);
		homeAppButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuFrame.dispose();
				new MainFrame();
			}
		});
		
		//menuFrame.add(tb, BorderLayout.NORTH);
		//menuFrame.setJMenuBar(mb);
		menuFrame.setSize(900, 550);
		menuFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		menuFrame.setResizable(false);
		menuFrame.setLocationRelativeTo(null);
		menuFrame.setVisible(true);

	}
}
