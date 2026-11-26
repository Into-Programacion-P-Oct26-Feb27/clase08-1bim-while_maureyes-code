/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LEGION
 */
public class Ejemplo064 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String inf_final = "";
        String pais;
        String capital;
        int cont = 0;
        boolean bandera = true;
        while (bandera == true) {//true==true//false===true
            System.out.println("Ingrese el pais:");//estoy en el ciclo
            pais = entrada.nextLine();

            System.out.println("Ingrese capital del pais:");
            capital = entrada.nextLine();//100//-100
            inf_final = String.format("%s%s\t%s\n", inf_final, pais, capital);
            cont = cont = 1;

            String salir;
            System.out.println("Desea salir del ciclo, ingrese si:");
            salir = entrada.nextLine();
            if (salir.equals("si")) {//100==-100
                bandera = false;
            }
            inf_final=String.format("%sTotal paises ingresados: %d\n",inf_final, cont);

            System.out.printf("%s\n", inf_final);
        }
    }
}

/*
ESTAMOS DANDO LA OPCION DEL USUARIO DEL SALIR DEL CICLO, YA NO DEBEMOS
CONFIGURAR NOSOTRO EL NUMERO DE VUELTAS QUE TIENE QUE DAR, PORQUE EL USUARIO
DEBE PONER EL PARO
 */
