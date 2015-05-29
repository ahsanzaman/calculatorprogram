
/**
 * Simple Calculator program made to test gui.
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Source extends JFrame {
	
	/**
	 *  Can't remember why this is needed.
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel result;
	JTextField inputText;
	JButton[] button;
	JMenuBar menuBar;
	JMenu file, help;
	JMenuItem exit, about;
	public Source() {
		
		Container pane = this.getContentPane();
		
		// Initializing and setting up the buttons
		// will complete buttons later
		int i;
		for( i=0; i<10 ;i++ ) {
			button[i] = new JButton( i+"" );
		}
		button[i] = new JButton( "+" );
		i++;
		button[i] = new JButton( "-" );
		i++;
		button[i] = new JButton( "*" );
		i++;
		button[i] = new JButton( "/" );
		
		
		menuBar = new JMenuBar();
		pane.add( menuBar );
		
		file = new JMenu( "File" );
		menuBar.add( file );
		
		help = new JMenu( "Help" );
		menuBar.add( help );
		
		Event e = new Event();
		
		// adding exit option to the file menu and assigning an action listener
		exit = new JMenuItem( "Exit" );
		exit.addActionListener( e );
		file.add( exit );
		
		// Adding about option to the help menu and assigning an action listener
		about = new JMenuItem( "About" );
		about.addActionListener( e );
		help.add( about );
		
	}
	
	public class Event implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if( e.getSource() == about ) {
				
			} else if( e.getSource() == exit ) {
				System.exit( 0) ;
			}
		}
	}
	
	public static void main( String[] args ) {
		
	}
	
	
}
