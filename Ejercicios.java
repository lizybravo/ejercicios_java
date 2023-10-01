/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 52553
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner recibir = new Scanner(System.in);
        
        //Ejercicio 1
        //Comprueba si un número es mayor que 10 y menor que 20.
        System.out.println("1. Comprobar si un numero es mayor que 10 y menor que 20");
        System.out.println("Ingresa el numero a validar:");
        int numero = recibir.nextInt();

        if (numero > 10 && numero < 20) {
            System.out.println("El numero es mayor que 10 y menor que 20.");
        } else {
            System.out.println("El numero es menor que 10 o es mayor que 20.");
        }
        
        //Ejercicio 2
        //Verifica si un número es divisible por 2 y por 3.
        System.out.println("2. Verificar si un numero es divisible por 2 y por 3");
        System.out.println("Ingresa un numero");
         int numero2 = recibir.nextInt();
         
         if (numero2 % 2 ==0 && numero2 % 3 ==0){
             System.out.println("El numero es divisible entre 2 y 3");
         }else {
             System.out.println("El numero no es divisible entre 2 y 3");
         }
         
         //Ejercicio 3
         // Determina si una cadena de texto contiene la letra "a" y la letra "b"
         recibir.nextLine();
         System.out.println("3. Saber si un texto contiene a y b");
         System.out.println("Ingresa un texto");
         String cadenaTexto = recibir.nextLine();
         
         if (cadenaTexto.contains("a") && cadenaTexto.contains("b")) {
             System.out.println("Si contiene a y b");
         }else {
             System.out.println("No contiene a y b");
         }
         
         //Ejercicio 4
         // Comprueba si un número es positivo y no es igual a cero.
         System.out.println("4. Comprobar si un numero es positivo y no igual a cero");
         System.out.println("Ingrese un numero");
         
         int numero4 = recibir.nextInt();
         
         if (numero4 == 0){
             System.out.println("El numero es cero.");
         }
         if (numero4 > 0) {
             System.out.println("El numero es positivo y diferente de cero");
         }else {
             System.out.println("El numero no es positivo y diferente de cero");
         }
         
         //Ejercicio 5
         // Verifica si un número es par o si es múltiplo de 5.
         System.out.println("5. Saber si un numero es par y multiplo de 5");
         System.out.println("Ingrese un numero");
         
         int numero5 = recibir.nextInt();
         
         if (numero5 % 2 == 0 && numero5 % 5 == 0) {
             System.out.println("El numero es par y multiplo de 5");
         }else {
             System.out.println("El numero es impar o no es multiplo de 5");
         }
         
         //Ejercicio 6
         // Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100
         System.out.println("6. Saber si un estudiante tuvo nota aprobatoria: mayor o igual a 60 y menor o igual a 100");
         System.out.println("Ingresar la calificacion obtenida");
         
         int numero6 = recibir.nextInt();
         
         if (numero6 >= 60 && numero6 <= 100){
             System.out.println("Felicidades, aprobaste");
         }else {
             System.out.println("Reprobaste, mano. Ponte a estudiar");
         }
         
         //Ejercicio 7
         //Comprueba si una persona es mayor de edad y tiene un permiso de conducir.
            System.out.println("7. Saber si una persona es mayor de edad y tiene permiso de conducir");
            System.out.println("Ingrese la edad (en numeros)");
            
            int edad = recibir.nextInt();
            
            if (edad < 18) {
                System.out.println("Es menor de edad");
            } else {
                System.out.println("Tiene permiso de conducir? Responder 'false' o 'true'");
                boolean tienePermiso = recibir.nextBoolean();
                
                if (tienePermiso) {
                    System.out.println("Es mayor de edad y tiene permiso de conducir");
                }else {
                    System.out.println("Es mayor de edad y no tiene permiso de conducir");
                }
                               
            }
           
      
            
         //Ejercicio 8
         //Verifica si un número es menor que 50 o mayor que 100.
         System.out.println("8. Saber si un numero es menor que 50 y mayor que 100");
         System.out.println("Ingresar el numero");
         
         int numero8 = recibir.nextInt();
         
         if (numero8 < 50 || numero6 > 100){
             System.out.println("Es menor que 50 o mayor que 100");
         }else {
             System.out.println("No es menor que 50 o mayor que 100");
         }
         
         //Ejercicio 9
         // Determina si un usuario tiene acceso si ha ingresado un nombre de usuario y una contraseña válidos.
            System.out.println("9. Saber si un usuario tiene acceso si ha ingresado un nombre de usuario y una contraseña validos");
                      
            recibir.nextLine();
            
            ArrayList<String> usuarios = new ArrayList<>();
            ArrayList<String> passwords = new ArrayList();
            
            System.out.println("Registrar nuevo usuario y contraseña");
            System.out.println("Ingrese su nuevo nombre de usuario");
            
            String nuevoUsuario = recibir.nextLine();
            
            System.out.println("Ingrese su nueva contraseña");
            
            String nuevoPassword = recibir.nextLine();
            
            usuarios.add(nuevoUsuario);
            passwords.add(nuevoPassword);
            
            System.out.println("Se ha creado su cuenta con exito");
            
            //inicio de sesion
            System.out.println("Iniciar sesion");
            System.out.println("Ingrese su nombre de usuario");
            
            String usuarioIngresado = recibir.nextLine();
            
            System.out.println("Ingrese su contraseña:");
            String passwordIngresado = recibir.nextLine();
            
            boolean inicioSesionExitoso = false;
            
             for (int i = 0; i <  usuarios.size(); i++) {
            if (usuarios.get(i).equals(usuarioIngresado) && passwords.get(i).equals(passwordIngresado)) {
                inicioSesionExitoso = true;
                break; 
                }
            }

            if (inicioSesionExitoso) {
            System.out.println("Se ha iniciado sesión exitosamente.");
            } else {
            System.out.println("Inicio de sesión fallido. Verifique su nombre de usuario y contraseña.");
            }
            
         //Ejercicio 10
         //Comprueba si un número es negativo o si es cero.
         System.out.println("10. Saber si un numero es negativo o si es cero");
         System.out.println("Ingrese el numero");
         
         int numero10 = recibir.nextInt();
         
         if (numero10 == 0 ){
             System.out.println("El numero es cero.");
         }
         
         if (numero10 > 0){
             System.out.println("El numero es positivo");
         } 
         
         if (numero10 < 0){
             System.out.println("El numero es negativo");
         }
         
         
         
         //Ejercicio 11
         // Verifica si un número es primo y menor que 100.
         System.out.println("11. Saber si un numero es primo y menor que 100");
         System.out.println("Ingrese el numero");
         
         int numero11 = recibir.nextInt();
         
         boolean esPrimo = true;
         
         if (numero11 <= 1){
             esPrimo = false;
             System.out.println("El numero no es primo, pero es menor que 100");
         }else {
             for (int i = 2; i <= Math.sqrt(numero11); i++) {
                if (numero11 % i == 0) {
                    esPrimo = false;
                    break;
                }
             }    
             if (esPrimo && numero11 < 100) {
                System.out.println("Es un número primo menor a 100.");
                } else {
                System.out.println("No es un número primo o es mayor a 100.");
                }
         }
         
         //Ejercicio 12
         // Determina si una persona es adulta y no es jubilada.
            System.out.println("7. Saber si una persona adulta y no es jubilada");
            System.out.println("Ingrese la edad (en numeros)");
            
            int edad12 = recibir.nextInt();
            
            if (edad12 < 18) {
                System.out.println("No es adulto");
            } else {
                System.out.println("Es jubilada? Responder 'false' o 'true'");
                boolean esJubilada = recibir.nextBoolean();
                
                if (esJubilada) {
                    System.out.println("Es mayor de edad y esta jubilada");
                }else {
                    System.out.println("Es mayor de edad y no esta jubilada");
                }            
            }
            
            
         //Ejercicio 13
         // Comprueba si un número es mayor que 5 y menor que 10 o si es mayor que 20 y menor que 30.
         System.out.println("13. Saber si un numero es mayor que 5 y menor que 10, o si es mayor que 20 y menor que 30");
         System.out.println("Ingrese el numero");
         
         int numero13 = recibir.nextInt();
         
         if (numero13 > 5 && numero13 < 10) {
             System.out.println("El numero es mayor que 5 y menor que 10");
         }else {
             System.out.println("El numero no es mayor que 5 ni menor que 10");
         }
         if (numero13 > 20 && numero13 < 30){
             System.out.println("El numero es mayor que 20 y menor que 30");
         }else {
             System.out.println("El numero no es mayor que 20 ni menor que 30");
         }
         
         //Ejercicio 14
         // Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha obtenido un resultado de "Aprobado" en su evaluación.
            System.out.println("14. Saber si un estudiante ha aprobado si su nota es igual o mayor a 70 o si ha obtenido un resultado de 'aprobado' en su evaluacion");
            System.out.println("Ingrese la nota el estudiante, en numeros, o presione -1 para omitir");
             int nota = recibir.nextInt();
             
             recibir.nextLine();
             System.out.println("Ingrese el resultado de la evaluacion 'aprobado' o 'reprobado'.");
             String evaluacion = recibir.nextLine();
             
             if (nota >= 70 || evaluacion.equalsIgnoreCase("aprobado")) {
                System.out.println("El estudiante ha aprobado");
             } else{
                 System.out.println("El estudiante ha reprobado");
             }
            
         
         
         //Ejercicio 15
         //Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada
         
         
         //Ejercicio 16
         // Comprueba si un número es múltiplo de 3 y no es múltiplo de 5.
         System.out.println("16. Saber si un numero es multiplo de 3 y no es multiplo de 5");
         System.out.println("Ingrese un numero");
         
         int numero16 = recibir.nextInt();
         
         if (numero16 % 3 == 0 && numero16 % 5 !=0) {
             System.out.println("El numero es multiplo de 3 y no es multiplo de 5");
         } else {
             System.out.println("El numero no es multiplo de 3 y/o es multiplo de 5");
         }
         
         //Ejercicio 17
         //Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra "Python".
         System.out.println("17. Saber si un texto contiene la palabra 'Java' y no contiene la palabra 'Python'. Reconoce minusculas y mayusculas.");
         System.out.println("Ingresa un texto");
         
         recibir.nextLine();
         String cadenaTexto17 = recibir.nextLine();
         
         if (cadenaTexto17.contains("Java") && !cadenaTexto17.contains("Python")) {
             System.out.println("contiene 'Java' y no contiene 'Python'.");
         }else {
             System.out.println("No contiene 'Java' y/o contiene 'Python'.");
         }
         
         //Ejercicio 18
         //Determina si un triángulo es equilátero o isósceles.
         System.out.println("18. Saber si un triangulo es equilatero, isosceles o escaleno.");
         System.out.println("Ingrese los 3 lados del triangulo a determinar:");
         
         System.out.println("Lado 1:");
         int lado1 = recibir.nextInt();
         
         System.out.println("Lado 2:");
         int lado2 = recibir.nextInt();
         
         System.out.println("Lado 3:");
         int lado3 = recibir.nextInt();
         
         if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Es un triangulo equilatero");
        } else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
                System.out.println("Es un traingulo isosceles");
                }
                else{
                System.out.println("Es un triangulo escaleno");
                }
         
         //Ejercicio 19
         // Comprueba si un número es mayor que 100 o si es menor que -100.
         System.out.println("19. Saber si un numero es mayor que 100 o si es menor que -100");
         System.out.println("Ingrese el numero");
         
         int numero19 = recibir.nextInt();
         
         if (numero19 > 100) {
             System.out.println("El numero es mayor que 100");
         }
         if (numero19 < -100){
             System.out.println("El numero es menor que -100");
         }
         
         if (numero19 < 100  && numero19 > -100) {
             System.out.println("El numero no es mayor que 100 ni menor que -100");
         }
         
         
         //Ejercicio 20
         // Verifica si una persona tiene acceso a una sala VIP si es mayor de edad o si tiene una invitación especial.
            System.out.println("20. Saber si una persona tiene acceso a una sala vip si es mayor de edad o si tiene una invitacion");
            System.out.println("Ingrese la edad (en numeros)");
            
            int edad20 = recibir.nextInt();
            
            if (edad20 < 18) {
                System.out.println("Es menor de edad, no puede pasar a la sala VIP");
            } else {
                System.out.println("Tiene invitacion especial? Responder 'false' o 'true'");
                
                boolean tieneInvitacion = recibir.nextBoolean();
                
                if (tieneInvitacion) {
                    System.out.println("Tiene invitacion, puede pasar a la sala VIP");
                }else {
                    System.out.println("No tiene invitacion, no puede pasar a la sala VIP");
                }
                               
            }


         
         
        recibir.close();
    }
}


