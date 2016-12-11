import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testTimer {
    private JLabel label;
    Timer countdownTimer;
    int timeRemaining = 45;

    public testTimer(JLabel passedLabel) {
        countdownTimer = new Timer(1000, new CountdownTimerListener());
        this.label = passedLabel;
        countdownTimer.start();
    }

    class CountdownTimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (--timeRemaining > 0) {
                label.setText(String.valueOf(timeRemaining));
            } else {
                label.setText("BOOM");
                countdownTimer.stop();
            }
        }
        public void addTime(){
            timeRemaining+=timeRemaining+30;
        }
    }
}