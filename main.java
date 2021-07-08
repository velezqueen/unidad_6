package deberes6;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double radio,base,altura,lado;
        boolean continuar = true;

        Scanner teclado = new Scanner(System.in);
        String figura;

        while(continuar) {
        System.out.println("Figura que deseas calcular el area || 0 para salir\n");
        System.out.println("\nCirculo - Triangulo - Cuadrado (Introduce el nombre de la figura deseada)\n");
        figura = teclado.next();

            switch(figura) {
            case "circulo":
                System.out.println("Introduce el radio:\n");
                radio = teclado.nextDouble();
                System.out.println("Area del circulo: "+area_circulo(radio)+"\n");
                break;
            case "triangulo":
                System.out.println("Introduce base:\n");
                base = teclado.nextDouble();
                System.out.println("Introduce altura:\n");
                altura = teclado.nextDouble();
                System.out.println("Area del circulo: "+area_triangulo(base, altura)+"\n");
                break;
            case "cuadrado":
                System.out.println("Introduce el lado:\n");
                lado = teclado.nextDouble();
                System.out.println("Area del circulo: "+area_cuadrado(lado)+"\n");
                break;
            case "0":
                continuar = figura.equals("0") ? false : true;
                break;
            }
        }
    }
    //Esta funcion calcula el area del circulo
    public static double area_circulo(double radio) {
        return (radio *radio)*3.14;
    }

    public static double area_triangulo(double base, double altura) {
        return (base*altura)/2;
    }

    public static double area_cuadrado(double lado) {
        return lado*lado;
    }
    
    

}