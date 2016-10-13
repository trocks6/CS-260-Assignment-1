import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class SearchByPublisherPanel extends JPanel {
	
	static JPanel displayResults = new JPanel((new GridLayout(10, 2)));

	public static void createPanel(){
		
		JTabbedPane publisherPane = new JTabbedPane();
		
		/** Displays Panels
		 * 
		 */
		
		JPanel displayPublisherPanel = new JPanel();

		/** Creates Tab Pages
		 * 
		 */
		
		publisherPane.addTab("Publisher", displayPublisherPanel);
		publisherPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        /** Creates Table
         * 
         */
		
    	displayPublisherPanel.setLayout(new BorderLayout());
    	displayPublisherPanel.add(displayResults, BorderLayout.CENTER);
    	// insert text field

	}

}
