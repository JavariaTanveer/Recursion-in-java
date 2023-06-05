
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class t1 extends JFrame {

	double amount;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t1 frame = new t1();
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
	public t1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 250, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Currency Calculator", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLUE));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMOUNT");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 67, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(200, 67, 74, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(350, 67, 67, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(10, 104, 131, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EURO", "US DOLLAR"}));
		comboBox.setBounds(176, 104, 98, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PAKISTAN RUPEE", "BRITISH POUND"}));
		comboBox_1.setBounds(323, 104, 141, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("CONVERTED AMOUNT");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setBounds(28, 196, 163, 30);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 199, 153, 25);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CONVERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
				amount =Double.parseDouble(textField.getText());
				if(comboBox.getSelectedItem().toString()=="EURO"   && comboBox_1.getSelectedItem().toString()=="PAKISTAN RUPEE")
				{
					double result= amount*213.82;
					textField_1.setText(Double.toString(result));
				}
				
				else if((comboBox.getSelectedItem().toString()=="EURO"   && comboBox_1.getSelectedItem().toString()=="BRITISH POUND"))
				{
					double result= amount*0.85;
					textField_1.setText(Double.toString(result));
				}
				if(comboBox.getSelectedItem().toString()=="US DOLLAR"   && comboBox_1.getSelectedItem().toString()=="PAKISTAN RUPEE")
				{
					double result= amount*198.67;
					textField_1.setText(Double.toString(result));
				}
				else if(comboBox.getSelectedItem().toString()=="US DOLLAR"   && comboBox_1.getSelectedItem().toString()=="BRITISH POUND")
				{
					double result= amount*0.79;
					textField_1.setText(Double.toString(result));
				}
				}
				catch(Exception NumberFormat)
				{
					JOptionPane.showMessageDialog(btnNewButton, NumberFormat,"Please Enter Valid Number", JOptionPane.ERROR_MESSAGE);
				}
				
			}
				
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(133, 281, 98, 38);
		panel.add(btnNewButton);
	}
}
