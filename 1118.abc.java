package pac;

import javax.swing.*;

public class App {

    private javax.swing.JPanel JPanel;

    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,200,200);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }


}
