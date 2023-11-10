package ar.com.codeStrong;

public class Orden {
    private final int idOrden;
    private final Producto productos[]; //Declaramos el arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    //Constructor vacío
    public Orden() {
        this.idOrden =  ++ Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + idOrden);
        double totalOrden  = this.calcularTotal();
        System.out.println("El total de la orden es: $" + totalOrden);
        System.out.println("Los productos de la orden: ");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}