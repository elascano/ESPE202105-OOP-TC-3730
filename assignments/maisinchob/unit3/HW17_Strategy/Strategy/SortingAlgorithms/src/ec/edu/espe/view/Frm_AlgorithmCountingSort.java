/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Frm_AlgorithmCountingSort extends javax.swing.JFrame {

    ArrayList<Integer>lista= new ArrayList<>();
    int items = 0;
    int lt[]; 
    /**
     * Creates new form AlgorithmCountingSort
     */
    public Frm_AlgorithmCountingSort() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaNum = new javax.swing.JTextArea();
        txtNum = new javax.swing.JTextField();
        rbInsertionSort = new javax.swing.JRadioButton();
        rdnQuickSort = new javax.swing.JRadioButton();
        rdnCountingSort = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btn_Limpiar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AlgorithmCountingSort");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txaNum.setColumns(20);
        txaNum.setRows(5);
        jScrollPane2.setViewportView(txaNum);

        rbInsertionSort.setText("InsertionSort");
        rbInsertionSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbInsertionSortMouseClicked(evt);
            }
        });

        rdnQuickSort.setText("QuickSort");
        rdnQuickSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdnQuickSortMouseClicked(evt);
            }
        });

        rdnCountingSort.setText("CountingSort");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdnQuickSort)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbInsertionSort)
                                .addComponent(rdnCountingSort, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbInsertionSort)
                        .addGap(18, 18, 18)
                        .addComponent(rdnQuickSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdnCountingSort)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_Limpiar)
                .addGap(70, 70, 70)
                .addComponent(btn_Agregar)
                .addContainerGap(563, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Limpiar)
                    .addComponent(btn_Agregar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
       
        
        
        if(!txtNum.getText().equals("")){
        lista.add(Integer.parseInt(txtNum.getText().toString()));
        txtNum.setText("");
        txtNum.requestFocus();
        view();
        }else{
            JOptionPane.showMessageDialog(null, "Inser number ");
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // TODO add your handling code here:
        
        
        lista.clear();
        txtNum.setText("");
        txaNum.setText("");
        items = 0;
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void rbInsertionSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbInsertionSortMouseClicked
        
        if(!txaNum.getText().equals("")){
        items=0;
        txaNum.setText("");
        InsertionSort();
        }else{
            JOptionPane.showMessageDialog(null, "Inser Numbers");
        } 
        
    }//GEN-LAST:event_rbInsertionSortMouseClicked

    private void rdnQuickSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdnQuickSortMouseClicked
         if(!txaNum.getText().equals("")){
        items=0;
        txaNum.setText("");
        QuickSort();
        }else{
            JOptionPane.showMessageDialog(null, "Inser Numbers");
        } 
    }//GEN-LAST:event_rdnQuickSortMouseClicked

    
    
    public void view(){
        txaNum.setText("");
        String list = "";
        for(int i=0;i<lista.size();i++){
            list+=lista.get(i)+"\n";
        }
        txaNum.setText(list);
    }
    
    public int[] transform(){
        Object numbers[] = new Object[lista.size()];
        numbers=lista.toArray();
        int n[]=new int[lista.size()];
        for (int i=0; i<lista.size();i++){
            n[i]=Integer.parseInt(numbers[i].toString());
        }
        return n;
    }
    public void InsertionSort(){
     int cont=0,d=0;
     lt=transform();
     PrintList();
     for(int i=0;i<lt.length-1;i++){
         int min=1;
         for(int j=i+1; j<lt.length;j++){
            if(lt[j]<lt[min]){
             min=j;
             cont=cont+1;
             PrintList();
         }
     }
         PrintList();
    int aux=lt[i];
    lt[i]=lt[min];
    lt[min]=aux;
    d=cont;
     }
     
    
    }
    
     public void Insertion(){
         int cont=0,d=0,dat;
         lt=transform();
         PrintList();
         for(int j=1;j<lt.length;j++){
             dat=lt[j];
             int i= j-1;
             while(i>=0 && lt[i]>dat){
                 lt[i+1]=lt[1];
                 i--;
                 cont=cont+1;
                 PrintList();
             }
             lt[i+1]=dat;
             d=cont;
             PrintList();
         }
     }
     
    
     public void QuickSort(){
         lt=transform();
         for(int c=1;c<lt.length-1;c++){
             PrintList();
             QuickSort(lt, 0, lt.length-1);
         }
     }
     
     
     
     
     public void QuickSort(int[] vector, int p,int u){
    int i=p, j=u;
    int pivote=vector[(p+u)/2];
    int aux;
    do{
        while(vector[i]<pivote)i++;
        while(vector[i]>pivote)i++;
        if(i<=j){
            aux=vector[j];
            vector[j]=vector[i];
            vector[i]=aux;
            i++;
            j--;
        }
        }while(i<=j);
        if(p<j) QuickSort(vector,p,j);
        if(u<i) QuickSort(vector,i,u); 
     }
    

             
             
    public void PrintList(){
        items ++;
        String  r=items+"->";
        for(int f=0;f<lt.length;f++){
            r=r+lt[f]+"-";
        }
        txaNum.append(r+"\n");
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
            java.util.logging.Logger.getLogger(Frm_AlgorithmCountingSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_AlgorithmCountingSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_AlgorithmCountingSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_AlgorithmCountingSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_AlgorithmCountingSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rbInsertionSort;
    private javax.swing.JRadioButton rdnCountingSort;
    private javax.swing.JRadioButton rdnQuickSort;
    private javax.swing.JTextArea txaNum;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
