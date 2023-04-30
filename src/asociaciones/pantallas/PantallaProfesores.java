/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.pantallas;

import asociaciones.entidades.Curso;
import asociaciones.entidades.EditaProfesor;
import asociaciones.entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class PantallaProfesores extends javax.swing.JFrame {
    
    private Curso curso;

    /**
     * Creates new form PantallaProfesores
     */
    public PantallaProfesores(Curso curso) {
        initComponents();
        this.curso = curso;
    }

    PantallaProfesores(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PantallaProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PantallaProfesores(EditaProfesor Editprof) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Profesor> buscar(String criterio) {
        return new ArrayList<>();
    }
    
    public void agregar(Profesor profesor) {
        Profesor[] profesores = curso.getProfesores();
        int tamaño = profesores.length;
        for (int i = 0; i < tamaño; i++) {
            if(profesores[i]!=null && 
                    !profesores[i].getNombre().isEmpty()){
                profesores[i]= profesor;
                return;
            }
            
            if(profesores[i]==null){
                profesores[i]=profesor;
                return;
            }
        }
    }
    
    public void eliminar(Profesor profesor) {
        //TODO:implementar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarProfe = new javax.swing.JButton();
        btnCancelarProfe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProfes = new javax.swing.JList<>();
        btnSalirProfe = new javax.swing.JButton();
        txtBuscarProfe = new javax.swing.JTextField();
        btnBuscarProfe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarProfe.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarProfe.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProfe.setText("Agregar");
        btnAgregarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfeActionPerformed(evt);
            }
        });

        btnCancelarProfe.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarProfe.setText("Cancelar");
        btnCancelarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProfeActionPerformed(evt);
            }
        });

        listProfes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listProfes);

        btnSalirProfe.setBackground(new java.awt.Color(255, 255, 51));
        btnSalirProfe.setText("Salir");
        btnSalirProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProfeActionPerformed(evt);
            }
        });

        txtBuscarProfe.setText("jTextField1");

        btnBuscarProfe.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscarProfe.setText("Buscar");

        jLabel1.setText("Profesores de: [ ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalirProfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarProfe)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProfe))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 53, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProfe))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProfe)
                    .addComponent(btnCancelarProfe)
                    .addComponent(btnSalirProfe))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfeActionPerformed
        
        Profesor profesor = new Profesor();
        PantallaEditarProfesor pantallaEditProfe = new PantallaEditarProfesor(profesor);
        pantallaEditProfe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAgregarProfeActionPerformed

    private void btnCancelarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarProfeActionPerformed

    private void btnSalirProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirProfeActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Curso curso = new Curso("",0,"");
                new PantallaProfesores(curso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProfe;
    private javax.swing.JButton btnBuscarProfe;
    private javax.swing.JButton btnCancelarProfe;
    private javax.swing.JButton btnSalirProfe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listProfes;
    private javax.swing.JTextField txtBuscarProfe;
    // End of variables declaration//GEN-END:variables
}