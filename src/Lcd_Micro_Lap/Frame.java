package Lcd_Micro_Lap;

import java.awt.Color;

public class Frame extends javax.swing.JFrame {

    private int[] count = new int[56];

    public Frame() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Lcd Micro Lap");
        for (int i = 0; i < 56; i++) {
            count[i] = 0;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        p7 = new javax.swing.JPanel();
        p8 = new javax.swing.JPanel();
        p9 = new javax.swing.JPanel();
        p10 = new javax.swing.JPanel();
        p13 = new javax.swing.JPanel();
        p11 = new javax.swing.JPanel();
        p14 = new javax.swing.JPanel();
        p12 = new javax.swing.JPanel();
        p15 = new javax.swing.JPanel();
        p17 = new javax.swing.JPanel();
        p18 = new javax.swing.JPanel();
        p19 = new javax.swing.JPanel();
        p20 = new javax.swing.JPanel();
        p21 = new javax.swing.JPanel();
        p22 = new javax.swing.JPanel();
        p23 = new javax.swing.JPanel();
        p25 = new javax.swing.JPanel();
        p31 = new javax.swing.JPanel();
        p30 = new javax.swing.JPanel();
        p27 = new javax.swing.JPanel();
        p29 = new javax.swing.JPanel();
        p28 = new javax.swing.JPanel();
        p26 = new javax.swing.JPanel();
        p37 = new javax.swing.JPanel();
        p35 = new javax.swing.JPanel();
        p39 = new javax.swing.JPanel();
        p36 = new javax.swing.JPanel();
        p34 = new javax.swing.JPanel();
        p33 = new javax.swing.JPanel();
        p38 = new javax.swing.JPanel();
        p45 = new javax.swing.JPanel();
        p47 = new javax.swing.JPanel();
        p44 = new javax.swing.JPanel();
        p41 = new javax.swing.JPanel();
        p43 = new javax.swing.JPanel();
        p46 = new javax.swing.JPanel();
        p42 = new javax.swing.JPanel();
        p49 = new javax.swing.JPanel();
        p52 = new javax.swing.JPanel();
        p54 = new javax.swing.JPanel();
        p50 = new javax.swing.JPanel();
        p55 = new javax.swing.JPanel();
        p53 = new javax.swing.JPanel();
        p51 = new javax.swing.JPanel();
        p32 = new javax.swing.JPanel();
        p16 = new javax.swing.JPanel();
        p24 = new javax.swing.JPanel();
        p48 = new javax.swing.JPanel();
        p56 = new javax.swing.JPanel();
        p40 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(51, 153, 255));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        p2.setBackground(new java.awt.Color(51, 153, 255));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 60));

        p3.setBackground(new java.awt.Color(51, 153, 255));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 60));

        p4.setBackground(new java.awt.Color(51, 153, 255));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 60, 60));

        p5.setBackground(new java.awt.Color(51, 153, 255));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 60));

        p6.setBackground(new java.awt.Color(51, 153, 255));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 60, 60));

        p7.setBackground(new java.awt.Color(51, 153, 255));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 60, 60));

        p8.setBackground(new java.awt.Color(51, 153, 255));
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 60, 60));

        p9.setBackground(new java.awt.Color(51, 153, 255));
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 60));

        p10.setBackground(new java.awt.Color(51, 153, 255));
        p10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 60));

        p13.setBackground(new java.awt.Color(51, 153, 255));
        p13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p13MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p13Layout = new javax.swing.GroupLayout(p13);
        p13.setLayout(p13Layout);
        p13Layout.setHorizontalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p13Layout.setVerticalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, 60));

        p11.setBackground(new java.awt.Color(51, 153, 255));
        p11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 60));

        p14.setBackground(new java.awt.Color(51, 153, 255));
        p14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p14Layout = new javax.swing.GroupLayout(p14);
        p14.setLayout(p14Layout);
        p14Layout.setHorizontalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p14Layout.setVerticalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 60, 60));

        p12.setBackground(new java.awt.Color(51, 153, 255));
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 60, 60));

        p15.setBackground(new java.awt.Color(51, 153, 255));
        p15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p15Layout = new javax.swing.GroupLayout(p15);
        p15.setLayout(p15Layout);
        p15Layout.setHorizontalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p15Layout.setVerticalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 60));

        p17.setBackground(new java.awt.Color(51, 153, 255));
        p17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p17MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p17Layout = new javax.swing.GroupLayout(p17);
        p17.setLayout(p17Layout);
        p17Layout.setHorizontalGroup(
            p17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p17Layout.setVerticalGroup(
            p17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 60));

        p18.setBackground(new java.awt.Color(51, 153, 255));
        p18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p18MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p18Layout = new javax.swing.GroupLayout(p18);
        p18.setLayout(p18Layout);
        p18Layout.setHorizontalGroup(
            p18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p18Layout.setVerticalGroup(
            p18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 60));

        p19.setBackground(new java.awt.Color(51, 153, 255));
        p19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p19MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p19Layout = new javax.swing.GroupLayout(p19);
        p19.setLayout(p19Layout);
        p19Layout.setHorizontalGroup(
            p19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p19Layout.setVerticalGroup(
            p19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 60));

        p20.setBackground(new java.awt.Color(51, 153, 255));
        p20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p20MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p20Layout = new javax.swing.GroupLayout(p20);
        p20.setLayout(p20Layout);
        p20Layout.setHorizontalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p20Layout.setVerticalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, 60));

        p21.setBackground(new java.awt.Color(51, 153, 255));
        p21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p21MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p21Layout = new javax.swing.GroupLayout(p21);
        p21.setLayout(p21Layout);
        p21Layout.setHorizontalGroup(
            p21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p21Layout.setVerticalGroup(
            p21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 60, 60));

        p22.setBackground(new java.awt.Color(51, 153, 255));
        p22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p22MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p22Layout = new javax.swing.GroupLayout(p22);
        p22.setLayout(p22Layout);
        p22Layout.setHorizontalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p22Layout.setVerticalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 60, 60));

        p23.setBackground(new java.awt.Color(51, 153, 255));
        p23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p23MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p23Layout = new javax.swing.GroupLayout(p23);
        p23.setLayout(p23Layout);
        p23Layout.setHorizontalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p23Layout.setVerticalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 60, 60));

        p25.setBackground(new java.awt.Color(51, 153, 255));
        p25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p25Layout = new javax.swing.GroupLayout(p25);
        p25.setLayout(p25Layout);
        p25Layout.setHorizontalGroup(
            p25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p25Layout.setVerticalGroup(
            p25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 60, 60));

        p31.setBackground(new java.awt.Color(51, 153, 255));
        p31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p31MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p31Layout = new javax.swing.GroupLayout(p31);
        p31.setLayout(p31Layout);
        p31Layout.setHorizontalGroup(
            p31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p31Layout.setVerticalGroup(
            p31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 60, 60));

        p30.setBackground(new java.awt.Color(51, 153, 255));
        p30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p30MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p30Layout = new javax.swing.GroupLayout(p30);
        p30.setLayout(p30Layout);
        p30Layout.setHorizontalGroup(
            p30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p30Layout.setVerticalGroup(
            p30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 60, 60));

        p27.setBackground(new java.awt.Color(51, 153, 255));
        p27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p27MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p27Layout = new javax.swing.GroupLayout(p27);
        p27.setLayout(p27Layout);
        p27Layout.setHorizontalGroup(
            p27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p27Layout.setVerticalGroup(
            p27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, 60));

        p29.setBackground(new java.awt.Color(51, 153, 255));
        p29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p29MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p29Layout = new javax.swing.GroupLayout(p29);
        p29.setLayout(p29Layout);
        p29Layout.setHorizontalGroup(
            p29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p29Layout.setVerticalGroup(
            p29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 60, 60));

        p28.setBackground(new java.awt.Color(51, 153, 255));
        p28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p28MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p28Layout = new javax.swing.GroupLayout(p28);
        p28.setLayout(p28Layout);
        p28Layout.setHorizontalGroup(
            p28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p28Layout.setVerticalGroup(
            p28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, 60));

        p26.setBackground(new java.awt.Color(51, 153, 255));
        p26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p26MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p26Layout = new javax.swing.GroupLayout(p26);
        p26.setLayout(p26Layout);
        p26Layout.setHorizontalGroup(
            p26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p26Layout.setVerticalGroup(
            p26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 60));

        p37.setBackground(new java.awt.Color(51, 153, 255));
        p37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p37MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p37Layout = new javax.swing.GroupLayout(p37);
        p37.setLayout(p37Layout);
        p37Layout.setHorizontalGroup(
            p37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p37Layout.setVerticalGroup(
            p37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p37, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 60, 60));

        p35.setBackground(new java.awt.Color(51, 153, 255));
        p35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p35MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p35Layout = new javax.swing.GroupLayout(p35);
        p35.setLayout(p35Layout);
        p35Layout.setHorizontalGroup(
            p35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p35Layout.setVerticalGroup(
            p35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 60, 60));

        p39.setBackground(new java.awt.Color(51, 153, 255));
        p39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p39MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p39Layout = new javax.swing.GroupLayout(p39);
        p39.setLayout(p39Layout);
        p39Layout.setHorizontalGroup(
            p39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p39Layout.setVerticalGroup(
            p39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 60, 60));

        p36.setBackground(new java.awt.Color(51, 153, 255));
        p36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p36MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p36Layout = new javax.swing.GroupLayout(p36);
        p36.setLayout(p36Layout);
        p36Layout.setHorizontalGroup(
            p36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p36Layout.setVerticalGroup(
            p36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 60, 60));

        p34.setBackground(new java.awt.Color(51, 153, 255));
        p34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p34MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p34Layout = new javax.swing.GroupLayout(p34);
        p34.setLayout(p34Layout);
        p34Layout.setHorizontalGroup(
            p34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p34Layout.setVerticalGroup(
            p34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p34, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, 60));

        p33.setBackground(new java.awt.Color(51, 153, 255));
        p33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p33MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p33Layout = new javax.swing.GroupLayout(p33);
        p33.setLayout(p33Layout);
        p33Layout.setHorizontalGroup(
            p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p33Layout.setVerticalGroup(
            p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        p38.setBackground(new java.awt.Color(51, 153, 255));
        p38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p38MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p38Layout = new javax.swing.GroupLayout(p38);
        p38.setLayout(p38Layout);
        p38Layout.setHorizontalGroup(
            p38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p38Layout.setVerticalGroup(
            p38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 60, 60));

        p45.setBackground(new java.awt.Color(51, 153, 255));
        p45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p45MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p45Layout = new javax.swing.GroupLayout(p45);
        p45.setLayout(p45Layout);
        p45Layout.setHorizontalGroup(
            p45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p45Layout.setVerticalGroup(
            p45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 60, 60));

        p47.setBackground(new java.awt.Color(51, 153, 255));
        p47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p47MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p47Layout = new javax.swing.GroupLayout(p47);
        p47.setLayout(p47Layout);
        p47Layout.setHorizontalGroup(
            p47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p47Layout.setVerticalGroup(
            p47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p47, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 60, 60));

        p44.setBackground(new java.awt.Color(51, 153, 255));
        p44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p44MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p44Layout = new javax.swing.GroupLayout(p44);
        p44.setLayout(p44Layout);
        p44Layout.setHorizontalGroup(
            p44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p44Layout.setVerticalGroup(
            p44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 60, 60));

        p41.setBackground(new java.awt.Color(51, 153, 255));
        p41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p41MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p41Layout = new javax.swing.GroupLayout(p41);
        p41.setLayout(p41Layout);
        p41Layout.setHorizontalGroup(
            p41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p41Layout.setVerticalGroup(
            p41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, 60));

        p43.setBackground(new java.awt.Color(51, 153, 255));
        p43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p43MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p43Layout = new javax.swing.GroupLayout(p43);
        p43.setLayout(p43Layout);
        p43Layout.setHorizontalGroup(
            p43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p43Layout.setVerticalGroup(
            p43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 60, 60));

        p46.setBackground(new java.awt.Color(51, 153, 255));
        p46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p46MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p46Layout = new javax.swing.GroupLayout(p46);
        p46.setLayout(p46Layout);
        p46Layout.setHorizontalGroup(
            p46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p46Layout.setVerticalGroup(
            p46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p46, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 60, 60));

        p42.setBackground(new java.awt.Color(51, 153, 255));
        p42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p42MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p42Layout = new javax.swing.GroupLayout(p42);
        p42.setLayout(p42Layout);
        p42Layout.setHorizontalGroup(
            p42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p42Layout.setVerticalGroup(
            p42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 60, 60));

        p49.setBackground(new java.awt.Color(51, 153, 255));
        p49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p49MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p49Layout = new javax.swing.GroupLayout(p49);
        p49.setLayout(p49Layout);
        p49Layout.setHorizontalGroup(
            p49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p49Layout.setVerticalGroup(
            p49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p49, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 60, 60));

        p52.setBackground(new java.awt.Color(51, 153, 255));
        p52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p52MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p52Layout = new javax.swing.GroupLayout(p52);
        p52.setLayout(p52Layout);
        p52Layout.setHorizontalGroup(
            p52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p52Layout.setVerticalGroup(
            p52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p52, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 60, 60));

        p54.setBackground(new java.awt.Color(51, 153, 255));
        p54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p54MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p54Layout = new javax.swing.GroupLayout(p54);
        p54.setLayout(p54Layout);
        p54Layout.setHorizontalGroup(
            p54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p54Layout.setVerticalGroup(
            p54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p54, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 60, 60));

        p50.setBackground(new java.awt.Color(51, 153, 255));
        p50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p50MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p50Layout = new javax.swing.GroupLayout(p50);
        p50.setLayout(p50Layout);
        p50Layout.setHorizontalGroup(
            p50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p50Layout.setVerticalGroup(
            p50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p50, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 60, 60));

        p55.setBackground(new java.awt.Color(51, 153, 255));
        p55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p55MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p55Layout = new javax.swing.GroupLayout(p55);
        p55.setLayout(p55Layout);
        p55Layout.setHorizontalGroup(
            p55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p55Layout.setVerticalGroup(
            p55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p55, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 60, 60));

        p53.setBackground(new java.awt.Color(51, 153, 255));
        p53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p53MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p53Layout = new javax.swing.GroupLayout(p53);
        p53.setLayout(p53Layout);
        p53Layout.setHorizontalGroup(
            p53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p53Layout.setVerticalGroup(
            p53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p53, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 60, 60));

        p51.setBackground(new java.awt.Color(51, 153, 255));
        p51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p51MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p51Layout = new javax.swing.GroupLayout(p51);
        p51.setLayout(p51Layout);
        p51Layout.setHorizontalGroup(
            p51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p51Layout.setVerticalGroup(
            p51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 60, 60));

        p32.setBackground(new java.awt.Color(51, 153, 255));
        p32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p32MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p32Layout = new javax.swing.GroupLayout(p32);
        p32.setLayout(p32Layout);
        p32Layout.setHorizontalGroup(
            p32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p32Layout.setVerticalGroup(
            p32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 60, 60));

        p16.setBackground(new java.awt.Color(51, 153, 255));
        p16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p16Layout = new javax.swing.GroupLayout(p16);
        p16.setLayout(p16Layout);
        p16Layout.setHorizontalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p16Layout.setVerticalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 60, 60));

        p24.setBackground(new java.awt.Color(51, 153, 255));
        p24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p24MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p24Layout = new javax.swing.GroupLayout(p24);
        p24.setLayout(p24Layout);
        p24Layout.setHorizontalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p24Layout.setVerticalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 60, 60));

        p48.setBackground(new java.awt.Color(51, 153, 255));
        p48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p48MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p48Layout = new javax.swing.GroupLayout(p48);
        p48.setLayout(p48Layout);
        p48Layout.setHorizontalGroup(
            p48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p48Layout.setVerticalGroup(
            p48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p48, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 60, 60));

        p56.setBackground(new java.awt.Color(51, 153, 255));
        p56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p56MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p56Layout = new javax.swing.GroupLayout(p56);
        p56.setLayout(p56Layout);
        p56Layout.setHorizontalGroup(
            p56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p56Layout.setVerticalGroup(
            p56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p56, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 60, 60));

        p40.setBackground(new java.awt.Color(51, 153, 255));
        p40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p40MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p40Layout = new javax.swing.GroupLayout(p40);
        p40.setLayout(p40Layout);
        p40Layout.setHorizontalGroup(
            p40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        p40Layout.setVerticalGroup(
            p40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(p40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 60, 60));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("American Typewriter", 3, 14)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 320, 50));

        jButton1.setFont(new java.awt.Font("American Typewriter", 3, 14)); // NOI18N
        jButton1.setText("Get Array");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
        if (count[0] == 0) {
            p1.setBackground(Color.red);
            count[0] = 1;
        } else {
            p1.setBackground(new Color(51, 153, 255));
            count[0] = 0;
        }

    }//GEN-LAST:event_p1MousePressed

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
        if (count[1] == 0) {
            p2.setBackground(Color.red);
            count[1] = 1;
        } else {
            p2.setBackground(new Color(51, 153, 255));
            count[1] = 0;
        }
    }//GEN-LAST:event_p2MousePressed

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
        if (count[2] == 0) {
            p3.setBackground(Color.red);
            count[2] = 1;
        } else {
            p3.setBackground(new Color(51, 153, 255));
            count[2] = 0;
        }
    }//GEN-LAST:event_p3MousePressed

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
        if (count[3] == 0) {
            p4.setBackground(Color.red);
            count[3] = 1;
        } else {
            p4.setBackground(new Color(51, 153, 255));
            count[3] = 0;
        }
    }//GEN-LAST:event_p4MousePressed

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed
        if (count[4] == 0) {
            p5.setBackground(Color.red);
            count[4] = 1;
        } else {
            p5.setBackground(new Color(51, 153, 255));
            count[4] = 0;
        }
    }//GEN-LAST:event_p5MousePressed

    private void p6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MousePressed
        if (count[5] == 0) {
            p6.setBackground(Color.red);
            count[5] = 1;
        } else {
            p6.setBackground(new Color(51, 153, 255));
            count[5] = 0;
        }
    }//GEN-LAST:event_p6MousePressed

    private void p7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MousePressed
        if (count[6] == 0) {
            p7.setBackground(Color.red);
            count[6] = 1;
        } else {
            p7.setBackground(new Color(51, 153, 255));
            count[6] = 0;
        }
    }//GEN-LAST:event_p7MousePressed

    private void p8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MousePressed
        if (count[7] == 0) {
            p8.setBackground(Color.red);
            count[7] = 1;
        } else {
            p8.setBackground(new Color(51, 153, 255));
            count[7] = 0;
        }

    }//GEN-LAST:event_p8MousePressed

    private void p10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MousePressed
        if (count[9] == 0) {
            p10.setBackground(Color.red);
            count[9] = 1;
        } else {
            p10.setBackground(new Color(51, 153, 255));
            count[9] = 0;
        }
    }//GEN-LAST:event_p10MousePressed

    private void p11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MousePressed
        if (count[10] == 0) {
            p11.setBackground(Color.red);
            count[10] = 1;
        } else {
            p11.setBackground(new Color(51, 153, 255));
            count[10] = 0;
        }
    }//GEN-LAST:event_p11MousePressed

    private void p12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MousePressed
        if (count[11] == 0) {
            p12.setBackground(Color.red);
            count[11] = 1;
        } else {
            p12.setBackground(new Color(51, 153, 255));
            count[11] = 0;
        }
    }//GEN-LAST:event_p12MousePressed

    private void p13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MousePressed
        if (count[12] == 0) {
            p13.setBackground(Color.red);
            count[12] = 1;
        } else {
            p13.setBackground(new Color(51, 153, 255));
            count[12] = 0;
        }
    }//GEN-LAST:event_p13MousePressed

    private void p14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14MousePressed
        if (count[13] == 0) {
            p14.setBackground(Color.red);
            count[13] = 1;
        } else {
            p14.setBackground(new Color(51, 153, 255));
            count[13] = 0;
        }
    }//GEN-LAST:event_p14MousePressed

    private void p15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15MousePressed
        if (count[14] == 0) {
            p15.setBackground(Color.red);
            count[14] = 1;
        } else {
            p15.setBackground(new Color(51, 153, 255));
            count[14] = 0;
        }
    }//GEN-LAST:event_p15MousePressed

    private void p16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16MousePressed
        if (count[15] == 0) {
            p16.setBackground(Color.red);
            count[15] = 1;
        } else {
            p16.setBackground(new Color(51, 153, 255));
            count[15] = 0;
        }
    }//GEN-LAST:event_p16MousePressed

    private void p9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseClicked
        if (count[8] == 0) {
            p9.setBackground(Color.red);
            count[8] = 1;
        } else {
            p9.setBackground(new Color(51, 153, 255));
            count[8] = 0;
        }
    }//GEN-LAST:event_p9MouseClicked

    private void p17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p17MousePressed
        if (count[16] == 0) {
            p17.setBackground(Color.red);
            count[16] = 1;
        } else {
            p17.setBackground(new Color(51, 153, 255));
            count[16] = 0;
        }
    }//GEN-LAST:event_p17MousePressed

    private void p18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p18MousePressed
        if (count[17] == 0) {
            p18.setBackground(Color.red);
            count[17] = 1;
        } else {
            p18.setBackground(new Color(51, 153, 255));
            count[17] = 0;
        }
    }//GEN-LAST:event_p18MousePressed

    private void p20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p20MousePressed
        if (count[19] == 0) {
            p20.setBackground(Color.red);
            count[19] = 1;
        } else {
            p20.setBackground(new Color(51, 153, 255));
            count[19] = 0;
        }
    }//GEN-LAST:event_p20MousePressed

    private void p21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p21MousePressed
        if (count[20] == 0) {
            p21.setBackground(Color.red);
            count[20] = 1;
        } else {
            p21.setBackground(new Color(51, 153, 255));
            count[20] = 0;
        }
    }//GEN-LAST:event_p21MousePressed

    private void p22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p22MousePressed
        if (count[21] == 0) {
            p22.setBackground(Color.red);
            count[21] = 1;
        } else {
            p22.setBackground(new Color(51, 153, 255));
            count[21] = 0;
        }
    }//GEN-LAST:event_p22MousePressed

    private void p23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p23MousePressed
        if (count[22] == 0) {
            p23.setBackground(Color.red);
            count[22] = 1;
        } else {
            p23.setBackground(new Color(51, 153, 255));
            count[22] = 0;
        }
    }//GEN-LAST:event_p23MousePressed

    private void p24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p24MousePressed
        if (count[23] == 0) {
            p24.setBackground(Color.red);
            count[23] = 1;
        } else {
            p24.setBackground(new Color(51, 153, 255));
            count[23] = 0;
        }
    }//GEN-LAST:event_p24MousePressed

    private void p19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p19MousePressed
        if (count[18] == 0) {
            p19.setBackground(Color.red);
            count[18] = 1;
        } else {
            p19.setBackground(new Color(51, 153, 255));
            count[18] = 0;
        }
    }//GEN-LAST:event_p19MousePressed

    private void p25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p25MousePressed
        if (count[24] == 0) {
            p25.setBackground(Color.red);
            count[24] = 1;
        } else {
            p25.setBackground(new Color(51, 153, 255));
            count[24] = 0;
        }
    }//GEN-LAST:event_p25MousePressed

    private void p26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p26MousePressed
        if (count[25] == 0) {
            p26.setBackground(Color.red);
            count[25] = 1;
        } else {
            p26.setBackground(new Color(51, 153, 255));
            count[25] = 0;
        }
    }//GEN-LAST:event_p26MousePressed

    private void p27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p27MousePressed
        if (count[26] == 0) {
            p27.setBackground(Color.red);
            count[26] = 1;
        } else {
            p27.setBackground(new Color(51, 153, 255));
            count[26] = 0;
        }
    }//GEN-LAST:event_p27MousePressed

    private void p28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p28MousePressed
        if (count[27] == 0) {
            p28.setBackground(Color.red);
            count[27] = 1;
        } else {
            p28.setBackground(new Color(51, 153, 255));
            count[27] = 0;
        }
    }//GEN-LAST:event_p28MousePressed

    private void p29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p29MousePressed
        if (count[28] == 0) {
            p29.setBackground(Color.red);
            count[28] = 1;
        } else {
            p29.setBackground(new Color(51, 153, 255));
            count[28] = 0;
        }
    }//GEN-LAST:event_p29MousePressed

    private void p30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p30MousePressed
        if (count[29] == 0) {
            p30.setBackground(Color.red);
            count[29] = 1;
        } else {
            p30.setBackground(new Color(51, 153, 255));
            count[29] = 0;
        }
    }//GEN-LAST:event_p30MousePressed

    private void p31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p31MousePressed
        if (count[30] == 0) {
            p31.setBackground(Color.red);
            count[30] = 1;
        } else {
            p31.setBackground(new Color(51, 153, 255));
            count[30] = 0;
        }
    }//GEN-LAST:event_p31MousePressed

    private void p32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p32MousePressed
        if (count[31] == 0) {
            p32.setBackground(Color.red);
            count[31] = 1;
        } else {
            p32.setBackground(new Color(51, 153, 255));
            count[31] = 0;
        }
    }//GEN-LAST:event_p32MousePressed

    private void p33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p33MousePressed
        if (count[32] == 0) {
            p33.setBackground(Color.red);
            count[32] = 1;
        } else {
            p33.setBackground(new Color(51, 153, 255));
            count[32] = 0;
        }
    }//GEN-LAST:event_p33MousePressed

    private void p34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p34MousePressed
        if (count[33] == 0) {
            p34.setBackground(Color.red);
            count[33] = 1;
        } else {
            p34.setBackground(new Color(51, 153, 255));
            count[33] = 0;
        }
    }//GEN-LAST:event_p34MousePressed

    private void p35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p35MousePressed
        if (count[34] == 0) {
            p35.setBackground(Color.red);
            count[34] = 1;
        } else {
            p35.setBackground(new Color(51, 153, 255));
            count[34] = 0;
        }
    }//GEN-LAST:event_p35MousePressed

    private void p36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p36MousePressed
        if (count[35] == 0) {
            p36.setBackground(Color.red);
            count[35] = 1;
        } else {
            p36.setBackground(new Color(51, 153, 255));
            count[35] = 0;
        }
    }//GEN-LAST:event_p36MousePressed

    private void p37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p37MousePressed
        if (count[36] == 0) {
            p37.setBackground(Color.red);
            count[36] = 1;
        } else {
            p37.setBackground(new Color(51, 153, 255));
            count[36] = 0;
        }
    }//GEN-LAST:event_p37MousePressed

    private void p38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p38MousePressed
        if (count[37] == 0) {
            p38.setBackground(Color.red);
            count[37] = 1;
        } else {
            p38.setBackground(new Color(51, 153, 255));
            count[37] = 0;
        }
    }//GEN-LAST:event_p38MousePressed

    private void p39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p39MousePressed
        if (count[38] == 0) {
            p39.setBackground(Color.red);
            count[38] = 1;
        } else {
            p39.setBackground(new Color(51, 153, 255));
            count[38] = 0;
        }
    }//GEN-LAST:event_p39MousePressed

    private void p40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p40MousePressed
        if (count[39] == 0) {
            p40.setBackground(Color.red);
            count[39] = 1;
        } else {
            p40.setBackground(new Color(51, 153, 255));
            count[39] = 0;
        }
    }//GEN-LAST:event_p40MousePressed

    private void p41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p41MousePressed
        if (count[40] == 0) {
            p41.setBackground(Color.red);
            count[40] = 1;
        } else {
            p41.setBackground(new Color(51, 153, 255));
            count[40] = 0;
        }
    }//GEN-LAST:event_p41MousePressed

    private void p42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p42MousePressed
        if (count[41] == 0) {
            p42.setBackground(Color.red);
            count[41] = 1;
        } else {
            p42.setBackground(new Color(51, 153, 255));
            count[41] = 0;
        }
    }//GEN-LAST:event_p42MousePressed

    private void p43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p43MousePressed
        if (count[42] == 0) {
            p43.setBackground(Color.red);
            count[42] = 1;
        } else {
            p43.setBackground(new Color(51, 153, 255));
            count[42] = 0;
        }
    }//GEN-LAST:event_p43MousePressed

    private void p44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p44MousePressed
        if (count[43] == 0) {
            p44.setBackground(Color.red);
            count[43] = 1;
        } else {
            p44.setBackground(new Color(51, 153, 255));
            count[43] = 0;
        }
    }//GEN-LAST:event_p44MousePressed

    private void p45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p45MousePressed
        if (count[44] == 0) {
            p45.setBackground(Color.red);
            count[44] = 1;
        } else {
            p45.setBackground(new Color(51, 153, 255));
            count[44] = 0;
        }
    }//GEN-LAST:event_p45MousePressed

    private void p46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p46MousePressed
        if (count[45] == 0) {
            p46.setBackground(Color.red);
            count[45] = 1;
        } else {
            p46.setBackground(new Color(51, 153, 255));
            count[45] = 0;
        }
    }//GEN-LAST:event_p46MousePressed

    private void p47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p47MousePressed
        if (count[46] == 0) {
            p47.setBackground(Color.red);
            count[46] = 1;
        } else {
            p47.setBackground(new Color(51, 153, 255));
            count[46] = 0;
        }
    }//GEN-LAST:event_p47MousePressed

    private void p48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p48MousePressed
        if (count[47] == 0) {
            p48.setBackground(Color.red);
            count[47] = 1;
        } else {
            p48.setBackground(new Color(51, 153, 255));
            count[47] = 0;
        }
    }//GEN-LAST:event_p48MousePressed

    private void p49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p49MousePressed
        if (count[48] == 0) {
            p49.setBackground(Color.red);
            count[48] = 1;
        } else {
            p49.setBackground(new Color(51, 153, 255));
            count[48] = 0;
        }
    }//GEN-LAST:event_p49MousePressed

    private void p50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p50MousePressed
        if (count[49] == 0) {
            p50.setBackground(Color.red);
            count[49] = 1;
        } else {
            p50.setBackground(new Color(51, 153, 255));
            count[49] = 0;
        }
    }//GEN-LAST:event_p50MousePressed

    private void p51MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p51MousePressed
        if (count[50] == 0) {
            p51.setBackground(Color.red);
            count[50] = 1;
        } else {
            p51.setBackground(new Color(51, 153, 255));
            count[50] = 0;
        }
    }//GEN-LAST:event_p51MousePressed

    private void p52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p52MousePressed
        if (count[51] == 0) {
            p52.setBackground(Color.red);
            count[51] = 1;
        } else {
            p52.setBackground(new Color(51, 153, 255));
            count[51] = 0;
        }
    }//GEN-LAST:event_p52MousePressed

    private void p53MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p53MousePressed
        if (count[52] == 0) {
            p53.setBackground(Color.red);
            count[52] = 1;
        } else {
            p53.setBackground(new Color(51, 153, 255));
            count[52] = 0;
        }
    }//GEN-LAST:event_p53MousePressed

    private void p54MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p54MousePressed
        if (count[53] == 0) {
            p54.setBackground(Color.red);
            count[53] = 1;
        } else {
            p54.setBackground(new Color(51, 153, 255));
            count[53] = 0;
        }
    }//GEN-LAST:event_p54MousePressed

    private void p56MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p56MousePressed
        if (count[55] == 0) {
            p56.setBackground(Color.red);
            count[55] = 1;
        } else {
            p56.setBackground(new Color(51, 153, 255));
            count[55] = 0;
        }
    }//GEN-LAST:event_p56MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean[] temp = new boolean[56];

        for (int i = 0; i < 56; i++) {
            if (count[i] == 1) {
                temp[i] = true;
            } else {
                temp[i] = false;
            }
        }

        byte[] mycharArray = toBytes(temp);

        jTextField1.setText(byteArrayToHex(mycharArray));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void p55MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p55MousePressed
        if (count[54] == 0) {
            p55.setBackground(Color.red);
            count[54] = 1;
        } else {
            p55.setBackground(new Color(51, 153, 255));
            count[54] = 0;
        }
    }//GEN-LAST:event_p55MousePressed

    public byte[] toBytes(boolean[] input) {
        byte[] toReturn = new byte[input.length / 8];
        for (int entry = 0; entry < toReturn.length; entry++) {
            for (int bit = 0; bit < 8; bit++) {
                if (input[entry * 8 + bit]) {
                    toReturn[entry] |= (128 >> bit);
                }
            }
        }

        return toReturn;
    }

    public static String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for (byte b : a) {
            b = (byte) ((b & 0xF0) >> 4 | (b & 0x0F) << 4);
            b = (byte) (char) ((b & 0xCC) >> 2 | (b & 0x33) << 2);
            b = (byte) (char) ((b & 0xAA) >> 1 | (b & 0x55) << 1);
            sb.append(String.format("%02xh, ", b));
        }
        return sb.toString();
    }

    public char reverse(char b) {

        return b;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JPanel p15;
    private javax.swing.JPanel p16;
    private javax.swing.JPanel p17;
    private javax.swing.JPanel p18;
    private javax.swing.JPanel p19;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p20;
    private javax.swing.JPanel p21;
    private javax.swing.JPanel p22;
    private javax.swing.JPanel p23;
    private javax.swing.JPanel p24;
    private javax.swing.JPanel p25;
    private javax.swing.JPanel p26;
    private javax.swing.JPanel p27;
    private javax.swing.JPanel p28;
    private javax.swing.JPanel p29;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p30;
    private javax.swing.JPanel p31;
    private javax.swing.JPanel p32;
    private javax.swing.JPanel p33;
    private javax.swing.JPanel p34;
    private javax.swing.JPanel p35;
    private javax.swing.JPanel p36;
    private javax.swing.JPanel p37;
    private javax.swing.JPanel p38;
    private javax.swing.JPanel p39;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p40;
    private javax.swing.JPanel p41;
    private javax.swing.JPanel p42;
    private javax.swing.JPanel p43;
    private javax.swing.JPanel p44;
    private javax.swing.JPanel p45;
    private javax.swing.JPanel p46;
    private javax.swing.JPanel p47;
    private javax.swing.JPanel p48;
    private javax.swing.JPanel p49;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p50;
    private javax.swing.JPanel p51;
    private javax.swing.JPanel p52;
    private javax.swing.JPanel p53;
    private javax.swing.JPanel p54;
    private javax.swing.JPanel p55;
    private javax.swing.JPanel p56;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    // End of variables declaration//GEN-END:variables
}
