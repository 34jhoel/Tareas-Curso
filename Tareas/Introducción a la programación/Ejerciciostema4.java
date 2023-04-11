public class Ejerciciostema4 {
    
    public static void main(String[] args) {
        
        // If
        int numeroIf = -5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }
        
        // While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor actual de numeroWhile es: " + numeroWhile);
        }
        
        // Do-While
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("El valor actual de numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);
        
        // For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor actual de numeroFor es: " + numeroFor);
        }
        
        // Switch
        String estacion = "primavera";
        switch (estacion) {
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            default:
                System.out.println("La variable estacion no tiene un valor válido.");
                break;
        }
    }
}