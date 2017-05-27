import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
  public static void main(String[] args) {

    JFrame f = new JFrame("Halli Hallo");
    JPanel p = new JPanel();
    Button b = new Button("Fass mich an!!!");

    p.add(b);
    f.add(p);
    f.setDefaultCloseOperation(3);
    f.setVisible(true);
  }
}