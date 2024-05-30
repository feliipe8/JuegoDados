package juegodados;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void lanzar(Random r) {
        //generar número aleatorio entre uno y seis
        numero = r.nextInt(6) + 1;

    }

    public void mostrar(JLabel Lbl) {
        //Obtener el nombre del archivo de la carta
        String nombreImagen = "/imagenes/" + String.valueOf(numero) + ".jpg";
        //Cargar la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        //Asignar el JLabel
        Lbl.setIcon(imagen);
    }
}
