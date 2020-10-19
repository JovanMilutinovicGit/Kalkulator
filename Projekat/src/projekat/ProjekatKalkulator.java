
package projekat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Јован
 */
public class ProjekatKalkulator extends javax.swing.JFrame implements Operacije{
    double prviBroj;
    double drugiBroj;
    double rezultat;
    String operacija;
    
    public ProjekatKalkulator() {
        initComponents();
    }
    //Ovo ovde je program sam iskucao (unchecked), tu su podesavanja dizajna itd.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        polje = new javax.swing.JTextField();
        broj8 = new javax.swing.JButton();
        broj6 = new javax.swing.JButton();
        broj7 = new javax.swing.JButton();
        broj5 = new javax.swing.JButton();
        broj4 = new javax.swing.JButton();
        broj1 = new javax.swing.JButton();
        broj2 = new javax.swing.JButton();
        broj9 = new javax.swing.JButton();
        oduzimanje = new javax.swing.JButton();
        deljenje = new javax.swing.JButton();
        koren = new javax.swing.JButton();
        stepen = new javax.swing.JButton();
        sabiranje = new javax.swing.JButton();
        kosinus = new javax.swing.JButton();
        faktorijel = new javax.swing.JButton();
        kvadrat = new javax.swing.JButton();
        sinus = new javax.swing.JButton();
        razlomak = new javax.swing.JButton();
        mnozenje = new javax.swing.JButton();
        logaritam = new javax.swing.JButton();
        ojler = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        dveNule = new javax.swing.JButton();
        procenat = new javax.swing.JButton();
        broj3 = new javax.swing.JButton();
        jednako = new javax.swing.JButton();
        broj0 = new javax.swing.JButton();
        znak = new javax.swing.JButton();
        decimalnaTacka = new javax.swing.JButton();
        dugmeObrisi = new javax.swing.JButton();
        obrisiSve = new javax.swing.JButton();
        polje2 = new javax.swing.JTextField();
        tanges = new javax.swing.JButton();
        ugaseno = new javax.swing.JButton();
        upaljeno = new javax.swing.JButton();
        citanjeMemorije = new javax.swing.JButton();
        ciscenjeMemorije = new javax.swing.JButton();
        cuvanjeMemorije = new javax.swing.JButton();
        Memorija = new javax.swing.JLabel();
        cosh = new javax.swing.JButton();
        ceoBroj = new javax.swing.JButton();
        sinh = new javax.swing.JButton();
        tanh = new javax.swing.JButton();
        polje5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Калкулатор");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        polje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        polje.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        polje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poljeActionPerformed(evt);
            }
        });
        getContentPane().add(polje);
        polje.setBounds(10, 30, 300, 40);

        broj8.setBackground(new java.awt.Color(51, 51, 51));
        broj8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj8.setForeground(new java.awt.Color(255, 255, 0));
        broj8.setText("8");
        broj8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj8ActionPerformed(evt);
            }
        });
        getContentPane().add(broj8);
        broj8.setBounds(90, 200, 55, 56);

        broj6.setBackground(new java.awt.Color(51, 51, 51));
        broj6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj6.setForeground(new java.awt.Color(255, 255, 0));
        broj6.setText("6");
        broj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj6ActionPerformed(evt);
            }
        });
        getContentPane().add(broj6);
        broj6.setBounds(170, 270, 55, 56);

        broj7.setBackground(new java.awt.Color(51, 51, 51));
        broj7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj7.setForeground(new java.awt.Color(255, 255, 0));
        broj7.setText("7");
        broj7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj7ActionPerformed(evt);
            }
        });
        getContentPane().add(broj7);
        broj7.setBounds(10, 200, 55, 56);

        broj5.setBackground(new java.awt.Color(51, 51, 51));
        broj5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj5.setForeground(new java.awt.Color(255, 255, 0));
        broj5.setText("5");
        broj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj5ActionPerformed(evt);
            }
        });
        getContentPane().add(broj5);
        broj5.setBounds(90, 270, 55, 56);

        broj4.setBackground(new java.awt.Color(51, 51, 51));
        broj4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj4.setForeground(new java.awt.Color(255, 255, 0));
        broj4.setText("4");
        broj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj4ActionPerformed(evt);
            }
        });
        getContentPane().add(broj4);
        broj4.setBounds(10, 270, 55, 56);

        broj1.setBackground(new java.awt.Color(51, 51, 51));
        broj1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj1.setForeground(new java.awt.Color(255, 255, 0));
        broj1.setText("1");
        broj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj1ActionPerformed(evt);
            }
        });
        getContentPane().add(broj1);
        broj1.setBounds(10, 340, 55, 56);

        broj2.setBackground(new java.awt.Color(51, 51, 51));
        broj2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj2.setForeground(new java.awt.Color(255, 255, 0));
        broj2.setText("2");
        broj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj2ActionPerformed(evt);
            }
        });
        getContentPane().add(broj2);
        broj2.setBounds(90, 340, 55, 56);

        broj9.setBackground(new java.awt.Color(51, 51, 51));
        broj9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj9.setForeground(new java.awt.Color(255, 255, 0));
        broj9.setText("9");
        broj9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj9ActionPerformed(evt);
            }
        });
        getContentPane().add(broj9);
        broj9.setBounds(170, 200, 55, 56);

        oduzimanje.setBackground(new java.awt.Color(51, 51, 51));
        oduzimanje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oduzimanje.setForeground(new java.awt.Color(255, 255, 0));
        oduzimanje.setText("-");
        oduzimanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oduzimanjeActionPerformed(evt);
            }
        });
        getContentPane().add(oduzimanje);
        oduzimanje.setBounds(250, 410, 55, 56);

        deljenje.setBackground(new java.awt.Color(51, 51, 51));
        deljenje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deljenje.setForeground(new java.awt.Color(255, 255, 0));
        deljenje.setText("/");
        deljenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deljenjeActionPerformed(evt);
            }
        });
        getContentPane().add(deljenje);
        deljenje.setBounds(250, 340, 55, 56);

        koren.setBackground(new java.awt.Color(0, 0, 0));
        koren.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        koren.setForeground(new java.awt.Color(255, 255, 0));
        koren.setText("√");
        koren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korenActionPerformed(evt);
            }
        });
        getContentPane().add(koren);
        koren.setBounds(330, 130, 55, 56);

        stepen.setBackground(new java.awt.Color(0, 0, 0));
        stepen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stepen.setForeground(new java.awt.Color(255, 255, 0));
        stepen.setText("x³");
        stepen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepenActionPerformed(evt);
            }
        });
        getContentPane().add(stepen);
        stepen.setBounds(400, 130, 55, 56);

        sabiranje.setBackground(new java.awt.Color(51, 51, 51));
        sabiranje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sabiranje.setForeground(new java.awt.Color(255, 255, 0));
        sabiranje.setText("+");
        sabiranje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabiranjeActionPerformed(evt);
            }
        });
        getContentPane().add(sabiranje);
        sabiranje.setBounds(250, 270, 55, 56);

        kosinus.setBackground(new java.awt.Color(0, 0, 0));
        kosinus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kosinus.setForeground(new java.awt.Color(255, 255, 0));
        kosinus.setText("cos");
        kosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosinusActionPerformed(evt);
            }
        });
        getContentPane().add(kosinus);
        kosinus.setBounds(470, 270, 55, 56);

        faktorijel.setBackground(new java.awt.Color(0, 0, 0));
        faktorijel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        faktorijel.setForeground(new java.awt.Color(255, 255, 0));
        faktorijel.setText("n!");
        faktorijel.setMaximumSize(new java.awt.Dimension(41, 25));
        faktorijel.setMinimumSize(new java.awt.Dimension(41, 25));
        faktorijel.setPreferredSize(new java.awt.Dimension(41, 25));
        faktorijel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faktorijelActionPerformed(evt);
            }
        });
        getContentPane().add(faktorijel);
        faktorijel.setBounds(540, 340, 55, 56);

        kvadrat.setBackground(new java.awt.Color(0, 0, 0));
        kvadrat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kvadrat.setForeground(new java.awt.Color(255, 255, 0));
        kvadrat.setText("x²");
        kvadrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kvadratActionPerformed(evt);
            }
        });
        getContentPane().add(kvadrat);
        kvadrat.setBounds(470, 340, 55, 56);

        sinus.setBackground(new java.awt.Color(0, 0, 0));
        sinus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sinus.setForeground(new java.awt.Color(255, 255, 0));
        sinus.setText("sin");
        sinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusActionPerformed(evt);
            }
        });
        getContentPane().add(sinus);
        sinus.setBounds(400, 270, 55, 56);

        razlomak.setBackground(new java.awt.Color(0, 0, 0));
        razlomak.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        razlomak.setForeground(new java.awt.Color(255, 255, 0));
        razlomak.setText("1/x");
        razlomak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razlomakActionPerformed(evt);
            }
        });
        getContentPane().add(razlomak);
        razlomak.setBounds(330, 340, 55, 56);

        mnozenje.setBackground(new java.awt.Color(51, 51, 51));
        mnozenje.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mnozenje.setForeground(new java.awt.Color(255, 255, 0));
        mnozenje.setText("*");
        mnozenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnozenjeActionPerformed(evt);
            }
        });
        getContentPane().add(mnozenje);
        mnozenje.setBounds(250, 200, 55, 56);

        logaritam.setBackground(new java.awt.Color(0, 0, 0));
        logaritam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logaritam.setForeground(new java.awt.Color(255, 255, 0));
        logaritam.setText("log");
        logaritam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logaritamActionPerformed(evt);
            }
        });
        getContentPane().add(logaritam);
        logaritam.setBounds(330, 270, 55, 56);

        ojler.setBackground(new java.awt.Color(0, 0, 0));
        ojler.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ojler.setForeground(new java.awt.Color(255, 255, 0));
        ojler.setText("e");
        ojler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojlerActionPerformed(evt);
            }
        });
        getContentPane().add(ojler);
        ojler.setBounds(400, 340, 55, 56);

        pi.setBackground(new java.awt.Color(0, 0, 0));
        pi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pi.setForeground(new java.awt.Color(255, 255, 0));
        pi.setText("\tπ");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        getContentPane().add(pi);
        pi.setBounds(540, 130, 55, 56);

        dveNule.setBackground(new java.awt.Color(51, 51, 51));
        dveNule.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dveNule.setForeground(new java.awt.Color(255, 255, 0));
        dveNule.setText("00");
        dveNule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dveNuleActionPerformed(evt);
            }
        });
        getContentPane().add(dveNule);
        dveNule.setBounds(90, 410, 55, 56);

        procenat.setBackground(new java.awt.Color(0, 0, 0));
        procenat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        procenat.setForeground(new java.awt.Color(255, 255, 0));
        procenat.setText("%");
        procenat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procenatActionPerformed(evt);
            }
        });
        getContentPane().add(procenat);
        procenat.setBounds(470, 130, 55, 56);

        broj3.setBackground(new java.awt.Color(51, 51, 51));
        broj3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj3.setForeground(new java.awt.Color(255, 255, 0));
        broj3.setText("3");
        broj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj3ActionPerformed(evt);
            }
        });
        getContentPane().add(broj3);
        broj3.setBounds(170, 340, 55, 56);

        jednako.setBackground(new java.awt.Color(51, 51, 51));
        jednako.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jednako.setForeground(new java.awt.Color(255, 255, 0));
        jednako.setText("=");
        jednako.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jednakoActionPerformed(evt);
            }
        });
        getContentPane().add(jednako);
        jednako.setBounds(250, 480, 55, 56);

        broj0.setBackground(new java.awt.Color(51, 51, 51));
        broj0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        broj0.setForeground(new java.awt.Color(255, 255, 0));
        broj0.setText("0");
        broj0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broj0ActionPerformed(evt);
            }
        });
        getContentPane().add(broj0);
        broj0.setBounds(10, 410, 55, 56);

        znak.setBackground(new java.awt.Color(51, 51, 51));
        znak.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        znak.setForeground(new java.awt.Color(255, 255, 0));
        znak.setText("+/-");
        znak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                znakActionPerformed(evt);
            }
        });
        getContentPane().add(znak);
        znak.setBounds(170, 480, 55, 56);

        decimalnaTacka.setBackground(new java.awt.Color(51, 51, 51));
        decimalnaTacka.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        decimalnaTacka.setForeground(new java.awt.Color(255, 255, 0));
        decimalnaTacka.setText(".");
        decimalnaTacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalnaTackaActionPerformed(evt);
            }
        });
        getContentPane().add(decimalnaTacka);
        decimalnaTacka.setBounds(170, 410, 55, 56);

        dugmeObrisi.setBackground(new java.awt.Color(255, 0, 0));
        dugmeObrisi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dugmeObrisi.setForeground(new java.awt.Color(255, 255, 255));
        dugmeObrisi.setText("Obrisi");
        dugmeObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeObrisiActionPerformed(evt);
            }
        });
        getContentPane().add(dugmeObrisi);
        dugmeObrisi.setBounds(90, 480, 55, 56);

        obrisiSve.setBackground(new java.awt.Color(255, 0, 0));
        obrisiSve.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        obrisiSve.setForeground(new java.awt.Color(255, 255, 255));
        obrisiSve.setText("Obrisi sve");
        obrisiSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiSveActionPerformed(evt);
            }
        });
        getContentPane().add(obrisiSve);
        obrisiSve.setBounds(10, 480, 55, 56);

        polje2.setEditable(false);
        polje2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        polje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polje2ActionPerformed(evt);
            }
        });
        getContentPane().add(polje2);
        polje2.setBounds(250, 130, 55, 56);

        tanges.setBackground(new java.awt.Color(0, 0, 0));
        tanges.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tanges.setForeground(new java.awt.Color(255, 255, 0));
        tanges.setText("tan");
        tanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangesActionPerformed(evt);
            }
        });
        getContentPane().add(tanges);
        tanges.setBounds(540, 270, 55, 56);

        ugaseno.setBackground(new java.awt.Color(255, 0, 0));
        ugaseno.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        ugaseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugasenoActionPerformed(evt);
            }
        });
        getContentPane().add(ugaseno);
        ugaseno.setBounds(290, 0, 20, 30);

        upaljeno.setBackground(new java.awt.Color(51, 204, 0));
        upaljeno.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        upaljeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upaljenoActionPerformed(evt);
            }
        });
        getContentPane().add(upaljeno);
        upaljeno.setBounds(270, 0, 20, 30);

        citanjeMemorije.setBackground(new java.awt.Color(0, 255, 204));
        citanjeMemorije.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        citanjeMemorije.setText("MR");
        citanjeMemorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citanjeMemorijeActionPerformed(evt);
            }
        });
        getContentPane().add(citanjeMemorije);
        citanjeMemorije.setBounds(90, 130, 55, 56);

        ciscenjeMemorije.setBackground(new java.awt.Color(0, 255, 204));
        ciscenjeMemorije.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ciscenjeMemorije.setText("MC");
        ciscenjeMemorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciscenjeMemorijeActionPerformed(evt);
            }
        });
        getContentPane().add(ciscenjeMemorije);
        ciscenjeMemorije.setBounds(10, 130, 55, 56);

        cuvanjeMemorije.setBackground(new java.awt.Color(0, 255, 204));
        cuvanjeMemorije.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cuvanjeMemorije.setText("MS");
        cuvanjeMemorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuvanjeMemorijeActionPerformed(evt);
            }
        });
        getContentPane().add(cuvanjeMemorije);
        cuvanjeMemorije.setBounds(170, 130, 55, 56);

        Memorija.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Memorija.setText("Меморија");
        getContentPane().add(Memorija);
        Memorija.setBounds(250, 190, 60, 10);

        cosh.setBackground(new java.awt.Color(0, 0, 0));
        cosh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cosh.setForeground(new java.awt.Color(255, 255, 0));
        cosh.setText("cosh");
        cosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coshActionPerformed(evt);
            }
        });
        getContentPane().add(cosh);
        cosh.setBounds(470, 200, 55, 56);

        ceoBroj.setBackground(new java.awt.Color(0, 0, 0));
        ceoBroj.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        ceoBroj.setForeground(new java.awt.Color(255, 255, 0));
        ceoBroj.setText("round");
        ceoBroj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceoBrojActionPerformed(evt);
            }
        });
        getContentPane().add(ceoBroj);
        ceoBroj.setBounds(330, 200, 55, 56);

        sinh.setBackground(new java.awt.Color(0, 0, 0));
        sinh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sinh.setForeground(new java.awt.Color(255, 255, 0));
        sinh.setText("sinh");
        sinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinhActionPerformed(evt);
            }
        });
        getContentPane().add(sinh);
        sinh.setBounds(400, 200, 55, 56);

        tanh.setBackground(new java.awt.Color(0, 0, 0));
        tanh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tanh.setForeground(new java.awt.Color(255, 255, 0));
        tanh.setText("tanh");
        tanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanhActionPerformed(evt);
            }
        });
        getContentPane().add(tanh);
        tanh.setBounds(540, 200, 55, 56);

        polje5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(polje5);
        polje5.setBounds(10, 70, 300, 40);

        jButton1.setText("Штампај");
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 660, 300, 25);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Израз", "Резултат"
            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TabelaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 550, 300, 100);

        jMenu1.setText("Додатни калкулатор");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Стандардни калкулатор");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Научни калкулатор");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //podesavanja velicine prozora
        this.setResizable(false);
        this.setSize(335, 750);
        
    }//GEN-LAST:event_formWindowActivated

    private void broj7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj7ActionPerformed
        //funkcija broja 7
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 7, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 7.
         */
        String a = polje.getText() + broj7.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj7ActionPerformed

    private void broj8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj8ActionPerformed
       //funkcija broja 8
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 8, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 8.
         */
        String a = polje.getText() + broj8.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj8ActionPerformed

    private void broj9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj9ActionPerformed
       //funkcija broja 9
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 9, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 9.
         */
        String a = polje.getText() + broj9.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj9ActionPerformed

    private void broj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj4ActionPerformed
        //funkcija broja 4
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 4, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 4.
         */
        String a = polje.getText() + broj4.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj4ActionPerformed

    private void broj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj5ActionPerformed
        //funkcija broja 5
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 5, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 5.
         */
        String a = polje.getText() + broj5.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj5ActionPerformed

    private void broj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj6ActionPerformed
        //funkcija broja 6
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 6, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 6.
         */
        String a = polje.getText() + broj6.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj6ActionPerformed

    private void broj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj1ActionPerformed
        //funkcija broja 1
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 1, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 1.
         */
        String a = polje.getText() + broj1.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj1ActionPerformed

    private void broj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj2ActionPerformed
        //funkcija broja 2
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 2, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 2.
         */
        String a = polje.getText() + broj2.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj2ActionPerformed

    private void broj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj3ActionPerformed
       //funkcija broja 3
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 3, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 3.
         */
        String a = polje.getText() + broj3.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj3ActionPerformed

    private void obrisiSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiSveActionPerformed
        /**funkcija dugmeta obrisi funkcionise tako sto samo setujemo (postavimo ) vrednost
         * polja sa praznim navodnicima.
         */
        polje.setText("");
        polje5.setText("");
    }//GEN-LAST:event_obrisiSveActionPerformed

    private void dugmeObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeObrisiActionPerformed
       /*funkcija brisanja broj po broj radi tako sto prvo proverava da li ima 
        neceg u polju za prikaz, onda koriscenjem ugradjene funkcije deleteCharAt() brise broj na odredjenoj
        poziciji jer ga posmatra kao niz karaktera.
        */
        String p = null;
       if (polje.getText().length()>0){
       StringBuilder sb = new StringBuilder(polje.getText());
       sb.deleteCharAt(polje.getText().length()-1);
       p = sb.toString();
       polje.setText(p);
       }
    }//GEN-LAST:event_dugmeObrisiActionPerformed

    private void broj0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broj0ActionPerformed
        //funkcija broja 3
        /**Imamo jedan string a, koji poprima trenutnu vrednost 
         * koja je upisana u polju za prikaz i na tu vrednost se dodaje vrednost 7, i to
         * tako sto uzima tekstualnu vrednost dugmeta. Ukoliko nema nikakve vrednosti
         * u polju za prikaz, ispisace se samo broj 3.
         */
        String a = polje.getText() + broj0.getText();        
        polje.setText(polje.getText()+"0");
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_broj0ActionPerformed

    private void polje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polje2ActionPerformed
       //Ovo je tekstualno polje2 ali sam ga ja u ovom kodu nazivao prozor.
    }//GEN-LAST:event_polje2ActionPerformed

    private void decimalnaTackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalnaTackaActionPerformed
        //funkcija dugmeta decimalne tacke je slicna funkciji broja
        if (!polje.getText().contains(".")){
        polje.setText(polje.getText() + decimalnaTacka.getText());
        }
    }//GEN-LAST:event_decimalnaTackaActionPerformed

    private void znakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_znakActionPerformed
        //Ovo je funkcija za upisivanje znaka minus ispred broja
        //Radi tako sto "kastuje" vrednost pa tu vrednost pomnozi sa -1.
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        t = t * (-1);
        polje.setText(String.valueOf(t));
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_znakActionPerformed
    
    private void korenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korenActionPerformed
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        if(polje.getText().length()>0)
        polje5.setText("√("+t+")");
        t = Math.sqrt(t);
        polje.setText(String.valueOf(t));
         ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_korenActionPerformed

    private void logaritamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logaritamActionPerformed
        //funkcija dugmeta za logaritam
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText("log("+t+")");
        t = Math.log(t);
        polje.setText(String.valueOf(t));
         ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_logaritamActionPerformed

    private void sinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusActionPerformed
        //funckija dugmeta za sinus
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText("sin("+t+")");
        t = Math.sin(t);
        polje.setText(String.valueOf(t));
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_sinusActionPerformed

    private void kosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosinusActionPerformed
        //funckija dugmeta za kosinus
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText("cos("+t+")");
        t = Math.cos(t);
        polje.setText(String.valueOf(t));
        
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_kosinusActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        //funkcija dugmeta "pi" radi tako sto  postavlja vrednost 3.14 u polju za prikaz
        double t;
        t = (3.1415926535897932384626433832795);
        polje.setText(String.valueOf(t));
       
    }//GEN-LAST:event_piActionPerformed

    private void ojlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojlerActionPerformed
        //funkcija dugmeta "e" radi tako sto  postavlja vrednost 2.718 u polju za prikaz
        double t;
        t = (2.7182818284590452353602874713527);
        polje.setText(String.valueOf(t));
        
    }//GEN-LAST:event_ojlerActionPerformed

    private void faktorijelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faktorijelActionPerformed
       //funkcija faktorijel
       //Ukoliko zelite objasnjenje funkcije faktorijel, objasnicu ako se to trazi od mene
       try{ 
       int t = Integer.parseInt(String.valueOf(polje.getText()));
        int faktorijel = 1;
        for (int i=1; i<=t; i++){
            faktorijel = faktorijel*i;
        }
        polje.setText(Integer.toString(faktorijel));
        polje5.setText(t+"!");
        
     ProjekatKalkulator.dodajPodatak(new Object[] {
           polje5.getText(),
            polje.getText(),
    });
       }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
       
    }//GEN-LAST:event_faktorijelActionPerformed

    private void kvadratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kvadratActionPerformed
        //funkcija za kvadrat broja
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText(t+"²");
        t = (t * t);
        polje.setText(String.valueOf(t));
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_kvadratActionPerformed

    private void stepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepenActionPerformed
        //funkcija za kubni stepen
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText(t+"³");
        t = (t * t * t);
        polje.setText(String.valueOf(t));
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_stepenActionPerformed

    private void jednakoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jednakoActionPerformed
        //funkcija dugmeta jednako
        //Ovde se vrsi samo provera operacije koja se vrsi i u zavisnosti od toga, vrsi se neka od  operacija.
        if(polje.getText().length()>0){
            double b = Double.parseDouble(polje.getText());
        switch(op){
            case "+": 
                sabiranje(vecIzracunataVrednost,b);
                break;
            
            case "-": 
                oduzimanje(vecIzracunataVrednost,b);
                break;
                
            case "*": 
                mnozenje(vecIzracunataVrednost,b);
                break;
                
            case "/": 
                
                deljenje(vecIzracunataVrednost,b);
                break;
                
        }
        
    }//GEN-LAST:event_jednakoActionPerformed
    
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
    }
      public static void dodajPodatak(Object[] niz){
       DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
       model.addRow(niz);
    }
    private void sabiranjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabiranjeActionPerformed
        //funkcija dugmeta za sabiranje
        op=("+");
        if(polje.getText().length()>0)
        v(op);
    }//GEN-LAST:event_sabiranjeActionPerformed

    private void oduzimanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oduzimanjeActionPerformed
        //funkcija dugmeta oduzimanje
        op=("-");
        if(polje.getText().length()>0)
        v(op);
    }//GEN-LAST:event_oduzimanjeActionPerformed

    private void mnozenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnozenjeActionPerformed
        //funkcija dugmeta mnozenje
        op=("*");
        if(polje.getText().length()>0)
        v(op);
    }//GEN-LAST:event_mnozenjeActionPerformed

    private void deljenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deljenjeActionPerformed
        //funkcija dugmeta deljenja
        op=("/");
        if(polje.getText().length()>0)
        v(op);   
    }//GEN-LAST:event_deljenjeActionPerformed

    private void procenatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procenatActionPerformed
        //funkcija hipotenuze koja se treba dovrsiti
        if (polje.getText().length()>0 && polje5.getText().length()>0){
        vecIzracunataVrednost = Double.parseDouble(polje.getText());
        procenat(Double.parseDouble(polje5.getText().split(" ")[0]),vecIzracunataVrednost);
        } 
    }//GEN-LAST:event_procenatActionPerformed
    private void procenat(double a, double b){
     switch(op){
         case "+":
             sabiranje(a*b/100,a);
             break;
         case "-":
             oduzimanje(a*b/100,a);
             break;
         case "*":
             mnozenje(a*b/100,a);
             break;
         case "/":
             deljenje(a*b/100,a);
             break;
     }
    }
    private void dveNuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dveNuleActionPerformed
        //funkcija dugmeta 00
        String a = polje.getText() + dveNule.getText();        
        polje.setText(a);
        polje5.setText(polje5.getText()+" "+a);
    }//GEN-LAST:event_dveNuleActionPerformed

    private void tangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangesActionPerformed
        //funkcija tangesa
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText("tan("+t+")");
        t = Math.tan(t);
        polje.setText(String.valueOf(t));
         ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
          });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_tangesActionPerformed

    private void razlomakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razlomakActionPerformed
        //funkcija dugmeta 1/x 
        //Ovde je potrebno bilo ubaciti try catch blok kako ne bi doslo do greske prilikom deljenja sa nulom.
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        if (t!=0){
        double p = (1.0/t);
        polje.setText(String.valueOf(p));
        polje5.setText("1/"+t);
        ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
          });
        }else {
        polje.setText("Nije dozvoljeno deljenje nulom.");
        }
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
        
    
    }//GEN-LAST:event_razlomakActionPerformed

    private void poljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poljeActionPerformed
    //Ovo je tekstualni polje ali sam ga ja u ovom kodu nazivao prozor.
    }//GEN-LAST:event_poljeActionPerformed

    private void upaljenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upaljenoActionPerformed
       //Ovo je funkcija dugmeta za ukljucivanje kalkulatora
       //Postavljamo vrednost na true da bi imali pristup funkcijama dugmica
       polje.setEnabled(true);
       polje2.setEnabled(true);
       polje5.setEnabled(true);
       razlomak.setEnabled(true);
       tanges.setEnabled(true);
       dveNule.setEnabled(true);
       procenat.setEnabled(true);
       deljenje.setEnabled(true);
       mnozenje.setEnabled(true);  
       oduzimanje.setEnabled(true);
       sabiranje.setEnabled(true);   
       stepen.setEnabled(true);
       kvadrat.setEnabled(true);
       koren.setEnabled(true);
       jednako.setEnabled(true);
       faktorijel.setEnabled(true);
       ojler.setEnabled(true);
       pi.setEnabled(true);
       kosinus.setEnabled(true);
       sinus.setEnabled(true);
       logaritam.setEnabled(true);
       decimalnaTacka.setEnabled(true);
       znak.setEnabled(true);
       dugmeObrisi.setEnabled(true);
       obrisiSve.setEnabled(true);
       broj1.setEnabled(true);
       broj2.setEnabled(true);
       broj3.setEnabled(true);
       broj4.setEnabled(true);
       broj5.setEnabled(true);
       broj6.setEnabled(true);
       broj7.setEnabled(true);
       broj8.setEnabled(true);
       broj9.setEnabled(true);
       broj0.setEnabled(true);
       citanjeMemorije.setEnabled(true);
       ciscenjeMemorije.setEnabled(true);
       cuvanjeMemorije.setEnabled(true);
       sinh.setEnabled(true);
       cosh.setEnabled(true);
       tanh.setEnabled(true);
       ceoBroj.setEnabled(true);
    }//GEN-LAST:event_upaljenoActionPerformed

    private void ugasenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugasenoActionPerformed
       //Ovo je funkcija dugmeta za ukljucivanje kalkulatora
       //Postavljamo vrednost na false da bi onemogucili rad kalkulatora kada je iskljucen
       polje.setText(""); 
       polje5.setText("");
       polje.setEnabled(false);
       polje5.setEnabled(false);
       razlomak.setEnabled(false);      
       tanges.setEnabled(false);
       dveNule.setEnabled(false);
       procenat.setEnabled(false);
       deljenje.setEnabled(false);
       mnozenje.setEnabled(false);  
       oduzimanje.setEnabled(false);
       sabiranje.setEnabled(false);   
       stepen.setEnabled(false);
       kvadrat.setEnabled(false);
       koren.setEnabled(false);
       jednako.setEnabled(false);
       faktorijel.setEnabled(false);
       ojler.setEnabled(false);
       pi.setEnabled(false);
       kosinus.setEnabled(false);
       sinus.setEnabled(false);
       logaritam.setEnabled(false);
       decimalnaTacka.setEnabled(false);
       znak.setEnabled(false);
       dugmeObrisi.setEnabled(false);
       obrisiSve.setEnabled(false);
       broj1.setEnabled(false);
       broj2.setEnabled(false);
       broj3.setEnabled(false);
       broj4.setEnabled(false);
       broj5.setEnabled(false);
       broj6.setEnabled(false);
       broj7.setEnabled(false);
       broj8.setEnabled(false);
       broj9.setEnabled(false);
       broj0.setEnabled(false);
       citanjeMemorije.setEnabled(false);
       ciscenjeMemorije.setEnabled(false);
       cuvanjeMemorije.setEnabled(false);
       sinh.setEnabled(false);
       cosh.setEnabled(false);
       tanh.setEnabled(false);
       ceoBroj.setEnabled(false);
    }//GEN-LAST:event_ugasenoActionPerformed

    private void citanjeMemorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citanjeMemorijeActionPerformed
        //funkcija za citanje vrednosti iz memorije
        //Radi tako sto uzima tekstualnu vrednost iz prozora polje2 i postavlja tu vrednost u prozor polje.
        polje.setText(String.valueOf(polje2.getText()));
    }//GEN-LAST:event_citanjeMemorijeActionPerformed

    private void ciscenjeMemorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciscenjeMemorijeActionPerformed
    //funkcija dugmeta za ciscenje memorije    
    //Cisti prozor polje2 upisivanjem praznih navodnika.
        polje2.setText("");
    }//GEN-LAST:event_ciscenjeMemorijeActionPerformed

    private void cuvanjeMemorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuvanjeMemorijeActionPerformed
       //funkcija za cuvanje vrednosti u memoriju
       /*Radi tako sto u prozoru polje2 postavlja vrednost koja se nalazi u prozoru polje 
       uz napomenu da to mora biti vrednost string jer postoji samo tekstualna vrednost dugmeta.
       */
        polje2.setText(String.valueOf(polje.getText()));
    }//GEN-LAST:event_cuvanjeMemorijeActionPerformed

    private void coshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coshActionPerformed
        //funkcija dugmeta cosh
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
         polje5.setText("cosh("+t+")");
        t = Math.cosh(t);
        polje.setText(String.valueOf(t));
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_coshActionPerformed

    private void ceoBrojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceoBrojActionPerformed
        //funkcija dugmeta za zaokrugljivanje
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
         polje5.setText("round("+t+")");
        t = Math.round(t);
        polje.setText(String.valueOf(t)); 
         ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_ceoBrojActionPerformed

    private void sinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinhActionPerformed
        //funkcija dugmeta sinh
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
         polje5.setText("sinh("+t+")");
        t = Math.sinh(t);
        polje.setText(String.valueOf(t));
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_sinhActionPerformed

    private void tanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanhActionPerformed
        //funkcija dugmeta tanh
        try{
        double t = Double.parseDouble(String.valueOf(polje.getText()));
        polje5.setText("tanh("+t+")");
        t = Math.tanh(t);
        polje.setText(String.valueOf(t));
     ProjekatKalkulator.dodajPodatak(new Object[] {
            polje5.getText(),
            polje.getText(),
    });
        }catch(Exception e){
        polje.setText("Niste uneli vrednost");
        }
    }//GEN-LAST:event_tanhActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.setResizable(false);
       this.setSize(630, 750);
       polje.setSize(585, 40);
       polje5.setSize(585, 40);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(false);
        this.setSize(335, 750);
        polje.setSize(300, 40);
        polje5.setSize(300,40);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void TabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaMouseEntered
    private void v(String op){
    
    String vrednost = polje.getText();
    vecIzracunataVrednost = Double.parseDouble(vrednost);
    polje5.setText(vrednost+" "+op);
    polje.setText("");
    }
    
   //Ovo je program sam kucao
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjekatKalkulator().setVisible(true);
            }
        });
        
    }
    private String op;
    private double vecIzracunataVrednost;
 
    
    //Ovo je program sam kucao
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Memorija;
    private static javax.swing.JTable Tabela;
    private javax.swing.JButton broj0;
    private javax.swing.JButton broj1;
    private javax.swing.JButton broj2;
    private javax.swing.JButton broj3;
    private javax.swing.JButton broj4;
    private javax.swing.JButton broj5;
    private javax.swing.JButton broj6;
    private javax.swing.JButton broj7;
    private javax.swing.JButton broj8;
    private javax.swing.JButton broj9;
    private javax.swing.JButton ceoBroj;
    private javax.swing.JButton ciscenjeMemorije;
    private javax.swing.JButton citanjeMemorije;
    private javax.swing.JButton cosh;
    private javax.swing.JButton cuvanjeMemorije;
    private javax.swing.JButton decimalnaTacka;
    private javax.swing.JButton deljenje;
    private javax.swing.JButton dugmeObrisi;
    private javax.swing.JButton dveNule;
    private javax.swing.JButton faktorijel;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jednako;
    private javax.swing.JButton koren;
    private javax.swing.JButton kosinus;
    private javax.swing.JButton kvadrat;
    private javax.swing.JButton logaritam;
    private javax.swing.JButton mnozenje;
    private javax.swing.JButton obrisiSve;
    private javax.swing.JButton oduzimanje;
    private javax.swing.JButton ojler;
    private javax.swing.JButton pi;
    private javax.swing.JTextField polje;
    private javax.swing.JTextField polje2;
    private javax.swing.JTextField polje5;
    private javax.swing.JButton procenat;
    private javax.swing.JButton razlomak;
    private javax.swing.JButton sabiranje;
    private javax.swing.JButton sinh;
    private javax.swing.JButton sinus;
    private javax.swing.JButton stepen;
    private javax.swing.JButton tanges;
    private javax.swing.JButton tanh;
    private javax.swing.JButton ugaseno;
    private javax.swing.JButton upaljeno;
    private javax.swing.JButton znak;
    // End of variables declaration//GEN-END:variables

    @Override
    public void sabiranje(double a, double b) {
        
        postaviRezultat(a+b);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void oduzimanje(double a, double b) {
         postaviRezultat(a-b);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mnozenje(double a, double b) {
         postaviRezultat(a*b);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deljenje(double a, double b) {
        if (b!=0){
        postaviRezultat(a/b);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }else {
        polje.setText("Nije dozvoljeno deljenje nulom.");
        }    
    }
    
    private void postaviRezultat(double rezultat){
        polje.setText(Double.toString(rezultat));
       
    }
}
