/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01;

/**
 *
 * @author Paco2
 */
public class EjerciciosNivel01 {

    //declaro un array de integers para hacer pruebas
    int[] listaNumeros = {333, 31, 200, 20, 5, 99};

    public int numeroMaximo(int[] lista) {
        int auxiliar = lista[0];  //el maximo va a ser el primer elemento del array
        for (int i = 0; i < lista.length; i++) {
            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }

    public int[] maximos(int[] lista) {
        int[] max = {0, 0};
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max[0]) {
                max[1] = max[0];
                max[0] = lista[i];
            } else if (lista[i] > max[1]) {
                max[1] = lista[i];
            }
        }
        return lista;
    }

    /**
     * Método auxiliar para quitar los espacios en blanco a un String
     *
     * @param frase
     * @return
     */
    private String quitaEspaciosEnBlanco(String cadena) {
        //Acaso hubo buhos aca
        //Acasohubobuhosaca
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {  //espacio en blanco se pone con las comillas porque es un char
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }

    public boolean esPalindromo(String frase) {
        //este programa devuelve verdadero si la frase tiene los mismos caracteres 
        //de izquierda a derecha y de derecha a izquierda

        //primera fase: quitar espacios en blanco
        String auxiliar2 = quitaEspaciosEnBlanco(frase);

        //segunda fase: pasamos a minúsculas toda la frase
        auxiliar2 = auxiliar2.toLowerCase();

        //voy a usar el método de los índices
        int indiceIzquierdo = 0;
        int indiceDerecho = auxiliar2.length() - 1;

        while (auxiliar2.charAt(indiceIzquierdo) == auxiliar2.charAt(indiceDerecho) && indiceIzquierdo <= indiceDerecho) {
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if (indiceIzquierdo < indiceDerecho) {  //se ha salido antes de llegar al medio, luego no es palíndromo
            return false;                     //no son palíndromos
        } else {
            return true;  //sí que es palíndromo porque los índices se han cruzado
        }
    }
    
    
    
    
    public boolean esIsograma(String palabra){  
        //Este método funciona pero compara varias veces los valores ya que al inicializar j en 0
        //compara siempre desde la primera palabra y no desde i, por lo que se repiten comparaciones

        //Este método devuelve true si la palabra no tiene ninguna letra repetida y false
        //si se repite alguna
        
        String auxiliar = palabra.toLowerCase();
            
         for(int i = 0; i < auxiliar.length(); i ++){                       //Coge la primera letra de la palabra y la compara con las demás
            for(int n = 0; n < auxiliar.length(); n ++){                    //Cuando ya ha comparado con todas las letras, empieza con la siguiente y la
                if(auxiliar.charAt(i) == auxiliar.charAt(n) && n != i){     //compara con todas, repitiendo las comparaciones con las letras anteriores
                    return false;
                }
            }
        }
        
        //Si ha recorrido los dos bucles sin salir en el return false,
        //es porque la palabra no tiene letras repetidas
        return true;
    }
    
    public boolean esIsogramaJorge(String palabra){
        //Este método no repite comparaciones
        
        palabra = palabra.toUpperCase();
        
        for(int i = 0; i < palabra.length(); i ++){         //Coge la primera letra de la palabra
            for(int j = i + 1; j < palabra.length(); j ++){ //y la va comparando. Cuando termina avanza a la siguiente letra                                               
                if(palabra.charAt(i) == palabra.charAt(j)){ //y no la compara con las anteriores como hacia el mio
                    return false;
                }
            }
        }
 
        //Si ha recorrido los dos bucles sin salir en el return false,
        //es porque la palabra no tiene letras repetidas        
        return true;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01 ejercicio = new EjerciciosNivel01();

        //Ejercicio palíndromos
        /*System.out.println("palíndromo: " + (ejercicio.esPalindromo("Acaso hubo buhos aca")));
        System.out.println("palíndromo: " + (ejercicio.esPalindromo("Este no es")));*/
        
        //Ejercicio isograma
        System.out.println("la palabra murciélago: " + ejercicio.esIsogramaJorge("murcielago"));
        System.out.println("la palabra careta: " + ejercicio.esIsogramaJorge("careta"));
    }

}
