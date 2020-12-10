import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * 112401.键盘敲击.APP.java
 * */
public class App {
    private javax.swing.JPanel JPanel = new JPanel();
    private javax.swing.JLabel JLabel = new JLabel();
    JTextArea textArea_a = new JTextArea();
    JTextArea textArea_b = new JTextArea();

    public App() {
        textArea_a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    textArea_b.append("你敲击了↑键\n");
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    textArea_b.setText("");
                }
            }
        });
    }

    void go(){
        //文本框
        textArea_a.setBounds(100,100,100,100);
        textArea_b.setBounds(100,300,100,100);
        textArea_a.setBackground(Color.ORANGE);
        textArea_b.setBackground(Color.PINK);
        JPanel.add(textArea_a);
        JPanel.add(textArea_b);

        JFrame frame = new JFrame("App");
        JPanel.setLayout(null);
        JPanel.add(JLabel);
        frame.setContentPane(JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,520,720);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
