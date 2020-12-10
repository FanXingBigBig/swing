import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

/*
 * 112502.回车键敲击判断2.APP.java
 * */
public class App2 {
    private javax.swing.JPanel JPanel = new JPanel();
    private javax.swing.JLabel JLabel = new JLabel();
    JTextArea textArea_a = new JTextArea();
    JTextArea textArea_b = new JTextArea();

    public App2() {
        //键盘
        textArea_a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    textArea_a.setText("");
                    textArea_b.setText("");
                }
                if (textArea_a.getText().equals("可以")){
                    if(e.getKeyCode()==KeyEvent.VK_ENTER){
                        textArea_b.setText("回答正确");
                    }
                }else{
                    if(e.getKeyCode()==KeyEvent.VK_ENTER){
                        textArea_b.setText("回答错误");
                    }
                }
            }
        });
        //单击
        textArea_a.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(textArea_a.getText()!=""){
                    textArea_a.setText("");
                }

            }
        });
    }

    void go(){
        textArea_a.setText("可以吗？");
        textArea_a.setBounds(100,100,100,100);
        textArea_a.setBackground(Color.ORANGE);
        JPanel.add(textArea_a);

        textArea_b.setBounds(100,300,100,100);
        textArea_b.setBackground(Color.PINK);
        JPanel.add(textArea_b);

        JFrame frame = new JFrame("App2");
        JPanel.setLayout(null);
        JPanel.add(JLabel);
        frame.setContentPane(JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,520,720);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App2().go();
    }
}
