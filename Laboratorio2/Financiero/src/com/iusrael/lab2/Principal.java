
package com.iusrael.lab2;


public class Principal
{

    public static void main(String[] args)
    {
        //instancia un objeto c1 y llama al constructor
        Cuenta c1= new Cuenta();
        //instancia un objeto c2 y llama al costructor (int, char, double)
       Cuenta c2=new Cuenta(101,'a',100);
       c1.mostrarCuenta();//llamada al metodo con el metodo c1
       c2.mostrarCuenta(); //llamada al objeto con el metodo c2
    }   
       
}
    