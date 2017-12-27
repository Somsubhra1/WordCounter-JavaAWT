import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {

    TextArea ta;
    Button b;
    Label l1,l2;

    Main() {
        setSize(500,430);
        setLayout(null);

        setTitle("Word Counter");
        ta=new TextArea();
        ta.setBounds(100, 50, 300, 230);
        add(ta);
        b=new Button("Count");
        b.setBounds(200, 300, 80, 30);
        add(b);

        setVisible(true);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String word[]=ta.getText().split(" ");
        l1=new Label("Words: "+word.length);
        l1.setBounds(100, 330, 100, 20);
        add(l1);

        l2=new Label("Characters: "+ta.getText().length());
        l2.setBounds(315, 330, 100, 20);
        add(l2);

    }

}
