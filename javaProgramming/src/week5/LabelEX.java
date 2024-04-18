package week5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

	public class LabelEX extends JFrame {
		public LabelEX(){
			setTitle("춘잣! 캐바바밥줘");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel textLabel = new JLabel("이지두 댄스 ");
			
			ImageIcon img = new ImageIcon("image");
			JLabel imageLabel = new JLabel(img);
			
			ImageIcon icon = new ImageIcon("images/images.jpg");
			JLabel label = new JLabel("지금부터는 저는 뒷부분은 스킵이애 임마",
					icon, SwingConstants.CENTER);
			
			c.add(textLabel); c.add(imageLabel); c.add(label);
			
			setSize(300,500);
			setVisible(true);
		}
		public static void main(String[]args) {
			new LabelEX();
		}
	}
