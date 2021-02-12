/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01;

import java.util.Arrays;

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
            if (cadena.charAt(i) != ' ' && cadena.charAt(i) != ',') {  //espacio en blanco se pone con las comillas porque es un char
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
        palabra = quitaAcentos(palabra);
        
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
     * @param cadena el string a limpiar
     * @return el string sin acentos
     */
    public String quitaAcentos(String cadena){
        //pájaro
        //pajaro
        cadena = cadena.replace('á', 'a');
        cadena = cadena.replace('é', 'e');
        cadena = cadena.replace('í', 'i');
        cadena = cadena.replace('ó', 'o');
        cadena = cadena.replace('ú', 'u');
        cadena = cadena.replace('ü', 'u');
        cadena = cadena.replace('Á', 'A');
        cadena = cadena.replace('É', 'E');
        cadena = cadena.replace('Í', 'I');
        cadena = cadena.replace('Ó', 'O');
        cadena = cadena.replace('Ú', 'U');
        cadena = cadena.replace('Ü', 'U');    
        
        return cadena;
    }
    public String quitaAcentosV2(String cadena){
        String auxiliar = "";
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == 'á') {auxiliar = auxiliar + 'a';}
            else if(cadena.charAt(i) == 'é') {auxiliar = auxiliar + 'e';}
            else if(cadena.charAt(i) == 'í') {auxiliar = auxiliar + 'i';}
            else if(cadena.charAt(i) == 'ó') {auxiliar = auxiliar + 'o';}
            else if(cadena.charAt(i) == 'ú') {auxiliar = auxiliar + 'u';}
            else if(cadena.charAt(i) == 'ü') {auxiliar = auxiliar + 'u';}
            else if(cadena.charAt(i) == 'ü') {auxiliar = auxiliar + 'u';}
            
            else if(cadena.charAt(i) == 'Á') {auxiliar = auxiliar + 'A';}
            else if(cadena.charAt(i) == 'É') {auxiliar = auxiliar + 'E';}
            else if(cadena.charAt(i) == 'Í') {auxiliar = auxiliar + 'I';}
            else if(cadena.charAt(i) == 'Ó') {auxiliar = auxiliar + 'O';}
            else if(cadena.charAt(i) == 'Ú') {auxiliar = auxiliar + 'U';}
            else if(cadena.charAt(i) == 'Ü') {auxiliar = auxiliar + 'U';}
            else{
                auxiliar = auxiliar + cadena.charAt(i);
            }
            
        }
        return auxiliar;
    }
    
    /**
    * Este método recibe un String formado por varias palabras
    * por ejemplo: "Alta Velocidad Española"
    * y devuelve un array de Strings por ejemplo
    * ("Alta", "Velocidad", "Española")
    * ESTA VERSIÓN SOLO SE USARÁ EN LAS PRÁCTICAS
    * NO EN LA VIDA REAL
    */    
    public String[] divideFrase(String frase){
        frase = frase + ' ';  //Método Paco: Añade un espacio en blanco al final 
                              //para que funcione el for con todas las palabras
        String auxiliar = "";
        //1ºaveriguo cuántos espacios en blano tiene la frase
        int numeroEspaciosEnBlanco = 0; 
        for(int i = 0; i < frase.length(); i ++){
            if(frase.charAt(i) == ' '){
                numeroEspaciosEnBlanco++;
            }
        }
        //+1 en numeroEspaciosEnBlanco para que me coja la última palabra
        String[] dividido = new String[numeroEspaciosEnBlanco]; 
        int contadorPalabra = 0;
        for(int i = 0; i < frase.length(); i ++){
            if(frase.charAt(i) == ' '){
                dividido[contadorPalabra] = auxiliar;
                auxiliar = "";
                contadorPalabra++;
            }
            else{
                auxiliar = auxiliar + frase.charAt(i);
            }
        }
        return dividido;
    }
    /**
     * Recibe una frase y devuelve sus acrónimo (La primera letra
     * de cada palabra que forma la frase)
     * @param frase
     * @return 
     */
    public String acronimo(String frase){
        frase = frase.toUpperCase();
        String[] palabras = divideFrase(frase);
        String auxiliar = "";
        
        for(int i = 0; i < palabras.length; i++){
            //palabras[i].charAt(0);
            if(palabras[i].length() > 0){ //para evitar el problema de las palabras vacías(palabras que tienen al menos 1 char)
                if(!(palabras[i].equals("Y") || palabras[i].equals("DE") || palabras[i].equals("LA") || palabras[i].equals("LAS") || palabras[i].equals("E"))){
                    auxiliar = auxiliar + palabras[i].charAt(0);
                }               
            }

                
        }
        return auxiliar;
    }

   
    /**
     * Recibe dos Strings y devuelve true si todas las letras del primero están
     * eb el segundo (sin repetirse), por ejemplo amor y roma
     * @param palabra1
     * @param palabra2
     * @return 
     */
    public boolean anagrama(String palabra1, String palabra2){
        palabra1 = quitaEspaciosEnBlanco(palabra1);
        palabra2 = quitaEspaciosEnBlanco(palabra2);
        palabra1 = quitaAcentos(palabra1);
        palabra2 = quitaAcentos(palabra2);
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        
        if(palabra1.length() != palabra2.length()){
            return false; //no tienen el mismo número de letras, luego no son anagramas
        }
        if(palabra1.length() == 0){
            return false; //no tiene caracteres
        }

        for(int i = 0; i < palabra1.length() ; i++){
            if(palabra2.contains("" + palabra1.charAt(i))){
                //busoc donde está la letra y luego hago algo con ella
                palabra2 = palabra2.replaceFirst("" + palabra1.charAt(i), "#");
            }
            else{
                return false;
            }
        }
        
        return true;
    }
    
    
    /**
     * 
     * @param diasIniciales Son los días con XX que hay que poner al inicio 
     */
    public void calendario(int diasIniciales){
        diasIniciales = Math.abs(diasIniciales % 7);
        //contador para saber que día de la semana estoy imprimiendo
        int contador = 0;
        //primera parte: imprimir las XX
        for(int i = 0; i < diasIniciales; i++){
            System.out.print("XX ");
            contador++;
        }
        //segunda fase: imprimir los números del 1 al 31
        for(int i = 1; i <= 31; i++){
            if(i < 10){
                System.out.print("0" + i + " ");
            }
            else{
                System.out.print(i + " ");
            }
            contador++;
            if(contador % 7 == 0){
                System.out.println("");
            }            
        }
        
        //tercera parte: imprimir las XX del final 
        int xQueFaltan = 35 - contador;
        if(contador > 35){
            xQueFaltan = 42 - contador;
        }
        for(int i = 0; i < xQueFaltan; i++){
            System.out.print("XX ");
        }
    }
    
    
    public static void main(String[] args) {
        EjerciciosNivel01 ejercicio = new EjerciciosNivel01();

        ejercicio.calendario(9);
    }

}
