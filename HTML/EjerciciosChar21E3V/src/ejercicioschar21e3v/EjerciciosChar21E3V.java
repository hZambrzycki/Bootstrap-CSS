/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioschar21e3v;

import java.util.Scanner;

/**
 *
 * @author Hubert Zambrzycki
 */
public class EjerciciosChar21E3V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
       Menu();
        int casos=teclado.nextInt();
        switch (casos) {
            case 1:
                System.out.println("Ejercicio 1 sin métodos seria:: ");
                char[] lista = teclado.next().toCharArray();
                char[] listaInvertida = invertirLista(lista);      
                //se puede hacer con void, solo llamar metodo
                break;
            case 2:
                 System.out.println("Ejercicio 2 sin métodos seria:");
                 //cada vez que lea strings o char regenerar scanner o dara problemas.
                int contador=0;
              teclado=new Scanner(System.in);
                String aux=teclado.nextLine();
               char[] texto = aux.toCharArray();
               teclado=new Scanner(System.in);
               char ocurrencia=teclado.next().charAt(0);
              
                for (char i = 0; i < texto.length; i++) {
                  
                    if(texto[i]==ocurrencia) {
                        contador++;
                    }
                }
                System.out.print("El numero de ocurrencias de la letra es : " + contador);
                break;
              case 3:
                System.out.println("El ejercicio del palindromo");
                System.out.println("Generar un palindromo");
                System.out.println("Introduzca la palabra");
                char[] original = teclado.next().toCharArray();
                int palabraR = original.length - 1;
                char[] palabraReves = new char [original.length];
                int auxPosicion=original.length-1;
                for (int i = 0; i < original.length; i++) {
                    palabraReves[i]=original[auxPosicion--];
                }
                int nuevoTamaño=(original.length + palabraReves.length)-1;
                char [] palindromo = new char [nuevoTamaño];
                int auxPosicion2=0;
                for (int i = 0; i < palindromo.length; i++) {
                    if(i<original.length-1) {
                        palindromo[i]=original[i];
                       // System.out.println(palindromo);
                    }else {
                        palindromo[i]=palabraReves[auxPosicion2++];
                       // System.out.println(palindromo);
                    }
                    }
                System.out.println(palindromo);
                 break;
            case 4: 
                sustituyePalabra();
                break;
                }
    }
    
        
        
     private static void Menu() {
         System.out.println("Que busca comprobar?");
         System.out.println("1-Ejercicio 1 sin metodos");
         System.out.println("2-Ejercicio 2 sin metodos");
         System.out.println("3- Ejercicio 4 Palindromo sin metodos");
         System.out.println("4- Ejercicio 3 sin metodos");
    }
    
    private static char[] invertirLista(char[] lista) {
        
        int aux=lista.length-1;
        char[] listaAux= lista;
        
        for (int i = 0; i < lista.length; i++) {
            System.out.print(listaAux[aux--]);
            
        }
        return listaAux;
    }
    private static char[] introducirPalabra() {
        Scanner teclado=new Scanner(System.in);
       char[] palabraIntroducida=teclado.next().toCharArray();
        return palabraIntroducida;
    }
    private static void sustituyePalabra() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el texto");
        char[] texto = teclado.nextLine().toCharArray();
        System.out.println("Introduzca la palabra");
        teclado = new Scanner(System.in);

        char[] palabra = teclado.nextLine().toCharArray();
        boolean sustitucion = false;
        //contador para comprobar las letras que van coincidiendo de la palabra
        int cont = 0;


        for (int i = 0; i < texto.length; i++) {
            //si encontramos una letra en el texto que coincida con la primera letra de la palabra procedemos a comparar el resto
            if (texto[i] == palabra[0]) {
                for (int j = 0; j < palabra.length; j++) {
                    if (palabra[j] == texto[i + j]) {
                        cont++;
                    }
                    //si el contador alcanza el tamaño de la palabra es que la encontró entera
                    if (cont == palabra.length) {
                        sustitucion = true;
      
                        for (int k = 0; k < palabra.length; k++) {
                        
                            if (k == 0) {
                                texto[i + k] = '*';
                            } else {
                                texto[i + k] = ' ';
                            }
                        }
                    }
                }
                cont = 0;
            }
        }
        if (sustitucion) {
            //creo un array nuevo con un tamaño igual al original menos la palabra y +1 porque dejamos 1 asterisco
            char[] textoSinPalabra = new char[(texto.length - palabra.length) + 1];
            int auxPosicion = 0;
            for (int i = 0; i < textoSinPalabra.length; i++) {
                textoSinPalabra[i] = texto[auxPosicion];
                if (texto[i] == '*') {
                    auxPosicion += palabra.length;
                } else {
                    auxPosicion++;
                }

            }
            System.out.println(textoSinPalabra);
        } else {
            System.out.println("No he encontrado la palabra");
        }

    }
    private static void metodoprofe() {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el texto");
        char[] texto = teclado.nextLine().toCharArray();
        System.out.println("Introduce la letra que vas a sustituir");
        char letraAsustituir= teclado.next().charAt(0);
        
        for (int i = 0; i < texto.length; i++) {
            if(texto[i]==letraAsustituir) {
            
            }
        }
        System.out.println(texto);
    }
       
        }

