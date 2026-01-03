
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordleAdministrador {

    private String rutaEntrada;
    private ArrayList<String> listaPalabras;
    private int longitudPalabra;

    public WordleAdministrador(String rutaLectura, int longPalabra) {//Constructor

        this.rutaEntrada = rutaLectura;
        this.longitudPalabra = longPalabra;
        this.listaPalabras = new ArrayList<>();
    }

    //Metodo para obtener una palabra al azar del texto de entrada (ruta entrada)
    public String escogerPalabra() {

        BufferedReader leyendo = null;

        try {
            // Abrir el recurso dentro del proyecto o fat JAR
            InputStream is = getClass().getResourceAsStream("/recursos/" + rutaEntrada);
            if (is == null) {
                // Intentar leer como archivo normal (IDE)
                File archivo = new File("src/recursos/" + rutaEntrada);
                if (!archivo.exists()) {
                    throw new RuntimeException("No se encontró el archivo de palabras: " + rutaEntrada);
                }
                is = new FileInputStream(archivo);
            }
            leyendo = new BufferedReader(new InputStreamReader(is));

            String linea;

            //BUCLE PARA LEER CADA LÍNEA DEL ARCHIVO
            while ((linea = leyendo.readLine()) != null) {

                //DIVIDE UNA LÍNEA DE TEXTO EN SUS DIFERENTES ESPACIOS PARA LOCALIZAR LAS PALABRA Y GUARADARLAS EN UN ARRAY 
                String[] palabras = linea.split("\\s+"); // Usa \\s+ para dividir por espacios  

                construirListaLimpia(palabras);

            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());

        } finally {
            try {
                if (leyendo != null) {
                    leyendo.close();
                }

            } catch (IOException e2) {
                System.err.println("Error cerrando el archivo: " + e2.getMessage());
            }
        }

        if (listaPalabras.isEmpty()) {

            return null;

        } else {

            //PASAR LA LISTA O COLECCION A UN ARRAY
            String[] copiaColeccion = new String[0];//Crea un array de tipo String de un tamaño adecuado

            String[] arrayPalabras = listaPalabras.toArray(copiaColeccion);//Crea un array y le da valor con lista de palabras

            String palabraEscogida = palabraAzar(arrayPalabras);

            return palabraEscogida;

        }

    }

    //METODO PARA AÑADIR VALORES A LOS DIFERENTES CONTENEDORES DE LA LISTA   
    private void construirListaLimpia(String[] lineaPalabras) {

        //BUCLE QUE RECORRE EL ARRAY PARA OBTENER EL VALOR DE CADA POSICION
        for (String palabra : lineaPalabras) {
            //LIMPIA EL VALOR DE CADA POSICION DE ESE ARRAY
            palabra = limpiarPalabra(palabra);

            //SI LA PALABRA CONTIENE 5 CARACTERES                   
            if (palabra.length() == longitudPalabra) {

                //AÑADE PALABRA A LA LISTA O COLECCCION DE PALABRAS
                listaPalabras.add(palabra);
            }
        }

    }

    //MÉTODO ESCOGE UNA PALABRA AL AZAR 
    private String palabraAzar(String[] words) {

        int posAzar = (int) (Math.random() * words.length);

        return words[posAzar];//String
    }

    //METODO PARA QUITAR TIPOS DE CARACTERES NO ADMITIDOS EN UNA PALABRA
    private String limpiarPalabra(String palabra) {

        //REMPLAZA TODO CARÁCTER NO ADMITIDO POR UN ESPACIO
        String palabraLimpia;

        palabraLimpia = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚÑñ]", "");

        return palabraLimpia;
    }
}
