	
	import javax.swing.table.*;
	import java.awt.*;
	import javax.swing.*;
	
	public class FRAME extends javax.swing.JFrame {
	    
    
	    java.util.Vector refList,tList;
	    Table ftable;
	    Object Pages[][],Algo[];
	    boolean flg,erf,erf2;
	    String msg,sAlgo;
	    int row,col,drow,refId,i,j,pfi,phi,k,fset,tmp;
	    java.lang.Integer tmpint,tmpint1;
	    public FRAME() {
	        msg="";
	        col=0;  
	        erf=true;
	        row=0;
	        Algo=new Object[3];        
	        Algo[0]="Select";
	        Algo[1]="FIFO";
	        Algo[2]="LRU";
		Algo[3]="optimal";
	        ftable = new Table(row,col);        
	        refList= new java.util.Vector();
	        initComponents();           
//	        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Ico.png")).getImage());      
	        this.setLocation(200,150);
	        this.setSize(742,452+35);   
	        
	    }
	    
	   
   
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jSpinner_PageFrame = new javax.swing.JSpinner();
        jButton_Set = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_Simulate = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane_RefField = new javax.swing.JScrollPane();
        jList_RefField = new javax.swing.JList();
        jSpinner_RefField = new javax.swing.JSpinner();
        jButton_AddEdit = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_DeleteAll = new javax.swing.JButton();
        jButton_Reverse = new javax.swing.JButton();
        jButton_Reverse.setToolTipText("Makes reverse order of whole list.");
        jLabel4 = new javax.swing.JLabel();
        jTextField_refField = new javax.swing.JTextField();
        jPanel_PageTable = new javax.swing.JPanel();
        jScrollPane_PageTable = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_PHits = new javax.swing.JTextField();
        jTextField_PFaults = new javax.swing.JTextField();
        jComboBox_Algo = new javax.swing.JComboBox(Algo);
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Page Replacement Algorithm Simulation");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Page Frames :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(245, 74, 98, 22);

        getContentPane().add(jSpinner_PageFrame);
        jSpinner_PageFrame.setBounds(389, 77, 78, 22);

        jButton_Set.setText("Select");
        jButton_Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SetActionPerformed(evt);
            }
        });

        getContentPane().add(jButton_Set);
        jButton_Set.setBounds(527, 71, 116, 28);

        jPanel2.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(170, 201, 235));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Simulate.setText("Simulate");
        jButton_Simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SimulateActionPerformed(evt);
            }
        });

        jPanel2.add(jButton_Simulate);
        jButton_Simulate.setBounds(20, 10, 80, 30);

        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jPanel2.add(jButton_Reset);
        jButton_Reset.setBounds(120, 10, 90, 30);


        getContentPane().add(jPanel2);
        jPanel2.setBounds(232,379,238,61);

        jPanel3.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 255, 255))));
        jPanel3.setEnabled(false);
        jScrollPane_RefField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane_RefField.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       
        jScrollPane_RefField.setViewportView(jList_RefField);

        jPanel3.add(jScrollPane_RefField);
        jScrollPane_RefField.setBounds(30, 70, 50, 130);

        jPanel3.add(jSpinner_RefField);
        jSpinner_RefField.setBounds(30, 30, 50, 20);

        jButton_AddEdit.setText("Add");
        jButton_AddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEditActionPerformed(evt);
            }
        });

        jPanel3.add(jButton_AddEdit);
        jButton_AddEdit.setBounds(100, 30, 60, 23);

 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
 
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 220, 130, 20);

        jTextField_refField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_refField.setText("0");
        jTextField_refField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField_refField.setFocusable(false);

        jTextField_refField.setBounds(150, 220, 30, 20);

      getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 90, 210, 260);

        jPanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Page Faults :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 40, 100, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Page Hits :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 90, 20);

        jTextField_PHits.setForeground(new java.awt.Color(255, 153, 153));
        jTextField_PHits.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_PHits.setText("0");
        jTextField_PHits.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField_PHits.setFocusable(false);
        jPanel1.add(jTextField_PHits);
        jTextField_PHits.setBounds(130, 10, 30, 20);

        jTextField_PFaults.setForeground(new java.awt.Color(255, 153, 153));
        jTextField_PFaults.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_PFaults.setText("0");
        jTextField_PFaults.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField_PFaults.setFocusable(false);
        jPanel1.add(jTextField_PFaults);
        jTextField_PFaults.setBounds(130, 40, 30, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(448,198,238,125);

        jComboBox_Algo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "FIFO", "LRU" }));
        getContentPane().add(jComboBox_Algo);
        jComboBox_Algo.setBounds(388, 39, 78, 22);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Algorithm: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(214, 36, 161, 28);

        pack();
    }
	
	    private void formWindowClosing(java.awt.event.WindowEvent evt) {
	    }
	
	    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {
	        
	        erf=true;
	        col=0;
	        row=0;
	        ftable.col=0;
	        ftable.row=0;    
	        phi=0;
	        pfi=0;
	        jComboBox_Algo.setSelectedIndex(0);
	        jSpinner_RefField.setValue(new java.lang.Integer(0));
	        jTextField_refField.setText(""+refList.size());
	        jTextField_PHits.setText(""+phi);
	        jTextField_PFaults.setText(""+pfi);   
	        if(refList.size()>0)
	        {
	        }     
	        ftable.resetModel();
	    //    jTable_PageTable.setModel(ftable.dataModel); 
	    }
	
	    private void jButton_SetActionPerformed(java.awt.event.ActionEvent evt) {
	        msg="";
	        col=1;
	        ftable.col=1;
	       tmpint1 = (java.lang.Integer)jSpinner_PageFrame.getValue();
	        if(tmpint1.intValue()<50&&tmpint1.intValue()>0)
	        {
	            if(erf)
	            {
	                erf=false;
	            }
	            row=tmpint1.intValue();
	            row++;
	            ftable.row=row-1;
	            ftable.resetObj();
	            ftable.resetModel();
	            fset=2;
	        }
	        else  {
	            fset=3;
	            msg+="Page Frames must be between 0 to 50.";
	            javax.swing.JOptionPane.showMessageDialog(this,msg, "Warning",javax.swing.JOptionPane.WARNING_MESSAGE  );
	        }
	    }
	
	    private void jButton_DeleteAllActionPerformed(java.awt.event.ActionEvent evt) {
	        if(refList.size()>0)
	        {
	            refList.removeAllElements();
	            jTextField_refField.setText(""+refList.size());
	            jList_RefField.setListData(refList);
	        }     
	        jTextField_refField.setText(""+refList.size());
	    }
	
	    private void jButton_SimulateActionPerformed(java.awt.event.ActionEvent evt) {
	        msg="";  
	        erf2=true;
	        sAlgo=jComboBox_Algo.getSelectedItem().toString();
	        if(refList.size()>0&&(row-1)<50&&(row-1)>0&&(!sAlgo.equals("Select")))
	        {
	            jSpinner_PageFrame.setValue(new java.lang.Integer(row-1));
	          
	            GetData();   
	            erf2=false;
	        }    
	        if(sAlgo.equals("Select"))
	        {
	            msg+="Please select algorithm.\n";
	        }
	        if(erf)
	        {
	            msg+="Please set page frames.\n";
	        }
	        else
	        {
	            jSpinner_PageFrame.setValue(new java.lang.Integer(row-1));
	        }
	        if(refList.size()<1)
	        {
	            msg+="Reference field is empty.\nPlease fill reference field.";
	        }
	        if(erf2)
	        {
	            javax.swing.JOptionPane.showMessageDialog(this,msg, "Warning",javax.swing.JOptionPane.WARNING_MESSAGE  ); 
	        }
	    }
	    private void jButton_AboutActionPerformed(java.awt.event.ActionEvent evt) {
	
	    	javax.swing.JOptionPane.showMessageDialog(this,"Developer : SAMir SOLanki (SamSol)\n" +"    Subject : Operating Systems\n" +"   Contact : solanki.samir@gmail.com","About Developer",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
	    }
	
	    private void jButton_AddEditActionPerformed(java.awt.event.ActionEvent evt) {       
	        tmpint = (java.lang.Integer)jSpinner_RefField.getValue();        
	        if(tmpint.intValue()<0||tmpint.intValue()>99)
	        {         
	            msg="Reference field must be between 0 to 100.\nPlease re-enter reference field.";
	            javax.swing.JOptionPane.showMessageDialog(this,msg, "Warning",javax.swing.JOptionPane.WARNING_MESSAGE  ); 
	        }
	        else
	        {
	            refList.add(jSpinner_RefField.getValue());
	            jTextField_refField.setText(""+refList.size());
	            jList_RefField.setListData(refList);        
	        }
	    }
	
	    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {
	        javax.swing.JOptionPane.showMessageDialog(this,"Developer : SAMir SOLanki (SamSol)\n" +"    Subject : Operating Systems\n" +"   Contact : solanki.samir@gmail.com","About Developer",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
	        System.exit(0);
	    }
	
	    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {
	       if(!jList_RefField.isSelectionEmpty())
	        {
	            refId=jList_RefField.getSelectedIndex();
	            refList.remove(refId);
	            jTextField_refField.setText(""+refList.size());
	            jList_RefField.setListData(refList);            
	        }
	       jTextField_refField.setText(""+refList.size());
	    }
	 public void GetData()
	    {              
	        flg=false;
	        pfi=1;
	        phi=0;
	        ftable.row=row;
	        ftable.col=refList.size();
	        col=refList.size();
	        Pages = new Object[col][row];
	        ftable.data = new Object[row][col];
	        for(i=0;i<col;i++)
	        {
	            for(j=0;j<row-1;j++)
	            {
	                Pages[i][j]="-";
	            }                
	        }  
	        for(i=0;i<col;i++)
	        {
	            Pages[i][row-1]="PF";
	        }
	        Pages[0][0]=refList.get(0);
	        if(sAlgo.equals("FIFO"))
	        {
	            for(i=1;i<col;i++)
	            {               
	                flg=false;
	                for(k=0;k<i&&k<row-1&&!flg;k++)
	                {
	                    if(Pages[i-1][k].toString().equals(refList.get(i).toString()))
	                    {
	                        flg=true; 
	                        Pages[i][row-1]="PH";                   
	                    }                 
	                }
	                if(!flg)
	                {                        
	                    for(j=1;j<=i&&j<row-1;j++)
	                    {
	                        Pages[i][j]=Pages[i-1][j-1];
	                    }
	                    Pages[i][0]=refList.get(i); 
	                    pfi++;
	                } 
	                else
	                { 
	                    for(k=0;k<i&&k<row-1;k++)
	                    {
	                        Pages[i][k]=Pages[i-1][k];
	                    }
	                    phi++;
	                }            
	            }
	        }
	        else if(sAlgo.equals("LRU"))
	        {        
	            for(i=1;i<col;i++)
	            {
	                flg=false;
	                for(k=0;k<i&&k<row-1&&!flg;k++)
	                {
	                    if(Pages[i-1][k].toString().equals(refList.get(i).toString()))
	                    {
	                        flg=true; 
	                        tmp=k;
	                        Pages[i][row-1]="PH";                   
	                    }                 
	                }                            
	                if(!flg)
	                {                        
	                    for(j=1;j<=i&&j<row-1;j++)
	                    {
	                        Pages[i][j]=Pages[i-1][j-1];
	                    }
	                    Pages[i][0]=refList.get(i); 
	                    pfi++;
	                } 
	                else
	                { 
	                    Pages[i][0]=Pages[i-1][tmp];
	                    for(k=1;k<=tmp&&k<row-1;k++)
	                    {
	                        Pages[i][k]=Pages[i-1][k-1];
	                    }
	                    for(k=tmp+1;k<i&&k<row-1;k++)
	                    {
	                        Pages[i][k]=Pages[i-1][k];
	                    }
	                    phi++;
	                }          
	            }
	        }
	        for(i=0;i<col;i++)
	        {
	            for(j=0;j<row;j++)
	            {
	            }
	        }        
	        jTextField_PHits.setText(""+phi);
	        jTextField_PFaults.setText(""+pfi);        
	        ftable.resetModel();
	    }
	    public static void main(String args[]) {
	        try { 
	            javax.swing.UIManager.put("AuditoryCues.playList",UIManager.get("AuditoryCues.allAuditoryCues"));
	            javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
	           
	            javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);	            
	            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");				
	        } catch (Exception ex) {
	            System.out.println("Failed loading L&F: ");
	            System.out.println(ex);
	        }        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new FRAME().setVisible(true);
	            }
	        });
	    }
	    
    private javax.swing.JButton jButton_About;
    private javax.swing.JButton jButton_AddEdit;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_DeleteAll;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_Reverse;
    private javax.swing.JButton jButton_Set;
    private javax.swing.JButton jButton_Simulate;
    private javax.swing.JCheckBox jCheckBox_Autoresize;
    private javax.swing.JComboBox jComboBox_Algo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList_RefField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_PageTable;
    private javax.swing.JScrollPane jScrollPane_PageTable;
    private javax.swing.JScrollPane jScrollPane_RefField;
    private JSpinner jSpinner_PageFrame;
    private javax.swing.JSpinner jSpinner_RefField;
    private javax.swing.JTextField jTextField_PFaults;
    private javax.swing.JTextField jTextField_PHits;
    private javax.swing.JTextField jTextField_refField;
        
	}
