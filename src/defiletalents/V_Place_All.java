package defiletalents;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.table.DefaultTableModel;
import methodesVerif.Verify;

/**
 * Classe permettant de gérer la vue relative à la table tal_place.
 *
 * @author giraudeaup
 */
public class V_Place_All extends javax.swing.JFrame {

    /**
     * Controleur de l'appli.
     */
    private Controller controller;
    /**
     * Boolean pour savoir si le mode recherche est activé.
     */
    private boolean recherche = false;
    /**
     * Résultats de la recherche s'il y'en a.
     */
    private CopyOnWriteArrayList<M_Place> results;

    /**
     * Constructeur de la vue.
     *
     * @param controller
     */
    public V_Place_All(Controller controller) {
        this.controller = controller;
        initComponents();
        setTitle("Paramètres > Gestion des places");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btDel = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlace = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));

        btDel.setText("Supprimer...");
        btDel.setMaximumSize(new java.awt.Dimension(160, 160));
        btDel.setMinimumSize(new java.awt.Dimension(160, 160));
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btClose.setText("Fermer");
        btClose.setMaximumSize(new java.awt.Dimension(160, 160));
        btClose.setMinimumSize(new java.awt.Dimension(160, 160));
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        tablePlace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Code", "Coordonées x,y", "Plan", "Disponibilité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePlace.setMaximumSize(new java.awt.Dimension(480, 18));
        tablePlace.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablePlace);
        if (tablePlace.getColumnModel().getColumnCount() > 0) {
            tablePlace.getColumnModel().getColumn(0).setMinWidth(0);
            tablePlace.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablePlace.getColumnModel().getColumn(0).setMaxWidth(0);
            tablePlace.getColumnModel().getColumn(1).setMinWidth(80);
            tablePlace.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablePlace.getColumnModel().getColumn(1).setMaxWidth(80);
            tablePlace.getColumnModel().getColumn(3).setMinWidth(130);
            tablePlace.getColumnModel().getColumn(3).setPreferredWidth(130);
            tablePlace.getColumnModel().getColumn(3).setMaxWidth(130);
            tablePlace.getColumnModel().getColumn(4).setMinWidth(100);
            tablePlace.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablePlace.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        btAdd.setText("Ajouter...");
        btAdd.setMaximumSize(new java.awt.Dimension(160, 160));
        btAdd.setMinimumSize(new java.awt.Dimension(160, 160));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setText("Modifier...");
        btEdit.setMaximumSize(new java.awt.Dimension(160, 160));
        btEdit.setMinimumSize(new java.awt.Dimension(160, 160));
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                .addContainerGap())
        );

        setBounds(0, 0, 650, 510);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Supprimer'.
     *
     * @param evt
     */
    private void btDelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btDelActionPerformed
    {//GEN-HEADEREND:event_btDelActionPerformed
        if (tablePlace.getSelectedRow() != -1) {
            controller.getDeleteConfirmFrame("place", String.valueOf((int) tablePlace.getValueAt(tablePlace.getSelectedRow(), 0))).setVisible(true);
        }
    }//GEN-LAST:event_btDelActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Fermer'.
     *
     * @param evt
     */
    private void btCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCloseActionPerformed
    {//GEN-HEADEREND:event_btCloseActionPerformed
        if (recherche) recherche = false;
        setVisible(false);
    }//GEN-LAST:event_btCloseActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Ajouter'.
     *
     * @param evt
     */
    private void btAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btAddActionPerformed
    {//GEN-HEADEREND:event_btAddActionPerformed
        controller.getPlaceEditFrame(V_Main.MODE_AJOUT).setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Modifier'.
     *
     * @param evt
     */
    private void btEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btEditActionPerformed
    {//GEN-HEADEREND:event_btEditActionPerformed
        if (tablePlace.getSelectedRow() != -1) {
            controller.getPlaceEditFrame((int) tablePlace.getValueAt(tablePlace.getSelectedRow(), 0), V_Main.MODE_EDITION).setVisible(true);
        }
    }//GEN-LAST:event_btEditActionPerformed

    /**
     * Surcharge de la méthode setVisible(boolean b).
     *
     * @param b
     */
    @Override
    public void setVisible(boolean b) {
        if (b) {
            setLocationRelativeTo(controller.getMainFrame());
            setTable();
        }
        super.setVisible(b);
    }

    /**
     * Met à jour le tableau utilisé par la vue.
     */
    private void setTable() {
        CopyOnWriteArrayList<M_Place> places = (recherche ? Verify.trierPlaces(results) : Verify.trierPlaces(controller.getPlaces()));
        DefaultTableModel model = (DefaultTableModel) tablePlace.getModel();
        int size = places.size();
        int i = 0;
        model.setRowCount(size);

        for (M_Place p : places) {
            model.setValueAt(p.getId(), i, 0);
            model.setValueAt(p.getCode(), i, 1);
            model.setValueAt("[" + p.getXplan() + "," + p.getYplan() + "]", i, 2);
            model.setValueAt(controller.getPlan(p.getId_Plan()).getLibelle(), i, 3);
            model.setValueAt(p.getDisponible() ? "Disponible" : "Non Disponible", i, 4);
            i++;
        }
        tablePlace.setModel(model);
    }

    /**
     * Passe la fenêtre en mode recherche. Valorise la collection concernant les
     * résultats de la recherche.
     *
     * @param recherche
     * @param results
     */
    public void rechercheMode(boolean recherche, CopyOnWriteArrayList<M_Place> results) {
        this.recherche = recherche;
        this.results = results;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePlace;
    // End of variables declaration//GEN-END:variables
}
