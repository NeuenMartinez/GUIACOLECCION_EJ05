package Servicios05;

import Entidades05.Pais;
import Utilidades05.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    String res = "";
    HashSet<Pais> ListaPaises = new HashSet();
    public void crearPais() {
        do {
            System.out.println("Ingresar paises que van al mundial: ");
            String p = leer.next();
            System.out.println("¿Desea agregar otro Pais? (pulse cualquier tecla para seguir agregando, o pulse n para terminar)");
            res = leer.next();
            ListaPaises.add(new Pais(p));
        } while (!res.equalsIgnoreCase("n"));

        if (res.equalsIgnoreCase("n")) {
            for (Pais ListaPaise : ListaPaises) {
                System.out.println(ListaPaise);
            }
        }
        ordenarListaAlf();
    }

    public void ordenarListaAlf() {
        List<Pais> ListaPaisOrdenados = new ArrayList(ListaPaises);
        Collections.sort(ListaPaisOrdenados, Comparadores.ordenarAlf);
        System.out.println("La lista Ordenada Es:");
        for (Pais aux : ListaPaisOrdenados) {
            System.out.println(aux);
        }
    }

    public void eliminarPais(){
        System.out.println("¿Que pais desea ELIMINAR?");
        String paisElim = leer.next();
        Iterator<Pais> it = ListaPaises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(paisElim)){
                it.remove();
        } 
            
        }
        System.out.println("Lista de paises sin los que no van al mundial: ");
        ordenarListaAlf();
    }
}
