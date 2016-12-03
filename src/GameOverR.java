import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class GameOverR {
	public JFrame frame;
	String score;
	public GameOverR(String s){
		score=s;
		frame = new JFrame("Game Over");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setFont(new Font("Dialog", Font.BOLD, 16));
		frame.setResizable(false);
		frame.setBounds(450, 100, 340, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGameOver.setBounds(112, 11, 105, 25);
		frame.getContentPane().add(lblGameOver);
		
		JLabel lblScore = new JLabel("Score :");
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(101, 57, 74, 25);
		frame.getContentPane().add(lblScore);
		
		JLabel sc1 = new JLabel("");
		sc1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sc1.setBounds(185, 57, 46, 25);
		frame.getContentPane().add(sc1);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlayAgain.setBounds(105, 105, 122, 25);
		frame.getContentPane().add(btnPlayAgain);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(104, 145, 123, 25);
		frame.getContentPane().add(btnExit);
		sc1.setText(score);
		btnExit.addActionListener(new Exit());
		btnPlayAgain.addActionListener(new PlayAgain());
	}
	class PlayAgain implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			WordRush wr=new WordRush();
			wr.frame.setVisible(true);
			wr.run();
		}
	}
	class Exit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			frame.dispose();
		}
		
	}
	
}
