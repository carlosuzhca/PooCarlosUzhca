
package com.iusrael.lab2;

import java.util.Scanner;

public class Cuenta {
    // atributos
    private int numero; // numero de cuenta
    private char tipo; // ahorro: 'a' corriente:
    private double saldo; // valor en $

    // metodos
    public void mostrarCuenta() {
        System.out.println("Cuenta No. " + this.numero + " Tipo: " + this.tipo + " Saldo: $" + this.saldo);
    }

    // constructor sin argumentos
    public Cuenta() {
        this.numero = 1000;
        this.tipo = 'a';
        this.saldo = 80;
    }

    // constructor con 3 argumentos
    public Cuenta(int numero, char tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Método para ingresar datos de la cuenta desde teclado
    public void ingresarCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta:");
        this.numero = scanner.nextInt();

        System.out.println("Ingrese el tipo de cuenta (a para ahorro, c para corriente):");
        this.tipo = scanner.next().charAt(0);

        System.out.println("Ingrese el saldo de la cuenta:");
        this.saldo = scanner.nextDouble();
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Cuenta utilizando el constructor sin argumentos
        Cuenta cuenta = new Cuenta();

        // Llamar al método ingresarCuenta para ingresar datos desde teclado
        cuenta.ingresarCuenta();

        // Llamar al método mostrarCuenta para mostrar los detalles de la cuenta ingresada
        cuenta.mostrarCuenta();
    }
}
