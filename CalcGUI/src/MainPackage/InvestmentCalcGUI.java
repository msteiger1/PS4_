package MainPackage;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class InvestmentCalcGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvestmentCalcGUI window = new InvestmentCalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InvestmentCalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblInvestmentAmount.setBounds(37, 64, 129, 16);
		frame.getContentPane().add(lblInvestmentAmount);

		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(125, 92, 41, 16);
		frame.getContentPane().add(lblYears);

		JLabel lblNewLabel = new JLabel("Annual Interest Rate");
		lblNewLabel.setBounds(37, 120, 129, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(81, 148, 85, 16);
		frame.getContentPane().add(lblFutureValue);

		textField = new JTextField();
		textField.setBounds(196, 61, 95, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 89, 95, 22);
		frame.getContentPane().add(textField_3);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 120, 95, 22);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 148, 95, 22);
		frame.getContentPane().add(textField_2);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double investmentAmount = Double.parseDouble(textField.getText()); 
				int years = (int) Double.parseDouble(textField_3.getText()); 
				double annualInterestRate = Double.parseDouble(textField_1.getText());
				InvestmentCalc proto = new InvestmentCalc();
				double total = proto.investmentCalculator(investmentAmount, years, annualInterestRate);
				textField_2.setText("$" + total);
			}
		});
		btnCalculate.setBounds(112, 176, 117, 29);
		frame.getContentPane().add(btnCalculate);

	}
}
