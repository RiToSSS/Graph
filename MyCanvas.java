
package graphred;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import  java.awt.image.*;

/**
 *
 * @author User
 */
public class MyCanvas extends JPanel
{   
    ArrayList<Integer> xs = new ArrayList<>();
    ArrayList<Integer> ys = new ArrayList<>();
    
    ArrayList<Integer> xf = new ArrayList<>();
    ArrayList<Integer> yf = new ArrayList<>();
    
    ArrayList<Integer> x1 = new ArrayList<>();
    ArrayList<Integer> y1 = new ArrayList<>();
    
     BufferedImage imag;
    
    int fx=0;
    int fy=0;
    int pr=0;
    int pr1=0;
    MyCanvas me;
    public MyCanvas(Dimension screensize)
    {
        super();
        
        
        me=this;
        
        this.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
               if (pr==1) {
                    x1.add(e.getX());
                    y1.add(e.getY());
                    
               }
               
               me.repaint();
             
                
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               
            }
        });
        
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                    
               if (pr1==1){
                    xs.add(e.getX());
                    ys.add(e.getY());
               }
                    
                    //System.out.print(" "+fx+" "+fy+" |");
                    
            me.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                if (pr1==1){
//                    Graphics g = me.getGraphics();
//
//                    int lx=e.getX();
//                    int ly=e.getY();
//                    g.setColor(Color.BLUE);
//                    g.fillRect(fx,fy, lx-fx, ly-fy);
//                }
            if (pr1==1){
                xf.add(e.getX());
                yf.add(e.getY());
                me.repaint();
            }
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    @Override
    public void paint(Graphics g)
    {   
        g.setColor(Color.white);
        g.fillRect(0,0,100000,100000);
      
        
        g.setColor(Color.BLUE);
        
        int r=10;
     
             for (int i=1;i<x1.size();i++) {
                g.fillOval(x1.get(i)-r, y1.get(i)-r, r*2, r*2);
            }
            
      
       
   
            for (int i=1;i<xs.size();i++) {
                g.fillRect(xs.get(i),ys.get(i), xf.get(i)-xs.get(i), yf.get(i)-ys.get(i));
              
            }
      
        
//        if (pr1==1) {
//            for (int i=1;i<x.size();i++) {
//                //System.out.print(i+" ");
//                g.setColor(Color.white);
//                //g.fillRect(fx,fy, x.get(i-1)-fx, y.get(i-1)-fy);
//
//                g.setColor(Color.BLUE);
//               // g.fillRect(fx,fy, x.get(i)-fx, y.get(i)-fy);
//
//
//            }
//        }
        
        //g.drawRect(fx,fy, x.get(x.size()-1)-fx, y.get(y.size()-1)-fy);
        
    }
}
