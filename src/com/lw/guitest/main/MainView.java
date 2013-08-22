package com.lw.guitest.main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartPanel;

public class MainView extends JFrame{
	
	private JPanel contentPane;
	
	public MainView() {
		setPanel();
	}
	
	public void setPanel(){
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(EEGGUI.class.getResource("/com/lw/guit/resource/brain_spawn.png")));
		setTitle("EEGTerminator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1200, 700);
		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
		// Menu Panel
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// Menu Item
		JMenu mnFile = new JMenu("File");

		menuBar.add(mnFile);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile.add(mntmLoad);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnAnalysis = new JMenu("Analysis");
		menuBar.add(mnAnalysis);
		
		JMenuItem mntmStart = new JMenuItem("Start");
		mntmStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnAnalysis.add(mntmStart);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnAbout.add(mntmAbout);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Button Item

		JButton btnLoad = new JButton("Load");
		btnLoad.setIcon(new ImageIcon(EEGGUI.class.getResource("/com/lw/guit/resource/reload_alt.png")));
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnStart = new JButton("Start");
		btnStart.setIcon(new ImageIcon(EEGGUI.class.getResource("/com/lw/guit/resource/playback_play.png")));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnAnalysis = new JButton("");
		btnAnalysis.setIcon(new ImageIcon(EEGGUI.class.getResource("/com/lw/guit/resource/lightbulb.png")));
		btnAnalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	

		JButton btnCapture = new JButton("");
		btnCapture.setIcon(new ImageIcon(EEGGUI.class.getResource("/com/lw/guit/resource/photo.png")));
		btnCapture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	

		// Tab Panel

		//TODO - change tab label bcolor
			//tabbedPane.addTab(null, myComponent);
		 	//tabbedPane.setTabComponentAt(0, new JLabel("Tab"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JPanel tabPanel = new JPanel();
		tabPanel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Raw Data", null, tabPanel, null);
		tabPanel.setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(63, 6, 1150, 531);
		tabPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		SingleChannelPlot singleChannelPlot = new SingleChannelPlot("xx");
		ChartPanel p = new ChartPanel(singleChannelPlot.getChart());
		panel.add(p, BorderLayout.CENTER);
		p.validate();

	
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(63, 477, 1150, 190);
		tabPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		JRadioButton rdbtnAF3 = new JRadioButton("AF3");
		rdbtnAF3.setBounds(6, 22, 51, 23);
		rdbtnAF3.setBackground(Color.WHITE);
		tabPanel.add(rdbtnAF3);
		rdbtnAF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JRadioButton rdbtnF7 = new JRadioButton("F7");
		rdbtnF7.setBounds(6, 56, 51, 23);
		rdbtnF7.setBackground(Color.WHITE);
		tabPanel.add(rdbtnF7);
		rdbtnF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnF3 = new JRadioButton("F3");
		rdbtnF3.setBounds(6, 90, 51, 23);
		rdbtnF3.setBackground(Color.WHITE);
		tabPanel.add(rdbtnF3);
		rdbtnF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnFC5 = new JRadioButton("FC5");
		rdbtnFC5.setBounds(6, 122, 51, 23);
		rdbtnFC5.setBackground(Color.WHITE);
		tabPanel.add(rdbtnFC5);
		rdbtnFC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnT7 = new JRadioButton("T7");
		rdbtnT7.setBounds(6, 153, 51, 23);
		rdbtnT7.setBackground(Color.WHITE);
		tabPanel.add(rdbtnT7);
		rdbtnT7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnP7 = new JRadioButton("P7");
		rdbtnP7.setBounds(6, 187, 51, 23);
		rdbtnP7.setBackground(Color.WHITE);
		tabPanel.add(rdbtnP7);
		rdbtnP7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnO1 = new JRadioButton("O1");
		rdbtnO1.setBounds(6, 222, 51, 23);
		rdbtnO1.setBackground(Color.WHITE);
		tabPanel.add(rdbtnO1);
		rdbtnO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JRadioButton rdbtnO2 = new JRadioButton("O2");
		rdbtnO2.setBounds(6, 255, 51, 23);
		rdbtnO2.setBackground(Color.WHITE);
		tabPanel.add(rdbtnO2);
		rdbtnO2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnP8 = new JRadioButton("P8");
		rdbtnP8.setBounds(6, 286, 51, 23);
		rdbtnP8.setBackground(Color.WHITE);
		tabPanel.add(rdbtnP8);
		rdbtnP8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnT8 = new JRadioButton("T8");
		rdbtnT8.setBounds(6, 317, 51, 23);
		rdbtnT8.setBackground(Color.WHITE);
		tabPanel.add(rdbtnT8);
		rdbtnT8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnFC6 = new JRadioButton("FC6");
		rdbtnFC6.setBounds(6, 348, 51, 23);
		rdbtnFC6.setBackground(Color.WHITE);
		tabPanel.add(rdbtnFC6);
		rdbtnFC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnF4 = new JRadioButton("F4");
		rdbtnF4.setBounds(6, 379, 51, 23);
		rdbtnF4.setBackground(Color.WHITE);
		tabPanel.add(rdbtnF4);
		rdbtnF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnF8 = new JRadioButton("F8");
		rdbtnF8.setBounds(6, 410, 51, 23);
		rdbtnF8.setBackground(Color.WHITE);
		tabPanel.add(rdbtnF8);
		rdbtnF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnAF4 = new JRadioButton("AF4");
		rdbtnAF4.setBounds(6, 446, 51, 23);
		rdbtnAF4.setBackground(Color.WHITE);
		tabPanel.add(rdbtnAF4);
		rdbtnAF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton rdbtnHR = new JRadioButton("HR");
		rdbtnHR.setBackground(Color.WHITE);
		rdbtnHR.setBounds(6, 477, 51, 23);
		tabPanel.add(rdbtnHR);
		rdbtnHR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JCheckBox chckbxALL = new JCheckBox("All");
		chckbxALL.setSelected(true);
		chckbxALL.setBackground(Color.WHITE);
		chckbxALL.setBounds(6, 514, 51, 23);
		tabPanel.add(chckbxALL);
		tabPanel.validate();
		rdbtnHR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		

		
		//Tab Panel 2
		
		
		JPanel tabPanel_1 = new JPanel();
		tabPanel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab(" FFT ", null, tabPanel_1, null);
		tabPanel_1.setLayout(null);


		JRadioButton radioButton = new JRadioButton("AF3");
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(6, 6, 51, 23);
		tabPanel_1.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_1 = new JRadioButton("F7");
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(6, 37, 51, 23);
		tabPanel_1.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_2 = new JRadioButton("F3");
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(6, 68, 51, 23);
		tabPanel_1.add(radioButton_2);
		 radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_3 = new JRadioButton("FC5");
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setBounds(6, 99, 51, 23);
		tabPanel_1.add(radioButton_3);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_4 = new JRadioButton("T7");
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setBounds(6, 130, 51, 23);
		tabPanel_1.add(radioButton_4);
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_5 = new JRadioButton("P7");
		radioButton_5.setBackground(Color.WHITE);
		radioButton_5.setBounds(6, 164, 51, 23);
		tabPanel_1.add(radioButton_5);
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_6 = new JRadioButton("O1");
		radioButton_6.setBackground(Color.WHITE);
		radioButton_6.setBounds(6, 195, 51, 23);
		tabPanel_1.add(radioButton_6);
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_7 = new JRadioButton("O2");
		radioButton_7.setBackground(Color.WHITE);
		radioButton_7.setBounds(6, 226, 51, 23);
		tabPanel_1.add(radioButton_7);
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_8 = new JRadioButton("P8");
		radioButton_8.setBackground(Color.WHITE);
		radioButton_8.setBounds(6, 257, 51, 23);
		tabPanel_1.add(radioButton_8);
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_9 = new JRadioButton("T8");
		radioButton_9.setBackground(Color.WHITE);
		radioButton_9.setBounds(6, 288, 51, 23);
		tabPanel_1.add(radioButton_9);
		radioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_10 = new JRadioButton("FC6");
		radioButton_10.setBackground(Color.WHITE);
		radioButton_10.setBounds(6, 319, 51, 23);
		tabPanel_1.add(radioButton_10);
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_11 = new JRadioButton("F4");
		radioButton_11.setBackground(Color.WHITE);
		radioButton_11.setBounds(6, 350, 51, 23);
		tabPanel_1.add(radioButton_11);
		radioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_12 = new JRadioButton("F8");
		radioButton_12.setBackground(Color.WHITE);
		radioButton_12.setBounds(6, 381, 51, 23);
		tabPanel_1.add(radioButton_12);
		radioButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_13 = new JRadioButton("AF4");
		radioButton_13.setBackground(Color.WHITE);
		radioButton_13.setBounds(6, 412, 51, 23);
		tabPanel_1.add(radioButton_13);
		radioButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton radioButton_14 = new JRadioButton("HR");
		radioButton_14.setBackground(Color.WHITE);
		radioButton_14.setBounds(6, 444, 51, 23);
		tabPanel_1.add(radioButton_14);
		radioButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JCheckBox checkBox = new JCheckBox("Hanning");
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(6, 532, 74, 23);
		tabPanel_1.add(checkBox);
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JCheckBox checkBox_1 = new JCheckBox("Hamming");
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setBounds(6, 507, 74, 23);
		tabPanel_1.add(checkBox_1);
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JCheckBox checkBox_2 = new JCheckBox("Blackman");
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setBounds(6, 482, 74, 23);
		tabPanel_1.add(checkBox_2);
		checkBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JCheckBox checkBox_3 = new JCheckBox("Rectangular");
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setBounds(6, 557, 74, 23);
		tabPanel_1.add(checkBox_3);
		checkBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel tabPanel_2 = new JPanel();
		tabPanel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab(" Analysis", null, tabPanel_2, null);
		tabPanel_2.setLayout(null);
		//UIManager.put("TabbedPane.selected", Color.black);
		
		
		// Layout 
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnCapture, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAnalysis, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnStart))
						.addComponent(btnLoad, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(btnLoad)
					.addGap(18)
					.addComponent(btnStart)
					.addGap(18)
					.addComponent(btnAnalysis)
					.addGap(18)
					.addComponent(btnCapture)
					.addContainerGap(397, Short.MAX_VALUE))
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
		);

		contentPane.setLayout(gl_contentPane);
		
	}
}
