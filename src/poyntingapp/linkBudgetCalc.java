/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyntingapp;

/**
 *
 * @author Vernon Shaw
 */
public class linkBudgetCalc extends javax.swing.JFrame {

    /**
     * Creates new form linkBudgetCalc
     */
    public linkBudgetCalc() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mfButtonGroup = new javax.swing.ButtonGroup();
        linkBudgetPanel = new javax.swing.JPanel();
        freeSpaceLossLbl = new javax.swing.JLabel();
        distanceInputLbl = new javax.swing.JLabel();
        unitsSelectLbl = new javax.swing.JLabel();
        mButton = new javax.swing.JRadioButton();
        fButton = new javax.swing.JRadioButton();
        distanceInputTxt = new javax.swing.JTextField();
        freqSelectLbl = new javax.swing.JLabel();
        freqInputTxt = new javax.swing.JTextField();
        MHzLbl = new javax.swing.JLabel();
        freeSpaceLossResultLbl = new javax.swing.JLabel();
        freeSpaceLossResultTxt = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Link Budget Calculator");

        freeSpaceLossLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        freeSpaceLossLbl.setText("Free Space Loss Calculation:");

        distanceInputLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        distanceInputLbl.setText("Please input distance:");

        unitsSelectLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        unitsSelectLbl.setText("Please Choose Units of Length:");

        mfButtonGroup.add(mButton);
        mButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mButton.setText("Meters");

        mfButtonGroup.add(fButton);
        fButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fButton.setText("Feet");

        distanceInputTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        freqSelectLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        freqSelectLbl.setText("Please Input Frequency:");

        freqInputTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MHzLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MHzLbl.setText("MHz");

        freeSpaceLossResultLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        freeSpaceLossResultLbl.setText("Free Space Loss    = ");

        freeSpaceLossResultTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout linkBudgetPanelLayout = new javax.swing.GroupLayout(linkBudgetPanel);
        linkBudgetPanel.setLayout(linkBudgetPanelLayout);
        linkBudgetPanelLayout.setHorizontalGroup(
            linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linkBudgetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(freeSpaceLossLbl)
                    .addGroup(linkBudgetPanelLayout.createSequentialGroup()
                        .addComponent(unitsSelectLbl)
                        .addGap(18, 18, 18)
                        .addComponent(mButton)
                        .addGap(18, 18, 18)
                        .addComponent(fButton))
                    .addGroup(linkBudgetPanelLayout.createSequentialGroup()
                        .addComponent(freqSelectLbl)
                        .addGap(18, 18, 18)
                        .addComponent(freqInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MHzLbl))
                    .addGroup(linkBudgetPanelLayout.createSequentialGroup()
                        .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(freeSpaceLossResultLbl)
                            .addComponent(distanceInputLbl))
                        .addGap(18, 18, 18)
                        .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(distanceInputTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(freeSpaceLossResultTxt))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        linkBudgetPanelLayout.setVerticalGroup(
            linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linkBudgetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(freeSpaceLossLbl)
                .addGap(18, 18, 18)
                .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freqSelectLbl)
                    .addComponent(freqInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MHzLbl))
                .addGap(18, 18, 18)
                .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitsSelectLbl)
                    .addComponent(mButton)
                    .addComponent(fButton))
                .addGap(18, 18, 18)
                .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanceInputLbl)
                    .addComponent(distanceInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(linkBudgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freeSpaceLossResultLbl)
                    .addComponent(freeSpaceLossResultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(linkBudgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(linkBudgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(linkBudgetCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(linkBudgetCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(linkBudgetCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(linkBudgetCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new linkBudgetCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MHzLbl;
    private javax.swing.JLabel distanceInputLbl;
    private javax.swing.JTextField distanceInputTxt;
    private javax.swing.JRadioButton fButton;
    private javax.swing.JLabel freeSpaceLossLbl;
    private javax.swing.JLabel freeSpaceLossResultLbl;
    private javax.swing.JTextField freeSpaceLossResultTxt;
    private javax.swing.JTextField freqInputTxt;
    private javax.swing.JLabel freqSelectLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel linkBudgetPanel;
    private javax.swing.JRadioButton mButton;
    private javax.swing.ButtonGroup mfButtonGroup;
    private javax.swing.JLabel unitsSelectLbl;
    // End of variables declaration//GEN-END:variables
}
