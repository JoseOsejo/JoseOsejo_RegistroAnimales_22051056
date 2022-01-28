/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroanimales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class RegistroAnimales {

    public static ArrayList<Animal> lista = new ArrayList();
    public static Scanner sc = new Scanner(System.in);
    //public static Animal animal = new Animal();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Crear Animal\n"
                + "2. Eliminar Animal\n"
                + "3. Editar Animal\n"
                + "4. Alimentar Animal\n"
                + "5. Imprimir Animal");
        return sc.nextInt();
    }

    public static void opciones(int opcion) {
       
        /*
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            
        else if(opcion == 2)
            
        else if(opcion == 3)
           
        else if(opcion == 4)
            
        else if(opcion == 5)
            
        else if(opcion == 6)
            
        else if(opcion == 7)
           
        else if(opcion == 8)
         */

    }
    
    public static boolean validarNombreCientifico(String nombreCientifico)
    {
    for(Animal animal:lista){
        if(nombreCientifico.equalsIgnoreCase(animal.getNombreCientifico()))
            return false;
    }    
    return true;
    }
    
    public static void crearAnimal(){
        System.out.print("Nombre Cientifico: ");
        String nombreCientifico = sc.nextLine();
        nombreCientifico = sc.nextLine();
        System.out.print("Nombre Comun: ");
        String nombreComun = sc.next();
        System.out.print("Habitat: ");
        String habitat = sc.next();
        System.out.print("alimentacion: ");
        String alimentacion = sc.next();
        System.out.print("Descripcion de Rasgos: ");
        String descripcionRasgos = sc.nextLine();
        System.out.print("Distribucion Geografica : ");
        String distroGeografica = sc.nextLine();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        lista.add(new Animal());
    }



}
