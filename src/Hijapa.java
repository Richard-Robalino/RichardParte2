public class Hijapa {
    public static void main(String[] args) {
        Padre padre =new Padre("Gustavo","Robalino","Soltero");
        Hija hijo1 = new Hija("Gustavo", "Robalino", "Casado", 2018, "Padre");
        Nieta nieta = new Nieta("Gustavo", "Robalino", "Casado", 2018, "Padre",17587659,"Eloy Alfaro","Mayor");
        padre.imprimir();
        hijo1.imprimirde();
        nieta.imprimirdesde();
    }
}
