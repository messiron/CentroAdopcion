

package com.mycompany.herencia;


public class Herencia {

    public static void main(String[] args) {
        
        Empleado emple = new Empleado();
       
        emple.getCargo();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre();
        
    }
}
