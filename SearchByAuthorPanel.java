import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class SearchByAuthorPanel extends JPanel{
	
	static JPanel displayResults        = new JPanel((new GridLayout(10, 2)));

	
	public static void createPanel(){
		
		JTabbedPane authorPane    = new JTabbedPane();
		
		JPanel displayAuthorPanel = new JPanel();
		
		/** Creates Tab Pages
		 * 
		 */
		
		authorPane.addTab("Authors", displayAuthorPanel);
		authorPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		/** Creates Table
		 * 
		 */
		
    	displayAuthorPanel.setLayout(new BorderLayout());
    	displayAuthorPanel.add(displayResults, BorderLayout.CENTER);
    	// insert text field
	}
}