/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato.views;

/**
 *
 * @author Sergop
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemReporteJugador = new javax.swing.JMenuItem();
        itemReporteEquipo = new javax.swing.JMenuItem();
        itemListadoEquipos = new javax.swing.JMenuItem();
        itemReporteIntegrantesEquipos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemTablaPosiciones = new javax.swing.JMenuItem();
        itemTablaGoleadores = new javax.swing.JMenuItem();
        itemTablaMenosVencida = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemResultadoEncuentro = new javax.swing.JMenuItem();
        itemEquipoPuntos = new javax.swing.JMenuItem();
        itemPromedioPuntos = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuOpciones.setText("Opciones");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menuOpciones.add(Salir);

        jMenuBar1.add(menuOpciones);
        menuOpciones.getAccessibleContext().setAccessibleDescription("");

        menuReportes.setText("Reportes");

        itemReporteJugador.setText("A. Información de un jugador");
        itemReporteJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteJugadorActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteJugador);

        itemReporteEquipo.setText("B. Información de un equipo");
        itemReporteEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteEquipoActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteEquipo);

        itemListadoEquipos.setText("C. Lista de equipos participantes");
        itemListadoEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListadoEquiposActionPerformed(evt);
            }
        });
        menuReportes.add(itemListadoEquipos);

        itemReporteIntegrantesEquipos.setText("D. Integrantes de cada equipo");
        itemReporteIntegrantesEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteIntegrantesEquiposActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteIntegrantesEquipos);
        menuReportes.add(jSeparator1);

        itemTablaPosiciones.setText("E. Tabla general de posiciones");
        itemTablaPosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTablaPosicionesActionPerformed(evt);
            }
        });
        menuReportes.add(itemTablaPosiciones);

        itemTablaGoleadores.setText("F. Tabla de goleadores");
        menuReportes.add(itemTablaGoleadores);

        itemTablaMenosVencida.setText("G. Tabla de valla menos vencida");
        menuReportes.add(itemTablaMenosVencida);
        menuReportes.add(jSeparator2);

        itemResultadoEncuentro.setText("H. Resultado específico de un encuentro");
        menuReportes.add(itemResultadoEncuentro);

        itemEquipoPuntos.setText("I. Cuál es el equipo con mayor cantidad de puntos");
        itemEquipoPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEquipoPuntosActionPerformed(evt);
            }
        });
        menuReportes.add(itemEquipoPuntos);

        itemPromedioPuntos.setText("J. Promedio de puntos por equipo del torneo.");
        itemPromedioPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPromedioPuntosActionPerformed(evt);
            }
        });
        menuReportes.add(itemPromedioPuntos);

        jMenuBar1.add(menuReportes);

        menuAcercaDe.setText("Acerca de");
        jMenuBar1.add(menuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void itemReporteJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteJugadorActionPerformed
        // TODO add your handling code here:
        GUIReporteJugador gui = new GUIReporteJugador();
        gui.setDefaultCloseOperation(HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_itemReporteJugadorActionPerformed

    private void itemReporteEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteEquipoActionPerformed
        // TODO add your handling code here:
        GUIEquipo gui = new GUIEquipo();
        gui.setDefaultCloseOperation(HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_itemReporteEquipoActionPerformed

    private void itemListadoEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListadoEquiposActionPerformed
        // TODO add your handling code here:
        GUIListaEquipos gui = new GUIListaEquipos();
        gui.setDefaultCloseOperation(HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_itemListadoEquiposActionPerformed

    private void itemEquipoPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEquipoPuntosActionPerformed
        // TODO add your handling code here:
        GUIEquipoMayorPuntaje gui = new GUIEquipoMayorPuntaje();
        gui.setDefaultCloseOperation(HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_itemEquipoPuntosActionPerformed

    private void itemReporteIntegrantesEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteIntegrantesEquiposActionPerformed
        // TODO add your handling code here:
        GUIIntegrantesEquipo gui = new GUIIntegrantesEquipo();
        gui.setDefaultCloseOperation(HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_itemReporteIntegrantesEquiposActionPerformed

    private void itemTablaPosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTablaPosicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTablaPosicionesActionPerformed

    private void itemPromedioPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPromedioPuntosActionPerformed
        // TODO add your handling code here:
        GUIPromedioPuntos gui = new GUIPromedioPuntos();
        gui.setDefaultCloseOperation(HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_itemPromedioPuntosActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem itemEquipoPuntos;
    private javax.swing.JMenuItem itemListadoEquipos;
    private javax.swing.JMenuItem itemPromedioPuntos;
    private javax.swing.JMenuItem itemReporteEquipo;
    private javax.swing.JMenuItem itemReporteIntegrantesEquipos;
    private javax.swing.JMenuItem itemReporteJugador;
    private javax.swing.JMenuItem itemResultadoEncuentro;
    private javax.swing.JMenuItem itemTablaGoleadores;
    private javax.swing.JMenuItem itemTablaMenosVencida;
    private javax.swing.JMenuItem itemTablaPosiciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenu menuReportes;
    // End of variables declaration//GEN-END:variables
}
