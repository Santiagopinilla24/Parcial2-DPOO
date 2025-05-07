package Logica;

public class Parcial {
    
    public static int potencia(int b, int e) {
        try {
        	if (b == 1) {
        		return 1;}
            
            if (e < 0) {
                throw new ArithmeticException("El exponente debe ser entero mayor que 1.");
            }
            int resultado = 1;
          
            for (int i = 1; i <= e; i++) {
          
                if (b > 0 && resultado > (Integer.MAX_VALUE / b)) {
                    throw new ArithmeticException("El resultado excede el valor máximo de un entero");
                }
                if (b < 0 && resultado < (Integer.MIN_VALUE / b)) {
                    throw new ArithmeticException("El resultado excede el valor mínimo de un entero");
                }
                resultado *= b;
            }
            
            return resultado;
            
        } catch (ArithmeticException ex) {
            System.err.println(ex.getMessage());
            return 0;
        }
    }
}
