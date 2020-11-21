// Java program to create a simple calculator 
// with basic +, -, /, * using java swing elements 

import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class calculator extends JFrame implements ActionListener { 
	// create a frame 
	static JFrame f; 

	// create a textfield 
	static JTextField text; 

	// store oprerator and operands 
	String s0, s1, s2; 
 
	calculator() 
	{ 
		s0 = s1 = s2 = ""; 
	} 

	// main function 
	public static void main(String args[]) 
	{ 
		f = new JFrame("calculator"); 

		try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (Exception e) {
            System.err.println(e);
        }
		calculator c = new calculator(); 

		text = new JTextField(16); 

		text.setEditable(false); 
                text.setToolTipText("Screen for see the final result");

		// create number buttons and some operators 
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bd,bm,be,beq,beq1,bu0,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,bueq1,bua,bus,bud,bum,bsin,bcos,btan,bcot,bshift,bushift; 

                bshift = new JButton("shift");
                bushift = new JButton("shift");
               
		// create number buttons 
		b0 = new JButton("0"); 
		b1 = new JButton("1"); 
		b2 = new JButton("2"); 
		b3 = new JButton("3"); 
		b4 = new JButton("4"); 
		b5 = new JButton("5"); 
		b6 = new JButton("6"); 
		b7 = new JButton("7"); 
		b8 = new JButton("8"); 
		b9 = new JButton("9"); 
                
                bu0 = new JButton("0"); 
		bu1 = new JButton("1"); 
		bu2 = new JButton("2"); 
		bu3 = new JButton("3"); 
		bu4 = new JButton("4"); 
		bu5 = new JButton("5"); 
		bu6 = new JButton("6"); 
		bu7 = new JButton("7"); 
		bu8 = new JButton("8"); 
		bu9 = new JButton("9"); 

		// equals button 
		beq1 = new JButton("="); 
                beq1.setToolTipText("Use it at end of your command to see result");
                bueq1 = new JButton("="); 
                bueq1.setToolTipText("Use it at end of your command to see result");
                
		// create operator buttons 
		ba = new JButton("+"); 
		bs = new JButton("-"); 
		bd = new JButton("/"); 
		bm = new JButton("*"); 
                
                bua = new JButton("+"); 
		bus = new JButton("-"); 
		bud = new JButton("/"); 
		bum = new JButton("*");
                bsin = new JButton("sin");
                bcos = new JButton("cos");
                btan = new JButton("tan");
                bcot = new JButton("cot");

		// create a panel 
		JPanel p1 = new JPanel();
                p1.setLocation(20, 200);
        p1.setSize(250,200);   
        p1.setLayout(new GridLayout(4,3));
                
                JPanel p2 = new JPanel();
                p2.setLocation(20, 200);
        p2.setSize(250,200);   
        p2.setLayout(new GridLayout(4,3));

                JTabbedPane tabbedPane = new JTabbedPane();
                
		// add action listeners 
		bm.addActionListener(c); 
		bd.addActionListener(c); 
		bs.addActionListener(c); 
		ba.addActionListener(c); 
		b9.addActionListener(c); 
		b8.addActionListener(c); 
		b7.addActionListener(c); 
		b6.addActionListener(c); 
		b5.addActionListener(c); 
		b4.addActionListener(c); 
		b3.addActionListener(c); 
		b2.addActionListener(c); 
		b1.addActionListener(c); 
		b0.addActionListener(c); 
		beq1.addActionListener(c); 

		// add elements to panel  
		p2.add(bua); 
		p2.add(bu1); 
		p2.add(bu2); 
		p2.add(bu3); 
		p2.add(bus); 
		p2.add(bu4); 
		p2.add(bu5); 
		p2.add(bu6); 
		p2.add(bum); 
		p2.add(bu7); 
		p2.add(bu8); 
		p2.add(bu9); 
		p2.add(bud); 
		p2.add(bu0); 
		p2.add(bueq1); 
                p2.add(bsin);
                p2.add(bcos);
                p2.add(btan);
                p2.add(bcot);
                p2.add(bushift);
                
		p1.add(ba); 
		p1.add(b1); 
		p1.add(b2); 
		p1.add(b3); 
		p1.add(bs); 
		p1.add(b4); 
		p1.add(b5); 
		p1.add(b6); 
		p1.add(bm); 
		p1.add(b7); 
		p1.add(b8); 
		p1.add(b9); 
		p1.add(bd); 
		p1.add(b0); 
		p1.add(beq1); 
                p1.add(bshift);
 
        text.setSize(277, 150);
        text.setLocation(3, 15);
        text.setEditable(false);
                f.add(text);


		f.add(p1);
                f.add(p2);

		f.setSize(300, 550);
        f.setLocation(100, 100);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        tabbedPane.setBounds(5, 170, 273, 260);
        tabbedPane.add("Normal", p1);
        tabbedPane.add("Scientist", p2);
        f.add(tabbedPane);
        f.setVisible(true); 
        
        JMenuBar jmb = new JMenuBar();
         f.setJMenuBar(jmb);
         
         JMenu m1 = new JMenu("Menu 1");
         m1.setMnemonic('M');
         jmb.add(m1);
         
         JMenuItem exit;
         exit = new JMenuItem("Exit");
         exit.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 System.exit(0);
             }
         });
         m1.add(exit);
         exit.setMnemonic('E');
         
         
         JMenuItem about;
         about = new JMenuItem("about");
         about.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null, "AUT Calculator....");
             }
         });
         m1.add(about);
         about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
         
         JMenuItem copy;
         copy = new JMenuItem("copy");
         copy.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
             }
         });
         m1.add(copy);
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
	} 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 

		// if the value is a number 
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) { 
			// if operand is present then add to second no 
			if (!s1.equals("")) 
				s2 = s2 + s; 
			else
				s0 = s0 + s; 

			// set the value of text 
			text.setText(s0 + s1 + s2); 
		} 

		else if (s.charAt(0) == '=') { 

			double te; 

			// store the value in 1st 
			if (s1.equals("+")) 
				te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
			else if (s1.equals("-")) 
				te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
			else if (s1.equals("/")) 
				te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

			// set the value of text 
			text.setText(s0 + s1 + s2 + "=" + te); 

			// convert it to string 
			s0 = Double.toString(te); 

			s1 = s2 = ""; 
		} 
		else { 
			// if there was no operand 
			if (s1.equals("") || s2.equals("")) 
				s1 = s; 
			// else evaluate 
			else { 
				double te; 

				// store the value in 1st 
				if (s1.equals("+")) 
					te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
				else if (s1.equals("-")) 
					te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
				else if (s1.equals("/")) 
					te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

				// convert it to string 
				s0 = Double.toString(te); 

				// place the operator 
				s1 = s; 

				// make the operand blank 
				s2 = ""; 
			} 

			// set the value of text 
			text.setText(s0 + s1 + s2); 
		} 
	} 
} 
