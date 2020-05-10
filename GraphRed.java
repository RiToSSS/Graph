
package graphred;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class GraphRed extends JFrame
{
    MyCanvas jp;
    
    public GraphRed()
    {
        super("Graph Editor");
        
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        
        this.setSize(screenSize.width,screenSize.height);
        this.setVisible(true);
        
        this.setLayout(null);
        
        jp = new MyCanvas(screenSize);
        
        jp.setBounds(100,100,screenSize.width-200,screenSize.height-200);
        jp.setBackground(Color.white);
        
        
        
        JButton but = new JButton("Pencil");
        but.setBounds(0,0,100,30);
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp.pr=1;
                jp.pr1=0;
            }
        });
        
         JButton but1 = new JButton("Rectangle");
        but1.setBounds(100,0,100,30);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp.pr1=1;
                jp.pr=0;
            }
        });
        
        
        
        JButton jb = new JButton("BUTTON");
        jb.setBounds(10, 10, 100, 20);
        jb.addActionListener
        (
            new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                
                }
        });
        //this.add(jb);
        this.add(jp);
        this.add(but);
        this.add(but1);
        
    }
//    public void paint(Graphics g)
//    {
//        super.paint(g);
//        Graphics gr = jp.getGraphics();
//       
//        gr.setColor(Color.BLUE);
//        gr.drawLine(0,0,500,500);
//    }
    public static void main(String[] args) {
        GraphRed app=new GraphRed();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
