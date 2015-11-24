package sub;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Sub extends JPanel implements ActionListener {
	TextArea jf = new TextArea(5,5);
    JLabel text;
	// create JTextField
	//final JTextField field = new JTextField();
	private final static String newline = "\n";
	private JButton button1 = new JButton("Make the Sub");
	private JCheckBox firstCheckBox, firstCheckBox1, firstCheckBox2 ; 
	private JCheckBox firstCheckBox3, firstCheckBox4, firstCheckBox5 ; 
	
	final JTextArea label = new JTextArea(4, 16);

    	public Sub (){
            super(new BorderLayout());

    		 String[] petStrings = { "Swiss", "American", "Provolone" };
    		
    		 //Create the combo box, select the item at index 2.
    	    //Indices start at 0, so 4 specifies the pig.
    		final JComboBox tastysub = new JComboBox(petStrings);
   
    		
    		JPanel p = new JPanel();
    		firstCheckBox = new JCheckBox("Ham");
    		firstCheckBox1 = new JCheckBox("Turkey");
    		firstCheckBox2 = new JCheckBox("Roast Beef");
    		
    		firstCheckBox.addActionListener(this);
    		firstCheckBox1.addActionListener(this);
    		firstCheckBox2.addActionListener(this);
    		
    		

    		p.add(firstCheckBox);
    		p.add(firstCheckBox1);
    		p.add(firstCheckBox2);
    		
    		
    		JPanel p3 = new JPanel();
    		firstCheckBox3 = new JCheckBox("Lettuce");
    		firstCheckBox4 = new JCheckBox("Tomato");
    		firstCheckBox5 = new JCheckBox("Olives");
    		
    		p3.add(firstCheckBox3);
    		p3.add(firstCheckBox4);
    		p3.add(firstCheckBox5);
    		
    		JPanel p2 = new JPanel();
    		

    		p2.add(button1);
    		//p2.add(label);
    		label.setEditable(false);
    	     //Lay out the demo.
    	      add(tastysub, BorderLayout.NORTH);
    	      add(p, BorderLayout.WEST);
    	      add(p2,BorderLayout.CENTER);
    	      add(p3, BorderLayout.EAST);
	    	// add textfield to frame
	      	  add(label, BorderLayout.AFTER_LAST_LINE);
	      	  
    	      //setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    	      
    	      button1.addActionListener(new ActionListener( ){
    	    	  
    	    
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					  
					String str = (String)tastysub.getSelectedItem();
					label.setText("This is your sub:\n" + str);
				
					
					Object source = e.getSource();
					if(source instanceof JButton && source == button1){
						if(firstCheckBox.isSelected())
							label.setText("This is your sub:\n" + "Ham\n" + str+ " cheese" );	
						if(firstCheckBox1.isSelected())
							label.setText("This is your sub:\n" + "Turkey\n" + str+ " cheese" );
						if(firstCheckBox2.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str+ " cheese" );
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str+ " cheese" );
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected())
							label.setText("This is your sub:\n" +"Ham, " + "Roast Beef\n" + str + " cheese");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected())
							label.setText("This is your sub:\n" +"Turkey, " + "Roast Beef\n" + str + " cheese");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey, " + "Roast Beef\n" + str + " cheese");
						
						//Condiments
						
						if(firstCheckBox3.isSelected() )
							label.setText("This is your sub:\n" + "Lettuce\n" + str + " cheese");
						if(firstCheckBox4.isSelected() )
							label.setText("This is your sub:\n" + "Tomato\n" +str + " cheese");
						if(firstCheckBox5.isSelected() )
							label.setText("This is your sub:\n" + "Olives\n" + str + " cheese");
						if(firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Lettuce, " + "Tomato\n" + str + " cheese");
						if(firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" +"Lettuce, " + "Olives\n" + str + " cheese");
						if(firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" +"Tomato, " + "Olives\n" + str + " cheese");
						if(firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Lettuce, " +"Tomato, " +"Olives\n" + str + " cheese" );
						
						
						//All togethor
						//Ham
						if(firstCheckBox.isSelected() && firstCheckBox3.isSelected()) //works
							label.setText("This is your sub:\n" +"Ham\n" + str + " cheese\n" + "Lettuce" );
						if(firstCheckBox.isSelected() && firstCheckBox4.isSelected()) //works
							label.setText("This is your sub:\n" +"Ham\n" +  str + " cheese\n" + "Tomato" );
						if(firstCheckBox.isSelected() && firstCheckBox5.isSelected()) //works
							label.setText("This is your sub:\n" +"Ham\n" + str + " cheese\n" + "Olives" );
						if(firstCheckBox.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected()) //works
							label.setText("This is your sub:\n" +"Ham\n" + str + " cheese\n" + "Lettuce, " + "Tomato" );
						if(firstCheckBox.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected()) //works
							label.setText("This is your sub:\n" +"Ham\n" + str + " cheese\n" + "Lettuce, " + "Olives" );
						if(firstCheckBox.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected()) //works
							label.setText("This is your sub:\n" +"Ham\n" + str + " cheese\n" + "Tomato, " + "Olives" );
						if(firstCheckBox.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham\n" + str + " cheese\n" + "Lettuce, " + "Tomato, "+ "Olives");
						
						//Turkey
						if(firstCheckBox1.isSelected() && firstCheckBox3.isSelected())
							label.setText("This is your sub:\n" +"Turkey\n" + str + " cheese\n" + "Lettuce" );
						if(firstCheckBox1.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" +"Turkey\n"+ str + " cheese\n"+ "Tomato" );
						if(firstCheckBox1.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey\n" + str + " cheese\n"+ "Olives");
						if(firstCheckBox.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Turkey\n" + str + " cheese\n" + "Lettuce, " +"Tomato");
						if(firstCheckBox.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey\n" + str + " cheese\n" + "Lettuce, " +"Olives");
						if(firstCheckBox.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey\n" + str + " cheese\n" + "Tomato, " +"Tomato");
						if(firstCheckBox1.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey\n" + str + " cheese\n" + "Lettuce, " + "Tomato, "+ "Olives");
						
						//Roast Beef
						if(firstCheckBox2.isSelected() && firstCheckBox3.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str + " cheese\n" + "Lettuce");
						if(firstCheckBox2.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str + " cheese\n" + "Tomato");
						if(firstCheckBox2.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str + " cheese\n" + "Olives" );
						if(firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This your sub:\n" + "Roast Beef\n" + str +" cheese\n" + "Lettuce, " + "Tomato");
						if(firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str + " cheese\n" +"Lettuce, " +"Olives");
						if(firstCheckBox2.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str + " cheese\n" +"Tomato, " +"Olives");
						if(firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Roast Beef\n" + str + " cheese\n" + "Lettuce, " + "Tomato, "+ "Olives");
						
						//Double Ham and Turkey
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox3.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str + " cheese\n" + "Lettuce");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str + " cheese\n" + "Tomato" );
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str +" cheese\n"+ "Olives");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str + " cheese\n" + "Lettuce, " + "Tomato");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str + " cheese\n" + "Lettuce, " + "Olives" );
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str + " cheese\n" + "Tomato, " + "Olives" );
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey\n" + str + " cheese\n" + "Lettuce, " + "Tomato, "+ "Olives" );
						//Double Ham Roast Beef
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Roast Beef\n" + str + " cheese\n" + "Lettuce");
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Roast Beef\n" +str + " cheese\n" +"Tomato");
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Roast Beef\n" + str + " cheese\n" + "Olives");
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" +"Ham, " + "Roast Beef\n" + str + " cheese\n"+ "Lettuce, "+ "Tomato");
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" +"Ham, " + "Roast Beef\n" + str + " cheese\n"+ "Lettuce, "+ "Olives");
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" +"Ham, " + "Roast Beef\n" + str + " cheese\n"+ "Tomato, "+ "Olives");
						if(firstCheckBox.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" +"Ham, " + "Roast Beef\n" + str + " cheese\n"+ "Lettuce, "+ "Tomato, " + "Olives");
						
						//Double Turkey Roast Beef
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() )
							label.setText("This is your sub:\n" + "Turkey, " + "Roast Beef\n" +str + " cheese\n" + "Lettuce");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Turkey, " + "Roast Beef\n" +str + " cheese\n" + "Tomato");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey, "+ "Roast Beef\n" + str + " cheese\n" + "Olives");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Turkey, " + "Roast Beef\n" + str + " cheese\n" + "Lettuce, "+ "Tomato");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey, " + "Roast Beef\n" + str + " cheese\n" + "Lettuce, "+ "Olives");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey, " + "Roast Beef\n" + str + " cheese\n" + "Tomato, "+ "Olives");
						if(firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Turkey, " + "Roast Beef\n" + str + " cheese\n" + "Lettuce, "+ "Tomato, " + "Olives");
						//All Meat and individual Toppings
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected())
							label.setText("This is your sub:\n" + "Ham, " +"Turkey, " +"Roast Beef\n" + str + " cheese\n" + "Lettuce" );
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey, " +"Roast Beef\n" + str + " cheese\n" + "Tomato");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n"+ "Ham ," + "Turkey, " + "Roast Beef\n" + str + " cheese\n" + "Olives");
						
						//All Meat and Toppings
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey, " + "Roast Beef\n" +str + " cheese\n" + "Lettuce, " + "Tomato");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey, "+ "Roast Beef\n" +str + " cheese\n" + "Lettuce, " + "Olives");
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey, "+ "Roast Beef\n" +str+ " cheese\n" + "Tomato, " + "Olives") ;
						
						
							
						if(firstCheckBox.isSelected() && firstCheckBox1.isSelected() && firstCheckBox2.isSelected() && firstCheckBox3.isSelected() && firstCheckBox4.isSelected() && firstCheckBox5.isSelected())
							label.setText("This is your sub:\n" + "Ham, " + "Turkey, "  +"Roast Beef\n" + str + " cheese\n" + "Lettuce, " +"Tomato, " +"Olives");
						
						
						
					}	
					
					
				
				
				}
    	    	  
    	    	  
    	    	  
    	      }
    	      
    	    		  
    	    		  
    	   );
    	      
    		
    	}
		  /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Tasty Sub");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        

	        //Create and set up the content pane.
	        JComponent newContentPane = new Sub();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);

	        
	        //Display the window.
	        frame.setSize(300, 200);
	        frame.pack();
	        frame.setVisible(true);
	        
	    }
		
		public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }



		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//String text = label.getText();
			//jf.append(text + newline);
			//label.selectAll();
			
		}
    



}