
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private javax.swing.JPanel JPanel = new JPanel();
    private JLabel JLabel_mouse = new JLabel();
    JLabel Jlabel_background = new JLabel();
    JLabel Jlabel_score = new JLabel();
    int i = 0;

    public App() {
        JLabel_mouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel_mouse.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),75,75);
                i++;
                Jlabel_score.setText(String.valueOf(i));
            }
        });
    }

    void go(){
        JPanel.setLayout(null);
        //添加资源引用打包
        java.net.URL imgURL1 = App.class.getResource("beijing.gif");
        Jlabel_background.setIcon(new ImageIcon(imgURL1));
        java.net.URL imgURL2 = App.class.getResource("shu.gif");
        JLabel_mouse.setIcon(new ImageIcon(imgURL2));
        Jlabel_background.setBounds(0,0,1024,720);
        JLabel_mouse.setBounds(100,100,75,75);
        Jlabel_score.setBounds(100,100,200,200);
        Jlabel_score.setFont(new Font("Arial",Font.BOLD,40));
        Jlabel_score.setForeground(Color.red);
        JPanel.add(Jlabel_score);
        JPanel.add(JLabel_mouse);
        JPanel.add(Jlabel_background);
        JFrame frame = new JFrame("打地鼠");
        frame.setContentPane(JPanel);
        frame.setBounds(100,100,1024,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
