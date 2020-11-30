import java.awt.*;

public class TrafficLight extends Canvas {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String status = "Red";

    TrafficLight() {
        setSize(100, 260);
    }

    public void changeLight(String status){
        this.status = status;
        repaint();
    }

    private void setGreen(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 90, 260);
        g.setColor(Color.green.brighter().brighter());
        g.fillOval(20, 20, 50, 50);
        g.setColor(Color.yellow.darker());
        g.fillOval(20, 100, 50, 50);
        g.setColor(Color.red.darker());
        g.fillOval(20, 180, 50, 50);
    }

    private void setYellow(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 90, 260);
        g.setColor(Color.green.darker());
        g.fillOval(20, 20, 50, 50);
        g.setColor(Color.yellow.brighter().brighter());
        g.fillOval(20, 100, 50, 50);
        g.setColor(Color.red.darker());
        g.fillOval(20, 180, 50, 50);
    }

    private void setRed(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 90, 260);
        g.setColor(Color.green.darker());
        g.fillOval(20, 20, 50, 50);
        g.setColor(Color.yellow.darker());
        g.fillOval(20, 100, 50, 50);
        g.setColor(Color.red.brighter().brighter());
        g.fillOval(20, 180, 50, 50);
    }


    public void paint(Graphics g) {
        switch(status){
            case "Green":
                setGreen(g);
                break;
            case "Yellow":
                setYellow(g);
                break;
            case "Red":
                setRed(g);
                break;
        }
    }
}