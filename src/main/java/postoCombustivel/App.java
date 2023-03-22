package postoCombustivel;
import java.util.Scanner;
public class App {
  
     public static void main(String[] args) {
      
         BombaCombustivel a1 = new BombaCombustivel("Gasolina", 5, 500);
         System.out.println(a1.abastecerPorValor(150));
         System.out.println(a1.qtdCombustivel);
         System.out.println(a1.abastecerPorLitro(30));
         System.out.println(a1.qtdCombustivel);         
        
    }
}
