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
public class Ejemplo062 {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);
    
    boolean bandera = true;
    while(bandera == true){//true==true//false===true
        System.out.println("Estoy en el ciclo");//estoy en el ciclo
        String salir;
        System.out.println("Desea salir del ciclo ingrese si");
        salir= entrada.nextLine();//100//-100
        if(salir.equals("si") ){//100==-100
          bandera = false;  
        }
    }
}    
}
/*
ESTAMOS DANDO LA OPCION DEL USUARIO DEL SALIR DEL CICLO, YA NO DEBEMOS
CONFIGURAR NOSOTRO EL NUMERO DE VUELTAS QUE TIENE QUE DAR, PORQUE EL USUARIO
DEBE PONER EL PARO
*/