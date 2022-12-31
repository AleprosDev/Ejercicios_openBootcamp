

public class Main {
    public static void main(String[] args) {
        var estacion = "lala";

        switch (estacion){
            case "verano":
            case "otoño":
            case "primavera":
            case "invierno":
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}