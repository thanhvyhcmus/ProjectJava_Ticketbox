/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CustomerController;
import Model.Film;
import Model.Theater;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author ngnth
 */
public class CustomerView extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void createListTheaterPanel (ArrayList<Theater> theaterlist){
        for (int i = 0; i < theaterlist.size(); i++){
            createTheaterPanel(theaterlist.get(i),i);
        }
    }
    private void createTheaterPanel(Theater theater, int pos){
        javax.swing.JLabel theaterlabel;
        javax.swing.JPanel theaterpanel;
        theaterpanel = new javax.swing.JPanel();
        theaterlabel = new javax.swing.JLabel();
        theaterpanel.setBackground(new java.awt.Color(199, 183, 158));
        theaterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        theaterlabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        theaterlabel.setForeground(new java.awt.Color(255, 255, 255));
        theaterlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        theaterlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/woodenbg.jpg"))); // NOI18N
        theaterlabel.setText(theater.getName());
        theaterlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        theaterlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        theaterlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theaterlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout theaterpanelLayout = new javax.swing.GroupLayout(theaterpanel);
        theaterpanel.setLayout(theaterpanelLayout);
        theaterpanelLayout.setHorizontalGroup(
                theaterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(theaterpanelLayout.createSequentialGroup()
                                .addComponent(theaterlabel)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        theaterpanelLayout.setVerticalGroup(
                theaterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(theaterlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        int posX = 40 + 320*(pos%3);
        int posY = 40 + 120*(pos/3);
        theaterListPanel.add(theaterpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, -1, -1));
    }
    private void createListMoviePanel (ArrayList<Film> filmlist){
        int len = 6;
        if (filmlist.size() < 6){
            len = filmlist.size();
        }
        for (int i = 0; i < 6; i++){
            addMoviePanel(filmlist.get(i),i);
        }
    }
    private void addMoviePanel(Film film, int pos){
        javax.swing.JPanel moviePanel;
        javax.swing.JLabel moviePoster;
        javax.swing.JLabel filmLabel;
        moviePanel = new javax.swing.JPanel();
        moviePoster = new javax.swing.JLabel();
        filmLabel = new javax.swing.JLabel();
        moviePanel.setBackground(new java.awt.Color(38, 19, 66));
        moviePoster.setIcon(new javax.swing.ImageIcon(getClass().getResource(film.getLinkimg()))); // NOI18N

        filmLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        filmLabel.setForeground(new java.awt.Color(255, 255, 255));
        filmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filmLabel.setText(film.getTitle());
        filmLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filmLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmLabelMouseClicked(evt);
            }

            private void filmLabelMouseClicked(MouseEvent evt) {
            }
        });

        javax.swing.GroupLayout moviePanel2Layout = new javax.swing.GroupLayout(moviePanel);
        moviePanel.setLayout(moviePanel2Layout);
        moviePanel2Layout.setHorizontalGroup(
                moviePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(moviePanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(moviePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(moviePoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(filmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        moviePanel2Layout.setVerticalGroup(
                moviePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(moviePanel2Layout.createSequentialGroup()
                                .addComponent(moviePoster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addContainerGap())
        );
        int posX = 0 + 320*(pos%3);
        int posY = 40 + 410*(pos/3);
        movieListPanel.add(moviePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, -1, -1));
    }
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mainscrollpane = new javax.swing.JScrollPane();
        mainpanel = new javax.swing.JPanel();
        MovieLab = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        movieListPanel = new javax.swing.JPanel();
        theaterLab = new javax.swing.JPanel();
        theatertext = new javax.swing.JLabel();
        theater_lineright = new javax.swing.JPanel();
        theater_lineleft = new javax.swing.JPanel();
        theaterListPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_32px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 42));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 16, 120, 42));

        sidepane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 350, 70));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookticket.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 42));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Ticket");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 16, 120, 42));

        sidepane.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 360, 70));

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infologo.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 42));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manage Account");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 16, 171, 42));

        sidepane.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 361, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        sidepane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(85, 65, 118));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/movielogo.png"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 42));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Movies");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 16, 120, 42));

        sidepane.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 361, 70));

        jPanel6.setBackground(new java.awt.Color(54, 33, 89));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theaterlogo.png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 42));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Theaters");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 16, 120, 42));

        sidepane.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 360, 70));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 332, 700));

        mainscrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        mainpanel.setBackground(new java.awt.Color(38, 19, 66));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MovieLab.setBackground(new java.awt.Color(38, 19, 66));
        MovieLab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(0, 0, 51));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MOVIE SELECTIONS");
        MovieLab.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 309, -1));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        MovieLab.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 300, 5));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        MovieLab.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 5));

        mainpanel.add(MovieLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 950, 40));

        movieListPanel.setBackground(new java.awt.Color(38, 19, 66));
        movieListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ArrayList<Film> fi = CustomerController.getAllFilms();
//        ArrayList<Film> fi = new ArrayList<>();
//        fi.add(new Film(1,"DORAEMON","des",1,"","","","","","/images/doraemon.jpg"));
//        fi.add(new Film(1,"DORAEMON","des",1,"","","","","","/images/doraemon.jpg"));
//        fi.add(new Film(1,"DORAEMON","des",1,"","","","","","/images/doraemon.jpg"));
//        fi.add(new Film(1,"DORAEMON","des",1,"","","","","","/images/doraemon.jpg"));
//        fi.add(new Film(1,"DORAEMON","des",1,"","","","","","/images/doraemon.jpg"));
//        fi.add(new Film(1,"DORAEMON","des",1,"","","","","","/images/doraemon.jpg"));
        createListMoviePanel(fi);
        mainpanel.add(movieListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 940, 840));
        theaterLab.setBackground(new java.awt.Color(38, 19, 66));
        theaterLab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        theatertext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        theatertext.setForeground(new java.awt.Color(255, 255, 255));
        theatertext.setText("THEATERS");
        theaterLab.add(theatertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 309, 40));

        javax.swing.GroupLayout theater_linerightLayout = new javax.swing.GroupLayout(theater_lineright);
        theater_lineright.setLayout(theater_linerightLayout);
        theater_linerightLayout.setHorizontalGroup(
                theater_linerightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        theater_linerightLayout.setVerticalGroup(
                theater_linerightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        theaterLab.add(theater_lineright, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 300, 5));

        javax.swing.GroupLayout theater_lineleftLayout = new javax.swing.GroupLayout(theater_lineleft);
        theater_lineleft.setLayout(theater_lineleftLayout);
        theater_lineleftLayout.setHorizontalGroup(
                theater_lineleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        theater_lineleftLayout.setVerticalGroup(
                theater_lineleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        theaterLab.add(theater_lineleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 5));

        mainpanel.add(theaterLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 950, 40));

        theaterListPanel.setBackground(new java.awt.Color(38, 19, 66));
        theaterListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArrayList<Theater> theaters = CustomerController.getAllTheaters();
        createListTheaterPanel(theaters);

        mainpanel.add(theaterListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 940, 950, 320));

        mainscrollpane.setViewportView(mainpanel);

        bg.add(mainscrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 940, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(647, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void theaterlabelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel MovieLab;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JScrollPane mainscrollpane;
    private javax.swing.JPanel movieListPanel;
    private javax.swing.JPanel sidepane;
    private javax.swing.JPanel theaterLab;
    private javax.swing.JPanel theaterListPanel;
    private javax.swing.JPanel theater_lineleft;
    private javax.swing.JPanel theater_lineright;
    private javax.swing.JLabel theatertext;
    // End of variables declaration                   
}
