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
    public static Animal ani = new Animal();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal1 = new Animal("ObotusPatrus", "Conejo", "Tierra", "Pastel", "Feroz", "Africa", 2);
        Animal animal2 = new Animal("PatrisFabiola", "Raton", "Casas", "Pastel de queso", "Veloz", "Argentina", 4);
        Animal animal3 = new Animal("OtrisPanicro", "Dinosaurio", "Cuevas", "Pastel de Carne", "Tranquilo", "Honduras", 25);
        lista.add(animal1);
        lista.add(animal2);
        lista.add(animal3);
        do {
            opciones(menu());
        } while (true);
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

        if (opcion == 0) {
            System.exit(0);
        } else if (opcion == 1) {
            crearAnimal();
        } else if (opcion == 2) {
            eliminarAnimal();
        } else if (opcion == 3) {
            editarAnimal();
        } else if (opcion == 4) {
            alimentacion();
        } else if (opcion == 5) {
            tipoImpresion();
        }

    }

    public static boolean validarNombreCientifico(String nombreCientifico) {
        for (Animal animal : lista) {
            if (nombreCientifico.equalsIgnoreCase(animal.getNombreCientifico())) {
                return false;
            }
        }
        return true;
    }

    public static void tipoImpresion() {
        System.out.println("Indique tipo de impresion: \n1. Imprimir por posicion\n2.Imprimir toda la lista\n3.Imprimir solo nombresCientifico");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            imprimirAnimalPos();
        } else if (opcion == 2) {
            imprimirListaCompleta();
        } else if (opcion == 3) {
            imprimirNombreCientifico();
        }
    }

    public static void crearAnimal() {
        System.out.println("Nombre Cientifico: ");
        String nombreCientifico = sc.next();
        System.out.println("Nombre Comun: ");
        String nombreComun = sc.next();
        System.out.println("Habitat: ");
        String habitat = sc.next();
        System.out.println("alimentacion: ");
        String alimentacion = sc.next();
        System.out.println("Descripcion de Rasgos: ");
        String descripcionRasgos = sc.nextLine();
        System.out.println("Distribucion Geografica : ");
        String distroGeografica = sc.nextLine();
        System.out.println("Vida: ");
        int vida = sc.nextInt();
        if (validarNombreCientifico(nombreCientifico) == true) {
            lista.add(new Animal(nombreCientifico,nombreComun,habitat,alimentacion,descripcionRasgos,distroGeografica,vida));
        }
    }

    public static void eliminarAnimal() {

        System.out.println("Ingrese nombre: ");
        String nombreCientifico = sc.next();
        for (Animal animal : lista) {
            int pos = lista.indexOf(nombreCientifico);
            lista.remove(pos);
        }
    }

    public static void editarAnimal() {
        System.out.print("Ingrese la posicion: ");
        int pos = sc.nextInt();
        System.out.println("1. Un atributo");
        System.out.println("2. Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            editarUnAtributo(pos);
        } else if (opcion == 2) {
            editarAtributos(pos);
        }
    }

    public static void imprimirAnimalPos() {
        System.out.print("Posicion: ");
        System.out.println(lista.get(sc.nextInt()));
    }

    public static void imprimirListaCompleta() {
        for (Animal animal : lista) {
            System.out.println(animal);
        }
    }

    public static void imprimirNombreCientifico() {
        for (Animal animal : lista) {
            System.out.println(animal.getNombreCientifico());
        }
    }

    public static void editarUnAtributo(int pos) {
        System.out.println("1. Nombre Cientifico");
        System.out.println("2. Nombre Comun");
        System.out.println("3. habitat");
        System.out.println("4. alimentacion");
        System.out.println("5. Descripcion de Rasgos");
        System.out.println("6. Distribucion Geografica");
        System.out.println("7. Vida");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Nombre Cientifico: ");
            lista.get(pos).setNombreCientifico(sc.next());
        } else if (opcion == 2) {
            System.out.print("Nombre Comun: ");
            lista.get(pos).setNombreComun(sc.next());
        } else if (opcion == 3) {
            System.out.print("Habitat: ");
            lista.get(pos).setHabitat(sc.next());
        } else if (opcion == 4) {
            System.out.println("Alimentacion: ");
            lista.get(pos).setAlimentacion(sc.next());
        } else if (opcion == 5) {
            System.out.print("Descripcion de Rasgos: ");
            lista.get(pos).setDescripcionRasgos(sc.next());
        } else if (opcion == 6) {
            System.out.print("Distribucion Geografica: ");
            lista.get(pos).setDistribucionGeografica(sc.next());
        } else if (opcion == 7) {
            System.out.println("Vida: ");
            lista.get(pos).setVida(sc.nextInt());
        }
    }

    public static void editarAtributos(int pos) {
        System.out.print("Nombre Cientifico: ");
        lista.get(pos).setNombreCientifico(sc.next());
        System.out.print("Nombre Comun: ");
        lista.get(pos).setNombreComun(sc.next());
        System.out.print("Habitat: ");
        lista.get(pos).setHabitat(sc.next());
        System.out.println("Alimentacion: ");
        lista.get(pos).setAlimentacion(sc.next());
        System.out.print("Descripcion de Rasgos: ");
        lista.get(pos).setDescripcionRasgos(sc.next());
        System.out.print("Distribucion Geografica: ");
        lista.get(pos).setDistribucionGeografica(sc.next());
        System.out.println("Vida: ");
        lista.get(pos).setVida(sc.nextInt());
    }

    public static void alimentacion() {
        System.out.println("Indique posicion de Animal para alimentar");
        int posAnimalAlimentar = sc.nextInt();
        System.out.println("Indique posicion de Animal a devorar");
        int posAnimalDevorar = sc.nextInt();
        lista.get(posAnimalAlimentar).vida += lista.get(posAnimalDevorar).vida;
        lista.remove(posAnimalDevorar);
    }
}
