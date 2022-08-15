package principal;

import figuras.enumeraciones.FiguraTipo;

import java.util.Scanner;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.FiguraGeometrica;
import figuras.Triangulo;

public class AreaFigurasGeometricas {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            limpiar();
            menu();
            FiguraTipo opcion = seleccionar_opcion();
            FiguraGeometrica figura = null;
            switch (opcion) {
                case CIRCULO:
                    figura = new Circulo(ingresar_positivo("Ingrese el Radio del Circulo: "));
                    break;

                case CUADRADO:
                    figura = new Cuadrado(ingresar_positivo("Ingrese la Base del Cuadrado: "),
                        ingresar_positivo("Ingrese la Altura del Cuadrado: "));
                    break;

                case TRIANGULO:
                    figura = new Triangulo(ingresar_positivo("Ingrese el 1er Lado del Triangulo: "),
                        ingresar_positivo("Ingrese el 2do Lado del Triangulo: "), 
                        ingresar_positivo("Ingrese el 3er Lado del Triangulo: "));
                    break;
            
                default:
                    mensaje("Gracias por usar nuestro programa");
                    mensaje("Esperamos que haya sido de su agrado");
                    mensaje("Deseamos que tenga un muy buen dia :D");
                    System.exit(0);
            }
            if (figura != null)
                mensaje(figura);
            pausa();
        }
    }

    public static void menu(){
        mensaje("************************************");
        mensaje("|    Elija la Figura Geometrica    |");
        mensaje("| De la que Desea Calcular el Area |");
        mensaje("|                                  |");
        mensaje("|          1) Circulo              |");
        mensaje("|          2) Cuadrado             |");
        mensaje("|          3) Triangulo            |");
        mensaje("|          4) ##Salir##            |");
        mensaje("************************************\n");
    }

    public static FiguraTipo seleccionar_opcion(){
        int opcion = (int)ingresar_menor_que("Ingrese el numero de su eleccion: ", 4);
        mensaje();
        return opcion == 1 ? FiguraTipo.CIRCULO : 
            opcion == 2 ? FiguraTipo.CUADRADO :
            opcion == 3 ? FiguraTipo.TRIANGULO : FiguraTipo.NINGUNO;
    }

    public static float ingresar_numero(Object texto){
        while (true) {
            try {
                mensaje_sin_enter(texto);
                return Float.parseFloat(leer.next());   
            } catch (Exception e) {
                mensaje_error("numero invalido");
            }    
        }
    }

    public static float ingresar_positivo(Object texto){
        while (true) {
            float numero = ingresar_numero(texto);
            if (numero > 0){
                mensaje();
                return numero;
            }
            mensaje_error("el numero debe ser positivo");
        }
    }

    public static float ingresar_menor_que(Object texto, int limite){
        while (true) {
            float numero = ingresar_positivo(texto);
            if (numero <= limite)
                return numero;
            mensaje_error("el numero debe ser positivo");
        }
    }
    
    public static void mensaje(){
        System.out.println();
    }

    public static void mensaje(Object texto){
        System.out.println(texto);
    }
    
    public static void mensaje_sin_enter(Object texto){
        System.out.print(texto);
    }

    public static void mensaje_error(Object error){
        mensaje("\nERROR " + error.toString().toUpperCase() + "!!!\n");
    }

    public static void limpiar(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pausa(){
        System.out.println("==================================================");
        try {
            new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
