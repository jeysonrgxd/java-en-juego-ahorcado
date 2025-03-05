import java.util.Scanner;

public class Ahorcado {
   public static void main(String[] args) throws Exception {

      // clase scanner que nos permite que el usuario escriba
      Scanner scanner = new Scanner(System.in);

      // Declaraciones y asignaciones
      String palabraSecreta = "inteligencia";
      int intentosMaximo = 10;
      int intentos = 0;
      boolean palabraAdivinada = false;

      // arreglos
      char[] letrasAdivinadas = new char[palabraSecreta.length()]; // las letras adivinadas tiene que ser la cantidad de
                                                                   // letras de plabra secreta

      // hacer bucle para poder imprimir gionsito de la palabra secretea para que la
      // persona sepa cuantas letras deve escribir
      for (int i = 0; i < letrasAdivinadas.length; i++) {
         letrasAdivinadas[i] = '_';
         System.out.print(letrasAdivinadas[i]);
      }
      System.out.println(""); // salto de linea despues de una un print si ln
      System.out.println(palabraSecreta);

      // Estrutura de control Iteratriva (Bucle while)

      // INTELIGENCIA ------------

      while (!palabraAdivinada && intentos < intentosMaximo) {

         System.out.println(
               "Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + letrasAdivinadas.length + ") letras");
         System.out.println("Introduce una letra por favor");

         char letra = Character.toLowerCase(scanner.next().charAt(0)); //convertimos la letra a minuscula

         boolean adivinoAlgunLetra = false;

         for (int i = 0; i < palabraSecreta.length(); i++) {

            if (palabraSecreta.charAt(i) == letra) {
               letrasAdivinadas[i] = letra;
               adivinoAlgunLetra = true;
            }

         }

         if(!adivinoAlgunLetra){
            intentos++;
            System.err.println("¡Incorrecta! Te quedan "+ (intentosMaximo - intentos) + " intentos");
         }

         if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
            palabraAdivinada = true;
            System.out.println("¡Felicidades adivinaste la palabra!");
         }


      }

      if(!palabraAdivinada && intentos == intentosMaximo){
         System.out.println("¡Que pena te has quedado sin intentos!");
      }
      
   }
}
