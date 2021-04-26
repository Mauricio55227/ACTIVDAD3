/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;
import java.util.Scanner;

/**
 *
 * @author BLANQUET
 */
public class Actividad3 {

    public static int x;
    public static int Menu;
    public static double suma;
    public static int factorial = 1;
    public static double media;

    public static void Encabezado() {
        System.out.println("Universidad Autonóma de Campeche");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Ingeniería de Sistemas Computacionales");
        System.out.println("Abril 2021");
    }
    
    public static void Cuerpo(){
        System.out.println("=========================================================");
        System.out.println("Seleccione una opcion para comenzar:");
        System.out.println("");
    }
    
    public static void Pie() {
        System.out.println("---------------------------------------------------------");
        System.out.println("EDC.2021");
    }
    
    //Suma los numeros del 0 al 10
     public static void Suma(){
         System.out.println("=========================================================");
        System.out.println("Suma del 0 al 10:"); 
        for (int i = 0; i <= 10; ++i) {
        x += i;
        System.out.println(x);
        }
     }
     
        //Calcula el Factorial del 1 al 10
        public static void Factorial() {
        System.out.println("=========================================================");
        System.out.println("Factorial del 1 al 10:");   
        for (int i = 1; i <= 10; ++i) {
        factorial *= i;
        System.out.println(factorial);
        }
    }
        //Programa que calcula el factorial dado por el usuario
        public static void FactorialUsuario() {
        System.out.println("=========================================================");
        System.out.println("Escriba un número para calcular el factorial:");  
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = 1; i <= x; ++i) {
        factorial *= i;
        System.out.println(factorial);
        
        }
}
        //Programa que encuentra la media de un numero por el usuario
        public static void Media() {        
        System.out.println("=========================================================");
        System.out.println("Determina un número calcular para la media de la suma del 0 hasta el número introducido");   
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = 1; i <= x; ++i) {
        suma += i;    
        }
        media = suma / x;
        System.out.println(media);
} 
        //Programa que imprime la media de un numero y el numero mas bajo y alto
        public static void Distancia() {
        System.out.println("=========================================================");     
        Scanner sc = new Scanner(System.in);
        System.out.println("Determina un número para sacar el promedio y determinar cuál número es el mayor y cuál el menor, y la distancia numérica entre ellos");   
        x = sc.nextInt();
        for (int i = 1; i <= x; ++i) {
        suma += i;
        media = suma / x;
        if (i == 1){
        System.out.println("El número más bajo de la media es" + media);
        }
         if (i == x){
        System.out.println("El número más alto de la media es" + media);
        }
     }
 } 
        //Arreglo de los dias de la semana
        public static void Semana(){
        System.out.println("=========================================================");        
        String dias[] = new String [7];
        
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";
        
        for (int i = 0; i < dias.length; i++) {
            
        System.out.println(dias[i]);       
        }
    }  
        //Programa que simula el juego del Gato
        public static void Gato(){
        System.out.println("=========================================================");

        String juegoGato[][] = new String [3][3];
        
        juegoGato[0][0] = " o ";
        juegoGato[0][1] = " x ";
        juegoGato[0][2] = " x ";
        juegoGato[1][0] = " o ";
        juegoGato[1][1] = " o ";
        juegoGato[1][2] = " o ";
        juegoGato[2][0] = " x ";
        juegoGato[2][1] = " x ";
        juegoGato[2][2] = " o ";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + juegoGato[i][j]);
            }
            System.out.println(" ");
        }
    }  
        //Menu para escoger el programa a usar
        public static void Menu(int opcion){
        
            switch (opcion) {
            case 1:
                Suma();
                break;
            case 2:
                Factorial();
                break;
            case 3:
                FactorialUsuario();
                break;
            case 4:
                Media();
                break;
            case 5:
                Distancia();
                break;
            case 6:
                Semana();
                break;
            case 7:
                Gato();
                break;
            default:
            System.out.println("Numero fuera de la lista");   
                break;    
            }
        
    }
        
        
        
    public static void main(String[] args) {
        // TODO code application logic here
    Encabezado();
    Cuerpo();
    Scanner sc = new Scanner(System.in);
        System.out.println("(1)SUMA DEL 0 AL 10");
        System.out.println("(2)FACTORIAL DEL 1 AL 10");
        System.out.println("(3)FACTORIAL DETERMINADO POR EL USUARIO");
        System.out.println("(4) PROMEDIO DEL NUMERO INGRESADO DESDE EL 0");
        System.out.println("(5) CALCULO DE MEDIA, NUMERO BAJO Y ALTO DEL INTRODUCIDO");
        System.out.println("(6) ARREGLO DE SEMANA");
        System.out.println("(7) ARREGLO DE GATO");
        Menu = sc.nextInt();
        Menu(Menu);
    Pie();    
        
    }    
}
