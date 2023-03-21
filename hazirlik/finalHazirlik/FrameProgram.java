package hazirlik.finalHazirlik;

import javax.swing.*;
import java.awt.*;

public class FrameProgram {
    public static void main(String[] args){

        // Creating Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu ("FILE");
        JMenu m2 = new JMenu ("Help");
        JMenu m3 = new JMenu ("Settings");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        JMenuItem m33 = new JMenuItem("Contact");
        JMenuItem m44 = new JMenuItem("Donate");
        m1.add(m11);
        m1.add(m22);
        m1.add(m33);
        m1.add(m44);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel();		// The panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10);		// Accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);	// Components Added using flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        // Upgrading code if any error will be exist because of this
/*
	JRadioButton radioButton1 = new JRadioButton("Kolay ");
	JRadioButton radioButton2 = new JRadioButton("Orta ");
	JRadioButton radioButton3 = new JRadioButton("Zor ");

	Container container = frame.getContentPane();
	container.add(radioButton1);
	container.add(radioButton2);
	container.add(radioButton3);
	ButtonGroup group = new ButtonGroup();
	group.add(radioButton1);
	group.add(radioButton2);
	group.add(radioButton3);
*/
	// NO Problemo but this idk


        // Text Area at the Center
        JTextArea ta = new JTextArea();

        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        /*frame.getContentPane().add(BorderLayout.CENTER, radioButton1);
        frame.getContentPane().add(BorderLayout.WEST, radioButton2);
        frame.getContentPane().add(BorderLayout.EAST , radioButton3);*/

        frame.setVisible(true);


    }
}
