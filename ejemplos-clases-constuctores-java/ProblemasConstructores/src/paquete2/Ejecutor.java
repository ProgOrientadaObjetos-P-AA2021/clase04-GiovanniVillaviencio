
package paquete2;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Hospital: ");
        String name = sc.nextLine();
        System.out.print("Ingrese la ciudad donde se encuentra: ");
        String ciudad = sc.nextLine();
        System.out.print("Ingrese el numero de doctores: ");
        int nDoc = sc.nextInt();
        System.out.print("Ingrese el numero de enfermeros: ");
        int nEnfer = sc.nextInt();
        
        Hospital h2 = new Hospital(name,ciudad,nDoc,nEnfer);
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        System.out.printf("%s\n", h2);
        
        
    }
}
