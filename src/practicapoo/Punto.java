/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;

/**
 *
 * @author Salvador Galindo Martínez <your.name at your.org>
 */
public class Punto {
    
    //Primer punto del ejercicio
    
    private double x;
    private double y;
    private static int numeroPuntos;
    
    //Segundo punto del ejercicio
    
    //Constructor vacío
    
    public Punto(){
    numeroPuntos++;
    }
    
    //Constructor que recibe dos puntos
    
    public Punto(double x,double y){
    this.x = x;
    this.y = y;
    numeroPuntos++;
    }
    
    //Constructor copia
    
    public Punto(Punto punto){
    this.x = punto.x;
    this.y = punto.y;
    numeroPuntos++;
    }
    
    //Punto 3 del ejercicio. Métodos Get y Set.
    
    public void setX(double x){
        this.x = x;
    }
    
    public double getX(){
        return x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getY(){
        return y;
    }

    public static int getNumeroPuntos() {
        return numeroPuntos;
    }
    
    //Punto 4 del ejercicio
    
    //Método Distancia
    public static double distancia(Punto punto1, Punto punto2){
        double distancia = 0;
        distancia=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        return distancia;
    }
    
    //Punto 5 del ejercicio
    
    //Método Distancia sobre un punto
    public double distanciaSobrePunto(Punto punto1){
        double distancia = 0;
        distancia=Math.sqrt((punto1.getX()*punto1.getX())+(punto1.getY()*punto1.getY()));
        return distancia;
    }
    
    //Punto 6 del ejercicio
    
    //Método Área
    public static double areaTriangulo(Punto punto1, Punto punto2, Punto punto3){
    double area;
    double distanciaUno;
    double distanciaDos;
    double distanciaTres;
    double sp;
    distanciaUno=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
    distanciaDos=Math.sqrt(((punto2.getX()-punto3.getX())*(punto2.getX()-punto3.getX()))+
                ((punto2.getY()-punto3.getY())*(punto2.getY()-punto3.getY())));
    distanciaTres=Math.sqrt(((punto1.getX()-punto3.getX())*(punto1.getX()-punto3.getX()))+
                ((punto1.getY()-punto3.getY())*(punto1.getY()-punto3.getY())));
    sp = (distanciaUno + distanciaDos + distanciaTres) / 2;
    area = (Math.sqrt(sp * (sp - distanciaUno) * (sp - distanciaDos) * (sp - distanciaTres)));
    return area;
    }
    
    //Punto 7 del ejercicio.
    
    //Método ImprimePunto
    public void imprimePunto(){
        System.out.println("(" + x + "," + y + ")");
    }
    
    //Punto 8 del ejercicio.
    
    //Método ImprimePunto con String
    public String imprimeCadena(){
    String imprimecadena = "(" + x + "," + y + ")";
    return imprimecadena;
    }
    
    //Punto 9 del ejercicio.
    
    //Método con toString
    public String toString(){
    String cadena = "(" + x + "," + y + ")";
    return cadena;
    }
    
    //Punto 10 del ejercicio
    
    //Método ImprimeArea
    public static String imprimeArea(Punto punto1, Punto punto2, Punto punto3){
    double area;
    double distanciaUno;
    double distanciaDos;
    double distanciaTres;
    double sp;
    distanciaUno=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
    distanciaDos=Math.sqrt(((punto2.getX()-punto3.getX())*(punto2.getX()-punto3.getX()))+
                ((punto2.getY()-punto3.getY())*(punto2.getY()-punto3.getY())));
    distanciaTres=Math.sqrt(((punto1.getX()-punto3.getX())*(punto1.getX()-punto3.getX()))+
                ((punto1.getY()-punto3.getY())*(punto1.getY()-punto3.getY())));
    sp = (distanciaUno + distanciaDos + distanciaTres) / 2;
    area = (Math.sqrt(sp * (sp - distanciaUno) * (sp - distanciaDos) * (sp - distanciaTres)));
    String areacadena = "El area del triángulo formada por los puntos: " + punto1 + punto2 + punto3 + " cuyos lados miden " + distanciaUno + " , " + distanciaDos + " , " + distanciaTres + " vale " + area;
    return areacadena;
    }
}
