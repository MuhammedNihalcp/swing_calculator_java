import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	

	

	boolean isOperaterClicked=false;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton sixbutton;
	JButton fivebutton;
	JButton fourbutton;
	JButton onebutton;
	JButton Twobutton;
	JButton Threebutton;
	JButton zerobutton;
	JButton doublezerobutton;
	JButton Dotbutton;
	JButton Equalbutton;
	JButton plusbutton;
	JButton multibutton;
	JButton subbutton;
	JButton divbutton;
	JButton Clearbutton,delbutton,pesebutton;
	
	String oldVlaue;
	float result;
	int op=1;
	
	
	
	
	public Calculator() {
	    jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(520, 700);
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		jf.setLocation(300, 10);
		
		displayLabel = new JLabel("");
		displayLabel.setBounds(40, 30, 450, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(40, 210, 80, 80);
		sevenbutton.addActionListener(this);
		sevenbutton.setBackground(Color.DARK_GRAY);
		sevenbutton.setForeground(Color.WHITE);
		sevenbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sevenbutton);
		
		 eightbutton=new JButton("8");
		eightbutton.setBounds(160, 210, 80,80);
		eightbutton.addActionListener(this);
		eightbutton.setBackground(Color.DARK_GRAY);
		eightbutton.setForeground(Color.WHITE);
		eightbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(eightbutton);
		
		 ninebutton=new JButton("9");
		ninebutton.setBounds(280, 210, 80,80);
		ninebutton.addActionListener(this);
		ninebutton.setBackground(Color.DARK_GRAY);
		ninebutton.setForeground(Color.WHITE);
        ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(ninebutton);
		
		
		 sixbutton=new JButton("6");
		sixbutton.setBounds(40,330, 80,80);
		sixbutton.addActionListener(this);
		sixbutton.setBackground(Color.DARK_GRAY);
		sixbutton.setForeground(Color.WHITE);
		sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sixbutton);
		
		
		 fivebutton=new JButton("5");
		fivebutton.setBounds(160, 330, 80,80);
		fivebutton.addActionListener(this);
		fivebutton.setBackground(Color.DARK_GRAY);
		fivebutton.setForeground(Color.WHITE);
		fivebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fivebutton);
		
		 fourbutton=new JButton("4");
		fourbutton.setBounds(280, 330, 80,80);
		fourbutton.addActionListener(this);
		fourbutton.setBackground(Color.DARK_GRAY);
		fourbutton.setForeground(Color.WHITE);
		fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fourbutton);
		
		 onebutton=new JButton("1");
		onebutton.setBounds(40,450, 80,80);
		onebutton.addActionListener(this);
		onebutton.setBackground(Color.DARK_GRAY);
		onebutton.setForeground(Color.WHITE);
		onebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(onebutton);
		
		 Twobutton=new JButton("2");
		Twobutton.setBounds(160,450, 80,80);
		Twobutton.addActionListener(this);
		Twobutton.setBackground(Color.DARK_GRAY);
		Twobutton.setForeground(Color.WHITE);
		Twobutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(Twobutton);
		
		 Threebutton=new JButton("3");
		Threebutton.setBounds(280,450, 80,80);
		Threebutton.addActionListener(this);
		Threebutton.setForeground(Color.WHITE);
		Threebutton.setBackground(Color.DARK_GRAY);
		Threebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(Threebutton);
		
		 zerobutton=new JButton("0");
		zerobutton.setBounds(40,570, 80,80);
		zerobutton.addActionListener(this);
		zerobutton.setBackground(Color.DARK_GRAY);
		zerobutton.setForeground(Color.WHITE);
		zerobutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(zerobutton);
		
		 doublezerobutton=new JButton("00");
		doublezerobutton.setBounds(160,570, 80,80);
		doublezerobutton.addActionListener(this);
		doublezerobutton.setBackground(Color.DARK_GRAY);
		doublezerobutton.setForeground(Color.WHITE);
		doublezerobutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(doublezerobutton);
		
		 Dotbutton=new JButton(".");
		Dotbutton.setBounds(280,570, 80,80);
		Dotbutton.addActionListener(this);
		Dotbutton.setBackground(Color.DARK_GRAY);
	    Dotbutton.setForeground(Color.WHITE);
		Dotbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(Dotbutton);
		
		 Equalbutton=new JButton("=");
		Equalbutton.setBounds(400,450, 80,200);
		Equalbutton.addActionListener(this);
		Equalbutton.setBackground(Color.orange);
		Equalbutton.setForeground(Color.WHITE);
		Equalbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(Equalbutton);
		
		 plusbutton=new JButton("+");
		plusbutton.setBounds(400,330, 80,80);
		plusbutton.addActionListener(this);
		plusbutton.setBackground(Color.orange);
		plusbutton.setForeground(Color.WHITE);
		
		plusbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(plusbutton);
		
		 subbutton=new JButton("-");
		subbutton.setBounds(400, 210, 80,80);
		subbutton.addActionListener(this);
		subbutton.setBackground(Color.orange);
		subbutton.setForeground(Color.WHITE);
		subbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(subbutton);
		
		 multibutton=new JButton("x");
		multibutton.setBounds(400, 90, 80,80);
		multibutton.addActionListener(this);
		multibutton.setBackground(Color.orange);
		multibutton.setForeground(Color.WHITE);
		multibutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(multibutton);
		
		 divbutton=new JButton("/");
		divbutton.setBounds(280, 90, 80,80);
		divbutton.addActionListener(this);
		divbutton.setBackground(Color.LIGHT_GRAY);
		divbutton.setForeground(Color.WHITE);
		divbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(divbutton);
		
		 Clearbutton=new JButton("C");
		Clearbutton.setBounds(40,90, 80,80);
		Clearbutton.addActionListener(this);
		Clearbutton.setBackground(Color.LIGHT_GRAY);
		Clearbutton.setForeground(Color.WHITE);
		Clearbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(Clearbutton);
		
		 delbutton=new JButton("D");
			delbutton.setBounds(160,90, 80,80);
			delbutton.addActionListener(this);
			delbutton.setBackground(Color.LIGHT_GRAY); 
			delbutton.setForeground(Color.WHITE);
			delbutton.setFont(new Font("Arial",Font.PLAIN,40));
			jf.add(delbutton);
			
			
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			if(isOperaterClicked) {
				displayLabel.setText("7");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
				
			}
			
			
		}else if(e.getSource()==eightbutton) {
			if(isOperaterClicked) {
				displayLabel.setText("8");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
				
			}
			
		}else if(e.getSource()==ninebutton) {
			if(isOperaterClicked) {
				displayLabel.setText("9");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
				
			}
			
		}else if(e.getSource()==sixbutton) {
			if(isOperaterClicked) {
				displayLabel.setText("6");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
				
			}
			
		}else if(e.getSource()==fivebutton) {
			if(isOperaterClicked) {
				displayLabel.setText("5");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
				
			}
			
		}else if(e.getSource()==fourbutton) {
			if(isOperaterClicked) {
				displayLabel.setText("4");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
				
			}
			
		
		}else if(e.getSource()==onebutton) {
			if(isOperaterClicked) {
				displayLabel.setText("1");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
				
			}
			
		}else if(e.getSource()==Twobutton) {
			if(isOperaterClicked) {
				displayLabel.setText("2");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
				
			}
			
		}else if(e.getSource()==Threebutton) {
			if(isOperaterClicked) {
				displayLabel.setText("3");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
				
			}
			
		}else if(e.getSource()==zerobutton) {
			if(isOperaterClicked) {
				displayLabel.setText("0");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
				
			}
			
		}else if(e.getSource()==doublezerobutton) {
			if(isOperaterClicked) {
				displayLabel.setText("00");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"00");
				
			}
			
		}else if(e.getSource()==Dotbutton) {
			if(isOperaterClicked) {
				displayLabel.setText(".");
				isOperaterClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
				
			}
			
		}else if(e.getSource()==Equalbutton) {
			
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldVlaue);
			float newValueF=Float.parseFloat(newValue);
			
			
			switch(op) {
			case 1:result=oldValueF+newValueF;
			break;
			case 2:result=oldValueF-newValueF;
			break;
			case 3:result=oldValueF*newValueF;
			break;
			case 4:result=oldValueF/newValueF;
			break;
			}
			displayLabel.setText(result+"");
			
			
			
			
			
			
			
			
			
			
			
		   
		   
		   
		    
		     
		     
				
		}else if(e.getSource()==plusbutton) {
			isOperaterClicked=true;
			oldVlaue=displayLabel.getText();
			op=1;
			
			
		}else if(e.getSource()==subbutton) {
			isOperaterClicked=true;
			oldVlaue=displayLabel.getText();
			op=2;
			
			
		}else if(e.getSource()==multibutton) {
			isOperaterClicked=true;
			oldVlaue=displayLabel.getText();
			op=3;
			
			
		}else if(e.getSource()==divbutton) {
			isOperaterClicked=true;
			oldVlaue=displayLabel.getText();
			op=4;
			
		}else if(e.getSource()==Clearbutton) {
			displayLabel.setText("");
			
		}else if(e.getSource()==delbutton) {
			String s=displayLabel.getText();
			displayLabel.setText("");
			for(int i=0;i<s.length()-1;i++) {
				displayLabel.setText(displayLabel.getText()+s.charAt(i));
			}
		
		}
		
	}

}
