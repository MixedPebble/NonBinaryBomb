import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Bomb extends JPanel {

    wire[] wires = new wire[4];
    JLabel year;
    int wiresLeft;
    JFrame myFrame;


    Bomb(JFrame f){
        myFrame = f;
        this.setSize(500,500);
        this.setLayout(new GridLayout(1,4,10,10));

        Color[] colors = new Color[]{Color.GREEN,Color.BLUE,Color.ORANGE, Color.RED, Color.YELLOW};
        int[] years = new int[]{1980, 1985, 1990, 1995, 2000, 2005};
        int r;
        for (int i = 0;i<wires.length;i++){
             r = new Random().nextInt(colors.length);
            wires[i] = new wire(colors[r],this);
            this.add(wires[i]);
            System.out.println(wires[i].getBackground());
        }
        year = new JLabel("Year Made: "+ years[new Random().nextInt(years.length)]);
        //this.add(year);
    }

    public void defusedCheck() {
        if (wiresLeft==0){
            System.out.println("YOU WIN");
            for (wire w:wires){
                w.setBackground(Color.WHITE);
            }
        }
    }
    public void explode() {
        for(wire w: wires){
            w.setBackground(Color.BLACK);
        }
    }
}
