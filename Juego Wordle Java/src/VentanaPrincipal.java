
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    private int numeroIntentos = 6;

    private String rutaEntrada = "archivo_lectura.txt";

    private int longitudPalabra = 5;

    public VentanaPrincipal() {
        initComponents();

        setLocationRelativeTo(null);//Ventana abre en el centro de la pantalla

        b_empezar.requestFocusInWindow();//Boton preseleccionado al abrir la ventana

        actualizarIntentos(this.numeroIntentos);

        actualizarLongitud(this.longitudPalabra);

        actualizarRutaEntrada(this.rutaEntrada);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_intentos = new javax.swing.ButtonGroup();
        bg_longitud = new javax.swing.ButtonGroup();
        b_empezar = new javax.swing.JButton();
        l_bienvenida = new javax.swing.JLabel();
        tf_nombrePlayer = new javax.swing.JTextField();
        p_resumen = new javax.swing.JPanel();
        l_resumenConfi = new javax.swing.JLabel();
        l_resumenLongitud = new javax.swing.JLabel();
        l_resumenIntentos = new javax.swing.JLabel();
        l_resumenRutaEntrada = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        m_escogerEntrada = new javax.swing.JMenuItem();
        m_configuracion = new javax.swing.JMenu();
        m_numeroIntentos = new javax.swing.JMenu();
        rb_3intentos = new javax.swing.JRadioButtonMenuItem();
        rb_4intentos = new javax.swing.JRadioButtonMenuItem();
        rb_5intentos = new javax.swing.JRadioButtonMenuItem();
        rb_6intentos = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        m_longitudPalabra = new javax.swing.JMenu();
        rb_3letras = new javax.swing.JRadioButtonMenuItem();
        rb_4letras = new javax.swing.JRadioButtonMenuItem();
        rb_5letras = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        b_empezar.setBackground(new java.awt.Color(255, 102, 51));
        b_empezar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_empezar.setForeground(new java.awt.Color(204, 255, 255));
        b_empezar.setText("COMENZAR JUEGO");
        b_empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_empezarActionPerformed(evt);
            }
        });

        l_bienvenida.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        l_bienvenida.setForeground(new java.awt.Color(51, 51, 255));
        l_bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_bienvenida.setText("Beinvenido a WORDLE");

        tf_nombrePlayer.setBackground(new java.awt.Color(255, 255, 255));
        tf_nombrePlayer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_nombrePlayer.setForeground(new java.awt.Color(0, 0, 0));
        tf_nombrePlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_nombrePlayer.setText("Nombre de jugador/a...");
        tf_nombrePlayer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_nombrePlayerFocusGained(evt);
            }
        });
        tf_nombrePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombrePlayerActionPerformed(evt);
            }
        });

        p_resumen.setLayout(new java.awt.GridLayout(4, 1));

        l_resumenConfi.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        l_resumenConfi.setForeground(new java.awt.Color(0, 51, 102));
        l_resumenConfi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_resumenConfi.setText("El juego comenzará con esta configuración:");
        l_resumenConfi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p_resumen.add(l_resumenConfi);

        l_resumenLongitud.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        l_resumenLongitud.setForeground(new java.awt.Color(0, 51, 102));
        l_resumenLongitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p_resumen.add(l_resumenLongitud);

        l_resumenIntentos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        l_resumenIntentos.setForeground(new java.awt.Color(0, 51, 102));
        l_resumenIntentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p_resumen.add(l_resumenIntentos);

        l_resumenRutaEntrada.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        l_resumenRutaEntrada.setForeground(new java.awt.Color(0, 51, 102));
        l_resumenRutaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p_resumen.add(l_resumenRutaEntrada);

        jMenu1.setText("Archivo");

        m_escogerEntrada.setText("Escoger archivo TXT para cargar palabras al juego ");
        m_escogerEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_escogerEntradaActionPerformed(evt);
            }
        });
        jMenu1.add(m_escogerEntrada);

        jMenuBar1.add(jMenu1);

        m_configuracion.setText("Configurar");

        m_numeroIntentos.setText("Número de intentos");

        bg_intentos.add(rb_3intentos);
        rb_3intentos.setText("3 intentos");
        rb_3intentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_3intentosActionPerformed(evt);
            }
        });
        m_numeroIntentos.add(rb_3intentos);

        bg_intentos.add(rb_4intentos);
        rb_4intentos.setText("4 intentos");
        rb_4intentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_4intentosActionPerformed(evt);
            }
        });
        m_numeroIntentos.add(rb_4intentos);

        bg_intentos.add(rb_5intentos);
        rb_5intentos.setText("5 intentos");
        rb_5intentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_5intentosActionPerformed(evt);
            }
        });
        m_numeroIntentos.add(rb_5intentos);

        bg_intentos.add(rb_6intentos);
        rb_6intentos.setSelected(true);
        rb_6intentos.setText("6 intentos");
        rb_6intentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_6intentosActionPerformed(evt);
            }
        });
        m_numeroIntentos.add(rb_6intentos);

        m_configuracion.add(m_numeroIntentos);
        m_configuracion.add(jSeparator1);

        m_longitudPalabra.setText("Longitud palabra");

        bg_longitud.add(rb_3letras);
        rb_3letras.setText("3 letras");
        rb_3letras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_3letrasActionPerformed(evt);
            }
        });
        m_longitudPalabra.add(rb_3letras);

        bg_longitud.add(rb_4letras);
        rb_4letras.setText("4 letras");
        rb_4letras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_4letrasActionPerformed(evt);
            }
        });
        m_longitudPalabra.add(rb_4letras);

        bg_longitud.add(rb_5letras);
        rb_5letras.setSelected(true);
        rb_5letras.setText("5 letras");
        rb_5letras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_5letrasActionPerformed(evt);
            }
        });
        m_longitudPalabra.add(rb_5letras);

        m_configuracion.add(m_longitudPalabra);

        jMenuBar1.add(m_configuracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombrePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(b_empezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(l_bienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(p_resumen, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(l_bienvenida)
                .addGap(27, 27, 27)
                .addComponent(tf_nombrePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(b_empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(p_resumen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarIntentos(int intentos) {
        this.numeroIntentos = intentos;
        l_resumenIntentos.setText("Vas a tener " + intentos + " intentos");
    }

    private void actualizarLongitud(int longitud) {
        this.longitudPalabra = longitud;
        l_resumenLongitud.setText("Se jugará con palabras de " + longitud + " letras");
    }

    private void actualizarRutaEntrada(String ruta) {
        this.rutaEntrada = ruta;
        l_resumenRutaEntrada.setText("Archivo escogido: " + ruta);
    }


    private void b_empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_empezarActionPerformed

        WordleAdministrador gestionPalabra = new WordleAdministrador(this.rutaEntrada, this.longitudPalabra);
        String palabraEscogida = gestionPalabra.escogerPalabra();
        String nombre = tf_nombrePlayer.getText();

        if (palabraEscogida != null) {
            palabraEscogida = palabraEscogida.toUpperCase();
            System.out.println("Palabra secreta es: " + palabraEscogida);

            if ((!"".equals(nombre)) && (!"Nombre de jugador/a...".equals(nombre))) {
                dispose();
                new VentanaJuego(numeroIntentos, palabraEscogida, longitudPalabra).setVisible(true);//Abre ventana de forma inicial
                //VentanaJuego jugar = new VentanaJuego();
                //jugar.setVisible(true); 
            } else {
                JOptionPane.showMessageDialog(this, "Debes rellenar con tu nombre.", "Nombre de jugador/a", JOptionPane.INFORMATION_MESSAGE );
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentran palabras para escoger en el archivo TXT seleccionado.\n"
                    + "Escoja otro archivo que contenga palabras de " + longitudPalabra + " letras.",
                    "Error con archivo escogido", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_b_empezarActionPerformed

    private void tf_nombrePlayerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombrePlayerFocusGained
        tf_nombrePlayer.setText("");
    }//GEN-LAST:event_tf_nombrePlayerFocusGained

    private void tf_nombrePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombrePlayerActionPerformed
        b_empezar.doClick();
    }//GEN-LAST:event_tf_nombrePlayerActionPerformed

    private void rb_3intentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_3intentosActionPerformed
        actualizarIntentos(3);
    }//GEN-LAST:event_rb_3intentosActionPerformed

    private void rb_4intentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_4intentosActionPerformed
        actualizarIntentos(4);
    }//GEN-LAST:event_rb_4intentosActionPerformed

    private void rb_5intentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_5intentosActionPerformed
        actualizarIntentos(5);
    }//GEN-LAST:event_rb_5intentosActionPerformed

    private void rb_6intentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_6intentosActionPerformed
        actualizarIntentos(6);
    }//GEN-LAST:event_rb_6intentosActionPerformed

    private void rb_3letrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_3letrasActionPerformed
        actualizarLongitud(3);
    }//GEN-LAST:event_rb_3letrasActionPerformed

    private void rb_4letrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_4letrasActionPerformed
        actualizarLongitud(4);
    }//GEN-LAST:event_rb_4letrasActionPerformed

    private void rb_5letrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_5letrasActionPerformed
        actualizarLongitud(5);
    }//GEN-LAST:event_rb_5letrasActionPerformed

    private void m_escogerEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_escogerEntradaActionPerformed
        JFileChooser buscarFichero = new JFileChooser();
        int resultado = buscarFichero.showOpenDialog(null);//buscarFichero.showDialog(this, "Abrir archivo");

        if (resultado == JFileChooser.APPROVE_OPTION) {
            rutaEntrada = buscarFichero.getSelectedFile().getAbsolutePath();
            actualizarRutaEntrada(rutaEntrada);

            System.out.println(rutaEntrada);
        }
    }//GEN-LAST:event_m_escogerEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_empezar;
    private javax.swing.ButtonGroup bg_intentos;
    private javax.swing.ButtonGroup bg_longitud;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel l_bienvenida;
    private javax.swing.JLabel l_resumenConfi;
    private javax.swing.JLabel l_resumenIntentos;
    private javax.swing.JLabel l_resumenLongitud;
    private javax.swing.JLabel l_resumenRutaEntrada;
    private javax.swing.JMenu m_configuracion;
    private javax.swing.JMenuItem m_escogerEntrada;
    private javax.swing.JMenu m_longitudPalabra;
    private javax.swing.JMenu m_numeroIntentos;
    private javax.swing.JPanel p_resumen;
    private javax.swing.JRadioButtonMenuItem rb_3intentos;
    private javax.swing.JRadioButtonMenuItem rb_3letras;
    private javax.swing.JRadioButtonMenuItem rb_4intentos;
    private javax.swing.JRadioButtonMenuItem rb_4letras;
    private javax.swing.JRadioButtonMenuItem rb_5intentos;
    private javax.swing.JRadioButtonMenuItem rb_5letras;
    private javax.swing.JRadioButtonMenuItem rb_6intentos;
    private javax.swing.JTextField tf_nombrePlayer;
    // End of variables declaration//GEN-END:variables
}
