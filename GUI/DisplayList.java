package GUI;
import javax.swing.DefaultListModel;
import Data.FileIO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import java.awt.SystemColor;

public class DisplayList extends JFrame {


	private static final long serialVersionUID = 1L;
	static DefaultListModel<String> arr = new DefaultListModel<String>();
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	
/* 
The @SuppressWarnings annotation in Java is used to suppress compiler warnings for a specific piece of code. It informs the 

compiler to ignore certain warnings that might be generated during compilation. This can be useful in situations where you are confident that the warnings 
are not indicative of a real problem or where you intentionally want to suppress them.
*/

	//@SuppressWarnings({ })
	public DisplayList() {
		setTitle("Account List");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountList = new JLabel("Account List");
		lblAccountList.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAccountList.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountList.setBounds(0, 11, 623, 31);
		contentPane.add(lblAccountList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 66, 613, 358);
		contentPane.add(scrollPane);
		
		arr = FileIO.bank.display();
		JList<String> list = new JList<String>(arr);
		scrollPane.setViewportView(list);
		
	

	}
}