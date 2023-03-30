import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        int operador1=3;
        int operador2=5;
        int resultado=sumaNumeros(operador1, operador2);

        System.out.println("El resultado de la suma es "+resultado);
    }

    public static int sumaNumeros (int _operador1, int _operador2){

        int resultado=_operador1+_operador2;
        return resultado;
    }

}
