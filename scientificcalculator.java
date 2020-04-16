package myfirstapplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class scientificcalculator {

	private JFrame frame;
	private JTextField textField;
	private String inp=new String();
	private String inp2=new String();
	private String func=new String();
	private String factres=new String();
	private String result=new String();
	private JTextField textField_1;
	private int flag=0;
	
	public void checkFunc(String s) {
		if(func.equals("")) {
			inp2=inp2+s;
		}
		else if(func.equals("+")) {
			inp2=inp2+s;
			result=Float.toString(Float.parseFloat(inp)+Float.parseFloat(inp2));
		}
		else if(func.equals("-")) {
			inp2=inp2+s;
			result=Float.toString(Float.parseFloat(inp)-Float.parseFloat(inp2));
		}
		else if(func.equals("*")) {
			inp2=inp2+s;
			result=Float.toString(Float.parseFloat(inp)*Float.parseFloat(inp2));
		}
		else if(func.equals("/")) {
			inp2=inp2+s;
			result=Float.toString(Float.parseFloat(inp)/Float.parseFloat(inp2));
		}
		else if(func.equals("^")) {
			inp2=inp2+s;
			result=Double.toString(Math.pow(Double.parseDouble(inp), Double.parseDouble(inp2)));
		}
		else if(func.equals("rem")) {
			inp2=inp2+s;
			result=Float.toString((Float.parseFloat(inp))%Math.round(Float.parseFloat(inp2)));
		}
		else if(func.equals("%")) {
			inp2=inp2+s;
			result=Double.toString(100*(Double.parseDouble(inp)/Double.parseDouble(inp2)));
		}
		else if(func.equals("root")) {
			func="";
			inp2=inp+s;
			inp="";
			result="";
		}
		else if(func.equals("!")) {
			func="";
			inp2=inp+s;
			inp="";
			result="";
		}
	}
	
	public void executeFunction(String s) {
		if(func.equals("")) {
			if(flag==0) {
				inp=inp2;
			inp2="";
			func=s;
			}
			else if(flag==1) {
				func=s;
			}
		}
		else if(func.equals("+")) {
			result=Float.toString(Float.parseFloat(inp)+Float.parseFloat(inp2));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("-")) {
			result=Float.toString(Float.parseFloat(inp)-Float.parseFloat(inp2));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("*")) {
			result=Float.toString(Float.parseFloat(inp)*Float.parseFloat(inp2));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("/")) {
			result=Float.toString(Float.parseFloat(inp)/Float.parseFloat(inp2));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("^")) {
			result=Double.toString(Math.pow(Double.parseDouble(inp), Double.parseDouble(inp2)));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("rem")) {
			result=Float.toString(Float.parseFloat(inp)%Math.round(Float.parseFloat(inp2)));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("%")) {
			result=Double.toString(100*(Double.parseDouble(inp)/Double.parseDouble(inp2)));
			inp=result;
			result="";
			inp2="";
			func=s;
		}
		else if(func.equals("root")) {
			func=s;
		}
		else if(func.equals("!")) {
			func=s;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificcalculator window = new scientificcalculator();
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
	public scientificcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 605, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(38, 233, 48, 36);
		ActionListener ac1=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("1");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton.addActionListener(ac1);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton_1.setBounds(98, 233, 48, 36);
		ActionListener ac2=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("2");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_1.addActionListener(ac2);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(158, 233, 48, 36);
		ActionListener ac3=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("3");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_2.addActionListener(ac3);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(38, 281, 48, 36);
		ActionListener ac4=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("4");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_3.addActionListener(ac4);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(98, 281, 48, 36);
		ActionListener ac5=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("5");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_4.addActionListener(ac5);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(158, 281, 48, 36);
		ActionListener ac6=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("6");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_5.addActionListener(ac6);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(38, 329, 48, 36);
		ActionListener ac7=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("7");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_6.addActionListener(ac7);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(98, 329, 48, 36);
		ActionListener ac8=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("8");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_7.addActionListener(ac8);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(158, 329, 48, 36);
		ActionListener ac9=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("9");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_8.addActionListener(ac9);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBounds(98, 377, 48, 36);
		ActionListener ac0=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				checkFunc("0");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_9.addActionListener(ac0);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.setBounds(38, 377, 48, 36);
		ActionListener ac=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				inp2=inp2+".";
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_10.addActionListener(ac);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnNewButton_11.setBounds(531, 303, 54, 54);
		ActionListener resul=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("=");
				func="";
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_11.addActionListener(resul);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setBounds(295, 237, 54, 54);
		ActionListener acadd=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("+");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12.addActionListener(acadd);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_12_1 = new JButton("-");
		btnNewButton_12_1.setBounds(373, 237, 54, 54);
		ActionListener acsub=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("-");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);

				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12_1.addActionListener(acsub);
		frame.getContentPane().add(btnNewButton_12_1);
		
		JButton btnNewButton_12_2 = new JButton("x");
		btnNewButton_12_2.setBounds(452, 237, 54, 54);
		ActionListener acmul=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("*");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);

				
			}
			
		};
		btnNewButton_12_2.addActionListener(acmul);
		frame.getContentPane().add(btnNewButton_12_2);
		
		JButton btnNewButton_12_3 = new JButton("/");
		btnNewButton_12_3.setBounds(531, 237, 54, 54);
		ActionListener acdiv=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("/");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);

				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12_3.addActionListener(acdiv);
		frame.getContentPane().add(btnNewButton_12_3);
		
		JButton btnNewButton_12_4 = new JButton("^");
		btnNewButton_12_4.setBounds(295, 303, 54, 54);
		ActionListener acpow=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("^");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);

				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12_4.addActionListener(acpow);
		frame.getContentPane().add(btnNewButton_12_4);
		
		JButton btnNewButton_12_5 = new JButton("root");
		btnNewButton_12_5.setBounds(373, 303, 54, 54);
		ActionListener acroot=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("root");
				result=Double.toString(Math.sqrt(Double.parseDouble(inp)));
				flag=1;
				inp=result;
				inp2="";
				textField.setText(inp+func+inp2);
				textField_1.setText(result);
				func="root";
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12_5.addActionListener(acroot);
		frame.getContentPane().add(btnNewButton_12_5);
		
		JButton btnNewButton_12_6 = new JButton("!");
		btnNewButton_12_6.setBounds(452, 303, 54, 54);
		ActionListener acfact=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				executeFunction("!");
				int fact=1;
				for(int i=1;i<=Math.round(Double.parseDouble(inp));i++) {
					fact=fact*i;
				}
				factres=Integer.toString(fact);
				flag=1;
				result=factres;
				inp=result;
				inp2="";
				textField.setText(inp+func+inp2);
				textField_1.setText(result);
				func="!";
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12_6.addActionListener(acfact);
		frame.getContentPane().add(btnNewButton_12_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(38, 150, 525, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_12_6_1 = new JButton("CLEAR");
		btnNewButton_12_6_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_12_6_1.setBounds(531, 369, 54, 54);
		ActionListener acclr=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inp2="";
				inp="";
				func="";
				factres="";
				result="";
				textField.setText("");
				textField_1.setText("");
				flag=0;
				// TODO Auto-generated method stub
				
			}
			
		};
		btnNewButton_12_6_1.addActionListener(acclr);
		frame.getContentPane().add(btnNewButton_12_6_1);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(159, 6, 268, 47);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(38, 72, 525, 66);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_9_1 = new JButton("DEL");
		btnNewButton_9_1.setBounds(158, 377, 48, 36);
		ActionListener delete=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
					if(inp2.equals("")) {
						if(func.equals("")) {
							if(inp.equals("")) {
								result="";
								textField.setText(inp+func+inp2);
								textField_1.setText(result);
							}
							else {
								inp=inp.substring(0, (inp.length())-1);
								result="";
								textField.setText(inp+func+inp2);
								textField_1.setText(result);
							}
						}
						else {
							func="";
							result="";
							textField.setText(inp+func+inp2);
							textField_1.setText(result);
						}
					}
					else {
						if(inp2.length()>1) {
						inp2=inp2.substring(0, (inp2.length())-1);
						textField.setText(inp+func+inp2);
						}
						else {
							inp2="";
							textField.setText(inp+func);
						}
						checkFunc("");
						textField_1.setText(result);
					}
			}
			
		};
		btnNewButton_9_1.addActionListener(delete);
		frame.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_12_7 = new JButton("rem");
		btnNewButton_12_7.setBounds(295, 369, 54, 54);
		ActionListener remainder=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				executeFunction("rem");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
			}
			
		};
		btnNewButton_12_7.addActionListener(remainder);
		frame.getContentPane().add(btnNewButton_12_7);
		
		JButton btnNewButton_12_7_1 = new JButton("%");
		btnNewButton_12_7_1.setBounds(373, 369, 54, 54);
		ActionListener percent=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				executeFunction("%");
				textField.setText(inp+func+inp2);
				flag=0;
				textField_1.setText(result);
			}
			
		};
		btnNewButton_12_7_1.addActionListener(percent);
		frame.getContentPane().add(btnNewButton_12_7_1);
		
		JButton btnNewButton_12_7_1_1 = new JButton("BASE");
		btnNewButton_12_7_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_12_7_1_1.setBounds(452, 369, 54, 54);
		frame.getContentPane().add(btnNewButton_12_7_1_1);
	}
}
