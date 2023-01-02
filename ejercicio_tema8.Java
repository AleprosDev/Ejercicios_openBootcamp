public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Juan Carlos");
        persona.setEdad(25);
        persona.setTelefono("123-456-789");

        System.out.println("Nombre: " + persona.setNombre());
        System.out.println("Edad: " + persona.setEdad());
        System.out.println("Telefono: " + persona.setTelefono());


    class Persona {
        private int edad;
        private String nombre;
        private String telefono;

    }

    public int getEdad(){
        return edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }

    public String setNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    }

}