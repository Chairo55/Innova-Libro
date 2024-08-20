public class TiendaDeLibros {
    // Atributos
    private String titulo;
    private String autor;
    private String ISBN;
    private double precio;

    // Constructor sin parámetros
    public TiendaDeLibros() {
        this.titulo = "Título Desconocido";
        this.autor = "Autor Desconocido";
        this.ISBN = "000-0000000000";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public TiendaDeLibros(String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Detalles del libro:");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Precio: $" + this.precio);
        System.out.println("---------------------");
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio ha sido actualizado a: $" + this.precio);
    }

    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        TiendaDeLibros libro1 = new TiendaDeLibros();

        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        TiendaDeLibros libro2 = new TiendaDeLibros("El Quijote", "Miguel de Cervantes", "978-1234567890", 19.99);

        // Muestra los detalles de 'libro1'
        libro1.mostrarDetalles();

        // Muestra los detalles de 'libro2'
        libro2.mostrarDetalles();

        // Actualiza el precio de 'libro2'
        libro2.actualizarPrecio(24.99);

        // Vuelve a mostrar los detalles de 'libro2' después de la actualización del precio
        libro2.mostrarDetalles();
    }
}
