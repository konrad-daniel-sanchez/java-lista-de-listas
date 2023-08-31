/**
 * Creación de la lista de listas:
 * Se crea una lista de listas llamada listaDeListas utilizando LinkedList<LinkedList<Character>>.
 * Esta lista contendrá listas enlazadas que a su vez almacenarán caracteres.
 * Creación de listas internas: Se crean tres listas enlazadas (lista1, lista2 y lista3)
 * y se les agregan caracteres.
 * Cada una de estas listas representa una fila del "Triqui" (Tres en línea).
 *
 * Agregando listas a la lista de listas:
 * Las tres listas internas (lista1, lista2 y lista3) se agregan a la lista de listas listaDeListas.
 *
 * Impresión de la longitud de la lista principal:
 * Imprime el tamaño de la lista principal (listaDeListas), que en este caso será 3.
 *
 * Impresión de la longitud de la primera lista interna:
 * Imprime el tamaño de la primera lista interna (lista1), que contiene 3 elementos.
 *
 * Acceso a un elemento específico:
 * Se accede al elemento en la posición (1, 2) dentro de la lista de listas.
 * Esto se logra llamando al método get(1) en listaDeListas para obtener
 * la segunda lista interna, y luego llamando al método get(2)
 * en esa lista para obtener el tercer elemento.
 * El carácter en esa posición (1, 2) se imprime en la consola.
 */

import java.util.LinkedList;

public class ListaDeListas {
    public static void main(String[] args) {
        LinkedList<LinkedList<Character>> listaDeListas = new LinkedList<>();
        // Crea 3 listas:
        LinkedList<Character> lista1 = new LinkedList<>();
        lista1.add('X');
        lista1.add(' ');
        lista1.add('O');
        LinkedList<Character> lista2 = new LinkedList<>();
        lista2.add(' ');
        lista2.add('X');
        lista2.add('O');
        LinkedList<Character> lista3 = new LinkedList<>();
        lista3.add(' ');
        lista3.add(' ');
        lista3.add('X');

        // Adiciona las listas a la lista de listas:
        listaDeListas.add(lista1);
        listaDeListas.add(lista2);
        listaDeListas.add(lista3);

        // Se imprime la longitud de la lista principal:
        System.out.println(listaDeListas.size());

        // Se imprime la longitud de la primera lista interna:
        System.out.println(listaDeListas.get(0).size());

        // Se accede al valor en la posición 1, 2
        System.out.println("El elemento en la posición 1, 2 es:");
        System.out.println(listaDeListas.get(1).get(2));
    }
}
