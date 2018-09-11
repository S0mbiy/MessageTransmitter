package messagetransmitter;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Panel extends JPanel {

    private JButton rst,
            btn0,
            btn1,
            btn2,
            btn3,
            btn4,
            btn5,
            btn6,
            btn7,
            btn8,
            btn9,
            btnA,
            btnB,
            btnC,
            btnD,
            btnE,
            btnF,
            btnCtrl;
    private JTextField text;
    private VentanaTablero win;

    public Panel(VentanaTablero win) {
        super();
        this.win = win;
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        this.btn0 = new JButton("0");
        this.btn1 = new JButton("1");
        this.btn2 = new JButton("2");
        this.btn3 = new JButton("3");
        this.btn4 = new JButton("4");
        this.btn5 = new JButton("5");
        this.btn6 = new JButton("6");
        this.btn7 = new JButton("7");
        this.btn8 = new JButton("8");
        this.btn9 = new JButton("9");
        this.btnA = new JButton("A");
        this.btnB = new JButton("B");
        this.btnC = new JButton("C");
        this.btnD = new JButton("D");
        this.btnE = new JButton("E");
        this.btnF = new JButton("F");
        this.btnCtrl = new JButton("Inicio/Fin");

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("0");
                text.setText(text.getText() + "0");
                //Play("0.wav");
            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("1");
                text.setText(text.getText() + "1");
                Play("1.wav");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("2");
                text.setText(text.getText() + "2");
                Play("2.wav");
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("3");
                text.setText(text.getText() + "3");
                Play("3.wav");
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("4");
                text.setText(text.getText() + "4");
                Play("4.wav");
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("5");
                text.setText(text.getText() + "5");
                Play("5.wav");
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("6");
                text.setText(text.getText() + "6");
                Play("6.wav");
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("7");
                text.setText(text.getText() + "7");
                Play("7.wav");
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("8");
                text.setText(text.getText() + "8");
                Play("8.wav");
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("9");
                text.setText(text.getText() + "9");
                Play("9.wav");
            }
        });

        btnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("A");
                Play("A.wav");
                text.setText(text.getText() + "A");
            }
        });

        btnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("B");
                Play("B.wav");
                text.setText(text.getText() + "B");
            }
        });

        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("C");
                Play("C.wav");
                text.setText(text.getText() + "C");
            }
        });

        btnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("D");
                Play("D.wav");
                text.setText(text.getText() + "D");
            }
        });

        btnE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("E");
                Play("E.wav");
                text.setText(text.getText() + "E");
            }
        });

        btnF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("F");
                Play("F.wav");
                text.setText(text.getText() + "F");
            }
        });

        btnCtrl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Start/Done");
                text.setText("");
            }
        });
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.ipadx = 20;
        this.add(btn0, c);
        this.add(btn1, c);
        this.add(btn2, c);
        this.add(btn3, c);
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.ipadx = 20;
        this.add(btn4, c);
        this.add(btn5, c);
        this.add(btn6, c);
        this.add(btn7, c);
        c.gridy = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.ipadx = 20;
        this.add(btn8, c);
        this.add(btn9, c);
        this.add(btnA, c);
        this.add(btnB, c);
        c.gridy = 4;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.ipadx = 20;
        this.add(btnC, c);
        this.add(btnD, c);
        this.add(btnE, c);
        this.add(btnF, c);
        c.gridy = 5;
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.ipady = 20;
        this.add(btnCtrl, c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      
        c.weightx = 0.0;
        c.gridwidth = 6;
        c.gridy = 0;
        c.gridx=0;
        this.text = new JTextField();
        this.text.setEditable(false);
        this.add(this.text,c);
    }

    private void Play(String path) {
        Media hit = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

}
