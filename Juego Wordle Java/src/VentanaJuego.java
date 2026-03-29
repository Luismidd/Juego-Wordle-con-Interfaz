
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaJuego extends javax.swing.JFrame {

    private int intentoActual = 0;
    private String palabraSecreta;
    private int numeroIntentos;//valor inicial por defecto
    private JLabel[][] intentos;
    private int longitudPalabra;

    public VentanaJuego() {//Constructor

    }

    public VentanaJuego(int nIntentos, String palabraEscogida, int longitud) {//Constructor
        initComponents();

        b_comprobar.requestFocusInWindow();//boton esta preseleccionado al abrir ventana 
        setLocationRelativeTo(null);//Ventana abre en el centro de la pantalla

        this.numeroIntentos = nIntentos;
        this.longitudPalabra = longitud;
        this.palabraSecreta = palabraEscogida;
        //Crea matriz para contener los diferentes intentos con sus diferentes contenedores de letra
        this.intentos = new JLabel[][]{
            {l_intento1l1, l_intento1l2, l_intento1l3, l_intento1l4, l_intento1l5},
            {l_intento2l1, l_intento2l2, l_intento2l3, l_intento2l4, l_intento2l5},
            {l_intento3l1, l_intento3l2, l_intento3l3, l_intento3l4, l_intento3l5},
            {l_intento4l1, l_intento4l2, l_intento4l3, l_intento4l4, l_intento4l5},
            {l_intento5l1, l_intento5l2, l_intento5l3, l_intento5l4, l_intento5l5},
            {l_intento6l1, l_intento6l2, l_intento6l3, l_intento6l4, l_intento6l5}
        };
        
        l_confirmacionPalabra.setText("Palabra secreta, de " + longitudPalabra + " letras, escogida con éxito.");
        ////////////////////////////////////////////////////////////////////////      
        //OCULTAR GRAFICAMENTE NUMERO INTENTOS Y LONGITUD PALABRA EN LA MATRIZ//
        ///////////////////////////////////////////////////////////////////////
        /*
        //NUMERO DE INTENTOS (utilizando Label)
        //Recorre solo las filas desde numero de intentos seleccionado para ocultar todas las celdas que estan en las filas sobrante
        for (int i = numeroIntentos ; i < intentos.length ; i++){
            for (int j = 0 ; j < intentos[i].length; j++){
                this.intentos[i][j].setVisible(false);                
            }
        }
        */       
        //LONGITUD PALABRA (utilizando Label)
        //Recorre todas las filas de la matriz para ocultar celdas de cada fila dependiendo de longitud de la palabra
        for (int i = 0; i < numeroIntentos; i++){
            for (int j = longitudPalabra; j < intentos[i].length; j++ ){
                this.intentos[i][j].setVisible(false);
            }
        }
        //NUMERO INTENTOS (utilizando Panel)
        //Definir array de intentos (filas) y ocultarlo graficamente si el numero de intentos escogido es menor
        JPanel[] intentoFila = {p_intento1, p_intento2, p_intento3, p_intento4, p_intento5, p_intento6};
        for (int i = numeroIntentos; i < intentoFila.length; i++) {//Oculta filas que no se usan
            intentoFila[i].setVisible(false);
        }               
        //Forzar redibujado
        this.revalidate();
        this.repaint();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_grupoIntentos = new javax.swing.ButtonGroup();
        l_wodle = new javax.swing.JLabel();
        p_historialIntentos = new javax.swing.JPanel();
        p_intento1 = new javax.swing.JPanel();
        l_intento1l1 = new javax.swing.JLabel();
        l_intento1l2 = new javax.swing.JLabel();
        l_intento1l3 = new javax.swing.JLabel();
        l_intento1l4 = new javax.swing.JLabel();
        l_intento1l5 = new javax.swing.JLabel();
        p_intento2 = new javax.swing.JPanel();
        l_intento2l1 = new javax.swing.JLabel();
        l_intento2l2 = new javax.swing.JLabel();
        l_intento2l3 = new javax.swing.JLabel();
        l_intento2l4 = new javax.swing.JLabel();
        l_intento2l5 = new javax.swing.JLabel();
        p_intento3 = new javax.swing.JPanel();
        l_intento3l1 = new javax.swing.JLabel();
        l_intento3l2 = new javax.swing.JLabel();
        l_intento3l3 = new javax.swing.JLabel();
        l_intento3l4 = new javax.swing.JLabel();
        l_intento3l5 = new javax.swing.JLabel();
        p_intento4 = new javax.swing.JPanel();
        l_intento4l1 = new javax.swing.JLabel();
        l_intento4l2 = new javax.swing.JLabel();
        l_intento4l3 = new javax.swing.JLabel();
        l_intento4l4 = new javax.swing.JLabel();
        l_intento4l5 = new javax.swing.JLabel();
        p_intento5 = new javax.swing.JPanel();
        l_intento5l1 = new javax.swing.JLabel();
        l_intento5l2 = new javax.swing.JLabel();
        l_intento5l3 = new javax.swing.JLabel();
        l_intento5l4 = new javax.swing.JLabel();
        l_intento5l5 = new javax.swing.JLabel();
        p_intento6 = new javax.swing.JPanel();
        l_intento6l1 = new javax.swing.JLabel();
        l_intento6l2 = new javax.swing.JLabel();
        l_intento6l3 = new javax.swing.JLabel();
        l_intento6l4 = new javax.swing.JLabel();
        l_intento6l5 = new javax.swing.JLabel();
        tf_introducirPalabra = new javax.swing.JTextField();
        b_comprobar = new javax.swing.JButton();
        l_confirmacionPalabra = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_inicio = new javax.swing.JMenu();
        mi_salirInicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));

        l_wodle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l_wodle.setForeground(new java.awt.Color(0, 0, 255));
        l_wodle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_wodle.setText("WORDLE");
        l_wodle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_wodle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        p_historialIntentos.setLayout(new java.awt.GridLayout(6, 0, 0, 3));

        p_intento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_intento1.setLayout(new java.awt.GridLayout(1, 5, 3, 0));

        l_intento1l1.setBackground(new java.awt.Color(255, 255, 255));
        l_intento1l1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento1l1.setForeground(new java.awt.Color(0, 0, 0));
        l_intento1l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento1l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_intento1l1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento1l1.setOpaque(true);
        l_intento1l1.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento1.add(l_intento1l1);

        l_intento1l2.setBackground(new java.awt.Color(255, 255, 255));
        l_intento1l2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento1l2.setForeground(new java.awt.Color(0, 0, 0));
        l_intento1l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento1l2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento1l2.setOpaque(true);
        l_intento1l2.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento1.add(l_intento1l2);

        l_intento1l3.setBackground(new java.awt.Color(255, 255, 255));
        l_intento1l3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento1l3.setForeground(new java.awt.Color(0, 0, 0));
        l_intento1l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento1l3.setOpaque(true);
        l_intento1l3.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento1.add(l_intento1l3);

        l_intento1l4.setBackground(new java.awt.Color(255, 255, 255));
        l_intento1l4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento1l4.setForeground(new java.awt.Color(0, 0, 0));
        l_intento1l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento1l4.setOpaque(true);
        l_intento1l4.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento1.add(l_intento1l4);

        l_intento1l5.setBackground(new java.awt.Color(255, 255, 255));
        l_intento1l5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento1l5.setForeground(new java.awt.Color(0, 0, 0));
        l_intento1l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento1l5.setOpaque(true);
        l_intento1l5.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento1.add(l_intento1l5);

        p_historialIntentos.add(p_intento1);

        p_intento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_intento2.setLayout(new java.awt.GridLayout(1, 5, 3, 0));

        l_intento2l1.setBackground(new java.awt.Color(255, 255, 255));
        l_intento2l1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento2l1.setForeground(new java.awt.Color(0, 0, 0));
        l_intento2l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento2l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_intento2l1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento2l1.setOpaque(true);
        l_intento2l1.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento2.add(l_intento2l1);

        l_intento2l2.setBackground(new java.awt.Color(255, 255, 255));
        l_intento2l2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento2l2.setForeground(new java.awt.Color(0, 0, 0));
        l_intento2l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento2l2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento2l2.setOpaque(true);
        l_intento2l2.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento2.add(l_intento2l2);

        l_intento2l3.setBackground(new java.awt.Color(255, 255, 255));
        l_intento2l3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento2l3.setForeground(new java.awt.Color(0, 0, 0));
        l_intento2l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento2l3.setOpaque(true);
        l_intento2l3.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento2.add(l_intento2l3);

        l_intento2l4.setBackground(new java.awt.Color(255, 255, 255));
        l_intento2l4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento2l4.setForeground(new java.awt.Color(0, 0, 0));
        l_intento2l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento2l4.setOpaque(true);
        l_intento2l4.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento2.add(l_intento2l4);

        l_intento2l5.setBackground(new java.awt.Color(255, 255, 255));
        l_intento2l5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento2l5.setForeground(new java.awt.Color(0, 0, 0));
        l_intento2l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento2l5.setOpaque(true);
        l_intento2l5.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento2.add(l_intento2l5);

        p_historialIntentos.add(p_intento2);

        p_intento3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_intento3.setLayout(new java.awt.GridLayout(1, 5, 3, 0));

        l_intento3l1.setBackground(new java.awt.Color(255, 255, 255));
        l_intento3l1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento3l1.setForeground(new java.awt.Color(0, 0, 0));
        l_intento3l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento3l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_intento3l1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento3l1.setOpaque(true);
        l_intento3l1.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento3.add(l_intento3l1);

        l_intento3l2.setBackground(new java.awt.Color(255, 255, 255));
        l_intento3l2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento3l2.setForeground(new java.awt.Color(0, 0, 0));
        l_intento3l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento3l2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento3l2.setOpaque(true);
        l_intento3l2.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento3.add(l_intento3l2);

        l_intento3l3.setBackground(new java.awt.Color(255, 255, 255));
        l_intento3l3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento3l3.setForeground(new java.awt.Color(0, 0, 0));
        l_intento3l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento3l3.setOpaque(true);
        l_intento3l3.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento3.add(l_intento3l3);

        l_intento3l4.setBackground(new java.awt.Color(255, 255, 255));
        l_intento3l4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento3l4.setForeground(new java.awt.Color(0, 0, 0));
        l_intento3l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento3l4.setOpaque(true);
        l_intento3l4.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento3.add(l_intento3l4);

        l_intento3l5.setBackground(new java.awt.Color(255, 255, 255));
        l_intento3l5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento3l5.setForeground(new java.awt.Color(0, 0, 0));
        l_intento3l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento3l5.setOpaque(true);
        l_intento3l5.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento3.add(l_intento3l5);

        p_historialIntentos.add(p_intento3);

        p_intento4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_intento4.setLayout(new java.awt.GridLayout(1, 5, 3, 0));

        l_intento4l1.setBackground(new java.awt.Color(255, 255, 255));
        l_intento4l1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento4l1.setForeground(new java.awt.Color(0, 0, 0));
        l_intento4l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento4l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_intento4l1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento4l1.setOpaque(true);
        l_intento4l1.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento4.add(l_intento4l1);

        l_intento4l2.setBackground(new java.awt.Color(255, 255, 255));
        l_intento4l2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento4l2.setForeground(new java.awt.Color(0, 0, 0));
        l_intento4l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento4l2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento4l2.setOpaque(true);
        l_intento4l2.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento4.add(l_intento4l2);

        l_intento4l3.setBackground(new java.awt.Color(255, 255, 255));
        l_intento4l3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento4l3.setForeground(new java.awt.Color(0, 0, 0));
        l_intento4l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento4l3.setOpaque(true);
        l_intento4l3.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento4.add(l_intento4l3);

        l_intento4l4.setBackground(new java.awt.Color(255, 255, 255));
        l_intento4l4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento4l4.setForeground(new java.awt.Color(0, 0, 0));
        l_intento4l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento4l4.setOpaque(true);
        l_intento4l4.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento4.add(l_intento4l4);

        l_intento4l5.setBackground(new java.awt.Color(255, 255, 255));
        l_intento4l5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento4l5.setForeground(new java.awt.Color(0, 0, 0));
        l_intento4l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento4l5.setOpaque(true);
        l_intento4l5.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento4.add(l_intento4l5);

        p_historialIntentos.add(p_intento4);

        p_intento5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_intento5.setLayout(new java.awt.GridLayout(1, 5, 3, 0));

        l_intento5l1.setBackground(new java.awt.Color(255, 255, 255));
        l_intento5l1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento5l1.setForeground(new java.awt.Color(0, 0, 0));
        l_intento5l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento5l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_intento5l1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento5l1.setOpaque(true);
        l_intento5l1.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento5.add(l_intento5l1);

        l_intento5l2.setBackground(new java.awt.Color(255, 255, 255));
        l_intento5l2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento5l2.setForeground(new java.awt.Color(0, 0, 0));
        l_intento5l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento5l2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento5l2.setOpaque(true);
        l_intento5l2.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento5.add(l_intento5l2);

        l_intento5l3.setBackground(new java.awt.Color(255, 255, 255));
        l_intento5l3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento5l3.setForeground(new java.awt.Color(0, 0, 0));
        l_intento5l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento5l3.setOpaque(true);
        l_intento5l3.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento5.add(l_intento5l3);

        l_intento5l4.setBackground(new java.awt.Color(255, 255, 255));
        l_intento5l4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento5l4.setForeground(new java.awt.Color(0, 0, 0));
        l_intento5l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento5l4.setOpaque(true);
        l_intento5l4.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento5.add(l_intento5l4);

        l_intento5l5.setBackground(new java.awt.Color(255, 255, 255));
        l_intento5l5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento5l5.setForeground(new java.awt.Color(0, 0, 0));
        l_intento5l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento5l5.setOpaque(true);
        l_intento5l5.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento5.add(l_intento5l5);

        p_historialIntentos.add(p_intento5);

        p_intento6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_intento6.setLayout(new java.awt.GridLayout(1, 5, 3, 0));

        l_intento6l1.setBackground(new java.awt.Color(255, 255, 255));
        l_intento6l1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento6l1.setForeground(new java.awt.Color(0, 0, 0));
        l_intento6l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento6l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_intento6l1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento6l1.setOpaque(true);
        l_intento6l1.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento6.add(l_intento6l1);

        l_intento6l2.setBackground(new java.awt.Color(255, 255, 255));
        l_intento6l2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento6l2.setForeground(new java.awt.Color(0, 0, 0));
        l_intento6l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento6l2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        l_intento6l2.setOpaque(true);
        l_intento6l2.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento6.add(l_intento6l2);

        l_intento6l3.setBackground(new java.awt.Color(255, 255, 255));
        l_intento6l3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento6l3.setForeground(new java.awt.Color(0, 0, 0));
        l_intento6l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento6l3.setOpaque(true);
        l_intento6l3.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento6.add(l_intento6l3);

        l_intento6l4.setBackground(new java.awt.Color(255, 255, 255));
        l_intento6l4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento6l4.setForeground(new java.awt.Color(0, 0, 0));
        l_intento6l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento6l4.setOpaque(true);
        l_intento6l4.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento6.add(l_intento6l4);

        l_intento6l5.setBackground(new java.awt.Color(255, 255, 255));
        l_intento6l5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_intento6l5.setForeground(new java.awt.Color(0, 0, 0));
        l_intento6l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_intento6l5.setOpaque(true);
        l_intento6l5.setPreferredSize(new java.awt.Dimension(30, 30));
        p_intento6.add(l_intento6l5);

        p_historialIntentos.add(p_intento6);

        tf_introducirPalabra.setBackground(new java.awt.Color(204, 204, 255));
        tf_introducirPalabra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_introducirPalabra.setForeground(new java.awt.Color(0, 0, 0));
        tf_introducirPalabra.setText("Introduce palabra");
        tf_introducirPalabra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_introducirPalabraFocusGained(evt);
            }
        });
        tf_introducirPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_introducirPalabraActionPerformed(evt);
            }
        });

        b_comprobar.setBackground(new java.awt.Color(255, 102, 0));
        b_comprobar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_comprobar.setForeground(new java.awt.Color(255, 255, 255));
        b_comprobar.setText("COMPROBAR");
        b_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprobarActionPerformed(evt);
            }
        });

        l_confirmacionPalabra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_confirmacionPalabra.setForeground(new java.awt.Color(0, 153, 255));
        l_confirmacionPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        m_inicio.setText("Inicio");

        mi_salirInicio.setText("Salir a ventana inicio");
        mi_salirInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirInicioActionPerformed(evt);
            }
        });
        m_inicio.add(mi_salirInicio);

        jMenuBar1.add(m_inicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(p_historialIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_introducirPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(b_comprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 86, Short.MAX_VALUE))
            .addComponent(l_wodle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(l_confirmacionPalabra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_wodle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_confirmacionPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_historialIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_introducirPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(b_comprobar)
                        .addGap(71, 71, 71)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reiniciarJuego() {

        String mensaje = " ¿Quiere jugar de nuevo?";
        String titulo = "Pregunta";
        Object[] opciones = {"SI", "NO", "Salir a Inicio"};

        int respuestaIndice = JOptionPane.showOptionDialog(this, mensaje,
                titulo, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);//opciones[0]valor por defecto

        switch (respuestaIndice) {
            case 0://"SI"
                dispose();//Cierra ventana
                new VentanaJuego(numeroIntentos, palabraSecreta, longitudPalabra).setVisible(true);//Abre ventana de forma inicial
                break;
            case 1://"NO"
                System.exit(0);//Cierra toda la aplicación
            case 2:
                dispose();//Cierra ventana
                new VentanaPrincipal().setVisible(true);
                break;
            default:
                break;
        }
    }

    private void comprobarLetras(String[] letras, String[] letras2, JLabel[] fila) {

        for (int i = 0; i < longitudPalabra; i++) {//Bucle pare recorrer letra por letra una fila de intento
            //Introduce las letras de la palabra introducida en cada contenedor de la fila de intentos
            fila[i].setText(letras[i]);

            //Compara cada letra de las dos palabras por su misma posicion en ambas
            if (letras[i].equals(letras2[i])) {//Si son iguales
                fila[i].setBackground(Color.GREEN);

            } else if (palabraSecreta.contains(letras[i])) {//Si palabraSecreta contiene la letra  
                fila[i].setBackground(Color.YELLOW);

            } else {
                fila[i].setBackground(Color.RED);
            }
        }
    }


    private void b_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprobarActionPerformed

        String palabraIntro = tf_introducirPalabra.getText().toUpperCase();

        if (palabraIntro.length() != longitudPalabra) {
            JOptionPane.showMessageDialog(this, "La palabra debe tener " + longitudPalabra + " letras.");
            return;
        }

        String[] letrasPalabraIntroducida = palabraIntro.split("");//Crea un array con las letras que contiene la palabra introducida      
        String[] letrasPalabraSecreta = palabraSecreta.split("");//Crea un array con las letras de la palabra secreta
        JLabel[] filaIntento = intentos[intentoActual];//Introduce en el array el valor de una fila de la matriz

        comprobarLetras(letrasPalabraIntroducida, letrasPalabraSecreta, filaIntento);

        intentoActual++;//Una vez termina el bucle, pasa al siguiente intento para la próxima vez que se compruebe

        //
        if (palabraIntro.equals(palabraSecreta)) {//Si se acierta
            JOptionPane.showMessageDialog(this, "¡HAS GANADO! La palabra correcta era: " + palabraSecreta);
            reiniciarJuego();

        } else if (intentoActual == numeroIntentos) {//Si no se acierta y llega al limite de intentos
            JOptionPane.showMessageDialog(this, "¡HAS PERDIDO! La palabra correcta era: " + palabraSecreta);
            reiniciarJuego();
        }
        //
        tf_introducirPalabra.setText("");//Limpia campo de texto de introducir palabra
    }//GEN-LAST:event_b_comprobarActionPerformed


    private void tf_introducirPalabraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_introducirPalabraFocusGained
        tf_introducirPalabra.setText("");
    }//GEN-LAST:event_tf_introducirPalabraFocusGained


    private void tf_introducirPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_introducirPalabraActionPerformed
        b_comprobar.doClick();
    }//GEN-LAST:event_tf_introducirPalabraActionPerformed

    private void mi_salirInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirInicioActionPerformed
        dispose();//Cierra ventana
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_mi_salirInicioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_comprobar;
    private javax.swing.ButtonGroup bg_grupoIntentos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel l_confirmacionPalabra;
    private javax.swing.JLabel l_intento1l1;
    private javax.swing.JLabel l_intento1l2;
    private javax.swing.JLabel l_intento1l3;
    private javax.swing.JLabel l_intento1l4;
    private javax.swing.JLabel l_intento1l5;
    private javax.swing.JLabel l_intento2l1;
    private javax.swing.JLabel l_intento2l2;
    private javax.swing.JLabel l_intento2l3;
    private javax.swing.JLabel l_intento2l4;
    private javax.swing.JLabel l_intento2l5;
    private javax.swing.JLabel l_intento3l1;
    private javax.swing.JLabel l_intento3l2;
    private javax.swing.JLabel l_intento3l3;
    private javax.swing.JLabel l_intento3l4;
    private javax.swing.JLabel l_intento3l5;
    private javax.swing.JLabel l_intento4l1;
    private javax.swing.JLabel l_intento4l2;
    private javax.swing.JLabel l_intento4l3;
    private javax.swing.JLabel l_intento4l4;
    private javax.swing.JLabel l_intento4l5;
    private javax.swing.JLabel l_intento5l1;
    private javax.swing.JLabel l_intento5l2;
    private javax.swing.JLabel l_intento5l3;
    private javax.swing.JLabel l_intento5l4;
    private javax.swing.JLabel l_intento5l5;
    private javax.swing.JLabel l_intento6l1;
    private javax.swing.JLabel l_intento6l2;
    private javax.swing.JLabel l_intento6l3;
    private javax.swing.JLabel l_intento6l4;
    private javax.swing.JLabel l_intento6l5;
    private javax.swing.JLabel l_wodle;
    private javax.swing.JMenu m_inicio;
    private javax.swing.JMenuItem mi_salirInicio;
    private javax.swing.JPanel p_historialIntentos;
    private javax.swing.JPanel p_intento1;
    private javax.swing.JPanel p_intento2;
    private javax.swing.JPanel p_intento3;
    private javax.swing.JPanel p_intento4;
    private javax.swing.JPanel p_intento5;
    private javax.swing.JPanel p_intento6;
    private javax.swing.JTextField tf_introducirPalabra;
    // End of variables declaration//GEN-END:variables
}
