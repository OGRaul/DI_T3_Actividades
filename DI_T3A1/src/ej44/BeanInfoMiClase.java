/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej44;

import ej43.MiControl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author raul
 * 
 * Una clase para ver información de MiControl sin que sea necesario crear el beaninfo en netbeans
 */
public class BeanInfoMiClase {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una instancia de MiControl para usarla en la introspeccio
        MiControl miControl = new MiControl();
        
        //Muestra el nombre del controlador
        System.out.println("MiControl es de la clase: ");
        System.out.println(miControl.getClass());
        //Guarda la clase en una variable
        Class claseMiControl = miControl.getClass();
        System.out.println("========================");

        //Muestra los campos de la clase "MiControl"
        mostrarCampos(claseMiControl);
        
        //Muestra los constructrores de la clase "MiControl"
        mostrarContructores(claseMiControl);
        
        //Muestra los métodos de la clase "MiControl"
        mostrarMetodos(claseMiControl);
    }

    private static void mostrarCampos(Class claseMiControl) {
        Field[] campos = claseMiControl.getDeclaredFields();
        System.out.println("Los campos de MiControl son: ");
        for (Field c : campos) {
            //Obtiene el nombre del campos
            String nombre = c.getName();
            System.out.println(nombre);
            
        }
        System.out.println("========================");
    }
    
    private static void mostrarContructores(Class claseMiControl) {

        
        Constructor[] constructores = claseMiControl.getDeclaredConstructors();
        System.out.println("Los constructores de MiControl son: ");
        for (Constructor c : constructores) {
            //Obtiene el nombre del constructor
            String nombre = c.getName();
            //Obtiene los modificadores y los imprime
            System.out.print(Modifier.toString(c.getModifiers())+" ");
            //En la misma linea se imprimen los nombre de los constructores
            System.out.print(nombre);
            System.out.println();
        }
        System.out.println("========================");
    }

    private static void mostrarMetodos(Class claseMiControl) {
        int i = 0;
        Method[] metodos = claseMiControl.getDeclaredMethods();
        System.out.println("Los metodos de MiControl son: ");
        for (Method m : metodos) {
            //Obtiene el nombre de los campos
            String nombre = m.getName();
            System.out.println(nombre);
            i++;
        }
       System.out.println("========================");
    }

}
