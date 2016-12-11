import javax.swing.*;
import java.awt.*;

public class card extends JFrame {
    public static final int TotalCardTypes = 4;
    JLabel description;
    Bomb myBomb;
    card(int i, Bomb b){
        description = new JLabel();
        myBomb = b;

        if(i==0){
            description.setText("Ignore this card.");
        } else if(i==1){
            description.setText("Cut all red wires");
            card1();
        } else if(i==2){
            description.setText("Cut all green wires");
            card2();

        } else if(i==3){
            description.setText("Cut all orange wires");
            card3();

        } else if(i==4){
            description.setText("Cut all yellow wires");
            card4();

        }else if(i==5){
            description.setText("If the bomb was made in 1990 cut all wires next to yellow wires");
            card4();

        } else {
            description.setText("Ignore this card.");

        }
        this.setSize(200,200);
        this.add(description);

        this.setVisible(true);
    }

    public void card1(){
        for (wire w: myBomb.wires){
            if (w.realColor.equals(Color.RED)) {
                w.changeCutState(true);
            }
        }

    }
    public void card2(){
        for (wire w: myBomb.wires){
            if (w.realColor.equals(Color.GREEN)) {
                w.changeCutState(true);
            }
        }
    }
    public void card3(){

        for (wire w: myBomb.wires){
            if (w.realColor.equals(Color.ORANGE)) {
                w.changeCutState(true);

            }
        }
    }
    public void card4(){

        for (wire w: myBomb.wires){
            if (w.realColor.equals(Color.YELLOW)) {
                w.changeCutState(true);

            }
        }
    }

}
