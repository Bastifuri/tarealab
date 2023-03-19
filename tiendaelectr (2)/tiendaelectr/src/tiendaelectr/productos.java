
package tiendaelectr;


public class productos {
    private String nombre;
    private String caracteristicas;
    private int precio;
    private int stock;
    private String categoria;

    public productos(String nombre, String caracteristicas, int precio, int stock, String categoria) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  nombre  +  caracteristicas  +   "  $"+ precio + "   stock:" + stock + "   categoria:" + categoria ;
    } 
    
}
