package Utilidades05;

import Entidades05.Pais;
import java.util.Comparator;

/**
 *
 * @author NeuenMartinez
 */
public class Comparadores {

    public static Comparator<Pais> ordenarAlf = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
}
