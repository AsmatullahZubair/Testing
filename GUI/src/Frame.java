import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JButton button = new JButton();
		JLabel label2 = new JLabel();
		JTextField textField = new JTextField();
		frame.setVisible(true);
		frame.setBounds(100,100,800,500); 
		frame.setTitle("JFrame Title");
		frame.add(panel);
		frame.setSize(300,400);
		
        label.setText("Enter Temperature in Celsius: ");
        button.setText("Click");
        label2.setText("F");
        textField.setColumns(20);
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(label2);
        button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String temperature = textField.getText();
				float celsius = Float.parseFloat(temperature);
				float fahrehiet = (float) ((celsius*1.8)+32);
				String temp = fahrehiet+"F";
				label2.setText(temp);
				}
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(frame, "Please enter temperature!");
				}
				
			}
		});
        
		//String temp=JOptionPane.showInputDialog("Enter temperature in Celsius");
        
	}
	
}
