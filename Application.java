
import java.awt.EventQueue;

import GUI.GUIForm;

public class Application {
	public static void main(String[] args) 
		{
			/* EventQueue.invokeLater(new Runnable() {...}): This is a standard practice in Swing programming. 
			It ensures that the GUI components are created and modified on the Event Dispatch Thread (EDT). The EDT is a special 
			thread used for handling GUI events in Java Swing applications. */
			
			EventQueue.invokeLater(new Runnable() {
				/*This is the run method of the Runnable interface. The code inside this method will be executed on the EDT. */
				public void run() {
					try {
						
						GUIForm.login.frame.setVisible(true);
					}
                    catch (Exception e) {
						
					}
				}
			});
		}
}
