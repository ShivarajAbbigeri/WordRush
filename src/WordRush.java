import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

//import NumberRush.List;

public class WordRush {
	JFrame frame;
	private JTextField yans;
	private String[] words={"able","acid","aged","also","area","army","away","baby","back","ball","band","bank","base","bath","bear","beat","been","beer","bell","belt","best","bill","bird","blow","blue","boat","body","bomb","bond","bch[1]","book","boom","born","boss","both","bowl","bulk","burn","bush","busy","call","calm","came","camp","card","care","case","cash","cast","cell","chat","chip","city","club","coal","coat","code","cold","come","cook","cool","cope","copy","CORE","cost","crew","crop","dark","data","date","dawn","days","dead","deal","dean","dear","debt","deep","deny","desk","dial","dick","diet","disc","disk","does","dch[1]","door","dose","down","draw","drew","drop","drug","dual","duke","dust","duty","each","earn","ease","east","easy","edge","else","even","ever","evil","exit","face","fact","fail","fair","fall","farm","fast","fate","fear","feed","feel","feet","fell","felt","file","fill","film","find","fine","fire","firm","fish","five","flat","flow","food","foot","ford","form","fort","four","free","from","fuel","full","fund","gain","game","gate","gave","gear","gene","gift","girl","give","glad","goal","goes","gold","Golf","gch[1]","good","gray","grew","grey","grow","gulf","hair","half","hall","hand","hang","hard","harm","hate","have","head","hear","heat","held","hell","help","here","hero","high","hill","hire","hold","hole","holy","home","hope","host","hour","huge","hung","hunt","hurt","idea","inch","into","iron","item","jack","jane","jean","john","join","jump","jury","just","keen","keep","kent","kept","kick","kill","kind","king","knee","knew","know","lack","lady","laid","lake","land","lane","last","late","lead","left","less","life","lift","like","line","link","list","live","load","loan","lock","logo","long","look","lord","lose","loss","lost","love","luck","made","mail","main","make","male","many","Mark","mass","matt","meal","mean","meat","meet","menu","mere","mike","mile","milk","mill","mind","mine","miss","mode","mood","moon","more","most","move","much","must","name","navy","near","neck","need","news","next","nice","nick","nine","nch[1]","nose","note","okay","once","only","onto","open","oral","over","pace","pack","page","paid","pain","pair","palm","park","part","pass","past","path","peak","pick","pink","pipe","plan","play","plot","plug","plus","poll","pool","poor","port","post","pull","pure","push","race","rail","rain","rank","rare","rate","read","real","rear","rely","rent","rest","rice","rich","ride","ring","rise","risk","road","rock","role","roll","roof","room","root","rose","rule","rush","ruth","safe","said","sake","sale","salt","same","sand","save","seat","seed","seek","seem","seen","self","sell","send","sent","sept","ship","shop","shot","show","shut","sick","side","sign","site","size","skin","slip","slow","snow","soft","soil","sold","sole","some","song","soon","sort","soul","spot","star","stay","step","stop","such","suit","sure","take","tale","talk","tall","tank","tape","task","team","tech","tell","tend","term","test","text","than","that","them","then","they","thin","this","thus","till","time","tiny","told","toll","tch[1]","tony","took","tool","tour","town","tree","trip","true","tune","turn","twin","type","unit","upon","used","user","vary","vast","very","vice","view","vote","wage","wait","wake","walk","wall","want","ward","warm","wash","wave","ways","weak","wear","week","well","went","were","west","what","when","whom","wide","wife","wild","will","wind","wine","wing","wire","wise","wish","with","wood","word","wore","work","yard","yeah","year","your","zero",};
	private String[] index={"0132","0231","0321","0312","1023","1203","1230","1302","1320","2013","2103","2130","2301","2310","3012","3021","3102","3120","3210"};
	Random r=new Random();
	private JTextField ch[]=new JTextField[4];
	private JLabel iwt;
	private JLabel row;
	private int wordIndex;
	private int charIndex;
	private Timer timer;
	private JLabel tm;
	private JButton submit;
	private int sco;
	private JLabel sc;
	private int counter;
	WordRush(){
		frame = new JFrame("Word Rush");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setFont(new Font("Dialog", Font.BOLD, 16));
		frame.setResizable(false);
		frame.setBounds(450, 100, 525, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("High Score : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 103, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblScore = new JLabel("Score : ");
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblScore.setBounds(395, 11, 71, 25);
		frame.getContentPane().add(lblScore);
		
		JLabel hs = new JLabel("0");
		hs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hs.setBounds(123, 11, 33, 25);
		frame.getContentPane().add(hs);
		
		sc = new JLabel("0");
		sc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sc.setBounds(476, 11, 33, 25);
		frame.getContentPane().add(sc);
		
		JLabel lblTimer = new JLabel("Timer : ");
		lblTimer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTimer.setBounds(198, 11, 71, 25);
		frame.getContentPane().add(lblTimer);
		
		tm = new JLabel("120");
		tm.setFont(new Font("Tahoma", Font.BOLD, 16));
		tm.setBounds(279, 11, 50, 25);
		frame.getContentPane().add(tm);
		
		ch[0] = new JTextField();
		ch[0].setBackground(Color.WHITE);
		ch[0].setHorizontalAlignment(SwingConstants.CENTER);
		ch[0].setEditable(false);
		ch[0].setFont(new Font("Tahoma", Font.PLAIN, 16));
		ch[0].setBounds(154, 95, 50, 25);
		frame.getContentPane().add(ch[0]);
		ch[0].setColumns(10);
		
		ch[2] = new JTextField();
		ch[2].setBackground(Color.WHITE);
		ch[2].setHorizontalAlignment(SwingConstants.CENTER);
		ch[2].setEditable(false);
		ch[2].setFont(new Font("Tahoma", Font.PLAIN, 16));
		ch[2].setBounds(279, 95, 50, 25);
		frame.getContentPane().add(ch[2]);
		ch[2].setColumns(10);
		
		ch[1] = new JTextField();
		ch[1].setFont(new Font("Tahoma", Font.PLAIN, 16));
		ch[1].setBackground(Color.WHITE);
		ch[1].setHorizontalAlignment(SwingConstants.CENTER);
		ch[1].setEditable(false);
		ch[1].setBounds(214, 95, 50, 25);
		frame.getContentPane().add(ch[1]);
		ch[1].setColumns(10);
		
		ch[3] = new JTextField();
		ch[3].setBackground(Color.WHITE);
		ch[3].setHorizontalAlignment(SwingConstants.CENTER);
		ch[3].setEditable(false);
		ch[3].setFont(new Font("Tahoma", Font.PLAIN, 16));
		ch[3].setBounds(339, 95, 50, 25);
		frame.getContentPane().add(ch[3]);
		ch[3].setColumns(10);
		
		yans = new JTextField();
		yans.setHorizontalAlignment(SwingConstants.CENTER);
		yans.setFont(new Font("Tahoma", Font.PLAIN, 16));
		yans.setBounds(222, 160, 75, 25);
		frame.getContentPane().add(yans);
		yans.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer :");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnswer.setBounds(133, 161, 79, 25);
		frame.getContentPane().add(lblAnswer);
		
		submit = new JButton("Submit");
		submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		submit.setBounds(307, 161, 99, 25);
		frame.getContentPane().add(submit);
		
		row = new JLabel(" ");
		row.setHorizontalAlignment(SwingConstants.CENTER);
		row.setFont(new Font("Tahoma", Font.BOLD, 16));
		row.setBounds(240, 224, 71, 25);
		frame.getContentPane().add(row);
		
		iwt = new JLabel(" ");
		iwt.setHorizontalAlignment(SwingConstants.CENTER);
		iwt.setFont(new Font("Tahoma", Font.BOLD, 16));
		iwt.setBounds(214, 260, 115, 25);
		frame.getContentPane().add(iwt);
		timer = new Timer(1000,new List());
		
		sco=0;
		submit.addActionListener(new Play());
		counter=90;
	}
	void run(){
		timer.start();
		yans.requestFocus();
		frame.getRootPane().setDefaultButton(submit);
		wordIndex=r.nextInt(500);
		charIndex=r.nextInt(19);
		int in;
		for(int i=0;i<4;i++){
			in=Integer.parseInt(Character.toString(index[charIndex].charAt(i)));
			ch[i].setText(Character.toString(words[wordIndex].charAt(in)));
		}
	}
	class List implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			tm.setText(""+counter);
			if(counter!=0)
			counter--;
			if(counter==0){
				timer.stop();
				 JDialog dialog = new JDialog(frame, "Custom made dialog");
				 dialog.setBounds(100, 100, 100, 50);
				 dialog.add(new JButton("OK"));
				 dialog.setModal(true);
				 dialog.setVisible(true);
				GameOverR gm=new GameOverR(Integer.toString(sco));
				gm.frame.setVisible(true);
		          frame.dispose();
				
			}
		}
		
	}
	class Play implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String ans=yans.getText();
			if(ans.equalsIgnoreCase(words[wordIndex])){
				sco+=2;
				sc.setText(Integer.toString(sco));
				row.setText("correct");
				iwt.setText("");
			}
			else{
				counter-=5;
				if(sco!=0)
				sco--;
				sc.setText(Integer.toString(sco));
				row.setText("Wrong");
				iwt.setText("Ans is : "+words[wordIndex]);
			}
			yans.setText("");
			run();
		}
		
	}
	public static void main(String args[]){
		WordRush wr=new WordRush();
		wr.frame.setVisible(true);
		wr.run();
	}
}
