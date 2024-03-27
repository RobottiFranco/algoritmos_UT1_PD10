package com.example;

public final class ContadorPalabras {

    /*
     * A- la nueva funcionalidad de encontrar palabras comunes toma como entrada 2
     * arrays
     * de strings, se compara cada palabra dentro de el primer array con una palabra
     * en el siguiente array
     * si se encuentra la palabra realiza un break y sigue con la siguiente, asi
     * hasta terminar con el primer array
     * cada uno de esas coincidencias se guardan en un array igual al lago del
     * primer array
     * y se devuelve.
     */

    public static void main(String[] args) {
        String[] Ar1 = { "Hola", "mundo", "de", "los", "algoritmos" };

        String[] Ar2 = { "Hola", "mundo", "de", "la", "informática" };

        String[] palabrasComunes = palabrasComunes(Ar1, Ar2);
        for (String string : palabrasComunes) {
            if (string != null) {
                System.out.print(string + " ");
            }
        }
    }

    public static String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        String[] arResultado = new String[palabras1.length];
        int i = 0;

        for (String palabra : palabras1) {
            for (String palabra2 : palabras2) {
                if (palabra.equals(palabra2)) {
                    arResultado[i] = palabra;
                    i++;
                    break;
                }
            }
        }

        return arResultado;
    }
}
