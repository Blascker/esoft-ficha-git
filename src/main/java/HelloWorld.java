import javax.swing.*;

public class HelloWorld extends JFrame{
    private JPanel panel1;
    private JLabel lblMensagem;

    public HelloWorld(String title){
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
    }

    public static void main (String[] args){
        new HelloWorld("This Nuts").setVisible(true);
    }
}
