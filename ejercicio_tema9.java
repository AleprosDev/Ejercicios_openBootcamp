public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 25;
        cliente.nombre = "Martin";
        cliente.telefono = "123-456-789";
        cliente.credito = 450;
        trabajador.salario = 8000;
        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Tel del cliente: " + cliente.telefono);
        System.out.println("Credito del cliente: " + cliente.credito);
        System.out.println("Salario del cliente: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}
