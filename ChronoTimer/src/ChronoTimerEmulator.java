import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;


public class ChronoTimerEmulator extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the applet.
	 */
	public ChronoTimerEmulator() {
		setSize(800,600);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton powerButton = new JButton("Power");
		powerButton.setBounds(33, 20, 68, 29);
		panel.add(powerButton);
		
		JButton Calc1 = new JButton("1");
		Calc1.setBounds(619, 246, 29, 29);
		Calc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(Calc1);
		
		JButton channel1 = new JButton("1");
		channel1.setBounds(291, 44, 29, 29);
		panel.add(channel1);
		
		JLabel lblNewLabel = new JLabel("CHRONOTIMER 1009");
		lblNewLabel.setBounds(387, 6, 140, 16);
		panel.add(lblNewLabel);
		
		JLabel startLbl = new JLabel("Start");
		startLbl.setBounds(234, 52, 29, 16);
		panel.add(startLbl);
		
		JLabel enableDisplayLbl = new JLabel("Enable/Disable");
		enableDisplayLbl.setBounds(169, 93, 95, 16);
		panel.add(enableDisplayLbl);
		
		JButton channel3 = new JButton("3");
		channel3.setBounds(337, 44, 29, 29);
		panel.add(channel3);
		
		JButton channel5 = new JButton("5");
		channel5.setBounds(385, 44, 29, 29);
		panel.add(channel5);
		
		JButton channel7 = new JButton("7");
		channel7.setBounds(431, 44, 29, 29);
		panel.add(channel7);
		
		JCheckBox check1 = new JCheckBox("");
		check1.setBounds(291, 85, 29, 28);
		panel.add(check1);
		
		JCheckBox check3 = new JCheckBox("");
		check3.setBounds(337, 85, 29, 28);
		panel.add(check3);
		
		JCheckBox check5 = new JCheckBox("");
		check5.setBounds(385, 85, 29, 28);
		panel.add(check5);
		
		JCheckBox check7 = new JCheckBox("");
		check7.setBounds(431, 85, 29, 28);
		panel.add(check7);
		
		JLabel finishLbl = new JLabel("Finish");
		finishLbl.setBounds(225, 164, 38, 16);
		panel.add(finishLbl);
		
		JLabel enableDisableLbl2 = new JLabel("Enable/Disable");
		enableDisableLbl2.setBounds(169, 200, 95, 16);
		panel.add(enableDisableLbl2);
		
		JButton finishButton2 = new JButton("2");
		finishButton2.setBounds(291, 159, 29, 29);
		panel.add(finishButton2);
		
		JButton finishButton4 = new JButton("4");
		finishButton4.setBounds(337, 159, 29, 29);
		panel.add(finishButton4);
		
		JButton finishButton6 = new JButton("6");
		finishButton6.setBounds(387, 159, 29, 29);
		panel.add(finishButton6);
		
		JButton finishButton8 = new JButton("8");
		finishButton8.setBounds(431, 159, 29, 29);
		panel.add(finishButton8);
		
		JCheckBox check2 = new JCheckBox("");
		check2.setBounds(291, 195, 29, 28);
		panel.add(check2);
		
		JCheckBox check4 = new JCheckBox("");
		check4.setBounds(337, 196, 29, 28);
		panel.add(check4);
		
		JCheckBox check6 = new JCheckBox("");
		check6.setBounds(387, 196, 29, 28);
		panel.add(check6);
		
		JCheckBox check8 = new JCheckBox("");
		check8.setBounds(431, 196, 29, 28);
		panel.add(check8);
		
		JButton btnPrinterPower = new JButton("Printer Power");
		btnPrinterPower.setBounds(626, 20, 117, 29);
		panel.add(btnPrinterPower);
		
		JTextPane consoleText = new JTextPane();
		consoleText.setBounds(246, 246, 252, 179);
		panel.add(consoleText);
		
		JTextPane printerText = new JTextPane();
		printerText.setBounds(598, 52, 180, 160);
		panel.add(printerText);
		
		JButton Calc2 = new JButton("2");
		Calc2.setBounds(648, 246, 29, 29);
		panel.add(Calc2);
		
		JButton Calc3 = new JButton("3");
		Calc3.setBounds(677, 246, 29, 29);
		panel.add(Calc3);
		
		JButton Calc4 = new JButton("4");
		Calc4.setBounds(619, 273, 29, 29);
		panel.add(Calc4);
		
		JButton Calc5 = new JButton("5");
		Calc5.setBounds(648, 273, 29, 29);
		panel.add(Calc5);
		
		JButton Calc6 = new JButton("6");
		Calc6.setBounds(677, 273, 29, 29);
		panel.add(Calc6);
		
		JButton Calc7 = new JButton("7");
		Calc7.setBounds(619, 301, 29, 29);
		panel.add(Calc7);
		
		JButton Calc8 = new JButton("8");
		Calc8.setBounds(648, 301, 29, 29);
		panel.add(Calc8);
		
		JButton Calc9 = new JButton("9");
		Calc9.setBounds(677, 301, 29, 29);
		panel.add(Calc9);
		
		JButton CalcStar = new JButton("*");
		CalcStar.setBounds(619, 328, 29, 29);
		panel.add(CalcStar);
		
		JButton Calc0 = new JButton("0");
		Calc0.setBounds(648, 328, 29, 29);
		panel.add(Calc0);
		
		JButton CalcPound = new JButton("#");
		CalcPound.setBounds(677, 328, 29, 29);
		panel.add(CalcPound);
		
		JButton btnFunction = new JButton("Function");
		btnFunction.setBounds(40, 301, 117, 29);
		panel.add(btnFunction);
		
		JButton btnUp = new JButton("^");
		btnUp.setBounds(19, 342, 29, 29);
		panel.add(btnUp);
		
		JButton btnDown = new JButton("V");
		btnDown.setBounds(60, 342, 29, 29);
		panel.add(btnDown);
		
		JButton buttonLeft = new JButton("<");
		buttonLeft.setBounds(101, 342, 29, 29);
		panel.add(buttonLeft);
		
		JButton buttonRight = new JButton(">");
		buttonRight.setBounds(142, 342, 29, 29);
		panel.add(buttonRight);
		
		JButton btnSwap = new JButton("Swap");
		btnSwap.setBounds(40, 488, 117, 29);
		panel.add(btnSwap);
		
		

	}
}
