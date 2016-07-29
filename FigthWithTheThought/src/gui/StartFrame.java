package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class StartFrame extends JFrame {
	private int voron = 0;
	private JLabel name;
	private JButton b_new;
	private JButton b_makeTeam;
	private JList northList;

	public StartFrame(Object o) {
		super("Menu");
		setSize(100, 100);
		String[] data = { "Chrome", "Firefox", "Internet Explorer", "Safari", "Opera", "Morrowind", "Oblivion", "NFS",
				"Half Life 2", "Hitman", "Morrowind", "Oblivion", "NFS", "Half Life 2", "Hitman", "Morrowind",
				"Oblivion", "NFS", "Half Life 2", "Hitman", "Morrowind", "Oblivion", "NFS", "Half Life 2", "Hitman",
				"Morrowind", "Oblivion", "NFS", "Half Life 2", "Hitman", "IL-2", "CMR", "NFS Undercover", "Star Wars",
				"Call of Duty", "IL-2", "CMR", "NFS Undercover", "Star Wars", "Call of Duty", "IL-2", "CMR",
				"NFS Undercover", "Star Wars", "Call of Duty", "IL-2", "CMR", "NFS Undercover", "Star Wars",
				"Call of Duty", "IL-2", "CMR", "NFS Undercover", "Star Wars", "Call of Duty", "IL-2", "CMR",
				"NFS Undercover", "Star Wars", "Call of Duty", "Arena", "Dagerfall", "MS Office", "Open Office",
				"Windows", "Arena", "Dagerfall", "MS Office", "Open Office", "Windows", "Arena", "Dagerfall",
				"MS Office", "Open Office", "Windows", "Arena", "Dagerfall", "MS Office", "Open Office", "Windows",
				"Mac OS", "Ubuntu" };
		northList = new JList(data);
		northList.setLayoutOrientation(JList.VERTICAL);
		northList.setVisibleRowCount(0);
		
		b_new=new JButton("edit");

		JScrollPane northScroll = new JScrollPane(northList);
		northScroll.setPreferredSize(new Dimension(100, 100));
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(northScroll,BorderLayout.CENTER);
		mainPanel.add(b_new,BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
		setPreferredSize(new Dimension(330, 450));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b_new.addActionListener((al) -> {
			for (int i = 0; i < data.length; i++)
				data[i] = "i" + i;
			northList.updateUI();
		});
	}

	public StartFrame() {
		super("Menu");
		name = new JLabel("fightWithTheThought");
		b_makeTeam = new JButton("Make Team");

		JPanel buttonsPanel = new JPanel(new FlowLayout());
		add(name, BorderLayout.NORTH);

		buttonsPanel.add(b_makeTeam);

		add(buttonsPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
