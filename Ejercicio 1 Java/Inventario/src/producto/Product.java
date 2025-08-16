
package producto;

/**
 * @version 1.0
 * @author LUISA ARANGO
 * Clase que contiene la información de los productos
 * de una tienda
 */

public class Product {
    /**
     * Contiene el nombre del producto
     */
    private String name;
    /**
     * Contiene la categoría del producto. Puede ser "Home", "Electronics", etc
     */
    private String category;
    /**
     * Contiene el precio del producto
     */
    private double price;
    /**
     * Contiene cuantas unidades del producto están disponibles
     */
    private int stock;
    /**
     * Contiene cuantas unidades del producto se han vendido en total
     */
    private int unitsSold;

    /**
     * Inicializa los productos con la información enviamada como parámetros
     * @param name -> Nombre del producto
     * @param category -> Categoria del producto
     * @param price -> Precio del producto
     * @param stock -> Unidades disponibles del producto
     * @param unitsSold -> Unidades vendidas
     */
    public Product(String name, String category, double price, int stock, int unitsSold) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.unitsSold = unitsSold;
    }

    /**
     * Devuelve el nombre del producto
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Actualiza el nombre del producto con un nuevo parametro
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la categoria del producto
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * Actualiza la categoria del producto con un nuevo parametro
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Devuelve el precio del producto
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * Actualiza el precio del producto con un nuevo parametro
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve las unidades disponibles del producto
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     * Actualiza las unidades disponibles con un nuevo parametro
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Devuelve las unidades vendidas del producto
     * @return
     */
    public int getUnitsSold() {
        return unitsSold;
    }

    /**
     * Actualiza las unidades vendidas con un nuevo parametro
     * @param unitsSold
     */
    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }
    

  }