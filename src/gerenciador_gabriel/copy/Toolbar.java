package gerenciador_gabriel.copy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

	private JButton quitAppButton;
	private JButton homeAppButton;
	private JButton pagebackAppButton;
	private JFrame menuFrame;


	public Toolbar(JFrame menuFrame) {
		
		this.menuFrame = menuFrame;
		
		setBorder(BorderFactory.createLoweredBevelBorder());

		homeAppButton = new JButton("Menu");
		quitAppButton = new JButton("Fechar");
		pagebackAppButton = new JButton("Voltar");

		homeAppButton.addActionListener(this);
		quitAppButton.addActionListener(this);
		pagebackAppButton.addActionListener(this);
		

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(homeAppButton);
		add(pagebackAppButton);
		add(quitAppButton);

	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if (clicked == quitAppButton) {
			System.exit(0);
		} else if (clicked == homeAppButton) {
			menuFrame.dispose();
			new MainFrame();
		} else if (clicked == pagebackAppButton) {
			
		}
	}
}
