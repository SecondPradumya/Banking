
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Home extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    
    public Home() {
        super("Home");
        initComponents();
        conn = dbconnect.connectDb();
        Calendar();
        Account();
        Table1();
        
    }
    
    //use calendar to set date
    public void Calendar(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        CurrentDate.setText(+ day + "-" + (month+1) + "-" + year);
        
    }
    //list customers in table
    public void Table1(){
        try{
            String sql = "select Acc,Name,DOB,Acc_Type,Gender,Mob from Account";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Customers.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePage = new javax.swing.JPanel();
        UnametxtTop = new javax.swing.JLabel();
        CurrentDate = new javax.swing.JTextField();
        DatetxtTop = new javax.swing.JLabel();
        LogoHP = new javax.swing.JLabel();
        UsernameTop = new javax.swing.JTextField();
        FunctionsTab = new javax.swing.JTabbedPane();
        ProfileTab = new javax.swing.JPanel();
        FullnametxtProfile = new javax.swing.JLabel();
        DateofbirthtxtProfile = new javax.swing.JLabel();
        GendertxtProfile = new javax.swing.JLabel();
        EthnicitytxtProfile = new javax.swing.JLabel();
        AddresstxtProfile = new javax.swing.JLabel();
        FullnameProfile = new javax.swing.JTextField();
        DateofBirthProfile = new javax.swing.JTextField();
        GenderProfile = new javax.swing.JTextField();
        EthnicityProfile = new javax.swing.JTextField();
        AddressProfile = new javax.swing.JTextField();
        AccnumtxtProfile = new javax.swing.JLabel();
        AcctypetxtProfile = new javax.swing.JLabel();
        MobiletxtProfile = new javax.swing.JLabel();
        SecurityqtxtProfile = new javax.swing.JLabel();
        AccnumProfile = new javax.swing.JTextField();
        AcctypeProfile = new javax.swing.JTextField();
        MobileProfile = new javax.swing.JTextField();
        SecurityqProfile = new javax.swing.JTextField();
        EditProfile = new javax.swing.JButton();
        SaveProfile = new javax.swing.JButton();
        DepositTab = new javax.swing.JPanel();
        UnametxtDeposit = new javax.swing.JLabel();
        NametxtDeposit = new javax.swing.JLabel();
        AccnumtxtDeposit = new javax.swing.JLabel();
        BaltxtDeposit = new javax.swing.JLabel();
        DeposittxtDeposit = new javax.swing.JLabel();
        UsernameDeposit = new javax.swing.JTextField();
        FullnameDeposit = new javax.swing.JTextField();
        AccnumDeposit = new javax.swing.JTextField();
        BalanceDeposit = new javax.swing.JTextField();
        DepositInput = new javax.swing.JTextField();
        NewbalDeposit = new javax.swing.JTextField();
        SearchDeposit = new javax.swing.JButton();
        CalculateDeposit = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        WithdrawTab = new javax.swing.JPanel();
        UnametxtWithdraw = new javax.swing.JLabel();
        FullnametxtWithdraw = new javax.swing.JLabel();
        AccnumtxtWithdraw = new javax.swing.JLabel();
        BaltxtWithdraw = new javax.swing.JLabel();
        AmounttxtWithdraw = new javax.swing.JLabel();
        NewbaltxtWithdraw = new javax.swing.JLabel();
        UsernameWithdraw = new javax.swing.JTextField();
        FullnameWithdraw = new javax.swing.JTextField();
        AccnumWithdraw = new javax.swing.JTextField();
        BalWithdraw = new javax.swing.JTextField();
        AmountWithdraw = new javax.swing.JTextField();
        NewbalWithdraw = new javax.swing.JTextField();
        SearchWithdraw = new javax.swing.JButton();
        CalculateWithdraw = new javax.swing.JButton();
        Withdraw = new javax.swing.JButton();
        ViewbalTab = new javax.swing.JPanel();
        UsertxtVB = new javax.swing.JLabel();
        NametxtVB = new javax.swing.JLabel();
        AccnumtxtVB = new javax.swing.JLabel();
        MnumtxtVB = new javax.swing.JLabel();
        UsernameVB = new javax.swing.JTextField();
        SearchVB = new javax.swing.JButton();
        FullnameVB = new javax.swing.JTextField();
        AccnumVB = new javax.swing.JTextField();
        MnumVB = new javax.swing.JTextField();
        BaltxtVB = new javax.swing.JLabel();
        BalVB = new javax.swing.JTextField();
        TransferTab = new javax.swing.JPanel();
        UnametxtTransfer = new javax.swing.JLabel();
        FullnametxtTransfer = new javax.swing.JLabel();
        AccnumtxtTransfer = new javax.swing.JLabel();
        BaltxtTransfer = new javax.swing.JLabel();
        AmounttxtTransfer = new javax.swing.JLabel();
        CreditamounttxtTransfer = new javax.swing.JLabel();
        UsernameTransfer = new javax.swing.JTextField();
        FullnameTransfer = new javax.swing.JTextField();
        AccnumTransfer = new javax.swing.JTextField();
        BalTransfer = new javax.swing.JTextField();
        TransferInput = new javax.swing.JTextField();
        NewbalTransfer = new javax.swing.JTextField();
        AccTransfer = new javax.swing.JComboBox();
        TransferNewInput = new javax.swing.JTextField();
        NewbalAccTransfer = new javax.swing.JTextField();
        SearchTransfer = new javax.swing.JButton();
        CalculateTransfer1 = new javax.swing.JButton();
        CalculateTransfer2 = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();
        CustomerlistTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customers = new javax.swing.JTable();
        ChangepinTab = new javax.swing.JPanel();
        OldpintxtChangepin = new javax.swing.JLabel();
        NewpintxtChangepin = new javax.swing.JLabel();
        OldpinChange = new javax.swing.JTextField();
        NewpinChange = new javax.swing.JTextField();
        Changepin = new javax.swing.JButton();
        ClearChangepin = new javax.swing.JButton();
        AboutTab = new javax.swing.JPanel();
        Info1 = new javax.swing.JLabel();
        Authorstxt = new javax.swing.JLabel();
        Versiontxt = new javax.swing.JLabel();
        SearchTop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePage.setBackground(new java.awt.Color(255, 255, 255));

        UnametxtTop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UnametxtTop.setText("Username");

        CurrentDate.setEditable(false);
        CurrentDate.setBackground(new java.awt.Color(255, 255, 255));

        DatetxtTop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DatetxtTop.setText("Date");

        LogoHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/banking logo (2).png"))); // NOI18N

        FunctionsTab.setBackground(new java.awt.Color(255, 255, 255));
        FunctionsTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 33, 71)));

        ProfileTab.setBackground(new java.awt.Color(255, 255, 255));
        ProfileTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        FullnametxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FullnametxtProfile.setText("Name");

        DateofbirthtxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateofbirthtxtProfile.setText("DOB");

        GendertxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GendertxtProfile.setText("Gender");

        EthnicitytxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EthnicitytxtProfile.setText("Ethnicity");

        AddresstxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddresstxtProfile.setText("Address");

        FullnameProfile.setEditable(false);
        FullnameProfile.setBackground(new java.awt.Color(255, 255, 255));

        DateofBirthProfile.setEditable(false);
        DateofBirthProfile.setBackground(new java.awt.Color(255, 255, 255));

        GenderProfile.setEditable(false);
        GenderProfile.setBackground(new java.awt.Color(255, 255, 255));

        EthnicityProfile.setEditable(false);
        EthnicityProfile.setBackground(new java.awt.Color(255, 255, 255));

        AddressProfile.setEditable(false);
        AddressProfile.setBackground(new java.awt.Color(255, 255, 255));

        AccnumtxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtProfile.setText("Account No.");

        AcctypetxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AcctypetxtProfile.setText("Account Type");

        MobiletxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MobiletxtProfile.setText("Mobile");

        SecurityqtxtProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SecurityqtxtProfile.setText("Security question");

        AccnumProfile.setEditable(false);
        AccnumProfile.setBackground(new java.awt.Color(255, 255, 255));

        AcctypeProfile.setEditable(false);
        AcctypeProfile.setBackground(new java.awt.Color(255, 255, 255));

        MobileProfile.setEditable(false);
        MobileProfile.setBackground(new java.awt.Color(255, 255, 255));

        SecurityqProfile.setEditable(false);
        SecurityqProfile.setBackground(new java.awt.Color(255, 255, 255));

        EditProfile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditProfile.setText("Edit");
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });

        SaveProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveProfile.setText("Save");
        SaveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfileTabLayout = new javax.swing.GroupLayout(ProfileTab);
        ProfileTab.setLayout(ProfileTabLayout);
        ProfileTabLayout.setHorizontalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileTabLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FullnametxtProfile)
                    .addComponent(DateofbirthtxtProfile)
                    .addComponent(GendertxtProfile)
                    .addComponent(EthnicitytxtProfile)
                    .addComponent(AddresstxtProfile))
                .addGap(27, 27, 27)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FullnameProfile)
                    .addComponent(DateofBirthProfile)
                    .addComponent(GenderProfile)
                    .addComponent(EthnicityProfile)
                    .addComponent(AddressProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccnumtxtProfile)
                    .addComponent(AcctypetxtProfile)
                    .addComponent(MobiletxtProfile)
                    .addComponent(SecurityqtxtProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileTabLayout.createSequentialGroup()
                        .addComponent(EditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(SaveProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MobileProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AcctypeProfile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(AccnumProfile, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(SecurityqProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );
        ProfileTabLayout.setVerticalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileTabLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullnametxtProfile)
                    .addComponent(FullnameProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccnumtxtProfile)
                    .addComponent(AccnumProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateofbirthtxtProfile)
                    .addComponent(DateofBirthProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcctypetxtProfile)
                    .addComponent(AcctypeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GendertxtProfile)
                    .addComponent(GenderProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MobiletxtProfile)
                    .addComponent(MobileProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EthnicitytxtProfile)
                    .addComponent(EthnicityProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecurityqtxtProfile)
                    .addComponent(SecurityqProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddresstxtProfile)
                    .addComponent(AddressProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditProfile)
                    .addComponent(SaveProfile))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        FunctionsTab.addTab("Profile", ProfileTab);

        DepositTab.setBackground(new java.awt.Color(255, 255, 255));
        DepositTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        UnametxtDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UnametxtDeposit.setText("User");

        NametxtDeposit.setBackground(new java.awt.Color(255, 255, 255));
        NametxtDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NametxtDeposit.setText("Name");

        AccnumtxtDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtDeposit.setText("Account No.");

        BaltxtDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BaltxtDeposit.setText("Available Balance");

        DeposittxtDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeposittxtDeposit.setText("Deposit");

        FullnameDeposit.setEditable(false);
        FullnameDeposit.setBackground(new java.awt.Color(255, 255, 255));

        AccnumDeposit.setEditable(false);
        AccnumDeposit.setBackground(new java.awt.Color(255, 255, 255));

        BalanceDeposit.setEditable(false);
        BalanceDeposit.setBackground(new java.awt.Color(255, 255, 255));

        SearchDeposit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchDeposit.setText("Search");
        SearchDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDepositActionPerformed(evt);
            }
        });

        CalculateDeposit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CalculateDeposit.setText("Calculate");
        CalculateDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateDepositActionPerformed(evt);
            }
        });

        Deposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Deposit.setText("Deposit");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DepositTabLayout = new javax.swing.GroupLayout(DepositTab);
        DepositTab.setLayout(DepositTabLayout);
        DepositTabLayout.setHorizontalGroup(
            DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositTabLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnametxtDeposit)
                    .addComponent(NametxtDeposit)
                    .addComponent(AccnumtxtDeposit)
                    .addComponent(BaltxtDeposit)
                    .addComponent(DeposittxtDeposit))
                .addGap(19, 19, 19)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccnumDeposit)
                    .addComponent(BalanceDeposit)
                    .addComponent(UsernameDeposit)
                    .addComponent(FullnameDeposit)
                    .addGroup(DepositTabLayout.createSequentialGroup()
                        .addComponent(DepositInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewbalDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Deposit, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(SearchDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(CalculateDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        DepositTabLayout.setVerticalGroup(
            DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnametxtDeposit)
                    .addComponent(UsernameDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchDeposit))
                .addGap(47, 47, 47)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NametxtDeposit)
                    .addComponent(FullnameDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccnumtxtDeposit)
                    .addComponent(AccnumDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaltxtDeposit)
                    .addComponent(BalanceDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeposittxtDeposit)
                    .addComponent(DepositInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewbalDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalculateDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Deposit)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        FunctionsTab.addTab("Deposit", DepositTab);

        WithdrawTab.setBackground(new java.awt.Color(255, 255, 255));
        WithdrawTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        UnametxtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UnametxtWithdraw.setText("User");

        FullnametxtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FullnametxtWithdraw.setText("Name");

        AccnumtxtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtWithdraw.setText("Account No.");

        BaltxtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BaltxtWithdraw.setText("Available balance");

        AmounttxtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AmounttxtWithdraw.setText("Amount");

        NewbaltxtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewbaltxtWithdraw.setText("Total");

        UsernameWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        FullnameWithdraw.setEditable(false);
        FullnameWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        FullnameWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AccnumWithdraw.setEditable(false);
        AccnumWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        AccnumWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BalWithdraw.setEditable(false);
        BalWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        BalWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AmountWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NewbalWithdraw.setEditable(false);
        NewbalWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        NewbalWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SearchWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchWithdraw.setText("Search");
        SearchWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchWithdrawActionPerformed(evt);
            }
        });

        CalculateWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CalculateWithdraw.setText("Calculate ");
        CalculateWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateWithdrawActionPerformed(evt);
            }
        });

        Withdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Withdraw.setText("Withdraw");
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WithdrawTabLayout = new javax.swing.GroupLayout(WithdrawTab);
        WithdrawTab.setLayout(WithdrawTabLayout);
        WithdrawTabLayout.setHorizontalGroup(
            WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawTabLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(WithdrawTabLayout.createSequentialGroup()
                        .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnametxtWithdraw)
                            .addComponent(FullnametxtWithdraw)
                            .addComponent(AccnumtxtWithdraw)
                            .addComponent(BaltxtWithdraw)
                            .addComponent(AmounttxtWithdraw)
                            .addComponent(NewbaltxtWithdraw))
                        .addGap(26, 26, 26)
                        .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsernameWithdraw)
                            .addComponent(FullnameWithdraw)
                            .addComponent(AccnumWithdraw)
                            .addComponent(BalWithdraw)
                            .addComponent(AmountWithdraw)
                            .addComponent(NewbalWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalculateWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        WithdrawTabLayout.setVerticalGroup(
            WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnametxtWithdraw)
                    .addComponent(UsernameWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchWithdraw))
                .addGap(47, 47, 47)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullnametxtWithdraw)
                    .addComponent(FullnameWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccnumtxtWithdraw)
                    .addComponent(AccnumWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaltxtWithdraw)
                    .addComponent(BalWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmounttxtWithdraw)
                    .addComponent(AmountWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewbaltxtWithdraw)
                    .addComponent(NewbalWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalculateWithdraw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Withdraw)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FunctionsTab.addTab("Withdraw", WithdrawTab);

        ViewbalTab.setBackground(new java.awt.Color(255, 255, 255));
        ViewbalTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        UsertxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsertxtVB.setText("User");

        NametxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NametxtVB.setText("Name");

        AccnumtxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtVB.setText("Account No.");

        MnumtxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MnumtxtVB.setText("MICR No.");

        SearchVB.setText("Search");
        SearchVB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchVBActionPerformed(evt);
            }
        });

        FullnameVB.setEditable(false);
        FullnameVB.setBackground(new java.awt.Color(255, 255, 255));

        AccnumVB.setEditable(false);
        AccnumVB.setBackground(new java.awt.Color(255, 255, 255));

        MnumVB.setEditable(false);
        MnumVB.setBackground(new java.awt.Color(255, 255, 255));

        BaltxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BaltxtVB.setText("Available Balance");

        BalVB.setEditable(false);
        BalVB.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ViewbalTabLayout = new javax.swing.GroupLayout(ViewbalTab);
        ViewbalTab.setLayout(ViewbalTabLayout);
        ViewbalTabLayout.setHorizontalGroup(
            ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewbalTabLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewbalTabLayout.createSequentialGroup()
                        .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsertxtVB)
                            .addComponent(NametxtVB))
                        .addGap(149, 149, 149)
                        .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullnameVB, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(UsernameVB)))
                    .addGroup(ViewbalTabLayout.createSequentialGroup()
                        .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccnumtxtVB)
                            .addComponent(MnumtxtVB)
                            .addComponent(BaltxtVB))
                        .addGap(72, 72, 72)
                        .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MnumVB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AccnumVB)
                            .addComponent(BalVB))))
                .addGap(36, 36, 36)
                .addComponent(SearchVB)
                .addGap(280, 280, 280))
        );
        ViewbalTabLayout.setVerticalGroup(
            ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewbalTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsertxtVB)
                    .addComponent(UsernameVB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchVB))
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NametxtVB)
                    .addComponent(FullnameVB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccnumtxtVB)
                    .addComponent(AccnumVB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MnumVB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MnumtxtVB))
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaltxtVB)
                    .addComponent(BalVB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        FunctionsTab.addTab("View balance", ViewbalTab);

        TransferTab.setBackground(new java.awt.Color(255, 255, 255));
        TransferTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        UnametxtTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UnametxtTransfer.setText("Username");

        FullnametxtTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FullnametxtTransfer.setText("Name");

        AccnumtxtTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtTransfer.setText("Account No.");

        BaltxtTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BaltxtTransfer.setText("Available Balance");

        AmounttxtTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AmounttxtTransfer.setText("Transfer Amount");

        CreditamounttxtTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CreditamounttxtTransfer.setText("Credit Account");

        FullnameTransfer.setEditable(false);
        FullnameTransfer.setBackground(new java.awt.Color(255, 255, 255));

        AccnumTransfer.setEditable(false);
        AccnumTransfer.setBackground(new java.awt.Color(255, 255, 255));

        BalTransfer.setEditable(false);
        BalTransfer.setBackground(new java.awt.Color(255, 255, 255));

        NewbalTransfer.setEditable(false);
        NewbalTransfer.setBackground(new java.awt.Color(255, 255, 255));

        AccTransfer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                AccTransferPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        TransferNewInput.setEditable(false);
        TransferNewInput.setBackground(new java.awt.Color(255, 255, 255));

        NewbalAccTransfer.setEditable(false);
        NewbalAccTransfer.setBackground(new java.awt.Color(255, 255, 255));

        SearchTransfer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchTransfer.setText("Search");
        SearchTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTransferActionPerformed(evt);
            }
        });

        CalculateTransfer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CalculateTransfer1.setText("Calculate");
        CalculateTransfer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateTransfer1ActionPerformed(evt);
            }
        });

        CalculateTransfer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CalculateTransfer2.setText("Calculate");
        CalculateTransfer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateTransfer2ActionPerformed(evt);
            }
        });

        Transfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Transfer.setText("Transfer");
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransferTabLayout = new javax.swing.GroupLayout(TransferTab);
        TransferTab.setLayout(TransferTabLayout);
        TransferTabLayout.setHorizontalGroup(
            TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferTabLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnametxtTransfer)
                    .addComponent(FullnametxtTransfer)
                    .addComponent(AccnumtxtTransfer)
                    .addComponent(BaltxtTransfer)
                    .addComponent(AmounttxtTransfer)
                    .addComponent(CreditamounttxtTransfer))
                .addGap(41, 41, 41)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameTransfer)
                    .addComponent(FullnameTransfer)
                    .addComponent(AccnumTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(BalTransfer)
                    .addGroup(TransferTabLayout.createSequentialGroup()
                        .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TransferInput)
                            .addComponent(AccTransfer, 0, 121, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewbalTransfer)
                            .addComponent(TransferNewInput))))
                .addGap(18, 18, 18)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SearchTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(CalculateTransfer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TransferTabLayout.createSequentialGroup()
                        .addComponent(NewbalAccTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalculateTransfer2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 140, 140))
        );
        TransferTabLayout.setVerticalGroup(
            TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnametxtTransfer)
                    .addComponent(UsernameTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchTransfer))
                .addGap(38, 38, 38)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullnametxtTransfer)
                    .addComponent(FullnameTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccnumtxtTransfer)
                    .addGroup(TransferTabLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(AccnumTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaltxtTransfer)
                    .addComponent(BalTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmounttxtTransfer)
                    .addComponent(TransferInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewbalTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalculateTransfer1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalculateTransfer2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(TransferTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CreditamounttxtTransfer)
                        .addComponent(AccTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TransferNewInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewbalAccTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(Transfer)
                .addGap(23, 23, 23))
        );

        FunctionsTab.addTab("Transfer", TransferTab);

        CustomerlistTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        Customers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Customers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Customers);

        javax.swing.GroupLayout CustomerlistTabLayout = new javax.swing.GroupLayout(CustomerlistTab);
        CustomerlistTab.setLayout(CustomerlistTabLayout);
        CustomerlistTabLayout.setHorizontalGroup(
            CustomerlistTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerlistTabLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );
        CustomerlistTabLayout.setVerticalGroup(
            CustomerlistTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        FunctionsTab.addTab("Customer list", CustomerlistTab);

        ChangepinTab.setBackground(new java.awt.Color(255, 255, 255));
        ChangepinTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        OldpintxtChangepin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OldpintxtChangepin.setText("Username");

        NewpintxtChangepin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewpintxtChangepin.setText("Enter New Pin:");

        Changepin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Changepin.setText("Change");
        Changepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangepinActionPerformed(evt);
            }
        });

        ClearChangepin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ClearChangepin.setText("Clear");
        ClearChangepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearChangepinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangepinTabLayout = new javax.swing.GroupLayout(ChangepinTab);
        ChangepinTab.setLayout(ChangepinTabLayout);
        ChangepinTabLayout.setHorizontalGroup(
            ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangepinTabLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OldpintxtChangepin)
                    .addComponent(NewpintxtChangepin))
                .addGap(34, 34, 34)
                .addGroup(ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ChangepinTabLayout.createSequentialGroup()
                        .addComponent(Changepin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearChangepin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OldpinChange)
                    .addComponent(NewpinChange, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        ChangepinTabLayout.setVerticalGroup(
            ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangepinTabLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OldpintxtChangepin)
                    .addComponent(OldpinChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewpintxtChangepin)
                    .addComponent(NewpinChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(ChangepinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Changepin)
                    .addComponent(ClearChangepin))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        FunctionsTab.addTab("Change PIN", ChangepinTab);

        AboutTab.setBackground(new java.awt.Color(255, 255, 255));
        AboutTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));

        Info1.setText("Project ID - PNJAVADA87412");

        Authorstxt.setText("Bought From: projectNOW");

        Versiontxt.setText("TMT v1.0");

        javax.swing.GroupLayout AboutTabLayout = new javax.swing.GroupLayout(AboutTab);
        AboutTab.setLayout(AboutTabLayout);
        AboutTabLayout.setHorizontalGroup(
            AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutTabLayout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Authorstxt)
                    .addComponent(Info1))
                .addGap(326, 326, 326))
            .addGroup(AboutTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Versiontxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AboutTabLayout.setVerticalGroup(
            AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutTabLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Info1)
                .addGap(30, 30, 30)
                .addComponent(Authorstxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Versiontxt)
                .addGap(40, 40, 40))
        );

        FunctionsTab.addTab("About", AboutTab);

        SearchTop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SearchTop.setText("Search");
        SearchTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FunctionsTab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(LogoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatetxtTop)
                            .addComponent(UnametxtTop))
                        .addGap(31, 31, 31)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CurrentDate)
                            .addComponent(UsernameTop, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(SearchTop, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UnametxtTop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchTop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatetxtTop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FunctionsTab, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1019, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// search for customer and grab details and put into profile page
    private void SearchTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTopActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM Account WHERE Name = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,UsernameTop.getText());
            rs = pst.executeQuery();
            if (rs.next()){
                String add1 = rs.getString("Name");
                FullnameProfile.setText(add1);
                
                String add2 = rs.getString("Acc");
                AccnumProfile.setText(add2);
                
                String add3 = rs.getString("DOB");
                DateofBirthProfile.setText(add3);
                
                String add4 = rs.getString("Acc_Type");
                AcctypeProfile.setText(add4);
                
                String add5 = rs.getString("Gender");
                GenderProfile.setText(add5);
                
                String add6 = rs.getString("Ethnicity");
                EthnicityProfile.setText(add6);
                
                String add7 = rs.getString("Mob");
                MobileProfile.setText(add7);
                
                String add8 = rs.getString("Address");
                AddressProfile.setText(add8);
                
                String add9 = rs.getString("Sec_Q");
                SecurityqProfile.setText(add9);
                
                rs.close();
                pst.close();

            }else{
                JOptionPane.showMessageDialog(null,"Please enter correct Name");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_SearchTopActionPerformed
//withdraw money from user and update database balances
    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = UsernameWithdraw.getText();
            String a2 = NewbalWithdraw.getText();
            String sql = "UPDATE Balances SET Balance = '" +a2+ "' WHERE Name = '" +a1+ "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Withdrawn Successfully.");

            UsernameWithdraw.setText("");
            FullnameWithdraw.setText("");
            AccnumWithdraw.setText("");
            BalWithdraw.setText("");
            AmountWithdraw.setText("");
            NewbalWithdraw.setText("");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_WithdrawActionPerformed
//calculate new total
    private void CalculateWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateWithdrawActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = BalWithdraw.getText();
            String a2 = AmountWithdraw.getText();
            int sum = Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1 = String.valueOf(sum);
            NewbalWithdraw.setText(sum1);
        }catch(Exception NumberFormatException){
            JOptionPane.showMessageDialog(null,"Please enter numbers only");
        }
    }//GEN-LAST:event_CalculateWithdrawActionPerformed
// get users balances details
    private void SearchWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchWithdrawActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM Balances WHERE Name = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,UsernameWithdraw.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Name");
                FullnameWithdraw.setText(add1);

                String add2 = rs.getString("Acc");
                AccnumWithdraw.setText(add2);

                String add3 = rs.getString("Balance");
                BalWithdraw.setText(add3);

                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter correct Name");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_SearchWithdrawActionPerformed
//clear changepin fields
    private void ClearChangepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearChangepinActionPerformed
        // TODO add your handling code here:

        OldpinChange.setText("");
        NewpinChange.setText("");

    }//GEN-LAST:event_ClearChangepinActionPerformed
//set new pin
    private void ChangepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangepinActionPerformed
        // TODO add your handling code here:

        try{
            String value1 = OldpinChange.getText();
            String value2 = NewpinChange.getText();

            String sql = "update Account set Pin='"+value2+"' where Name='"+value1+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pin changed successfully");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_ChangepinActionPerformed
//save profile details
    private void SaveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveProfileActionPerformed
        // TODO add your handling code here:
        try{
            String value1 = GenderProfile.getText();
            String value2 = EthnicityProfile.getText();
            String value3 = AddressProfile.getText();
            String value4 = MobileProfile.getText();
            String value5 = SecurityqProfile.getText();
            String value6 = UsernameTop.getText();

            String sql = "UPDATE Account SET Gender='"+value1+"',Ethnicity='"+value2+"',Address='"+value3+"',Mob='"+value4+"',Sec_Q='"+value5+"' where Name='"+value6+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Profile updated successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SaveProfileActionPerformed
// make fields editable for changing
    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        // TODO add your handling code here:

        GenderProfile.setEditable(true);
        EthnicityProfile.setEditable(true);
        AddressProfile.setEditable(true);
        MobileProfile.setEditable(true);
        SecurityqProfile.setEditable(true);
    }//GEN-LAST:event_EditProfileActionPerformed
//transfers money between two accounts
    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
        // TODO add your handling code here:
        TransferD();
        TransferC();
        UsernameTransfer.setText("");
        FullnameTransfer.setText("");
        AccnumTransfer.setText("");
        BalTransfer.setText("");
        TransferInput.setText("");
        NewbalTransfer.setText("");
        TransferNewInput.setText("");
        NewbalAccTransfer.setText("");

    }//GEN-LAST:event_TransferActionPerformed
//calculate new balance for account two
    private void CalculateTransfer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateTransfer2ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = TransferInput.getText();
            String a2 = TransferNewInput.getText();
            int sum = Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1 = String.valueOf(sum);
            NewbalAccTransfer.setText(sum1);
        }catch(Exception NumberFormatException){
            JOptionPane.showMessageDialog(null,"Please enter numbers only for Transfer Amount");
        }
    }//GEN-LAST:event_CalculateTransfer2ActionPerformed
//calculate new balance for account one
    private void CalculateTransfer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateTransfer1ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = BalTransfer.getText();
            String a2 = TransferInput.getText();
            int sum = Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1 = String.valueOf(sum);
            NewbalTransfer.setText(sum1);
        }catch(Exception NumberFormatException){
            JOptionPane.showMessageDialog(null,"Please enter numbers only");
        }
    }//GEN-LAST:event_CalculateTransfer1ActionPerformed
//Get users details for transfer
    private void SearchTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTransferActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM Balances WHERE Name = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,UsernameTransfer.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Name");
                FullnameTransfer.setText(add1);

                String add2 = rs.getString("Acc");
                AccnumTransfer.setText(add2);

                String add3 = rs.getString("Balance");
                BalTransfer.setText(add3);

                rs.close();
                pst.close();
            }else{
                JOptionPane.showMessageDialog(null,"Please enter correct Name");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_SearchTransferActionPerformed

    private void AccTransferPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_AccTransferPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try{
            String a1 = (String) AccTransfer.getSelectedItem();
            String sql = "SELECT * FROM Balances WHERE Acc = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,a1);
            rs = pst.executeQuery();
            if(rs.next()){
                String add = rs.getString("Balance");
                TransferNewInput.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_AccTransferPopupMenuWillBecomeInvisible
//get user details for View balance page
    private void SearchVBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchVBActionPerformed
        // TODO add your handling code here:
        String sql = "select * from Balances where Name=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, UsernameVB.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Name");
                FullnameVB.setText(add1);
                String add2 = rs.getString("Acc");
                AccnumVB.setText(add2);
                String add3 = rs.getString("MICR_No");
                MnumVB.setText(add3);
                String add4 = rs.getString("Balance");
                BalVB.setText(add4);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_SearchVBActionPerformed
//update balances after a deposit
    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        // TODO add your handling code here:
        try{
            String value1 = UsernameDeposit.getText();
            String value2 = NewbalDeposit.getText();
            String sql = "UPDATE Balances SET Balance ='"+value2+"' WHERE Name ='"+value1+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Successfully deposited.");
            UsernameDeposit.setText("");
            FullnameDeposit.setText("");
            AccnumDeposit.setText("");
            BalanceDeposit.setText("");
            DepositInput.setText("");
            NewbalDeposit.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_DepositActionPerformed
//calculate new balance after deposit
    private void CalculateDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateDepositActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = BalanceDeposit.getText();
            String a2 = DepositInput.getText();
            int sum = Integer.parseInt(a1) + Integer.parseInt(a2);
            String sum1 = String.valueOf(sum);
            NewbalDeposit.setText(sum1);
        }catch(Exception NumberFormatException){
            JOptionPane.showMessageDialog(null,"Please enter numbers only");
        }
    }//GEN-LAST:event_CalculateDepositActionPerformed
//get users details for deposit page
    private void SearchDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDepositActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM Balances WHERE Name = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,UsernameDeposit.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Name");
                FullnameDeposit.setText(add1);

                String add2 = rs.getString("Acc");
                AccnumDeposit.setText(add2);

                String add3 = rs.getString("Balance");
                BalanceDeposit.setText(add3);

                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter correct Name");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
            }
    }//GEN-LAST:event_SearchDepositActionPerformed
}
    //get accounts in database for transfer dropdownbox
    public void Account(){
        try{
            String sql = "SELECT * FROM Balances";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String account = rs.getString("Acc");
                AccTransfer.addItem(account);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
 // transfer money from one account to another
 public void TransferC(){
     try{
         String value1 = (String) AccTransfer.getSelectedItem();
         String value2 = NewbalAccTransfer.getText();
         String sql = "UPDATE Balances SET Balance = '"+value2+"' WHERE Acc = '"+value1+"' ";
         pst = conn.prepareStatement(sql);
         pst.execute();
         JOptionPane.showMessageDialog(null,"Successfully transfered.");
     }catch(Exception e){
         JOptionPane.showConfirmDialog(null, e);
     }
 }   
  // transfer money from one account to another
 public void TransferD(){
     try{
         String value1 = UsernameTransfer.getText();
         String value2 = NewbalTransfer.getText();
         String sql = "UPDATE Balances SET Balance = '" +value2+ "' WHERE Name = '" +value1+ "' ";
         pst = conn.prepareStatement(sql);
         pst.execute();
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
 }
 
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutTab;
    private javax.swing.JComboBox AccTransfer;
    private javax.swing.JTextField AccnumDeposit;
    private javax.swing.JTextField AccnumProfile;
    private javax.swing.JTextField AccnumTransfer;
    private javax.swing.JTextField AccnumVB;
    private javax.swing.JTextField AccnumWithdraw;
    private javax.swing.JLabel AccnumtxtDeposit;
    private javax.swing.JLabel AccnumtxtProfile;
    private javax.swing.JLabel AccnumtxtTransfer;
    private javax.swing.JLabel AccnumtxtVB;
    private javax.swing.JLabel AccnumtxtWithdraw;
    private javax.swing.JTextField AcctypeProfile;
    private javax.swing.JLabel AcctypetxtProfile;
    private javax.swing.JTextField AddressProfile;
    private javax.swing.JLabel AddresstxtProfile;
    private javax.swing.JTextField AmountWithdraw;
    private javax.swing.JLabel AmounttxtTransfer;
    private javax.swing.JLabel AmounttxtWithdraw;
    private javax.swing.JLabel Authorstxt;
    private javax.swing.JTextField BalTransfer;
    private javax.swing.JTextField BalVB;
    private javax.swing.JTextField BalWithdraw;
    private javax.swing.JTextField BalanceDeposit;
    private javax.swing.JLabel BaltxtDeposit;
    private javax.swing.JLabel BaltxtTransfer;
    private javax.swing.JLabel BaltxtVB;
    private javax.swing.JLabel BaltxtWithdraw;
    private javax.swing.JButton CalculateDeposit;
    private javax.swing.JButton CalculateTransfer1;
    private javax.swing.JButton CalculateTransfer2;
    private javax.swing.JButton CalculateWithdraw;
    private javax.swing.JButton Changepin;
    private javax.swing.JPanel ChangepinTab;
    private javax.swing.JButton ClearChangepin;
    private javax.swing.JLabel CreditamounttxtTransfer;
    private javax.swing.JTextField CurrentDate;
    private javax.swing.JPanel CustomerlistTab;
    private javax.swing.JTable Customers;
    private javax.swing.JTextField DateofBirthProfile;
    private javax.swing.JLabel DateofbirthtxtProfile;
    private javax.swing.JLabel DatetxtTop;
    private javax.swing.JButton Deposit;
    private javax.swing.JTextField DepositInput;
    private javax.swing.JPanel DepositTab;
    private javax.swing.JLabel DeposittxtDeposit;
    private javax.swing.JButton EditProfile;
    private javax.swing.JTextField EthnicityProfile;
    private javax.swing.JLabel EthnicitytxtProfile;
    private javax.swing.JTextField FullnameDeposit;
    private javax.swing.JTextField FullnameProfile;
    private javax.swing.JTextField FullnameTransfer;
    private javax.swing.JTextField FullnameVB;
    private javax.swing.JTextField FullnameWithdraw;
    private javax.swing.JLabel FullnametxtProfile;
    private javax.swing.JLabel FullnametxtTransfer;
    private javax.swing.JLabel FullnametxtWithdraw;
    private javax.swing.JTabbedPane FunctionsTab;
    private javax.swing.JTextField GenderProfile;
    private javax.swing.JLabel GendertxtProfile;
    private javax.swing.JPanel HomePage;
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel LogoHP;
    private javax.swing.JTextField MnumVB;
    private javax.swing.JLabel MnumtxtVB;
    private javax.swing.JTextField MobileProfile;
    private javax.swing.JLabel MobiletxtProfile;
    private javax.swing.JLabel NametxtDeposit;
    private javax.swing.JLabel NametxtVB;
    private javax.swing.JTextField NewbalAccTransfer;
    private javax.swing.JTextField NewbalDeposit;
    private javax.swing.JTextField NewbalTransfer;
    private javax.swing.JTextField NewbalWithdraw;
    private javax.swing.JLabel NewbaltxtWithdraw;
    private javax.swing.JTextField NewpinChange;
    private javax.swing.JLabel NewpintxtChangepin;
    private javax.swing.JTextField OldpinChange;
    private javax.swing.JLabel OldpintxtChangepin;
    private javax.swing.JPanel ProfileTab;
    private javax.swing.JButton SaveProfile;
    private javax.swing.JButton SearchDeposit;
    private javax.swing.JButton SearchTop;
    private javax.swing.JButton SearchTransfer;
    private javax.swing.JButton SearchVB;
    private javax.swing.JButton SearchWithdraw;
    private javax.swing.JTextField SecurityqProfile;
    private javax.swing.JLabel SecurityqtxtProfile;
    private javax.swing.JButton Transfer;
    private javax.swing.JTextField TransferInput;
    private javax.swing.JTextField TransferNewInput;
    private javax.swing.JPanel TransferTab;
    private javax.swing.JLabel UnametxtDeposit;
    private javax.swing.JLabel UnametxtTop;
    private javax.swing.JLabel UnametxtTransfer;
    private javax.swing.JLabel UnametxtWithdraw;
    private javax.swing.JTextField UsernameDeposit;
    private javax.swing.JTextField UsernameTop;
    private javax.swing.JTextField UsernameTransfer;
    private javax.swing.JTextField UsernameVB;
    private javax.swing.JTextField UsernameWithdraw;
    private javax.swing.JLabel UsertxtVB;
    private javax.swing.JLabel Versiontxt;
    private javax.swing.JPanel ViewbalTab;
    private javax.swing.JButton Withdraw;
    private javax.swing.JPanel WithdrawTab;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

