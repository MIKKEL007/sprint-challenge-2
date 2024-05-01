import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            Sistema.menu();
            try {

                int seleccion = Integer.parseInt(lectura.nextLine());
                double valor = 0;
                switch (seleccion) {
                    case 7:
                    continuar = false;
                    break;
                    case 6:
                    System.out.print("Ingresa la cantidad a convertir: ");
                    valor = Double.parseDouble(lectura.nextLine());
                    Sistema.proceso("COP", valor, "USD");
                    break;
                    case 5:
                    System.out.print("Ingresa la cantidad a convertir: ");
                    
                    valor = Double.parseDouble(lectura.nextLine());
                    Sistema.proceso("USD", valor, "COP");
                    break;
                    case 4:
                    System.out.print("Ingresa la cantidad a convertir: ");
                    
                    valor = Double.parseDouble(lectura.nextLine());
                    Sistema.proceso("BRL", valor, "USD");
                    break;
                    case 3:
                    
                    System.out.print("Ingresa la cantidad a convertir: ");
                    valor = Double.parseDouble(lectura.nextLine());
                    Sistema.proceso("USD", valor, "BRL");
                    break;
                    case 2:
                    System.out.print("Ingresa la cantidad a convertir: ");
                    
                    valor = Double.parseDouble(lectura.nextLine());
                    Sistema.proceso("ARS", valor, "USD");
                    break;
                    case 1:
                    System.out.print("Ingresa la cantidad a convertir: ");
                    
                    valor = Double.parseDouble(lectura.nextLine());
                    Sistema.proceso("USD", valor,"ARS");
                    break;
                    default:
                    break;
                }
                
            }catch (Exception e) {
                System.out.println("ERROR________________________________________________" );
                System.out.println("Valor incorrecto debes ingresar una cantidad numerica" );
                System.out.println("_____________________________________________________" );

            }
            }

    }
}
