import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.net.*;



public class ChitChatApp extends javax.swing.JFrame 
{
    public static String cstatus = "Disconnected";
    static String person2 = "";
    public static String username = "";
    static int portnum = 0;
    static String  Ipaddress = "";
    public static ServerSocket ssc = null;
    public static Socket sc = null;
    public  static DataOutputStream out;
    public  static DataInputStream in;
    
    /**
     * Creates new form ChapAppJavaG
     */
    public ChitChatApp() {
        initComponents();
        seticon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChitChat V2.1 by Navdeep Mishra");
        setMaximumSize(new java.awt.Dimension(632, 417));
        setMinimumSize(new java.awt.Dimension(632, 417));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(632, 417));
        jPanel1.setMinimumSize(new java.awt.Dimension(632, 417));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 422));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 422));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 422));

        jRadioButton1.setText("Host");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Client");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 35, 35));
        jLabel3.setText("IP Address");

        jTextField1.setText("localhost");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(36, 35, 35));
        jLabel4.setText("Port Number");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 35, 35));
        jLabel5.setText("Your Name");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Connect");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Disconnect");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(36, 35, 35));
        jLabel6.setText("Not Chating with anyone");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 240, 420);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 150, 370, 100);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextArea2PropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(250, 310, 312, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 310, 57, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Reply Received");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 120, 200, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Your Messge");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 260, 109, 23);

        jLabel7.setText("Connection Status: Discoonnected");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 390, 390, 30);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("        Chit Chat - Lets Chat");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 0, 390, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setSelected(false);
        jTextField1.setEditable(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if (jRadioButton1.isSelected())                   //Connect funcitonality for the host.
        {
           new Thread(new Runnable()
           {
               public void run()
               {   
                   try
                    {
                        if(jTextField3.getText().isEmpty())
                        {
//                           
                           
                            throw new Exception("Name Field can't be empty");
                        }
                        if(jTextField2.getText().isEmpty())
                        {
                            throw new Exception("The Port Number Can't be Empty");
                        }
                        if(jTextField1.getText().isEmpty())
                        {
                            throw new Exception("IpAddress field can't be Emptj");
                            
                        }
                        username = jTextField3.getText();
                        portnum = Integer.parseInt(jTextField2.getText());
//                       
                        Ipaddress = jTextField1.getText();
                        ssc = new ServerSocket(portnum);
                       
                        sc = ssc.accept();
                        cstatus = "Connected";
                        
                        out = new DataOutputStream(sc.getOutputStream());
                        out.writeUTF(username);
                        in = new DataInputStream(sc.getInputStream());
                        person2 = in.readUTF();
                        statusVerifier(true);

//                      
                        new Thread(new Runnable()
                        {
                            public void run()
                            {  try
                                {
                                while(true)
                                
                                    {   
                                        String msgg;
                                         msgg=in.readUTF();
                                         
                                         jTextArea1.setEditable(true);
                                        
                                         jTextArea1.append(person2+": "+msgg+"\n");
                                         jTextArea1.setEditable(false);
                                    }
                                }
                                catch(SocketException ee)
                                {
                                    JFrame jf = new JFrame("Message");
                                    JOptionPane.showMessageDialog(jf,"You've Ended the Chat");
                                }
                                catch(EOFException ee)
                                {
                                    JFrame jf = new JFrame("Message");
                                    JOptionPane.showMessageDialog(jf,person2+" Has Ended the Chat");
                                    cstatus = "Disconnected";
                                    statusVerifier(false);
                                }
                                catch(Exception ee)
                                    {
                                             JFrame jf = new JFrame("Message");
                                             JOptionPane.showMessageDialog(jf,ee);
//                                           
                                    }
                            }
                            
                        }).start();

                        
                    }
                   catch(SocketException se)
                   {
                       statusVerifier(false);
                       JFrame jf = new JFrame("Error Occurred");
                       JOptionPane.showMessageDialog(jf,se);
//                       se.printStackTrace();
                                          
                   }
                    
                   catch(Exception e)
                   {
                       JFrame jf = new JFrame("Error Occurred");
                       JOptionPane.showMessageDialog(jf,e);
//                       e.printStackTrace();
                       
                       
                   }
                   
               }
           }).start();
        }
        if (jRadioButton2.isSelected())          //connect functionality for the client
        {
            new Thread(new Runnable()
           {
               public void run()
               {   
                   try
                    {
                        if(jTextField3.getText().isEmpty())
                        {
                            
                            throw new Exception("Name Field can't be empty");
                        }
                        if(jTextField2.getText().isEmpty())
                        {
                            throw new Exception("The Port Number Can't be Empty");
                        }
                        if(jTextField1.getText().isEmpty())
                        {
                            throw new Exception("IpAddress field can't be Emptj");
                            
                        }
                        Ipaddress = jTextField1.getText();
                        portnum = Integer.parseInt(jTextField2.getText());
                        sc = new Socket(Ipaddress,portnum);
                        
                        cstatus = "Connected";
                        username = jTextField3.getText();
//                       
                        
                        in = new DataInputStream(sc.getInputStream());
                        person2 = in.readUTF();
                        out = new DataOutputStream(sc.getOutputStream());
                        out.writeUTF(username);
                        statusVerifier(true);
//                     
                        String msgg;                      
//                 
                        new Thread(new Runnable()
                        {
                            public void run()
                            {  try
                                {
                                while(true)
                                
                                    {   
                                        String msgg;
                                         msgg=in.readUTF();
                                         jTextArea1.setEditable(true);
//                                        
                                         jTextArea1.append(person2+": "+msgg+"\n");
                                         jTextArea1.setEditable(false);
                                    }
                                }
                                catch(EOFException ee)
                                {
                                    JFrame jf = new JFrame("Message");
                                    JOptionPane.showMessageDialog(jf,person2+" Has Ended the Chat");
//                                    ee.printStackTrace();
                                    cstatus="Disconnected";
                                    statusVerifier(false);
                                }
                                 catch(SocketException se)
                                    {
                                        statusVerifier(false);
                                        JFrame jf = new JFrame("Error Occurred");
                                        JOptionPane.showMessageDialog(jf,"You have Ended the Chat");
//                                        se.printStackTrace();

                                    }
                                catch(Exception ee)
                                    {
                                             JFrame jf = new JFrame("Message");
                                             JOptionPane.showMessageDialog(jf,ee);
//                                             ee.printStackTrace();
                                    }
                            }
                            
                        }).start();
                      
                    }
                   
                   catch(SocketException se)
                   {
                       statusVerifier(false);
                      
                      
                       JFrame jf = new JFrame("Error Occurred");
                       JOptionPane.showMessageDialog(jf,se);
//                       se.printStackTrace();
                                          
                   }
                  
                   catch(Exception ee)
                    {
                        JFrame jf  = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,ee);
//                        ee.printStackTrace();

                    }
                   
               }
           }).start();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
            new Thread(new Runnable()       //sends the message
            {
                public void run()
                {
//                  
                    
                    try
                    {
                        if(cstatus == "Connected")
                        {     
                            
                            out = new DataOutputStream(sc.getOutputStream());
                            String msg = jTextArea2.getText();
                            if(msg.isEmpty())
                            {
//                              
                            }
                            else
                            {
                                jTextArea2.setText("");
                                jTextArea1.append(username+": "+msg+"\n");
                                out.writeUTF(msg);
                            }
                            
                        }
                    }
                    
                    
                     catch(EOFException ee)
                    {
                        JFrame jf = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,"Eof errrorr......................");
//                        ee.printStackTrace();
                    }
                    catch(Exception ee)
                    {
                        JFrame jf  = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,ee);
                        ee.printStackTrace();

                    }
                }
            
            }).start();
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jRadioButton2.setSelected(false);
        jTextField1.setEditable(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        if(jRadioButton1.isSelected())                      //Disconnect Function if host option selected
        {
            new Thread(new Runnable()
            {
                public void run()
                {
                    try
                    {
                        
                        ssc.close();
                        sc.close();
                        
                        cstatus = "Disconnected";
                        statusVerifier(false);                       
                        
                    }
                    catch(EOFException ee)
                    {
                        JFrame jf = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,"Eof errrorr in disconnect button");

                    }
                    catch(Exception ee)
                    {
                        JFrame jf = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,"server Disconnected button");
//                       ee.printStackTrace();
                    }
                    
                }
            }).start();
        }
      
        if(jRadioButton2.isSelected())                     //Disconnect Function if client option selected
        {
            new Thread(new Runnable()
            {
                public void run()
                {
                    try
                    {
                       
                        sc.close();
                        cstatus = "Disconnected";
                        
                        statusVerifier(false);
                      
                        
                    }
                    catch(EOFException ee)
                    {
                        JFrame jf = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,"Eof errrorr in disconnect button");
//                        ee.printStackTrace();
                    }
                    catch(Exception ee)
                    {
                        JFrame jf = new JFrame("Message");
                        JOptionPane.showMessageDialog(jf,"client Disconnected button");
//                        ee.printStackTrace();
                        
                    }
                    
                }
            }).start();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextArea2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextArea2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2PropertyChange
void statusVerifier(boolean status1)                        //One of the most important funciton which verifies the status that the application 
{                                                           //connected or disconnected and perform the some gui operations.
    if(status1==false && cstatus=="Disconnected")
    {
       try
       {
           if(jRadioButton1.isSelected())
           {
            jButton4.setEnabled(false);
            jButton3.setEnabled(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
            jTextField1.setEditable(true);
            jTextField2.setEditable(true);
            jTextField3.setEditable(true);
            jLabel6.setText(cstatus);
            jLabel7.setText("Connection Status: "+cstatus);
            jLabel6.setText("Disconnected");
            jButton2.setEnabled(false);
            jTextField2.setEditable(true);
            jTextArea1.setEditable(false);
            ssc.close();
            sc.close();
           }
           if(jRadioButton2.isSelected())
           {
               jButton4.setEnabled(false);
            jButton3.setEnabled(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
            jTextField1.setEditable(true);
            jTextField2.setEditable(true);
            jTextField3.setEditable(true);
            jLabel6.setText(cstatus);
            jLabel7.setText("Connection Status: "+cstatus);
            jLabel6.setText("Disconnected");
            jButton2.setEnabled(false);
            jTextField2.setEditable(true);
            jTextArea1.setEditable(false);
            
            sc.close();
           }
        }
        catch (Exception ee)
        {
            JFrame jf = new JFrame("Error");
            JOptionPane.showMessageDialog(jf,ee);
            ee.printStackTrace();
        }
        
        
        
    }
    else if(status1==true && cstatus=="Connected")
            {
                jButton2.setEnabled(true);
                jTextArea1.setText("");
                jTextArea2.setText("");  
                jButton4.setEnabled(true);
                jButton3.setEnabled(false);
                jRadioButton1.setEnabled(false);
                jRadioButton2.setEnabled(false);
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jLabel6.setText("Connected to: "+person2);
                
                jLabel7.setText("Connection Status: "+cstatus);
                jTextField2.setEditable(false);
            }
    
}
void firsttimestatusverifier(boolean status2)           //This function disables some option when the gui is started. So that user can start the 
{                                                       // application without encountering any bug.
    if(status2 == false && cstatus=="Disconnected")
    {
        try
        {
            jButton4.setEnabled(false);
            jButton3.setEnabled(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
            jTextField1.setEditable(true);
            jTextField2.setEditable(true);
            jTextField3.setEditable(true);
            jLabel6.setText(cstatus);
            jLabel7.setText("Connection Status: "+cstatus);
            jLabel6.setText("Disconnected");
            jButton2.setEnabled(false);
            jTextField2.setEditable(true);
            jTextArea1.setEditable(false);  
        
        }
        catch (Exception ee)
        {
            JFrame jf = new JFrame("Error");
            JOptionPane.showMessageDialog(jf,ee);
            ee.printStackTrace();
        }
    }
}
void seticon()
{
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png"))); //for setting icon
}

    
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
            java.util.logging.Logger.getLogger(ChitChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChitChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChitChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChitChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              ChitChatApp root = new ChitChatApp();  //initializing the main gui
              root.setVisible(true);                   //making it visible
              root.firsttimestatusverifier(false);    // verify the status of the app for the first time.

              
              
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

/*
Created and Managed by Navdeep Mishra
*/