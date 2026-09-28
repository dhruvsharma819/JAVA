import javax.swing.*;
public class Myframe {
    public static void main(String[] args) {
        JFrame frame= new JFrame("My Application");
        JButton button= new JButton("Click Here");
        frame.add(button);
        frame.setSize(700,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}