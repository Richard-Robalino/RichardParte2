public class Hijapa {
    public static void main(String[] args) {
        Padre padre =new Padre("Gustavo","Robalino","Soltero");
        Hija hijo1 = new Hija("Gustavo", "Robalino", "Casado", 2018, "Padre");
        padre.imprimir();
        hijo1.imprimirde();
    }
}
