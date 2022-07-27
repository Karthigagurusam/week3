package week3assignment;

import java.awt.Desktop;

/*
		 * 
		 * Assignment1
		===========
		     Package   :org.system
		     Class        :Computer
		     Methods   :computerModel()
		     Class        :Desktop
		     Methods   :desktopSize()
		Description:
		create above 2 class and call all your class methods into the Desktop using single inheritance.
		 */

/*
 * 
 * 
 * Assignment1
===========
     Package   :org.system
     Class        :Computer
     Methods   :computerModel()
     Class        :Desktop
     Methods   :desktopSize()
Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.
 */


public class computer {
public void desktopSize() {
	System.out.println("Screen size is 20 inches");
}
public static void main(String[] args) {

	computer c = new computer();
	c.computerModel();
	c.desktopSize();
	}
void computerModel() {
	// TODO Auto-generated method stub
	
}
}