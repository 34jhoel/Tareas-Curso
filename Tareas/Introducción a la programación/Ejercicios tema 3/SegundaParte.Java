public class Coche {

    private int numPuertas;
  
    public Coche() {
      this.numPuertas = 0;
    }
  
    public void agregarPuerta() {
      this.numPuertas++;
    }
  
    public int getNumPuertas() {
      return this.numPuertas;
    }
  
    public static void main(String[] args) {
      Coche miCoche = new Coche();
      miCoche.agregarPuerta();
      System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puerta(s)");
    }
  
  }