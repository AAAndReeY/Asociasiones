/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.pantallas;

/**
 *
 * @author Personal
 */
public class PantallaEstudiantes extends javax.swing.JPanel {

    /**
     * Creates new form PantallaEstudiantes
     */
    public PantallaEstudiantes() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarEstudi = new javax.swing.JTextField();
        btnBuscarEstudiante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEstudiante = new javax.swing.JList<>();
        btnSalirEstudiante = new javax.swing.JButton();
        btnAgregarEstudiante = new javax.swing.JButton();
        btnEliminarEstudiantes = new javax.swing.JButton();

        jLabel2.setText("Estudiantes de: [ ] ");

        txtBuscarEstudi.setText("jTextField1");

        btnBuscarEstudiante.setBackground(new java.awt.Color(51, 153, 0));
        btnBuscarEstudiante.setLabel("Buscar");
        btnBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudianteActionPerformed(evt);
            }
        });

        listEstudiante.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listEstudiante);

        btnSalirEstudiante.setBackground(new java.awt.Color(255, 255, 51));
        btnSalirEstudiante.setLabel("Salir");

        btnAgregarEstudiante.setBackground(new java.awt.Color(0, 0, 204));
        btnAgregarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEstudiante.setLabel("Agregar");

        btnEliminarEstudiantes.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarEstudiantes.setLabel("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarEstudi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarEstudiante))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalirEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnAgregarEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarEstudiantes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarEstudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEstudiante))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirEstudiante)
                    .addComponent(btnAgregarEstudiante)
                    .addComponent(btnEliminarEstudiantes))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnBuscarEstudiante.getAccessibleContext().setAccessibleName("Buscar");
        btnBuscarEstudiante.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JButton btnEliminarEstudiantes;
    private javax.swing.JButton btnSalirEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listEstudiante;
    private javax.swing.JTextField txtBuscarEstudi;
    // End of variables declaration//GEN-END:variables
}