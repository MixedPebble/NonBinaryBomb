import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by snoop_000 on 12/6/2016.
 */
public class wire extends JPanel {
    Color realColor;
    boolean cut=false;
    Bomb myBomb;

    public JPanel getWire(){
        return this;
    }
    public void changeCutState(boolean cutMe){
        if(cut&&cutMe){
            //do nothing
            System.out.println("Condition 1");
        } else if(cut && cutMe==false){
            cut = false;
            myBomb.wiresLeft--;
            System.out.println("Condition 2");

        } else if (cut==false && cutMe==false){
            //Do nothing
            System.out.println("Condition 3");

        }
        else if (cut == false && cutMe){
            cut=true;
            myBomb.wiresLeft++;
            System.out.println("Condition 4");

        } else{
            System.out.println("I MISSED A CONDITION IN THE WIRE CLASS FIX ME!!!");
        }
    }

    public wire(Color c, Bomb b){
        myBomb = b;
        this.setPreferredSize(new Dimension(75,400));
        this.setSize(100,400);
        realColor=c;
        this.setBackground(c);
        MouseListener mL = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                cutWire();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getWire().setBackground(getBackground().darker());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getWire().setBackground(getBackground().brighter());

            }
        };
        this.addMouseListener(mL);
    }

    public void cutWire(){
        if(cut){
            System.out.println("No boom boom :(");
            this.setBackground(Color.GRAY);
            myBomb.wiresLeft--;
            myBomb.defusedCheck();
        } else {
            System.out.println("BOOM BOOM");
            myBomb.explode();
        }
    }

}
