/*
 * @author NeuenMartinez
 */
package ColeccionesEj_05;

import Servicios05.PaisService;


public class ColeccionesEj_05 {

    public static void main(String[] args) {

        PaisService ps = new PaisService();
        ps.crearPais();
        ps.eliminarPais();
    }
}