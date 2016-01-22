package pak;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

public class Vesala extends JFrame implements IIgra {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<Rec> listalakih=new ArrayList<Rec>();
	ArrayList<Rec> listasrednjih=new ArrayList<Rec>();
	ArrayList<Rec> listateskih = new ArrayList<Rec>();
	ArrayList<Rec> radnalista = new ArrayList<Rec>();
	ArrayList<Slovo> slova = new ArrayList<Slovo>();
	ArrayList<Slovo> slova2 = new ArrayList<Slovo>();
	
	String alfabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZČĆŠĐŽ";
	
	
	
	
	
	JButton btnPostaviSrednje;
	JButton btnPostaviTesko;
	JButton btnPostaviLako;
	JButton btnPomoc;
	
	Slovo s1;
	Slovo s2;
	Rec radna;
	String line="";
	String brpokusajastr=null;
	int proverabr=-1;
	String pogreseno="";
	int y=0;
	int brojpokusaja=0;
	int brpogodjenih=0;
	
	private JTextField textPogresna;
	private JTextField textPoruka;
	private JLabel lblPreostaliPokusaji;
	private JLabel labelPreostaliPokusaji;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnI;
	private JButton btnJ;
	private JButton btnK;
	private JButton btnL;
	private JButton btnM;
	private JButton btnN;
	private JButton btnO;
	private JButton btnP;
	private JButton btnR;
	private JButton btnS;
	private JButton btnT;
	private JButton btnU;
	private JButton btnV;
	private JButton btnZ;
	
	private JTextField textPomoc;
	private JButton btnRestart;
	private JButton btnPravila;
	private JButton btnC2;
	private JButton btnC3;
	private JButton btnS2;
	private JButton btnD2;
	private JButton btnZ2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vesala frame = new Vesala();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vesala() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPostaviLako = new JButton("Lako");
		btnPostaviLako.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					btnRestart.setEnabled(true); 
					textPoruka.setText("");
					radnalista.removeAll(radnalista);
					slova.removeAll(slova);
					listalakih.removeAll(listalakih);
					System.out.println(slova.toString());
						radnalista=listalakih;
					ucitajLakeReci(null);
					 radna=postaviRec();
					brojpokusaja=radna.brojzivota();
					textPogresna.setText("");
					for(int i=0;i<radna.fraza.length();i++){
						s1 = new Slovo();
						s2 = new Slovo();
						 s1.c = radna.fraza.charAt(i)+"";
						 s2.c = "_";
						 slova.add(s1);
						 slova2.add(s2);
						System.out.println(radna.fraza.charAt(i));
					}
					brpogodjenih=slova.size();
					textPoruka.setText(slova2.toString());
					System.out.println(s1.getC());
					brpokusajastr=String.valueOf(brojpokusaja);
					labelPreostaliPokusaji.setText(brpokusajastr);
					btnPostaviLako.setEnabled(false);
					btnPostaviSrednje.setEnabled(false);
					btnPostaviTesko.setEnabled(false);
					btnA.setEnabled(true);
					btnB.setEnabled(true);
					btnC.setEnabled(true);
					btnD.setEnabled(true);
					btnE.setEnabled(true);
					btnF.setEnabled(true);
					btnG.setEnabled(true);
					btnH.setEnabled(true);
					btnI.setEnabled(true);
					btnJ.setEnabled(true);
					btnK.setEnabled(true);
					btnL.setEnabled(true);
					btnM.setEnabled(true);
					btnN.setEnabled(true);
					btnO.setEnabled(true);
					btnP.setEnabled(true);
					btnR.setEnabled(true);
					btnS.setEnabled(true);
					btnT.setEnabled(true);
					btnU.setEnabled(true);
					btnV.setEnabled(true);
					btnZ.setEnabled(true);
					btnC2.setEnabled(true);
					btnC3.setEnabled(true);
					btnS2.setEnabled(true);
					btnD2.setEnabled(true);
					btnZ2.setEnabled(true);
					btnPomoc.setEnabled(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Problem pri učitavanju liste!");
				}
				
			}
			
		});
		btnPostaviLako.setBounds(122, 118, 89, 23);
		contentPane.add(btnPostaviLako);
		
		btnPostaviSrednje = new JButton("Srednje");
		btnPostaviSrednje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					btnRestart.setEnabled(true); 
					textPoruka.setText("");
					radnalista.removeAll(radnalista);
					slova.removeAll(slova);
					listasrednjih.removeAll(listasrednjih);
					System.out.println(slova.toString());
						radnalista=listasrednjih;
					ucitajSrednjeReci(null);
					 radna=postaviRec();
					brojpokusaja=radna.brojzivota();
					textPogresna.setText("");
					for(int i=0;i<radna.fraza.length();i++){
						s1 = new Slovo();
						s2 = new Slovo();
						 s1.c = radna.fraza.charAt(i)+"";
						 s2.c = "_";
						 slova.add(s1);
						 slova2.add(s2);
						System.out.println(radna.fraza.charAt(i));
					}
					brpogodjenih=slova.size();
					textPoruka.setText(slova2.toString());
					System.out.println(s1.getC());
					brpokusajastr=String.valueOf(brojpokusaja);
					labelPreostaliPokusaji.setText(brpokusajastr);
					btnPostaviLako.setEnabled(false);
					btnPostaviSrednje.setEnabled(false);
					btnPostaviTesko.setEnabled(false);
					btnA.setEnabled(true);
					btnB.setEnabled(true);
					btnC.setEnabled(true);
					btnD.setEnabled(true);
					btnE.setEnabled(true);
					btnF.setEnabled(true);
					btnG.setEnabled(true);
					btnH.setEnabled(true);
					btnI.setEnabled(true);
					btnJ.setEnabled(true);
					btnK.setEnabled(true);
					btnL.setEnabled(true);
					btnM.setEnabled(true);
					btnN.setEnabled(true);
					btnO.setEnabled(true);
					btnP.setEnabled(true);
					btnR.setEnabled(true);
					btnS.setEnabled(true);
					btnT.setEnabled(true);
					btnU.setEnabled(true);
					btnV.setEnabled(true);
					btnZ.setEnabled(true);
					btnC2.setEnabled(true);
					btnC3.setEnabled(true);
					btnS2.setEnabled(true);
					btnD2.setEnabled(true);
					btnZ2.setEnabled(true);
					btnPomoc.setEnabled(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Problem pri učitavanju liste!");
				}
				
				
			}
		});
		btnPostaviSrednje.setBounds(221, 118, 89, 23);
		contentPane.add(btnPostaviSrednje);
		
		btnPostaviTesko = new JButton("Teško");
		btnPostaviTesko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					btnRestart.setEnabled(true); 
					textPoruka.setText("");
					radnalista.removeAll(radnalista);
					slova.removeAll(slova);
					listateskih.removeAll(listateskih);
					System.out.println(slova.toString());
						radnalista=listateskih;
					ucitajTeskeReci(null);
					 radna=postaviRec();
					brojpokusaja=radna.brojzivota();
					textPogresna.setText("");
					for(int i=0;i<radna.fraza.length();i++){
						s1 = new Slovo();
						s2 = new Slovo();
						 s1.c = radna.fraza.charAt(i)+"";
						 s2.c = "_";
						 slova.add(s1);
						 slova2.add(s2);
						System.out.println(radna.fraza.charAt(i));
					}
					brpogodjenih=slova.size();
					textPoruka.setText(slova2.toString());
					System.out.println(s1.getC());
					brpokusajastr=String.valueOf(brojpokusaja);
					labelPreostaliPokusaji.setText(brpokusajastr);
					btnPostaviLako.setEnabled(false);
					btnPostaviSrednje.setEnabled(false);
					btnPostaviTesko.setEnabled(false);
					btnA.setEnabled(true);
					btnB.setEnabled(true);
					btnC.setEnabled(true);
					btnD.setEnabled(true);
					btnE.setEnabled(true);
					btnF.setEnabled(true);
					btnG.setEnabled(true);
					btnH.setEnabled(true);
					btnI.setEnabled(true);
					btnJ.setEnabled(true);
					btnK.setEnabled(true);
					btnL.setEnabled(true);
					btnM.setEnabled(true);
					btnN.setEnabled(true);
					btnO.setEnabled(true);
					btnP.setEnabled(true);
					btnR.setEnabled(true);
					btnS.setEnabled(true);
					btnT.setEnabled(true);
					btnU.setEnabled(true);
					btnV.setEnabled(true);
					btnZ.setEnabled(true);
					btnC2.setEnabled(true);
					btnC3.setEnabled(true);
					btnS2.setEnabled(true);
					btnD2.setEnabled(true);
					btnZ2.setEnabled(true);
					btnPomoc.setEnabled(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Problem pri učitavanju liste!");
				}
				
			}
		});
		btnPostaviTesko.setBounds(320, 118, 89, 23);
		contentPane.add(btnPostaviTesko);
		
		JLabel lblIzaberiTezinu = new JLabel("Izaberi težinu:");
		lblIzaberiTezinu.setBounds(10, 115, 89, 29);
		contentPane.add(lblIzaberiTezinu);
		
		JLabel lblVesala = new JLabel("VEŠALA");
		lblVesala.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 70));
		lblVesala.setBounds(328, 12, 302, 95);
		contentPane.add(lblVesala);
		
		JLabel lblRec = new JLabel("Reč:");
		lblRec.setBounds(10, 193, 55, 16);
		contentPane.add(lblRec);
		
		btnA = new JButton("A");
		btnA.setEnabled(false);
		btnA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				proverabr = 0;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnA.setEnabled(false);
				
			}
		});
		btnA.setBounds(10, 375, 61, 26);
		contentPane.add(btnA);
		
		JLabel lblPogresenaSlova = new JLabel("Pogrešena slova:");
		lblPogresenaSlova.setBounds(328, 193, 98, 16);
		contentPane.add(lblPogresenaSlova);
		
		textPogresna = new JTextField();
		textPogresna.setEditable(false);
		textPogresna.setBounds(438, 191, 253, 20);
		contentPane.add(textPogresna);
		textPogresna.setColumns(10);
		
		btnB = new JButton("B");
		btnB.setEnabled(false);
		
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr=1;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnB.setEnabled(false);
			}
		});
		btnB.setBounds(77, 375, 61, 26);
		contentPane.add(btnB);
		
		textPoruka = new JTextField();
		textPoruka.setEditable(false);
		textPoruka.setBounds(49, 191, 262, 20);
		contentPane.add(textPoruka);
		textPoruka.setColumns(10);
		
		lblPreostaliPokusaji = new JLabel("Preostali životi:");
		lblPreostaliPokusaji.setBounds(10, 238, 119, 16);
		contentPane.add(lblPreostaliPokusaji);
		
		labelPreostaliPokusaji = new JLabel("");
		labelPreostaliPokusaji.setBounds(122, 238, 55, 16);
		contentPane.add(labelPreostaliPokusaji);
		
		btnC = new JButton("C");
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 2;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnC.setEnabled(false);
				
			}
		});
		btnC.setBounds(144, 375, 61, 26);
		contentPane.add(btnC);
		
		btnD = new JButton("D");
		btnD.setEnabled(false);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 3;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnD.setEnabled(false);
			}
		});
		btnD.setBounds(211, 375, 61, 26);
		contentPane.add(btnD);
		
		btnE = new JButton("E");
		btnE.setEnabled(false);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				proverabr = 4;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnE.setEnabled(false);
			}
		});
		btnE.setBounds(276, 375, 61, 26);
		contentPane.add(btnE);
		
		btnF = new JButton("F");
		btnF.setEnabled(false);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 5;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnF.setEnabled(false);
			}
		});
		btnF.setBounds(341, 375, 61, 26);
		contentPane.add(btnF);
		
		btnG = new JButton("G");
		btnG.setEnabled(false);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 6;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnG.setEnabled(false);
			}
		});
		btnG.setBounds(406, 375, 61, 26);
		contentPane.add(btnG);
		
		btnH = new JButton("H");
		btnH.setEnabled(false);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 7;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnH.setEnabled(false);
			}
		});
		btnH.setBounds(470, 375, 61, 26);
		contentPane.add(btnH);
		
		btnI = new JButton("I");
		btnI.setEnabled(false);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 8;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnI.setEnabled(false);
			}
		});
		btnI.setBounds(536, 375, 61, 26);
		contentPane.add(btnI);
		
		btnJ = new JButton("J");
		btnJ.setEnabled(false);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 9;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnJ.setEnabled(false);
			}
		});
		btnJ.setBounds(599, 375, 61, 26);
		contentPane.add(btnJ);
		
		btnK = new JButton("K");
		btnK.setEnabled(false);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 10;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnK.setEnabled(false);
			}
		});
		btnK.setBounds(668, 375, 61, 26);
		contentPane.add(btnK);
		
		btnL = new JButton("L");
		btnL.setEnabled(false);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 11;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnL.setEnabled(false);
			}
		});
		btnL.setBounds(10, 413, 61, 26);
		contentPane.add(btnL);
		
		btnM = new JButton("M");
		btnM.setEnabled(false);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 12;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnM.setEnabled(false);
			}
		});
		btnM.setBounds(77, 413, 61, 26);
		contentPane.add(btnM);
		
		btnN = new JButton("N");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 13;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnN.setEnabled(false);
			}
		});
		btnN.setBounds(144, 413, 61, 26);
		contentPane.add(btnN);
		
		btnO = new JButton("O");
		btnO.setEnabled(false);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 14;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnO.setEnabled(false);
			}
		});
		btnO.setBounds(211, 413, 61, 26);
		contentPane.add(btnO);
		
		btnP = new JButton("P");
		btnP.setEnabled(false);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 15;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnP.setEnabled(false);
			}
		});
		btnP.setBounds(276, 413, 61, 26);
		contentPane.add(btnP);
		
		btnR = new JButton("R");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 17;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnR.setEnabled(false);
			}
		});
		btnR.setBounds(341, 413, 61, 26);
		contentPane.add(btnR);
		
		btnS = new JButton("S");
		btnS.setEnabled(false);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 18;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnS.setEnabled(false);
			}
		});
		btnS.setBounds(406, 413, 61, 26);
		contentPane.add(btnS);
		
		btnT = new JButton("T");
		btnT.setEnabled(false);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 19;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnT.setEnabled(false);
			}
		});
		btnT.setBounds(470, 413, 61, 26);
		contentPane.add(btnT);
		
		btnU = new JButton("U");
		btnU.setEnabled(false);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 20;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnU.setEnabled(false);
			}
		});
		btnU.setBounds(536, 413, 61, 26);
		contentPane.add(btnU);
		
		btnV = new JButton("V");
		btnV.setEnabled(false);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 21;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnV.setEnabled(false);
			}
		});
		btnV.setBounds(599, 413, 61, 26);
		contentPane.add(btnV);
		
		btnZ = new JButton("Z");
		btnZ.setEnabled(false);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proverabr = 25;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnZ.setEnabled(false);
			}
		});
		btnZ.setBounds(668, 413, 61, 26);
		contentPane.add(btnZ);
		
		btnPomoc = new JButton("Pomoć!");
		btnPomoc.setEnabled(false);
		btnPomoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pomocstr=null;
				pomocstr=pomoc();
				textPomoc.setText(pomocstr);
			}
		});
		btnPomoc.setBounds(328, 233, 98, 26);
		contentPane.add(btnPomoc);
		
		textPomoc = new JTextField();
		textPomoc.setEditable(false);
		textPomoc.setBounds(438, 236, 253, 20);
		contentPane.add(textPomoc);
		textPomoc.setColumns(10);
		
		btnRestart = new JButton("Nova igra");
		btnRestart.setEnabled(false);
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				listalakih.removeAll(listalakih);
				listasrednjih.removeAll(listasrednjih);
				listateskih.removeAll(listateskih);
				btnPostaviLako.setEnabled(true);
				btnPostaviSrednje.setEnabled(true);
				btnPostaviTesko.setEnabled(true);
				slova.removeAll(slova);
				slova2.removeAll(slova2);
				radnalista.removeAll(radnalista);
				brpogodjenih=0;
				pogreseno ="";
				textPomoc.setText("");
				btnPomoc.setEnabled(true);
				btnRestart.setEnabled(false);
				textPoruka.setText("");
				labelPreostaliPokusaji.setText("");
				
				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				btnH.setEnabled(false);
				btnI.setEnabled(false);
				btnJ.setEnabled(false);
				btnK.setEnabled(false);
				btnL.setEnabled(false);
				btnM.setEnabled(false);
				btnN.setEnabled(false);
				btnO.setEnabled(false);
				btnP.setEnabled(false);
				btnR.setEnabled(false);
				btnS.setEnabled(false);
				btnT.setEnabled(false);
				btnU.setEnabled(false);
				btnV.setEnabled(false);
				btnZ.setEnabled(false);
				btnC2.setEnabled(false);
				btnC3.setEnabled(false);
				btnS2.setEnabled(false);
				btnD2.setEnabled(false);
				btnZ2.setEnabled(false);
				btnPomoc.setEnabled(false);
				
			}
		});
		btnRestart.setBounds(421, 116, 98, 26);
		contentPane.add(btnRestart);
		
		btnPravila = new JButton("Pravila");
		btnPravila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Cilj je pogoditi nepoznatu reč a poznat je broj slova. \n Pomoć prikazuje neku informaciju vezanu za datu reč "
						+ "ali troši 3 života.\n Životi se troše samo ako se pogreši slovo ili potraži pomoć.\n Na početku se dobija 6 života za laku, 5 za srednju i 4 za tešku igru.\n Uživajte :) ");
			}
		});
		btnPravila.setBounds(532, 116, 98, 26);
		contentPane.add(btnPravila);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Created by: \n Radoljub Marković 209/2009 \n Bojan Zogović 54/2009 \n Milan Bogićević 522/2013");
				
			}
		});
		btnCredits.setBounds(642, 116, 98, 26);
		contentPane.add(btnCredits);
		
		btnC2 = new JButton("Č");
		btnC2.setEnabled(false);
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				proverabr = 26;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnC2.setEnabled(false);
			}
		});
		btnC2.setBounds(10, 446, 61, 26);
		contentPane.add(btnC2);
		
		btnC3 = new JButton("Ć");
		btnC3.setEnabled(false);
		btnC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proverabr = 27;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnC3.setEnabled(false);
			}
		});
		btnC3.setBounds(77, 446, 61, 26);
		contentPane.add(btnC3);
		
		btnS2 = new JButton("Š");
		btnS2.setEnabled(false);
		btnS2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proverabr = 28;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnS2.setEnabled(false);
			}
		});
		btnS2.setBounds(144, 446, 61, 26);
		contentPane.add(btnS2);
		
		btnD2 = new JButton("Đ");
		btnD2.setEnabled(false);
		btnD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proverabr = 29;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnD2.setEnabled(false);
			}
		});
		btnD2.setBounds(211, 446, 61, 26);
		contentPane.add(btnD2);
		
		btnZ2 = new JButton("Ž");
		btnZ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				proverabr = 30;
				String pom =null;
				pom=provera();
				textPoruka.setText(pom);
				textPogresna.setText(pogreseno);
				btnZ2.setEnabled(false);
			}
		});
		btnZ2.setEnabled(false);
		btnZ2.setBounds(276, 446, 61, 26);
		contentPane.add(btnZ2);
	}

	@Override
	public void ucitajLakeReci(Rec r) {
		
		Rec r1 = new LakaRec("MAČKA", "Lovi miševe");
		listalakih.add(r1);
		Rec r2 = new LakaRec("MIŠ", "Jede sir");
		listalakih.add(r2);
		Rec r3= new LakaRec("KVOČKA", "Leži na jajima");
		listalakih.add(r3);
		Rec r4 = new LakaRec("AVALA", "Planina kod Beograda");
		listalakih.add(r4);
		Rec r5 = new LakaRec("TELEFON", "Račun");
		listalakih.add(r5);
		Rec r6 = new LakaRec("RAČUNAR", "Tastatura");
		listalakih.add(r6);
		Rec r7 = new LakaRec("ZMAJ", "Mitološko biće");
		listalakih.add(r7);
		Rec r8 = new LakaRec("AMSTERDAM", "Grad u Holandiji");
		listalakih.add(r8);
		Rec r9 = new LakaRec("SNEG", "Zima");
		listalakih.add(r9);
		Rec r10 = new LakaRec("JELEN", "Vrsta piva");
		listalakih.add(r10);
		
	}
	
	@Override
	public void ucitajSrednjeReci(Rec r) {
		
		Rec r1 = new SrednjaRec("PROGRAMIRANJE", "JAVA,C++,C#...");
		listasrednjih.add(r1);
		Rec r2 = new SrednjaRec("ZLATIBOR", "Čajetina");
		listasrednjih.add(r2);
		Rec r3 = new SrednjaRec("PODUNAVCI", "Mesto kod Vrnjačke Banje");
		listasrednjih.add(r3);
		Rec r4 = new SrednjaRec("GOROBILJE", "Selo kod Požege");
		listasrednjih.add(r4);
		Rec r5 = new SrednjaRec("GRADAC", "Staro ime jednog grada u Šumadiji");
		listasrednjih.add(r5);
		Rec r6 = new SrednjaRec("SINGIDUNUM", "Staro ime jednog grada u Srbiji");
		listasrednjih.add(r6);
		Rec r7 = new SrednjaRec("METALIKA", "Treš metal bend");
		listasrednjih.add(r7);
		Rec r8 = new SrednjaRec("TERMINATOR", "Film Arnolda Švarcenegera");
		listasrednjih.add(r8);
		Rec r9 = new SrednjaRec("ZLATICA", "Krompir");
		listasrednjih.add(r9);
		Rec r10 = new SrednjaRec("KOPAKABANA", "Plaža u Rio de Žaneiru");
		listasrednjih.add(r10);
		
	}

	@Override
	public void ucitajTeskeReci(Rec r) {
		Rec r1 = new TeskaRec("PALATALIZACIJA", "Glasovna promena");
		listateskih.add(r1);
		Rec r2 = new TeskaRec("BAOBAB", "Vrsta drveća");
		listateskih.add(r2);
		Rec r3 = new TeskaRec("POPOKATEPETL", "Vulkan u Meksiku");
		listateskih.add(r3);
		Rec r4 = new TeskaRec("ETNA", "Vulkan u Evropi");
		listateskih.add(r4);
		Rec r5 = new TeskaRec("SPAJALICA", "Pribor u kancelariji");
		listateskih.add(r5);
		Rec r6 = new TeskaRec("KAVURMA", "Mesna prerađevina");
		listateskih.add(r6);
		Rec r7 =new TeskaRec("MEDOVAČA", "Vrsta alkoholnog pića");
		listateskih.add(r7);
		Rec r8 = new TeskaRec("KRV", "Arterija");
		listateskih.add(r8);
		Rec r9 = new TeskaRec("INSEKT", "Vrsta živog bića");
		listateskih.add(r9);
		Rec r10= new TeskaRec("SAFARI", "Afrika");
		listateskih.add(r10);
		
		
	}
		
		
	

	@Override
	public Rec postaviRec() {
		
		Random rand= new Random();
		int i=0;
		i=rand.nextInt(radnalista.size());
		return radnalista.get(i);
		
	}

	
	@Override
	public String provera(){
		
				int bristih=0;
				int z =0;
				z=proverabr;
		
		String strpom="";
		strpom+=alfabet.charAt(z);
		System.out.println("Slovo : "+alfabet.charAt(z));
		for(int i=0;i<slova.size();i++){
			
			System.out.println(slova.get(i).toString());
			
			if(slova.get(i).getC().equals(strpom)){
				slova2.get(i).setC(strpom);
				y =1;
				bristih+=1;
				line = slova2.toString();
				
				
				
			}
				else{
				System.out.println("nema slova na ovom mestu");
				
				}
			
			
		}
		
		if(y==1){
			System.out.println("OK");
			y=0;
			brpogodjenih-=bristih;
		}
		else{
			pogreseno+=strpom;
			line= slova2.toString();
			brojpokusaja-=1;
		
		}
		System.out.println(line);
		brpokusajastr=String.valueOf(brojpokusaja);
		labelPreostaliPokusaji.setText(brpokusajastr);
		
		if(brpogodjenih==0){
			JOptionPane.showMessageDialog(null, "Čestitamo pronašli ste reč!");
			listalakih.removeAll(listalakih);
			listasrednjih.removeAll(listasrednjih);
			listateskih.removeAll(listateskih);
			btnPostaviLako.setEnabled(true);
			btnPostaviSrednje.setEnabled(true);
			btnPostaviTesko.setEnabled(true);
			slova.removeAll(slova);
			slova2.removeAll(slova2);
			radnalista.removeAll(radnalista);
			brpogodjenih=0;
			pogreseno ="";
			textPomoc.setText("");
			btnPomoc.setEnabled(true);
			btnRestart.setEnabled(true);
			labelPreostaliPokusaji.setText("");
			
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			btnG.setEnabled(false);
			btnH.setEnabled(false);
			btnI.setEnabled(false);
			btnJ.setEnabled(false);
			btnK.setEnabled(false);
			btnL.setEnabled(false);
			btnM.setEnabled(false);
			btnN.setEnabled(false);
			btnO.setEnabled(false);
			btnP.setEnabled(false);
			btnR.setEnabled(false);
			btnS.setEnabled(false);
			btnT.setEnabled(false);
			btnU.setEnabled(false);
			btnV.setEnabled(false);
			btnZ.setEnabled(false);
			btnC2.setEnabled(false);
			btnC3.setEnabled(false);
			btnS2.setEnabled(false);
			btnD2.setEnabled(false);
			btnZ2.setEnabled(false);
			btnPomoc.setEnabled(false);
			btnRestart.setEnabled(false);
			
					
		}
		if (brojpokusaja<1){
			JOptionPane.showMessageDialog(null, "Nemate više pokušaja, izgubili ste!");
			listalakih.removeAll(listalakih);
			listasrednjih.removeAll(listasrednjih);
			listateskih.removeAll(listateskih);
			btnPostaviLako.setEnabled(true);
			btnPostaviSrednje.setEnabled(true);
			btnPostaviTesko.setEnabled(true);
			slova.removeAll(slova);
			slova2.removeAll(slova2);
			radnalista.removeAll(radnalista);
			brpogodjenih=0;
			pogreseno="";
			textPomoc.setText("");
			btnPomoc.setEnabled(true);
			btnRestart.setEnabled(true);
			labelPreostaliPokusaji.setText("");
			
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			btnG.setEnabled(false);
			btnH.setEnabled(false);
			btnI.setEnabled(false);
			btnJ.setEnabled(false);
			btnK.setEnabled(false);
			btnL.setEnabled(false);
			btnM.setEnabled(false);
			btnN.setEnabled(false);
			btnO.setEnabled(false);
			btnP.setEnabled(false);
			btnR.setEnabled(false);
			btnS.setEnabled(false);
			btnT.setEnabled(false);
			btnU.setEnabled(false);
			btnV.setEnabled(false);
			btnZ.setEnabled(false);
			btnPomoc.setEnabled(false);
			btnC2.setEnabled(false);
			btnC3.setEnabled(false);
			btnS2.setEnabled(false);
			btnD2.setEnabled(false);
			btnZ2.setEnabled(false);
			btnRestart.setEnabled(false);
			}

		return line;
	}

	@Override
	public String pomoc() {
		if(brojpokusaja<4){
			JOptionPane.showMessageDialog(null, "Nemate dovoljno života,pomoć troši 3 života!");
			return null;
		}
		else{
			brojpokusaja-=3;
			brpokusajastr=String.valueOf(brojpokusaja);
			labelPreostaliPokusaji.setText(brpokusajastr);
			btnPomoc.setEnabled(false);
			return radna.getPomoc();
				
		}
	}

	
	}
		
