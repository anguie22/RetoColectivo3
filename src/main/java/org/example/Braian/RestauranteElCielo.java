package org.example.Braian;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class RestauranteElCielo {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Integer menuOption = 0;
        ArrayList<Objects> empleado = new ArrayList <>();
        ArrayList<Objects> plato = new ArrayList <>();
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


                } else if(menuOption == 2){


                } else if(menuOption == 3){


                } else if(menuOption == 4){
                    System.out.println("📋 Lista de platos registrados:");
                    for (int i = 0; i < contadorPlatos; i++) {
                        System.out.println("Plato #" + (i + 1) + ": " + platos[i]);

                } else if(menuOption == 5){


                } else {
                    throw new Exception();
                }



            }


        } catch (Exception error) {

        }

    }


}
