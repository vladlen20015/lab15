import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab15 extends JFrame{
    private Label label;
    private TextField txt;
    private JButton but1;
    private JButton but2;

    public Lab15(){
        setBounds(400, 400, 150, 300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new Label("Число");

        txt = new TextField("0");
        int txt1;
        txt1=0;
        txt.setEditable(true);
        add(txt);

        but1 = new JButton("+1");
        but2 = new JButton("-1");

        final int[] finalTxt = {txt1};
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (finalTxt[0] <=2){
                    finalTxt[0]++;
                    txt.setText(String.valueOf(finalTxt[0]));
            }}
        });

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(finalTxt[0] >=-4){
                finalTxt[0]--;
                txt.setText(String.valueOf(finalTxt[0]));
            }}
        });

        add(label);
        add(txt);
        add(but1);
        add(but2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab15();
    }
}

