
package Operaciones;


public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Retorno: " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("Retorno2: " + resultado);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 15);
        System.out.println("A2 a: " + aritmetica2.a);
        System.out.println("A2 b: " + aritmetica2.b);
        System.out.println("A2 suma: " + aritmetica2.sumarConRetorno());
        
        
    }
    
}
