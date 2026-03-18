
import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
// Add this if not already imported
//import javax.swing.table.DefaultTableModel;
 

    
public class MainPage extends javax.swing.JFrame {
    
    private StudentDAO dao;  
    private UserRole role;

    
    // Change this constructor!
    public MainPage(UserRole role) {
        // Test MySQL connection first
    if (DatabaseConnection.testConnection()) {
        System.out.println("Successfully connected to MySQL!");
    } else {
        System.out.println("Failed to connect to MySQL!");
    }
        // Initialize database first
    
    dao = new StudentDAO();    
    this.role = role;
    initComponents();
    applyPermissions();
    refreshTable();
    this.setLocationRelativeTo(null);

    }
    
    // Default constructor (if needed)
    public MainPage() {
        this.role = UserRole.ADMIN; // Default role
        initComponents();
        applyPermissions();
        refreshTable();
        this.setLocationRelativeTo(null);
    }
    private void applyPermissions() {
   lblStatus.setText(
    switch (role) {
        case STUDENT -> {
            jButton1.setEnabled(false); // Add
            jButton2.setEnabled(false); // Update
            jButton3.setEnabled(false); // Delete
            yield "Role: Student (View Only)";
        }
        case TEACHER -> {
            jButton3.setEnabled(false); // Delete
            yield "Role: Teacher";
        }
        case ADMIN -> "Role: Admin";
    }
);
   
    } 
    
//    public  MainPage() {
//        initComponents();
//    }
//
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbCourse = new javax.swing.JComboBox<>();
        txtMarks = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 248, 254));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(243, 254, 254));

        jPanel2.setBackground(new java.awt.Color(235, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 204)));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Student Management System (SMS)");

        lblLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("x");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLogout))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setText("Update");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Add");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setForeground(new java.awt.Color(242, 242, 242));
        jButton3.setText("Delete");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setForeground(new java.awt.Color(242, 242, 242));
        jButton4.setText("Search");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setBackground(new java.awt.Color(0, 0, 153));
        jButton5.setForeground(new java.awt.Color(242, 242, 242));
        jButton5.setText("Show All");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));

        jButton6.setText("All Students");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setText("Filtering & Sorting");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setText("Statistics");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Course", "Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRequestFocusEnabled(false);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(true);
        table.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Course:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Marks:");

        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setText("enter fullName");
        txtName.addActionListener(this::txtNameActionPerformed);

        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("someone@gmail.com");
        txtEmail.addActionListener(this::txtEmailActionPerformed);

        cmbCourse.setForeground(new java.awt.Color(153, 153, 153));
        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math IV", "Java", "C++", "Circuit Analysis", "Database" }));
        cmbCourse.addActionListener(this::cmbCourseActionPerformed);

        txtMarks.setForeground(new java.awt.Color(153, 153, 153));
        txtMarks.setText("marks over 100%");
        txtMarks.addActionListener(this::txtMarksActionPerformed);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Student Input");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCheckBox1.setText("Math IV");
        jCheckBox1.addActionListener(this::jCheckBox1ActionPerformed);

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCheckBox2.setText("Java");

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCheckBox3.setText("C++");
        jCheckBox3.addActionListener(this::jCheckBox3ActionPerformed);

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton1.setText("Sort By ID");

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton2.setText("Sort By Name (A-Z)");
        jRadioButton2.addActionListener(this::jRadioButton2ActionPerformed);

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jRadioButton3.setText("Sort By Mark (High-Low)");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Advanced Filters");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1))
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 153, 51));
        lblStatus.setText("Student Added Successfully ! ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton5)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblStatus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatus))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jMenuBar1.setBackground(new java.awt.Color(241, 254, 254));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(0, 51, 204), new java.awt.Color(0, 51, 204), new java.awt.Color(0, 51, 153)));
        jMenuBar1.setOpaque(true);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Students");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem2.setText("Add");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Update");
        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Delete");
        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Help");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        // ADD Student functionality
    String name = txtName.getText().trim();
    String email = txtEmail.getText().trim();
    String course = cmbCourse.getSelectedItem().toString();

    // Validate inputs
    if (name.isEmpty() || email.isEmpty()) {
        lblStatus.setText("Name and Email cannot be empty!");
        lblStatus.setForeground(Color.RED);
        return;
    }

    try {
        int marks = Integer.parseInt(txtMarks.getText().trim());

        if (marks < 0 || marks > 100) {
            lblStatus.setText("Marks must be between 0 and 100!");
            lblStatus.setForeground(Color.RED);
            return;
        }

        Student student = new Student(name, email, course, marks);
        dao.add(student);

        lblStatus.setText("Student added successfully!");
        lblStatus.setForeground(Color.GREEN);
        refreshTable();

        // Clear input fields
        txtName.setText("");
        txtEmail.setText("");
        txtMarks.setText("");
        cmbCourse.setSelectedIndex(0);

    } catch (NumberFormatException ex) {
        lblStatus.setText("Please enter valid marks (numbers only)!");
        lblStatus.setForeground(Color.RED);
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
    if (selectedRow >= 0) {
        try {
            int id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
            String name = txtName.getText().trim();
            String email = txtEmail.getText().trim();
            String course = cmbCourse.getSelectedItem().toString();

            if (name.isEmpty() || email.isEmpty()) {
                lblStatus.setText("Name and Email cannot be empty!");
                lblStatus.setForeground(Color.RED);
                return;
            }

            int marks = Integer.parseInt(txtMarks.getText().trim());

            if (marks < 0 || marks > 100) {
                lblStatus.setText("Marks must be between 0 and 100!");
                lblStatus.setForeground(Color.RED);
                return;
            }

            Student student = new Student(name, email, course, marks);
            dao.update(student, id);

            lblStatus.setText("Student updated successfully!");
            lblStatus.setForeground(Color.GREEN);
            refreshTable();

            txtName.setText("");
            txtEmail.setText("");
            txtMarks.setText("");

        } catch (NumberFormatException ex) {
            lblStatus.setText("Please enter valid marks (numbers only)!");
            lblStatus.setForeground(Color.RED);
        }
    } else {
        lblStatus.setText("Please select a student to update!");
        lblStatus.setForeground(Color.RED);
    }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        // Sort By Name (A-Z)
        List<Student> sorted = dao.getAll().stream()
        .sorted((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()))
        .collect(Collectors.toList());
        updateTable(sorted);
        lblStatus.setText("Sorted by Name (A-Z)");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarksActionPerformed
        // TODO add your handling code here:
        jButton1.doClick();
    }//GEN-LAST:event_txtMarksActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        cmbCourse.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       try {
        // Get all students from database
        List<Student> allStudents = dao.getAll();
        
        // Make a copy to work with
        List<Student> filteredStudents = new ArrayList<>(allStudents);
        
        // ========== APPLY COURSE FILTERS FROM CHECKBOXES ==========
        List<String> selectedCourses = new ArrayList<>();
        if (jCheckBox1.isSelected()) selectedCourses.add("Math IV");
        if (jCheckBox2.isSelected()) selectedCourses.add("Java");
        if (jCheckBox3.isSelected()) selectedCourses.add("C++");
        
        // If any courses are selected, filter by those courses
        if (!selectedCourses.isEmpty()) {
            filteredStudents = filteredStudents.stream()
                .filter(s -> selectedCourses.contains(s.getCourse()))
                .collect(Collectors.toList());
        }
        
        // ========== APPLY SLIDER FILTER ==========
        // Assuming slider is for minimum marks (0-100)
        int minMarks = jSlider1.getValue();
        if (minMarks > 0) {
            filteredStudents = filteredStudents.stream()
                .filter(s -> s.getMarks() >= minMarks)
                .collect(Collectors.toList());
        }
        
        // ========== APPLY SORTING BASED ON RADIO BUTTONS ==========
        String sortMessage = "";
        
        if (jRadioButton1.isSelected()) { // Sort By ID
            filteredStudents.sort(Comparator.comparingInt(Student::getId));
            sortMessage = "Sorted by ID";
            
        } else if (jRadioButton2.isSelected()) { // Sort By Name (A-Z)
            filteredStudents.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
            sortMessage = "Sorted by Name (A-Z)";
            
        } else if (jRadioButton3.isSelected()) { // Sort By Mark (High-Low)
            filteredStudents.sort((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));
            sortMessage = "Sorted by Marks (High to Low)";
        }
        
        // ========== UPDATE THE TABLE ==========
        if (filteredStudents.isEmpty()) {
            if (!selectedCourses.isEmpty()) {
                lblStatus.setText("No students found in selected courses");
            } else if (minMarks > 0) {
                lblStatus.setText("No students with marks ≥ " + minMarks);
            } else {
                lblStatus.setText("No students available");
            }
            lblStatus.setForeground(Color.RED);
            
            // Update table with empty list (clears the table)
            updateTable(filteredStudents);
            
        } else {
            // Update the table with filtered and sorted results
            updateTable(filteredStudents);
            
            // Set status message
            String message = "Displaying " + filteredStudents.size() + " student(s)";
            if (!sortMessage.isEmpty()) {
                message = sortMessage + " - " + filteredStudents.size() + " student(s)";
            }
            if (!selectedCourses.isEmpty()) {
                message = "Filtered by course: " + String.join(", ", selectedCourses) + 
                         " - " + filteredStudents.size() + " student(s)";
            }
            if (minMarks > 0) {
                message = "Marks ≥ " + minMarks + " - " + filteredStudents.size() + " student(s)";
            }
            
            lblStatus.setText(message);
            lblStatus.setForeground(new Color(0, 153, 51)); // Green color
        }
        
        // Clear radio button selection message if no filter was applied
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && 
            !jRadioButton3.isSelected() && selectedCourses.isEmpty() && minMarks == 0) {
            lblStatus.setText("Please select filter or sort options");
            lblStatus.setForeground(Color.BLUE);
        }
        
    } catch (Exception e) {
        lblStatus.setText("Error applying filters: " + e.getMessage());
        lblStatus.setForeground(Color.RED);
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // SHOW ALL Students functionality
        refreshTable();
        lblStatus.setText("All students displayed");
        lblStatus.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // SEARCH Student functionality
        String keyword = txtName.getText().trim();

        if (keyword.isEmpty()) {
            lblStatus.setText("Please enter a name to search!");
            lblStatus.setForeground(Color.RED);
            return;
        }

        List<Student> results = dao.getAll().stream()
        .filter(s -> s.getName().toLowerCase().contains(keyword.toLowerCase()))
        .collect(Collectors.toList());

        if (results.isEmpty()) {
            lblStatus.setText("No students found with name: " + keyword);
            lblStatus.setForeground(Color.RED);
        } else {
            updateTable(results);
            lblStatus.setText(results.size() + " student(s) found");
            lblStatus.setForeground(Color.BLUE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // DELETE Student functionality
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            int id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
            String name = table.getValueAt(selectedRow, 1).toString();

            // Confirm deletion
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete " + name + "?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                dao.delete(id);
                lblStatus.setText("Student deleted successfully!");
                lblStatus.setForeground(Color.GREEN);
                refreshTable();
            }
        } else {
            lblStatus.setText("Please select a student to delete!");
            lblStatus.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ADD Student functionality
        String name = txtName.getText().trim();
        String email = txtEmail.getText().trim();
        String course = cmbCourse.getSelectedItem().toString();

        // Validate inputs
        if (name.isEmpty() || email.isEmpty()) {
            lblStatus.setText("Name and Email cannot be empty!");
            lblStatus.setForeground(Color.RED);
            return;
        }

        try {
            int marks = Integer.parseInt(txtMarks.getText().trim());

            if (marks < 0 || marks > 100) {
                lblStatus.setText("Marks must be between 0 and 100!");
                lblStatus.setForeground(Color.RED);
                return;
            }

            Student student = new Student(name, email, course, marks);
            dao.add(student);

            lblStatus.setText("Student added successfully!");
            lblStatus.setForeground(Color.GREEN);
            refreshTable();

            // Clear input fields
            txtName.setText("");
            txtEmail.setText("");
            txtMarks.setText("");
            cmbCourse.setSelectedIndex(0);

        } catch (NumberFormatException ex) {
            lblStatus.setText("Please enter valid marks (numbers only)!");
            lblStatus.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //   private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
            // UPDATE Student functionality
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                try {
                    int id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
                    String name = txtName.getText().trim();
                    String email = txtEmail.getText().trim();
                    String course = cmbCourse.getSelectedItem().toString();

                    if (name.isEmpty() || email.isEmpty()) {
                        lblStatus.setText("Name and Email cannot be empty!");
                        lblStatus.setForeground(Color.RED);
                        return;
                    }

                    int marks = Integer.parseInt(txtMarks.getText().trim());

                    if (marks < 0 || marks > 100) {
                        lblStatus.setText("Marks must be between 0 and 100!");
                        lblStatus.setForeground(Color.RED);
                        return;
                    }

                    Student student = new Student(name, email, course, marks);
                    dao.update(student, id);

                    lblStatus.setText("Student updated successfully!");
                    lblStatus.setForeground(Color.GREEN);
                    refreshTable();

                    // Clear input fields
                    txtName.setText("");
                    txtEmail.setText("");
                    txtMarks.setText("");

                } catch (NumberFormatException ex) {
                    lblStatus.setText("Please enter valid marks (numbers only)!");
                    lblStatus.setForeground(Color.RED);
                }
            } else {
                lblStatus.setText("Please select a student to update!");
                lblStatus.setForeground(Color.RED);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        //       private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {
            lblLogout.setForeground(java.awt.Color.WHITE); // Change back to your original color
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        //       private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {
            lblLogout.setForeground(java.awt.Color.RED); // Change to red on hover
            lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change cursor to hand
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        //        private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {
            // 1. Ask for confirmation before logging out
            int response = javax.swing.JOptionPane.showConfirmDialog(this,
                "Are you sure you want to logout?",
                "Confirm Logout",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE);

            // 2. If 'Yes' is clicked, handle the navigation
            if (response == javax.swing.JOptionPane.YES_OPTION) {
                // Replace 'loginpage' with the exact name of your login class
                new LoginForm().setVisible(true);

                // Close the current MainPage window
                this.dispose();
            }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        // 1. Ask for confirmation before logging out
    int response = javax.swing.JOptionPane.showConfirmDialog(this,
        "Are you sure you want to logout?",
        "Confirm Logout",
        javax.swing.JOptionPane.YES_NO_OPTION,
        javax.swing.JOptionPane.QUESTION_MESSAGE);

    // 2. If 'Yes' is clicked, handle the navigation
    if (response == javax.swing.JOptionPane.YES_OPTION) {
        // Open Login Form
        new LoginForm().setVisible(true);

        // Close current window
        this.dispose();
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
    if (selectedRow >= 0) {
        int id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        String name = table.getValueAt(selectedRow, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete " + name + "?",
            "Confirm Delete",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            dao.delete(id);
            lblStatus.setText("Student deleted successfully!");
            lblStatus.setForeground(Color.GREEN);
            refreshTable();
        }
    } else {
        lblStatus.setText("Please select a student to delete!");
        lblStatus.setForeground(Color.RED);
    }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         About.showAbout();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        refreshTable();
    
    // Update status
    lblStatus.setText("All students displayed");
    lblStatus.setForeground(Color.BLACK);
    
    // Reset all filter and sort selections
    jCheckBox1.setSelected(false);
    jCheckBox2.setSelected(false);
    jCheckBox3.setSelected(false);
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jSlider1.setValue(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         try {
        // Get all students
        List<Student> allStudents = dao.getAll();
        
        if (allStudents.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "No student data available for statistics.",
                "Statistics",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // Calculate statistics
        int totalStudents = allStudents.size();
        
        // Marks statistics
        double totalMarks = 0;
        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;
        String highestScorer = "";
        String lowestScorer = "";
        
        // Course distribution
        java.util.Map<String, Integer> courseCount = new java.util.HashMap<>();
        
        for (Student s : allStudents) {
            int marks = s.getMarks();
            totalMarks += marks;
            
            if (marks > highestMarks) {
                highestMarks = marks;
                highestScorer = s.getName();
            }
            
            if (marks < lowestMarks) {
                lowestMarks = marks;
                lowestScorer = s.getName();
            }
            
            // Count courses
            String course = s.getCourse();
            courseCount.put(course, courseCount.getOrDefault(course, 0) + 1);
        }
        
        double averageMarks = totalMarks / totalStudents;
        
        // Build simple statistics message
        StringBuilder stats = new StringBuilder();
        stats.append("STUDENT STATISTICS\n");
        stats.append("==================\n\n");
        stats.append("Total Students: ").append(totalStudents).append("\n");
        stats.append(String.format("Average Marks: %.2f\n", averageMarks));
        stats.append("Highest Marks: ").append(highestMarks).append(" (").append(highestScorer).append(")\n");
        stats.append("Lowest Marks: ").append(lowestMarks).append(" (").append(lowestScorer).append(")\n\n");
        
        stats.append("Course Distribution:\n");
        for (java.util.Map.Entry<String, Integer> entry : courseCount.entrySet()) {
            stats.append("• ").append(entry.getKey()).append(": ").append(entry.getValue());
            stats.append(" (").append(String.format("%.1f", (entry.getValue() * 100.0 / totalStudents))).append("%)\n");
        }
        
        JOptionPane.showMessageDialog(this,
            stats.toString(),
            "Student Statistics",
            JOptionPane.INFORMATION_MESSAGE);
        
        lblStatus.setText("Statistics displayed");
        lblStatus.setForeground(new Color(0, 102, 204));
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
            "Error: " + e.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainPage(UserRole.STUDENT).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

   private void updateTable(List<Student> studentList) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    
    for (Student s : studentList) {
        model.addRow(new Object[]{
            s.getId(),           // Column 0: ID
            s.getName(),         // Column 1: Name
            s.getCourse(),       // Column 2: Course
            s.getMarks()         // Column 3: Marks
        });
    }

}
 private void refreshTable() {
    if (dao == null) {
        System.err.println("DAO is null! Reinitializing...");
        dao = new StudentDAO();
    }
    
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    
    List<Student> students = dao.getAll();
    if (students == null) {
        System.err.println("getAll() returned null!");
        return;
    }
    
    for (Student s : students) {
        model.addRow(new Object[]{
            s.getId(),
            s.getName(),
            s.getCourse(),
            s.getMarks()
        });
    }
}


}
