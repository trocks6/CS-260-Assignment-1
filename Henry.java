import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

@SuppressWarnings("serial")
public class Henry extends JFrame{
	
	/** Creates Panes
	 * 
	 */
	
	JTabbedPane authorPane    = new JTabbedPane();
	JTabbedPane categoryPane  = new JTabbedPane();
	JTabbedPane publisherPane = new JTabbedPane();
	
	/** Creates Text Field
	 * 
	 */
	
	JTextField jtf_cost = new JTextField();
	
    public Henry() {
    	
    	/** Creates Panels
    	 * 
    	 */
    	
    	SearchByAuthorPanel.createPanel();
    	SearchByCategoryPanel.createPanel();
    	SearchByPublisherPanel.createPanel();
    	createTopPanel();
    }
    
    public void createTopPanel(){
    	JPanel topPanel = new JPanel();
    	topPanel.setLayout(new GridLayout(1,3));
    	getContentPane().add(topPanel);
    	topPanel.add(authorPane,    BorderLayout.CENTER);
    	topPanel.add(categoryPane,  BorderLayout.CENTER);
    	topPanel.add(publisherPane, BorderLayout.CENTER);

    }
}
	






