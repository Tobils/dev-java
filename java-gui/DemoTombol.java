import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoTombol extends JFrame
{
    protected PanelPesan panelPesan = new PanelPesan("JAVA itu Tangguh");

    private JButton jbtKiri = new JButton("<=");
    private JButton jbtKanan = new JButton("=>");

    public static void main(String[] args) 
    {
        DemoTombol frame = new DemoTombol();
        frame.setTitle("Demo Tombol");
        frame.setSize(250,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    
    }

    public DemoTombol()
    {
        PanelPesan.setBackground(Color.white);
        
    }
}