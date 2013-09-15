import javax.swing.JFrame;


public class weeek3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame myFrame = new JFrame ("Balloons");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().add( new Week3Gui());
		myFrame.pack();
		myFrame.setVisible(true);
	}

}
