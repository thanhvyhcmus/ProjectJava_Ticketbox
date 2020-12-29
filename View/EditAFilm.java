/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Color;
import javax.swing.*;
import java.awt.Component;
import java.util.ArrayList;
import DAO.FilmDAO;
import Model.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import javax.imageio.ImageIO;
/**
 *
 * @author nguye
 */
public class EditAFilm extends javax.swing.JFrame {
    ImageIcon icon = null;
    final JFileChooser  fileDialog = new JFileChooser(getClass().getResource("/images").getPath());
    /**
     * Creates new form MannageUsers
     */
    ArrayList<ArrayList<JLabel>> lstLab = null;
    String linkImg = "";
    Film me = null;
    int mpX, mpY;
    public EditAFilm(Film me) {
        initComponents();
        this.me = me;
        title.setText(me.getTitle());
        cast.setText(me.getCast());
      
        duration.setText(Integer.toString(me.getDuration()));
        date.setDate(LocalDate.parse(me.getReleasedDate()));
        String[] favgenre = me.getGenre().split(", ");
            for(String genre:favgenre){
                if(genre.equals("Drama"))
                    genre_drama.setSelected(true);
                if(genre.equals("Comedy"))
                    genre_comedy.setSelected(true);
                if(genre.equals("Action"))
                    genre_action.setSelected(true);
            }
        des.setText(me.getDescription());
        linkImg = me.getLinkimg();
                
        icon = new ImageIcon(getClass().getResource(me.getLinkimg()));
        icon.getImage().flush();
        labimg.setIcon(icon);
        
        
        
        
        
        
              
        
        //System.out.println(getClass().getResource("/images/exit.png"));
        //System.out.println(getClass().getResource("/images/logo.png"));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        header_top = new javax.swing.JPanel();
        menu_top = new javax.swing.JPanel();
        btn_exit = new javax.swing.JPanel();
        lab_exit = new javax.swing.JLabel();
        btn_min = new javax.swing.JPanel();
        lab_min = new javax.swing.JLabel();
        btn_max = new javax.swing.JPanel();
        lab_max = new javax.swing.JLabel();
        header_bottom = new javax.swing.JPanel();
        main_menu = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        lab_home = new javax.swing.JLabel();
        btn_accounts = new javax.swing.JPanel();
        lab_accounts = new javax.swing.JLabel();
        btn_films = new javax.swing.JPanel();
        lab_films = new javax.swing.JLabel();
        btn_showtimes = new javax.swing.JPanel();
        lab_showtimes = new javax.swing.JLabel();
        btn_revenue = new javax.swing.JPanel();
        lab_revenue = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_st = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        img = new javax.swing.JPanel();
        labimg = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lab_type7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lab_type4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        btnImg = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lab_type1 = new javax.swing.JLabel();
        cast = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        lab_type5 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        lab_type6 = new javax.swing.JLabel();
        date = new com.github.lgooddatepicker.components.DatePicker();
        jPanel11 = new javax.swing.JPanel();
        lab_genre = new javax.swing.JLabel();
        genre_drama = new javax.swing.JCheckBox();
        genre_comedy = new javax.swing.JCheckBox();
        genre_action = new javax.swing.JCheckBox();
        mess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        header.setBackground(new java.awt.Color(64, 33, 100));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.setPreferredSize(new java.awt.Dimension(800, 80));
        header.setLayout(new java.awt.BorderLayout());

        header_top.setBackground(new java.awt.Color(64, 33, 100));
        header_top.setPreferredSize(new java.awt.Dimension(400, 30));
        header_top.setLayout(new java.awt.BorderLayout());

        menu_top.setBackground(new java.awt.Color(64, 33, 100));
        menu_top.setPreferredSize(new java.awt.Dimension(150, 30));
        menu_top.setLayout(new java.awt.BorderLayout());

        btn_exit.setBackground(new java.awt.Color(64, 33, 100));
        btn_exit.setMinimumSize(new java.awt.Dimension(25, 25));
        btn_exit.setPreferredSize(new java.awt.Dimension(50, 30));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        btn_exit.setLayout(new java.awt.BorderLayout());

        lab_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        lab_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.add(lab_exit, java.awt.BorderLayout.CENTER);

        menu_top.add(btn_exit, java.awt.BorderLayout.EAST);

        btn_min.setBackground(new java.awt.Color(64, 33, 100));
        btn_min.setPreferredSize(new java.awt.Dimension(50, 30));
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minMouseExited(evt);
            }
        });
        btn_min.setLayout(new java.awt.BorderLayout());

        lab_min.setBackground(new java.awt.Color(24, 24, 24));
        lab_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        lab_min.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lab_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_minMouseExited(evt);
            }
        });
        btn_min.add(lab_min, java.awt.BorderLayout.CENTER);

        menu_top.add(btn_min, java.awt.BorderLayout.WEST);

        btn_max.setBackground(new java.awt.Color(64, 33, 100));
        btn_max.setPreferredSize(new java.awt.Dimension(50, 30));
        btn_max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_maxMouseExited(evt);
            }
        });
        btn_max.setLayout(new java.awt.BorderLayout());

        lab_max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/max.png"))); // NOI18N
        btn_max.add(lab_max, java.awt.BorderLayout.CENTER);

        menu_top.add(btn_max, java.awt.BorderLayout.CENTER);

        header_top.add(menu_top, java.awt.BorderLayout.LINE_END);

        header.add(header_top, java.awt.BorderLayout.PAGE_START);

        header_bottom.setBackground(new java.awt.Color(64, 33, 100));
        header_bottom.setAlignmentX(Component.CENTER_ALIGNMENT);
        header_bottom.setMinimumSize(new java.awt.Dimension(800, 30));
        header_bottom.setPreferredSize(new java.awt.Dimension(800, 50));

        main_menu.setBackground(new java.awt.Color(64, 33, 100));
        main_menu.setPreferredSize(new java.awt.Dimension(600, 30));
        main_menu.setLayout(new java.awt.GridLayout(1, 5));

        btn_home.setBackground(new java.awt.Color(64, 33, 100));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        btn_home.setLayout(new java.awt.BorderLayout());

        lab_home.setBackground(new java.awt.Color(64, 33, 100));
        lab_home.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_home.setForeground(new java.awt.Color(255, 255, 255));
        lab_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        lab_home.setText("Home");
        lab_home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_home.add(lab_home, java.awt.BorderLayout.CENTER);

        main_menu.add(btn_home);

        btn_accounts.setBackground(new java.awt.Color(64, 33, 100));
        btn_accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_accountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_accountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_accountsMouseExited(evt);
            }
        });
        btn_accounts.setLayout(new java.awt.BorderLayout());

        lab_accounts.setBackground(new java.awt.Color(64, 33, 100));
        lab_accounts.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_accounts.setForeground(new java.awt.Color(255, 255, 255));
        lab_accounts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_accounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account1.png"))); // NOI18N
        lab_accounts.setText("Accounts");
        btn_accounts.add(lab_accounts, java.awt.BorderLayout.CENTER);

        main_menu.add(btn_accounts);

        btn_films.setBackground(new java.awt.Color(64, 33, 100));
        btn_films.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filmsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_filmsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_filmsMouseExited(evt);
            }
        });
        btn_films.setLayout(new java.awt.BorderLayout());

        lab_films.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_films.setForeground(new java.awt.Color(255, 255, 255));
        lab_films.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_films.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/film.png"))); // NOI18N
        lab_films.setText("Films");
        btn_films.add(lab_films, java.awt.BorderLayout.CENTER);

        main_menu.add(btn_films);

        btn_showtimes.setBackground(new java.awt.Color(64, 33, 100));
        btn_showtimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_showtimesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_showtimesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_showtimesMouseExited(evt);
            }
        });
        btn_showtimes.setLayout(new java.awt.BorderLayout());

        lab_showtimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_showtimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/showtimes.png"))); // NOI18N
        lab_showtimes.setText("Showtimes");
        lab_showtimes.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_showtimes.setForeground(new java.awt.Color(255, 255, 255));
        btn_showtimes.add(lab_showtimes, java.awt.BorderLayout.CENTER);

        main_menu.add(btn_showtimes);

        btn_revenue.setBackground(new java.awt.Color(64, 33, 100));
        btn_revenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_revenueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_revenueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_revenueMouseExited(evt);
            }
        });
        btn_revenue.setLayout(new java.awt.BorderLayout());

        lab_revenue.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lab_revenue.setForeground(new java.awt.Color(255, 255, 255));
        lab_revenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_revenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/revenue.png"))); // NOI18N
        lab_revenue.setText(" Revenue");
        btn_revenue.add(lab_revenue, java.awt.BorderLayout.CENTER);

        main_menu.add(btn_revenue);

        header_bottom.add(main_menu);

        header.add(header_bottom, java.awt.BorderLayout.CENTER);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 33, 100)));
        body.setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(140, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        jLabel4.setBackground(new java.awt.Color(64, 33, 100));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 33, 100));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADD A FILM");
        jPanel2.add(jLabel4);

        jPanel3.add(jPanel2);

        jPanel1.add(jPanel3);

        body.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panel_st.setBackground(new java.awt.Color(255, 255, 255));
        panel_st.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 50));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        save.setForeground(new java.awt.Color(64, 33, 100));
        save.setText("Save");
        save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.setBorderPainted(false);
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setPreferredSize(new java.awt.Dimension(100, 29));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel4.add(save);

        panel_st.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel5.setLayout(new java.awt.BorderLayout());

        img.setBackground(new java.awt.Color(255, 255, 255));
        img.setPreferredSize(new java.awt.Dimension(250, 250));
        img.add(labimg);

        jPanel5.add(img, java.awt.BorderLayout.LINE_END);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        lab_type7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_type7.setForeground(new java.awt.Color(64, 33, 100));
        lab_type7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lab_type7.setText("Description");
        lab_type7.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel14.add(lab_type7);

        des.setColumns(43);
        des.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        jPanel14.add(jScrollPane1);

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(5, 1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lab_type4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_type4.setForeground(new java.awt.Color(64, 33, 100));
        lab_type4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lab_type4.setText("Title");
        lab_type4.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel8.add(lab_type4);

        title.setPreferredSize(new java.awt.Dimension(300, 30));
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        jPanel8.add(title);

        btnImg.setBackground(new java.awt.Color(255, 255, 255));
        btnImg.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        btnImg.setForeground(new java.awt.Color(64, 33, 100));
        btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        btnImg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImg.setBorderPainted(false);
        btnImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImg.setPreferredSize(new java.awt.Dimension(93, 30));
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });
        jPanel8.add(btnImg);

        jPanel7.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lab_type1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_type1.setForeground(new java.awt.Color(64, 33, 100));
        lab_type1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lab_type1.setText("Cast");
        lab_type1.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel9.add(lab_type1);

        cast.setPreferredSize(new java.awt.Dimension(400, 30));
        cast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                castActionPerformed(evt);
            }
        });
        jPanel9.add(cast);

        jPanel7.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        lab_type5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_type5.setForeground(new java.awt.Color(64, 33, 100));
        lab_type5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lab_type5.setText("Duration");
        lab_type5.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel10.add(lab_type5);

        duration.setPreferredSize(new java.awt.Dimension(103, 30));
        jPanel10.add(duration);

        lab_type6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lab_type6.setText("Released Date");
        lab_type6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_type6.setForeground(new java.awt.Color(64, 33, 100));
        lab_type6.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel10.add(lab_type6);

        date.setPreferredSize(new java.awt.Dimension(185, 30));
        jPanel10.add(date);

        jPanel7.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        lab_genre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_genre.setForeground(new java.awt.Color(64, 33, 100));
        lab_genre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lab_genre.setText("Genre");
        lab_genre.setPreferredSize(new java.awt.Dimension(152, 20));
        jPanel11.add(lab_genre);

        genre_drama.setBackground(new java.awt.Color(255, 255, 255));
        genre_drama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genre_drama.setForeground(new java.awt.Color(64, 33, 100));
        genre_drama.setText("Drama");
        genre_drama.setPreferredSize(new java.awt.Dimension(100, 29));
        jPanel11.add(genre_drama);

        genre_comedy.setBackground(new java.awt.Color(255, 255, 255));
        genre_comedy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genre_comedy.setForeground(new java.awt.Color(64, 33, 100));
        genre_comedy.setText("Comedy");
        genre_comedy.setPreferredSize(new java.awt.Dimension(100, 29));
        jPanel11.add(genre_comedy);

        genre_action.setBackground(new java.awt.Color(255, 255, 255));
        genre_action.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genre_action.setForeground(new java.awt.Color(64, 33, 100));
        genre_action.setText("Action");
        genre_action.setPreferredSize(new java.awt.Dimension(100, 29));
        jPanel11.add(genre_action);

        jPanel7.add(jPanel11);

        mess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mess.setBackground(new java.awt.Color(255, 255, 255));
        mess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel7.add(mess);

        jPanel13.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel13, java.awt.BorderLayout.CENTER);

        panel_st.add(jPanel5, java.awt.BorderLayout.CENTER);

        body.add(panel_st, java.awt.BorderLayout.CENTER);

        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(800, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        // TODO add your handling code here:
        btn_exit.setBackground(Color.red);
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        // TODO add your handling code here:
        btn_exit.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_minMouseClicked

    private void btn_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseEntered
        // TODO add your handling code here:
        btn_min.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_minMouseEntered

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        // TODO add your handling code here:
        btn_min.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_minMouseExited

    private void btn_maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseClicked
        // TODO add your handling code here:
        if(this.getExtendedState()!=MAXIMIZED_BOTH){
            this.setExtendedState(MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(NORMAL);
        }
    }//GEN-LAST:event_btn_maxMouseClicked

    private void btn_maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseEntered
        // TODO add your handling code here:
        btn_max.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_maxMouseEntered

    private void btn_maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseExited
        // TODO add your handling code here:
        btn_max.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_maxMouseExited

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        // TODO add your handling code here:
        btn_home.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        // TODO add your handling code here:
        btn_home.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_accountsMouseClicked

    private void btn_accountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountsMouseEntered
        // TODO add your handling code here:
        btn_accounts.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_accountsMouseEntered

    private void btn_accountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountsMouseExited
        // TODO add your handling code here:
        btn_accounts.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_accountsMouseExited

    private void btn_filmsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filmsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filmsMouseClicked

    private void btn_filmsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filmsMouseEntered
        // TODO add your handling code here:
        btn_films.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_filmsMouseEntered

    private void btn_filmsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filmsMouseExited
        // TODO add your handling code here:
        btn_films.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_filmsMouseExited

    private void btn_showtimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showtimesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_showtimesMouseClicked

    private void btn_showtimesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showtimesMouseEntered
        // TODO add your handling code here:
        btn_showtimes.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_showtimesMouseEntered

    private void btn_showtimesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showtimesMouseExited
        // TODO add your handling code here:
        btn_showtimes.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_showtimesMouseExited

    private void btn_revenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_revenueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_revenueMouseClicked

    private void btn_revenueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_revenueMouseEntered
        // TODO add your handling code here:
        btn_revenue.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_btn_revenueMouseEntered

    private void btn_revenueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_revenueMouseExited
        // TODO add your handling code here:
        btn_revenue.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_btn_revenueMouseExited

    private void lab_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_minMouseClicked
        // TODO add your handling code here:
        setState(this.ICONIFIED);
        
    }//GEN-LAST:event_lab_minMouseClicked

    private void lab_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_minMouseEntered
        // TODO add your handling code here:
        btn_min.setBackground(new Color(37,12,65));
    }//GEN-LAST:event_lab_minMouseEntered

    private void lab_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_minMouseExited
        // TODO add your handling code here:
        btn_min.setBackground(new Color(64,33,100));
    }//GEN-LAST:event_lab_minMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        mpX = evt.getX();
        mpY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        setLocation(getLocation().x + evt.getX() - mpX,getLocation().y + evt.getY() - mpY );
    }//GEN-LAST:event_formMouseDragged

    private void castActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_castActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_castActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        int returnVal = fileDialog.showOpenDialog(this);
        System.out.println(getClass().getResource("/images").toString());
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               linkImg = "/images/"+file.getName();
                System.out.println(linkImg+" ll"+file.getAbsolutePath());
                
                icon = new ImageIcon(file.getAbsolutePath());
                icon.getImage().flush();
                labimg.setIcon(icon);
       }
            else{
                mess.setText("Please choose a Picture for The Film" );
                
                
                
            }  
    }//GEN-LAST:event_btnImgActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String strtitle = this.title.getText();
        System.out.println(strtitle.equals("")+strtitle+"link img"+linkImg);
        int dur = 0;
        
        String strcast = this.cast.getText();
        String strduration = this.duration.getText();
        String strdate = this.date.toString();
        String strdescription = des.getText();
        String favgenre = "";
            if (genre_drama.isSelected())
            favgenre += genre_drama.getText() + ", ";
            if (genre_action.isSelected())
            favgenre += genre_action.getText() + ", ";
            if (genre_comedy.isSelected())
            favgenre += genre_comedy.getText() + ", ";
            if (favgenre.length() != 0)
                favgenre = favgenre.substring(0, favgenre.length() - 2);
        
        System.out.println(strtitle.length() == 0 || this.date.getDate()==null||strcast.length() == 0||strduration.length() == 0||linkImg.length() == 0);
        if(strtitle.length() == 0 || this.date.getDate()==null||strcast.length() == 0||strduration.length() == 0||linkImg.length() == 0){
            mess.setText("Please fill full information");
            return;

        }
        
        try {
                    dur =Integer.parseInt(strduration);
                    boolean res = FilmDAO.updateAFilm(new Film(me.getID(),strtitle,strdescription,dur,favgenre, "", strcast, strdate, "Vietnamese",linkImg));
                    if(res)
                        mess.setText("Updated successfully");
                    else
                        mess.setText("Updated fail");
        } catch (Exception e) {
                    mess.setText("Duration is not correct format");
                    
        }        
                
        
        
    }//GEN-LAST:event_saveActionPerformed
     
    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btnImg;
    private javax.swing.JPanel btn_accounts;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_films;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_max;
    private javax.swing.JPanel btn_min;
    private javax.swing.JPanel btn_revenue;
    private javax.swing.JPanel btn_showtimes;
    private javax.swing.JTextField cast;
    private com.github.lgooddatepicker.components.DatePicker date;
    private javax.swing.JTextArea des;
    private javax.swing.JTextField duration;
    private javax.swing.JCheckBox genre_action;
    private javax.swing.JCheckBox genre_comedy;
    private javax.swing.JCheckBox genre_drama;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header_bottom;
    private javax.swing.JPanel header_top;
    private javax.swing.JPanel img;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_accounts;
    private javax.swing.JLabel lab_exit;
    private javax.swing.JLabel lab_films;
    private javax.swing.JLabel lab_genre;
    private javax.swing.JLabel lab_home;
    private javax.swing.JLabel lab_max;
    private javax.swing.JLabel lab_min;
    private javax.swing.JLabel lab_revenue;
    private javax.swing.JLabel lab_showtimes;
    private javax.swing.JLabel lab_type1;
    private javax.swing.JLabel lab_type4;
    private javax.swing.JLabel lab_type5;
    private javax.swing.JLabel lab_type6;
    private javax.swing.JLabel lab_type7;
    private javax.swing.JLabel labimg;
    private javax.swing.JPanel main_menu;
    private javax.swing.JPanel menu_top;
    private javax.swing.JLabel mess;
    private javax.swing.JPanel panel_st;
    private javax.swing.JButton save;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
