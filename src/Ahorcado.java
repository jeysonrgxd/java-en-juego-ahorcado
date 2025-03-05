import java.util.Scanner;

public class Ahorcado {
   public static void main(String[] args) throws Exception {

      // clase scanner que nos permite que el usuario escriba

      Scanner scanner = new Scanner(System.in);

      // Declaraciones y asignaciones
      String palabraSecreta = "Inteligencia";
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
      System.out.println(""); //salto de linea despues de una un print si ln
      System.out.println(palabraSecreta);


      // Estrutura de control Iteratriva (Bucle while)

      while (!palabraAdivinada && intentos < intentosMaximo) {
         
      }



   }
}
