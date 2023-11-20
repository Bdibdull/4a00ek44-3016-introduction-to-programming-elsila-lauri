import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

class MyWindow extends JFrame {
    private JButton click;

    //e07-e09
    public MyWindow() {
        click = new JButton("click");

        click.addActionListener((x) -> 
        {
            System.out.println("click");
            click.setText("clicked");
        }
        );

        //e10
        click.addActionListener(this::clicked);
        click.addActionListener(this::Jump);

        add(click);
    }

    //e10
    public void clicked(ActionEvent e) 
    {
        System.out.println("clicked");

        //e11-12
        Thread t = new Thread(() -> doIt());
        t.start();
    }

    //e12
    public void doIt()
    {
        System.out.println("hello again");
    }

    public void Jump(ActionEvent e)
    {
        this.setLocation((int)(Math.random()*1920), (int)(Math.random()*1080));
    }
}

class Main {
    public static void main(String [] args) {
        MyWindow window = new MyWindow();
        window.setTitle("window");
        window.setSize(400,400);
        window.setVisible(true);    
        }
}