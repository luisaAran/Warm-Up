package producto;

/**
 * @version 1.0
 * @author Luisa
 * Clase que gestionará el inventario de productos, y las operaciones relacionadas con
 * estos mismos.
 */

import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {
        /**
         * Primero, se crean algunos productos para la lista, con las categorías
         * "Electronics" y "Home"
         */
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Television", "Electronics", 500.0, 10, 5));
        products.add(new Product("celular", "Electronics", 1200.0, 0, 3));
        products.add(new Product("mesa", "Home", 80.0, 3, 10));
        products.add(new Product("cubrelecho", "Home", 700.0, 2, 1));
        products.add(new Product("cargador", "Electronics", 150.0, 7, 8));
        products.add(new Product("lampara", "Home", 40.0, 10, 4));

        /**
         *  Imprimir productos Electronics con stock > 0, ordenados por nombre
         */
        System.out.println("Electronics con stock > 0:");
        ArrayList<Product> electronics = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equals("Electronics") && p.getStock() > 0) {
                electronics.add(p);
            }
        }
        /**
         * Ordenarlos por nombre
         */
        for (int i = 0; i < electronics.size() - 1; i++) {
            for (int j = i + 1; j < electronics.size(); j++) {
                if (electronics.get(i).getName().compareTo(electronics.get(j).getName()) > 0) {
                    Product temp = electronics.get(i);
                    electronics.set(i, electronics.get(j));
                    electronics.set(j, temp);
                }
            }
        }
        /**
         * Imprimir productos
         */
        for (Product p : electronics) {
            System.out.println(p.getName());
        }
        /**
         * 2. Aumentar precio de Home en 10% si stock < 5
         */
        for (Product p : products) {
            if (p.getCategory().equals("Home") && p.getStock() < 5) {
                p.setPrice(p.getPrice() * 1.10);
            }
        }
        /**
         * Calcular ingresos totales por categoría
         */
        double ingresosElectronics = 0;
        double ingresosHome = 0;
        for (Product p : products) {
            double ingreso = p.getPrice() * p.getUnitsSold();
            if (p.getCategory().equals("Electronics")) {
                ingresosElectronics += ingreso;
            } else if (p.getCategory().equals("Home")) {
                ingresosHome += ingreso;
            }
        }
        /**
         * 4. Imprimir la categoría con mayor ingreso
         */
        if (ingresosElectronics > ingresosHome) {
            System.out.println("Categoría con mayor ingreso: Electronics");
        } else if (ingresosHome > ingresosElectronics) {
            System.out.println("Categoría con mayor ingreso: Home");
        } else {
            System.out.println("Categoría con mayor ingreso: Ninguna (empate)");
        }

        /**
         * 5. Lista de nombres de productos ordenados por precio desc, y por stock si hay empate
         */
        ArrayList<Product> copia = new ArrayList<>(products);
        for (int i = 0; i < copia.size() - 1; i++) {
            for (int j = i + 1; j < copia.size(); j++) {
                if (copia.get(i).getPrice() < copia.get(j).getPrice() ||
                   (copia.get(i).getPrice() == copia.get(j).getPrice() &&
                    copia.get(i).getStock() > copia.get(j).getStock())) {
                    Product temp = copia.get(i);
                    copia.set(i, copia.get(j));
                    copia.set(j, temp);
                }
            }
        }
        System.out.println("Productos ordenados: ");
        for (int i = 0; i < copia.size(); i++) {
           System.out.print(copia.get(i).getName() + " ");
        }

    }
}
