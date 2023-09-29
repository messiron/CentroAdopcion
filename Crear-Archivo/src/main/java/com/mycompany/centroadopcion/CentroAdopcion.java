package com.mycompany.centroadopcion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class CentroAdopcion {

    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Perro perro1= new Perro("Lucas", "Labrador");
        Perro perro2= new Perro();
        perro2.setNombre("Firu");
        perro2.setRaza("Criollo");
        String nombArchivo="Perros.dat";

        try {
            OutputStream salida = new FileOutputStream (nombArchivo);
            ObjectOutputStream obsalida = new ObjectOutputStream(salida);
            obsalida.writeObject(perro1);
            obsalida.writeObject(perro2);
            obsalida.close();

        }catch(FileNotFoundException ex){
    }
         try {
            InputStream in = new FileInputStream (nombArchivo);
            ObjectInputStream entrada = new ObjectInputStream(in);
            Perro perro3=(Perro)entrada.readObject();
            System.out.println("Nombre: "+ perro3.getNombre());
            System.out.println("Raza: "+ perro3.getRaza());
            entrada.close();
        }catch(FileNotFoundException ex){
}
          try {
            InputStream in = new FileInputStream (nombArchivo);
            ObjectInputStream entrada = new ObjectInputStream(in);
           Perro perro4= (Perro)entrada.readObject();
           System.out.println("Nombre "+ perro4.getNombre());
           System.out.println("Raza "+perro4.getRaza());
            entrada.close();
        }catch(FileNotFoundException ex){
}
    }
}