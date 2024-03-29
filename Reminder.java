package reminderApp;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class Reminder {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reminder window = new Reminder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reminder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 655, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBackground(UIManager.getColor("CheckBox.background"));
		btnNewButton.setForeground(new Color(255, 102, 0));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\VC HARSHAD ROSHAN\\Downloads\\icons8-update-64.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				this.setVisible(false);
				new Update().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
			}
		});
		btnNewButton.setBounds(380, 149, 180, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
				new view().setVisible(true);
			
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnView.setBackground(UIManager.getColor("CheckBox.background"));
		btnView.setForeground(new Color(255, 102, 0));
		btnView.setFont(new Font("Verdana", Font.BOLD, 14));
		btnView.setHorizontalAlignment(SwingConstants.LEFT);
		btnView.setIcon(new ImageIcon("C:\\Users\\VC HARSHAD ROSHAN\\Downloads\\icons8-view-64.png"));
		btnView.setBounds(380, 233, 180, 67);
		frame.getContentPane().add(btnView);
		
		JButton btnNewReminder = new JButton("New ");
		btnNewReminder.setBackground(UIManager.getColor("CheckBox.background"));
		btnNewReminder.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewReminder.setForeground(new Color(255, 102, 0));
		btnNewReminder.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewReminder.setIcon(new ImageIcon("C:\\Users\\VC HARSHAD ROSHAN\\Downloads\\icons8-add-reminder-64.png"));
		btnNewReminder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				this.setVisible(false);
		        new Newreminder().setVisible(true);
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		
		});
		btnNewReminder.setBounds(380, 57, 180, 67);
		frame.getContentPane().add(btnNewReminder);
		
		JLabel lblNewLabel = new JLabel("REMINDER ");
		lblNewLabel.setForeground(new Color(255, 102, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(101, 11, 198, 160);
		frame.getContentPane().add(lblNewLabel);
	}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
