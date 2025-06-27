package org.example.Braian;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.*;
public class RestauranteElCielo {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Integer menuOption = 0;
        ArrayList<HashMap<String,Object>> empleados = new ArrayList <>();
        ArrayList<HashMap<String,Object>> platos = new ArrayList <>();
        Integer contadorPlatos = 0;
        Integer contadorEmpleados = 0;

        System.out.println("\n****Hola Apreciado Usuario****\n"+"☀\uFE0F Bienvenido al restaurante el cielo ☀\uFE0F\n"+"");
        try {
            while (true){

                    System.out.println("1/Registra empleados");
                    System.out.println("2/Registro platos");
                    System.out.println("3/Ver empleados");
                    System.out.println("4/Ver platos");
                    System.out.println("5/Salir");
                    menuOption = lea.nextInt();
                try{

                    if(menuOption == 1){

                        boolean v1;
                        Integer idEmpleado;
                        HashMap<String, Object> empleado = new HashMap<>();
                        System.out.println("introdusca empleado en la base de datos:");
                        System.out.println("id del empleado:");
                        do {
                            v1 = true;
                            idEmpleado = lea.nextInt();
                            for (int i = 0; i < contadorEmpleados; i++){
                                if (idEmpleado.equals(empleados.get(i).get("id"))){
                                    v1 = false;
                                    System.out.println("❌ el id ya se encuentra registrado, por favor seleccione uno diferente");
                                }
                            }
                        }while (!v1);
                        empleado.put("id",idEmpleado);
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

                        System.out.println("✅ empleado agregado con exito ✅");

                    } else if(menuOption == 2){

                        boolean v1;
                        Integer idPlato;
                        HashMap<String, Object> plato = new HashMap<>();
                        System.out.println("introdusca plato en la base de datos:");
                        System.out.println("id del plato:");
                        do {
                            v1 = true;
                            idPlato = lea.nextInt();
                            for (int i = 0; i < contadorPlatos; i++){
                                if (idPlato.equals(platos.get(i).get("id"))){
                                    v1 = false;
                                    System.out.println("❌ el id ya se encuentra registrado, por favor seleccione uno diferente");
                                }
                            }
                        }while (!v1);
                        plato.put("id",idPlato);
                        System.out.println("nombre del plato:");
                        lea.nextLine();
                        plato.put("nombre",lea.nextLine());
                        System.out.println("ingredientes del plato (separados por un espacio):");
                        plato.put("ingredientes",lea.nextLine());
                        System.out.println("precio del plato");
                        plato.put("precio",lea.nextInt());

                        platos.add(plato);
                        contadorPlatos++;

                        System.out.println("✅ plato agregado con exito ✅");

                    } else if(menuOption == 3){

                        if(!empleados.isEmpty()){
                            System.out.println("📋 Lista de empleados registrados:");
                            for (int i = 0; i < contadorEmpleados; i++) {
                                System.out.println("\nempleado #"+ empleados.get(i).get("id"));
                                System.out.println("nombre: "+ empleados.get(i).get("nombre"));
                                System.out.println("fecha de nacimiento: "+ empleados.get(i).get("fechaNacimiento"));
                                System.out.println("cargo: "+ empleados.get(i).get("cargo"));
                                System.out.println("salario: "+ empleados.get(i).get("salario"));

                            }
                        }else{
                            System.out.println("hasta el momento no se encuentra ningun empleado registrado");
                        }

                    } else if(menuOption == 4){

                        if(!platos.isEmpty()){
                            System.out.println("📋 Lista de platos registrados:");
                            for (int i = 0; i < contadorPlatos; i++) {
                                System.out.println("\nplato #"+platos.get(i).get("id"));
                                System.out.println("nombre: "+ platos.get(i).get("nombre"));
                                System.out.println("ingredientes:");
                                String texto = (String) platos.get(i).get("ingredientes");
                                String[] ingrediente = texto.split(" ");
                                for (String elemento : ingrediente){
                                    System.out.println("- " + elemento);
                                }
                                System.out.println("precio: "+ platos.get(i).get("precio"));
                            }
                        }else{
                            System.out.println("hasta el momento no se encuentra ningun plato registrado");
                        }


                    } else if(menuOption == 5){

                        System.out.println("menu cerrado, gracias por entrar");
                        break;

                    } else {
                        throw new Exception();
                    }

                }catch (InputMismatchException error){
                    System.out.println("⚠\uFE0F error al digitar, por favor revise bien lo que se le esta pidiendo. ⚠\uFE0F");
                    lea.nextLine();
                }
                System.out.println("\nmenu de opciones:\n");
            }


        } catch (Exception error) {

            System.out.println("⚠\uFE0F error al digitar una opcion ⚠\uFE0F");

        }

    }


}
