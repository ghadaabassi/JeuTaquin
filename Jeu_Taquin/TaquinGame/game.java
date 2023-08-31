package TaquinGame;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import TaquinGame.TaquinState;
import TaquinGame.TaquinSolver;

public class game extends javax.swing.JFrame {
    public int moves = 1;

    public game() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        New = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        br = new javax.swing.JRadioButton();
        dp = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        buttons = new javax.swing.JButton[3][3];
        buttons[0][0] = b1;
        buttons[0][1] = b2;
        buttons[0][2] = b3;
        buttons[1][0] = b4;
        buttons[1][1] = b5;
        buttons[1][2] = b6;
        buttons[2][0] = b7;
        buttons[2][1] = b8;
        buttons[2][2] = b9;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(214, 234, 248));

        New.setBackground(new java.awt.Color(252, 243, 207));
        New.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        New.setText("New Game");
        New.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionrandom(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabel4.setText("TAQUINGAME");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setText("Moves :");

        search.setBackground(new java.awt.Color(252, 243, 207));
        search.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        search.setText("search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search.setEnabled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (br.isSelected()) {
                    actionbr(evt);
                    buttonGroup1.clearSelection();
                    search.setEnabled(false);
                }
                if (dp.isSelected()) {
                    actiondp(evt);
                    buttonGroup1.clearSelection();
                    search.setEnabled(false);
                }

            }
        });

        panel2.setBackground(new java.awt.Color(252, 243, 207));

        b1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b2.setText("2");
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b3.setText("3");
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b4.setText("4");
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b5.setText("5");
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b6.setText("6");
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b7.setText("7");
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b8.setText("8");
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        b9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        b9.setText("");
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerforme(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE)));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel3.setIcon(new javax.swing.ImageIcon("manette.png"));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText(
                "            Pour vous aider a trouver une solution \n            Merci de deplacer le cube vide au milieux\n                                   de puzzle !");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE));

        buttonGroup1.add(br);
        br.setText("Breadth First");
        br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search.setEnabled(true);
            }
        });

        buttonGroup1.add(dp);
        dp.setText("Depth First");
        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search.setEnabled(true);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 255, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(383, 463, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(239, 239, 239)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(New)
                                                        .addComponent(br, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(101, 101, 101)
                                                                .addComponent(dp,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel4)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(New)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(br, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(search))
                                .addGap(29, 29, 29)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    public void actiondp(java.awt.event.ActionEvent e) {

        TaquinSolver ts = new TaquinSolver();

        int[][] initialState = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!buttons[i][j].getText().equals("")) {
                    initialState[i][j] = Integer.parseInt(buttons[i][j].getText());
                } else {
                    initialState[i][j] = 0;
                }
            }
        }
        String sol = "";
        String chemin = "";

        List<TaquinSolver.Node> path = null;
        if (buttons[1][1].getText().equals("")) {
            path = TaquinSolver.solve(initialState);
            ;
        } else {
            path = null;
        }

        if (path != null) {
            sol += "\t                 Solution \n";

            sol += "\n";
            for (TaquinSolver.Node node : path) {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        chemin += " \t" + node.state[i][j];
                    }
                    chemin += "\n";

                }
                chemin += "\n\t-------------------------------------------\n";
            }
            sol += chemin;

        } else {
            sol += "\n\n Desole , je ne peux pa trouver une solution pour ce puzzle essayez avec un autre !.";
        }

        jTextArea2.setText(sol);
    }

    public void actionbr(java.awt.event.ActionEvent e) {

        TaquinState ts = new TaquinState(values, ERROR, ABORT);

        int[][] board = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!buttons[i][j].getText().equals("")) {
                    board[i][j] = Integer.parseInt(buttons[i][j].getText());
                } else {
                    board[i][j] = 0;
                }
            }
        }

        int zeroRow = 1;
        int zeroCol = 1;
        String sol = " ";

        List<TaquinState> solution = ts.solve(board, zeroRow, zeroCol);

        if (solution != null && buttons[1][1].getText().equals("")) {
            sol += "\t                   Solution \n \n        Nombre de mouvements : ";
            sol += String.valueOf((solution.size() - 1));
            sol += "\n\n";
            for (TaquinState state : solution) {
                int[][] stateBoard = state.getBoard();
                for (int[] row : stateBoard) {
                    sol += "\t               ";
                    sol += Arrays.toString(row);
                    sol += "\n";

                }
                sol += "\n\t----------------------------------------\n\n";

            }
        } else {
            sol += "\n\n Desole , je ne peux pas trouver une solution pour ce puzzle essayez avec un autre !.";
        }
        jTextArea2.setText(sol);
    }

    public void actionrandom(java.awt.event.ActionEvent e) {
        jLabel2.setText("0");
        moves = 1;
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(12) + 1;
        if (nombreAleatoire < 4) {
            buttons[0][0].setText("4");
            buttons[0][1].setText("1");
            buttons[0][2].setText("3");
            buttons[1][0].setText("2");
            buttons[1][1].setText("");
            buttons[1][2].setText("6");
            buttons[2][0].setText("7");
            buttons[2][1].setText("5");
            buttons[2][2].setText("8");
        }

        else if (nombreAleatoire <= 6 && 4 <= nombreAleatoire) {
            buttons[0][0].setText("1");
            buttons[0][1].setText("3");
            buttons[0][2].setText("6");
            buttons[1][0].setText("7");
            buttons[1][1].setText("");
            buttons[1][2].setText("2");
            buttons[2][0].setText("5");
            buttons[2][1].setText("4");
            buttons[2][2].setText("8");
        } else if (nombreAleatoire <= 9 && 7 <= nombreAleatoire) {

            buttons[0][0].setText("1");
            buttons[0][1].setText("2");
            buttons[0][2].setText("3");
            buttons[1][0].setText("8");
            buttons[1][1].setText("");
            buttons[1][2].setText("5");
            buttons[2][0].setText("4");
            buttons[2][1].setText("7");
            buttons[2][2].setText("6");

        } else {

            buttons[0][0].setText("5");
            buttons[0][1].setText("3");
            buttons[0][2].setText("6");
            buttons[1][0].setText("1");
            buttons[1][1].setText("4");
            buttons[1][2].setText("");
            buttons[2][0].setText("2");
            buttons[2][1].setText("7");
            buttons[2][2].setText("8");

        }
    }

    public void actionPerforme(java.awt.event.ActionEvent e) {
        javax.swing.JButton button = (javax.swing.JButton) e.getSource();
        int x = -1, y = -1;
        String number = button.getText();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j] == button) {
                    x = i;
                    y = j;

                }
            }
        }

        if (x == 0) {
            if (y == 0) {

                if (buttons[x][y + 1].getText().equals("")) {
                    buttons[x][y + 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x + 1][y].getText().equals("")) {
                    buttons[x + 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }

            if (y == 1) {

                if (buttons[x][y + 1].getText().equals("")) {
                    buttons[x][y + 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x + 1][y].getText().equals("")) {
                    buttons[x + 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x][y - 1].getText().equals("")) {
                    buttons[x][y - 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }
            if (y == 2) {

                if (buttons[x][y - 1].getText().equals("")) {
                    buttons[x][y - 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x + 1][y].getText().equals("")) {
                    buttons[x + 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }
        }

        if (x == 1) {
            if (y == 0) {

                if (buttons[x][y + 1].getText().equals("")) {
                    buttons[x][y + 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x + 1][y].getText().equals("")) {
                    buttons[x + 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x - 1][y].getText().equals("")) {
                    buttons[x - 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }

            if (y == 1) {

                if (buttons[x][y + 1].getText().equals("")) {
                    buttons[x][y + 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x + 1][y].getText().equals("")) {
                    buttons[x + 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x][y - 1].getText().equals("")) {
                    buttons[x][y - 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x - 1][y].getText().equals("")) {
                    buttons[x - 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }
            if (y == 2) {

                if (buttons[x - 1][y].getText().equals("")) {
                    buttons[x - 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x + 1][y].getText().equals("")) {
                    buttons[x + 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x][y - 1].getText().equals("")) {
                    buttons[x][y - 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }
            }

        }

        if (x == 2) {
            if (y == 0) {

                if (buttons[x][y + 1].getText().equals("")) {
                    buttons[x][y + 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x - 1][y].getText().equals("")) {
                    buttons[x - 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }

            if (y == 1) {

                if (buttons[x][y + 1].getText().equals("")) {
                    buttons[x][y + 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x - 1][y].getText().equals("")) {
                    buttons[x - 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x][y - 1].getText().equals("")) {
                    buttons[x][y - 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

            }
            if (y == 2) {

                if (buttons[x - 1][y].getText().equals("")) {
                    buttons[x - 1][y].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }

                if (buttons[x][y - 1].getText().equals("")) {
                    buttons[x][y - 1].setText(number);
                    button.setText("");
                    String mv = String.valueOf(moves++);
                    jLabel2.setText(mv);
                }
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    private javax.swing.JButton New;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JRadioButton br;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JButton search;
    private javax.swing.JButton[][] buttons;
    private int[][] values;

}
