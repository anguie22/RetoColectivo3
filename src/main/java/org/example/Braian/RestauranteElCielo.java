package org.example.Braian;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
public class RestauranteElCielo {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Integer menuOption = 0;
        ArrayList<Object> empleados = new ArrayList <>();
        ArrayList<Object> platos = new ArrayList <>();
        Integer contadorPlatos = 0;
        Integer contadorEmpleados = 0;

        try {
            while (true){
                System.out.println("****Hola Apreciado Usuario****\n"+"Bienvenido al restaurante el cielo\n"+"");
                System.out.println("1/Registra empleados");
                System.out.println("2/Registro platos");
                System.out.println("3/Ver empleados");
                System.out.println("4/Ver platos");
                System.out.println("5/Salir");
                menuOption = lea.nextInt();

                if(menuOption == 1){

                    HashMap<String, Object> empleado = new HashMap<>();
                    System.out.println("introdusca empleado en la base de datos:");
                    System.out.println("id del empleado:");
                    empleado.put("id",lea.nextInt());
                    System.out.println("nombre del empleado:");
                    lea.nextLine();
                    empleado.put("nombre",lea.nextLine());
                    System.out.println("fecha de nacimiento del empleado");
                    empleado.put("fechaNacimiento",lea.nextLine());
                    System.out.println("cargo del empleado");
                    empleado.put("cargo",lea.nextLine());
                    System.out.println("salario del empleado");
                    empleado.put("salario",lea.nextInt());

                    empleados.add(empleado);
                    contadorEmpleados++;

                    System.out.println("empleado agregado con exito");

                } else if(menuOption == 2){

                    HashMap<String, Object> plato = new HashMap<>();
                    System.out.println("introdusca plato en la base de datos:");
                    System.out.println("id del plato:");
                    plato.put("id",lea.nextInt());
                    System.out.println("nombre del plato:");
                    lea.nextLine();
                    plato.put("nombre",lea.nextLine());
                    System.out.println("ingredientes del plato (separados por un espacio):");
                    plato.put("ingredientes",lea.nextLine());
                    System.out.println("precio del plato");
                    plato.put("precio",lea.nextInt());

                    platos.add(plato);
                    contadorPlatos++;

                    System.out.println("plato agregado con exito");

                } else if(menuOption == 3){

                    System.out.println("📋 Lista de platos registrados:");
                    for (int i = 0; i < contadorEmpleados-1; i++) {
                    System.out.println("empleado #"+(i+1)+": "+ empleados.get(i));
                    }

                } else if(menuOption == 4){
                    System.out.println("📋 Lista de platos registrados:");
                    for (int i = 0; i < contadorPlatos-1; i++) {
                        System.out.println("empleado #"+(i+1)+": "+ platos.get(i));
                    }

                } else if(menuOption == 5){

                    System.out.println("menu cerrado, gracias por entrar");
                    break;

                } else {
                    throw new Exception();
                }



            }


        } catch (Exception error) {

            System.out.println("error al digitar una opcion");

        }

    }


}
