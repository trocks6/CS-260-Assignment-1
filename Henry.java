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
	
	/** Displays Panels
	 * 
	 */
	
	JPanel displayAuthorPanel    = new JPanel();
	JPanel displayCategoryPanel  = new JPanel();
	JPanel displayPublisherPanel = new JPanel();
	JPanel displayResults        = new JPanel((new GridLayout(10, 2)));

    public Henry() {
		
	/** Create Tab Pages
	 * 
	 */
	
	authorTable();
	categoryTable();
	publisherTable();
	
	JPanel topPanel = new JPanel();
	topPanel.setLayout(new GridLayout(1,3));
	getContentPane().add(topPanel);
	topPanel.add(authorPane,    BorderLayout.CENTER);
	topPanel.add(categoryPane,  BorderLayout.CENTER);
	topPanel.add(publisherPane, BorderLayout.CENTER);
	
	/** Creates Tab Pages
	 * 
	 */
	
	authorPane.addTab("Authors",      displayAuthorPanel);
	categoryPane.addTab("Category",   displayCategoryPanel);
	publisherPane.addTab("Publisher", displayPublisherPanel);
	
	authorPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	categoryPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	publisherPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	
    }
    
    public void authorTable(){
    	displayAuthorPanel.setLayout(new BorderLayout());
    	displayAuthorPanel.add(displayResults, BorderLayout.CENTER);
    	// insert text field
    }
    
    public void categoryTable(){
    	displayCategoryPanel.setLayout(new BorderLayout());
    	displayCategoryPanel.add(displayResults, BorderLayout.CENTER);
    	// insert text field
    }
    
    public void publisherTable(){
    	displayPublisherPanel.setLayout(new BorderLayout());
    	displayPublisherPanel.add(displayResults, BorderLayout.CENTER);
    	// insert text field
    }
}
	






