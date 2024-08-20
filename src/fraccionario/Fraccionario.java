/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraccionario;

/**
 *
 * @johann lopez
 */
public class Fraccionario {
private final int numerador;
private final int denominador;

public Fraccionario (int numerador, int denominador){
this .numerador = numerador;
this .denominador = denominador; 
}
public String obtenerFraccion () {
return numerador + "/"+ denominador; 
}

public static void main(String[] args) {
Fraccionario miFraccion = new Fraccionario (3, 4); 
System.out.println ("Mi fraccionario es: " + miFraccion.obtenerFraccion());
}

}
