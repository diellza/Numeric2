import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuizFrame extends JFrame implements ActionListener {
	public ButtonGroup r;
	private JRadioButton a;
	private JRadioButton b;
	private JRadioButton c;
	private JRadioButton d;
	private JLabel pyetja;
	private JButton next;
	private JButton checkAnswer;
	private JLabel lab;
	private int i = 0;
	public PyetjetPergjigjiet[] p = new PyetjetPergjigjiet[20];

	public QuizFrame() {
		super("Quiz");
		setgui();
		regjistroListeners();
		pyetjet();
		update();
	}

	public void setgui() {
		JPanel paneli1 = new JPanel();
		pyetja = new JLabel("Pyetja");
		pyetja.setFont(new Font("TimesRoman", Font.BOLD, 18));
		a = new JRadioButton("Pergjigjia 1");
		b = new JRadioButton("Pergjigjia 2");
		c = new JRadioButton("Pergjigjia 3");
		d = new JRadioButton("Pergjigjia 4");
		r = new ButtonGroup();
		r.add(a);
		r.add(b);
		r.add(c);
		r.add(d);
		paneli1.setLayout(new GridLayout(5, 2, 1, 1));
		paneli1.add(pyetja);
		paneli1.add(a);
		paneli1.add(b);
		paneli1.add(c);
		paneli1.add(d);

		JPanel paneli2= new JPanel();
		{
			next = new JButton("Next");
			checkAnswer = new JButton("CheckAnswer");
            lab = new JLabel(""); 
			
			paneli2.setLayout(new FlowLayout());
			paneli2.add(next);
			paneli2.add(checkAnswer);
			paneli2.add(lab);

			Container cp = this.getContentPane();
			cp.setLayout(new BorderLayout());
			cp.add(paneli1, BorderLayout.CENTER);
			cp.add(paneli2, BorderLayout.SOUTH);

			this.setSize(600, 400);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}

	public void regjistroListeners() {
		next.addActionListener(this);	
		checkAnswer.addActionListener(this);}

	public void pyetjet()
	{p[0] = new PyetjetPergjigjiet("Sa eshte numri i biteve ne IPv6 ?", "32 bit", "64bit", "128bit", "256 bit", "C");
    p[1] = new PyetjetPergjigjiet("Cili eshte web shfletuesi i pare, i zbuluar ne 1990 ?", "Internet Explorer", "Mosaic", "Mozilla", "WorldWideWeb", "D");
	p[2] = new PyetjetPergjigjiet("Cila prej gjuheve vijuese perdoret per te krijuar programe si aplete?", "COBOL", "C", "Java", "Basic", "C");
	p[3] = new PyetjetPergjigjiet("Virusi i pare i kompjuterit eshte i njohur si ?", "Rabbit", "Creeper Virus", "Elk Cloner", "SCA Virus", "B");
	p[4] = new PyetjetPergjigjiet("Cila prej gjuheve perdoret per inteligjence artificale", "C", "Java", "J2EE", "Prolog", "D");
	p[5] = new PyetjetPergjigjiet("Firewall ne kompjuter perdoret per?", "Siguri", "Transmetim te te dhenave", "Autentikim", "Monitorim", "A");
	p[6] = new PyetjetPergjigjiet("Cila prej tyre nuk eshte sistem operativ?", "DOS", "Mac", "C", "Linux", "C");
	p[7] = new PyetjetPergjigjiet("Cila prej ketyre nuk eshte softver per menagjimin e databazes ?", "MySQL", "Oracle", "Sybase", "COBOL", "D");
	p[8] = new PyetjetPergjigjiet("Numri i shtresave ne OSI modelin?", "9", "3", "7", "11", "C");
	p[9] = new PyetjetPergjigjiet("Sa bajt jane 1024 bit?", "1", "128", "32", "64", "B");
	p[10] = new PyetjetPergjigjiet("Nga cila kompani eshte zhvilluar sistemi operativ Mac?", "IBM", "Apple", "Microsoft", "Samsung", "B");
	p[11] = new PyetjetPergjigjiet(".gif eshte prapashtes e kujt?", "Imazhit", "Video", "Audio", "Word", "A");
	p[12] = new PyetjetPergjigjiet("Cili protokoll eshte perdorur per te pranuar e-mail?", "SMTP", "POP3", "HTTP", "FTP", "B");
	p[13] = new PyetjetPergjigjiet("Cili protokoll eshte perdorur per te derguar e-mail?", "HTTP", "POP3", "SMTP", "SSH", "C");
	p[14] = new PyetjetPergjigjiet("Cili program konverton gjuhen asembluese ne gjuhe te makines?", "Interpreteri", "Kompajleri", "Asembleri", "Komparatori", "C");
	p[15] = new PyetjetPergjigjiet("Ne cilin vit shenja '@' eshte zgjedhur per perdorim ne email?", "1976", "1980", "1977", "1972", "D");
	p[16] = new PyetjetPergjigjiet("Sa shtresa jane ne TCP/IP ?", "7", "5", "4", "11", "C");
	p[17] = new PyetjetPergjigjiet("Kush ka krijuar gjuhen programuese C?", "Ken Thompson", "Dennis Ritchie", "Robin Milner", "Frieder Nake", "B");
	p[18] = new PyetjetPergjigjiet("Cfare i referohet DNS?", "Data Number Sequence", "Digital Network Service", "Domain Name System", "Disk Numbering System", "B");
	p[19] = new PyetjetPergjigjiet("Kush e ka zbuluar Java?", "Oracle", "Microsoft", "Novell", "Sun", "D");
		
}
	public void actionPerformed(ActionEvent e)
     {if(a.isSelected()  )
    	 {checkAns("A");}
     else if(b.isSelected())
    	  {checkAns("B");}
     else if(c.isSelected())
    	 {checkAns("C");}
     else if(d.isSelected())
    	 {checkAns("D");}

     
     if(e.getSource()==next)
     {nextQuestion();
     r.clearSelection();
     }
    	 }

	public void checkAns(String perdoruesi)
	{
		 String sakta = p[i].getPergjigjiaSakte();
		 if(perdoruesi.equals(sakta))
		 {lab.setText("Sakte");}
		 else {
			    lab.setText("Gabim. E sakte eshte ne "+ p[i].getPergjigjiaSakte());
		 }
		
	}
	
	public void nextQuestion()
	{i++ ;
	 if(i>=p.length)
	 {System.exit(0);}
	 update(); 
	}
	
	public void update()
	
	{
		PyetjetPergjigjiet p1 = p[i];
		pyetja.setText(p1.getPyetja());
		a.setText(p1.getPergj1());
		b.setText(p1.getPergj2());
		c.setText(p1.getPergj3());
		d.setText(p1.getPergji4());
		lab.setText("");
	}
	
	public static void main(String[] args) {
	  new QuizFrame();

	}

}


