import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class SearchByCategoryPanel extends JPanel{
	
	static JPanel displayResults = new JPanel((new GridLayout(10, 2)));

	public static void createPanel(){
		
		JTabbedPane categoryPane  = new JTabbedPane();
		
		/** Displays Panels
		 * 
		 */
		
		JPanel displayCategoryPanel  = new JPanel();
		
		/** Creates Tab Pages
		 * 
		 */
		
		categoryPane.addTab("Category",   displayCategoryPanel);
		categoryPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		/** Creates Table
		 * 
		 */
		
    	displayCategoryPanel.setLayout(new BorderLayout());
    	displayCategoryPanel.add(displayResults, BorderLayout.CENTER);
    	// insert text field

	}
}
