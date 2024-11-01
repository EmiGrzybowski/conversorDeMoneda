
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 8){
            System.out.println("****************************\n" +
                    " Bienvenido al Conversor de Monedas\n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    " 1. Dolar a Peso Argentino\n" +
                    " 2. Peso Argentino a Dolar\n" +
                    " 3. Dolar a Real Brasilero\n" +
                    " 4. Real Brasilero a Dolar\n" +
                    " 5. Dolar a Peso Chileno\n" +
                    " 6. Peso Chileno  a Dolar\n" +
                    " 7. Convertir Otra Moneda\n" +
                    " 8. Salir\n");
            Scanner leer = new Scanner(System.in);

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch(opcion){
                case 1:
                    ConvertirMoneda.convertir("USD" ,  "ARS", consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS" ,  "USD", consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD" , "BRL", consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL" , "USD", consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD" ,  "CLP", consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("CLP" , "USD", consulta,lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;


                default:
                    System.out.println("Opción no válida");
                    break;

            }
        }


    }
}
