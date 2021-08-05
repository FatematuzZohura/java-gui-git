import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String Answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 296, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		//r0w ....0...
		JButton btnarr = new JButton("← ");
		btnarr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arr = null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB= new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					arr = strB.toString();
					textField.setText(arr);
				}
			}
		});
		btnarr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnarr.setBounds(10, 54, 69, 50);
		contentPane.add(btnarr);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null );
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(86, 54,69, 50);
		contentPane.add(btnC);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPer.setBounds(162, 54, 69, 50);
		contentPane.add(btnPer);
		
		JButton btnvag = new JButton("/");
		btnvag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			
			}
		});
		btnvag.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnvag.setBounds(237, 54, 69, 50);
		contentPane.add(btnvag);
		//row 1......
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText() + btn7.getText();
				
				textField.setText(Enternumber );
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 110,69, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn8.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(86, 110,69, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn9.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(162, 110,69, 50);
		contentPane.add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(237, 110,69, 50);
		contentPane.add(btnplus);
		//row 2.......
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn4.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 166,69, 50);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn5.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(86,166,69, 50);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn6.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(162, 166, 69, 50);
		contentPane.add(btn6);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(237, 166,69, 50);
		contentPane.add(btnsub);
		//row 3.............
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn1.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 222,69, 50);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn2.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(86,222,69, 50);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn3.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(162, 222,69, 50);
		contentPane.add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(237, 222,69, 50);
		contentPane.add(btnMult);
		//r0w...4...
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn0.getText();
				
				textField.setText(Enternumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 278,69, 50);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               String Enternumber = textField.getText() + btnDot.getText();
				
				textField.setText(Enternumber );
				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(86,278,69, 50);
		contentPane.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pm = Double.parseDouble(String.valueOf(textField.getText()));
				pm =pm * (-1);
				textField.setText(String.valueOf(pm));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(162, 278,69, 50);
		contentPane.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = firstNumber + secondNumber;
					Answer = String.format("%.2f",result);
					textField.setText(Answer);
					
					
				}
				else if(operations == "-")
				{
					result = firstNumber - secondNumber;
					Answer = String.format("%.2f",result);
					textField.setText(Answer);
					
				}
				else if(operations == "*")
				{
					result = firstNumber * secondNumber;
					Answer = String.format("%.2f",result);
					textField.setText(Answer);
					
				}
				else if(operations == "/")
				{
					result = firstNumber / secondNumber;
					Answer = String.format("%.2f",result);
					textField.setText(Answer);
					
				}
				else if(operations == "%")
				{
					result = firstNumber % secondNumber;
					Answer = String.format("%.2f",result);
					textField.setText(Answer);
					
				}


				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(237, 278,69, 50);
		contentPane.add(btnEqual);
		//row...5
		
		
	}
}
