/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo01;

/**
 *
 * @author Alumno
 */
import java.util.Stack;

public class Nuevo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Stack cdk = new Stack();
       cdk.push("Primer elemento");
       cdk.push(7);
       cdk.push(5.4);
       cdk.push(999999L);
       cdk.push('#');
       cdk.push(6.3F);
        System.out.println("Tamaño pilas:" + cdk.size()); //muestra la cantidad de push
        System.out.println(cdk); // muestra los elementos de las pilas
        System.out.println("Cima:" + cdk.peek()); // muestra el ultimo valor
        System.out.println("Posicion del Elemento" + cdk.search(6)); //Buscar (si sale el elemento -1 es que no esta)
        System.out.println("Posicion del Elemento" + cdk.search(""));//Buscar (si sale el elemento -1 es que no esta)
        System.out.println("Elementos des-apilados:" + cdk.pop()); // quita el primer elemento de la cima (el ultimo en apilar)
        System.out.println("Esta lapila vacia?  " + cdk.empty()); //muesta si la pila esta vacia o no
        Tarea_Decimas supp = new Tarea_Decimas();
        supp._1();
        supp._2();
        supp._3();
        supp._4();
    }
    
}
