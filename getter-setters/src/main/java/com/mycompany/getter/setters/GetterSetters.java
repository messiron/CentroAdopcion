
package com.mycompany.getter.setters;


public class GetterSetters {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno ();
        Alumno alumno2 = new Alumno(5 , "Deivy" , "Patiño" );
    
        
       System.out.println("La id del alumno 2 es: "  + alumno2.getId());
       System.out.println("El nombre del alumno 2 es: "  + alumno2.getNombre());
       System.out.println("El apellido del alumno 2 es: "  + alumno2.getApellido());
       
       alumno1.setId(2);
       alumno1.setNombre("Juan");
       alumno1.setApellido("Rodriguez");
       
       
       System.out.println("-------------------");
       System.out.println("El id del alumno 1 es: " + alumno1.getId());
       System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
       System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());
    }
}
