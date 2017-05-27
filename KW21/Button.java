import javax.swing.JButton;
import java.awt.event.MouseEvent;

public class Button extends JButton {
  
  public Button(String title) {
    super(title);
  }

  @Override
  /**
   * Wird ausgefuert, sobald eine Interaktion
   */
  public void processMouseEvent(MouseEvent e) {
    if(e.getButton() == MouseEvent.MOUSE_RELEASED)
      System.out.println("Hello World!");
    super.processMouseEvent(e);
  }
}