/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo01;

import java.util.Stack;

/**
 *
 * @author Alumno
 */
public class Tarea_Decimas {
    public void _1(){
        Stack cdk = new Stack();
       cdk.push("World of Warcraft");
       cdk.push("League of Legend");
       System.out.println("Tamaño pilas:" + cdk.size());
       System.out.println(cdk);
       System.out.println("Cima:" + cdk.peek());
       System.out.println("Posicion del Elemento" + cdk.search("World of Warcraft"  ));
       System.out.println("Elementos des-apilados:" + cdk.pop());
       System.out.println("Esta la pila vacia?  " + cdk.empty());
    }
    public void _2(){
        Stack cdk = new Stack();
        cdk.push(7.0);
        cdk.push(6.1);
        cdk.push(1.2);
        cdk.push(0.2);
        cdk.push(3.8);
        for(int i=0;i<cdk.size(); i++) {   
 {
            System.out.println(cdk.get(i));
     }
       }             System.out.println("Tercero");
    }
    public void _3(){
        Stack cdk = new Stack();
        cdk.push(7.0);
        cdk.push(6.1);
        cdk.push(1.2);
        cdk.push(0.2);
        cdk.push(3.8);
        for (Object a : cdk) {
            System.out.println(a); 
        }
    }
    public void _4(){
        Stack cdk = new Stack();
        cdk.push("Fate Stay Night");
        cdk.push("Ichigo 100%");
        cdk.push("Bleach");
        cdk.push("Hellsing");
        while(! cdk.empty()){
            System.out.println(cdk.pop());
        }
    }
    
}
