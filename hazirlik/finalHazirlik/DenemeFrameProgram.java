package hazirlik.finalHazirlik;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DenemeFrameProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("deneme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JMenuBar mb = new JMenuBar();
        JMenu info = new JMenu("info");
        JMenu account = new JMenu("account");
        mb.add(account);
        mb.add(info);

        JMenuItem m11 = new JMenuItem("deneme1");
        JMenuItem m22 = new JMenuItem("deneme2");
        info.add(m11);
        info.add(m22);

        JTextArea ta = new JTextArea();

        JPanel panel = new JPanel();
        JLabel label = new JLabel("text area : ");
        JButton button1 = new JButton("buton1");
        JButton button2 = new JButton("button2");
        JTextField tf = new JTextField(10);

        panel.add(label);
        panel.add(tf);
        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);

        frame.setVisible(true);
    }
}
