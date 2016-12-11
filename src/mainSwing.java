import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by snoop_000 on 12/6/2016.
 */
public class mainSwing extends JFrame{
    Bomb boom;
    JLabel timer;
    card[] cards;


    public void showAndCreateGUI(){
        this.setSize(500,500);
        boom = new Bomb(this);
        this.add(boom, BorderLayout.WEST);
        this.add(boom.year, BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        timer = new JLabel("45",JLabel.CENTER);

        this.add(timer);
        new testTimer(timer);
        this.setVisible(true);
        this.pack();
        this.setVisible(true);
        for (int i = 0;i<4;i++){
            int r =  new Random().nextInt(card.TotalCardTypes);

            new card(r, boom);
        }


    }

    mainSwing(){
        showAndCreateGUI();
    }
    public static void main(String arg[]){
        new mainSwing();
    }
}
