/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;
import java.util.Scanner;
/**
 *
 * @author Salvador Galindo Martínez <your.name at your.org>
 */
public class PracticaPOO {


    public static void main(String[] args) {
        
        //Punto 11 del ejercicio. Declarar 6 objetos
        Punto p1,p2,p3,p4,p5,p6;
        
        //Punto 12 del ejercicio.
        p1 = new Punto();
        p1.setX(3);
        p1.setY(4);
        p1.imprimePunto();
                
        //Punto 13 del ejercicio.
        p2 = new Punto(7,4);
        String puntoDos = p2.imprimeCadena();
        System.out.println(puntoDos);
        
        //Punto 14 del ejercicio.
        p3 = new Punto(p1);
        p3.setX(3);
        p3.setY(7);
        System.out.println(p3.toString());
        
        //Punto 15 del ejercicio
        double distancia = Punto.distancia(p1, p2);
        System.out.println("La distancia entre los puntos " + p1 + " y " + p2 + " vale " + distancia);
    
        //Punto 16 del ejercicio
        Scanner teclado = new Scanner(System.in);
        p4 = new Punto();
        double x4, y4;
        System.out.print("Primer punto X= ");
        x4 = teclado.nextDouble();
        p4.setX(x4);
        System.out.print("Primer punto Y= ");
        y4 = teclado.nextDouble();
        p4.setY(y4);
        
        System.out.println("");
        
        p5 = new Punto();
        double x5, y5;
        System.out.print("Segundo punto X= ");
        x5 = teclado.nextDouble();
        p5.setX(x5);
        System.out.print("Segundo punto Y= ");
        y5 = teclado.nextDouble();
        p5.setY(y5);
        
        System.out.println("");
        
        p6 = new Punto();
        double x6, y6;
        System.out.print("Tercer punto X= ");
        x6 = teclado.nextDouble();
        p6.setX(x6);
        System.out.print("Tercer punto Y= ");
        y6 = teclado.nextDouble();
        p6.setY(y6);
        
        //Punto 17 del ejercicio
        String imprimirElArea = Punto.imprimeArea(p4, p5, p6);
        System.out.println(imprimirElArea);
        
        //Punto 18 del ejercicio

        System.out.println("El número de puntos que tenemos es de " + Punto.getNumeroPuntos());
    }
    
}
