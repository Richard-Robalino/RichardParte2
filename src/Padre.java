public class Padre{
    String nombre;
    String apellido;
    String estado;
    public  Padre(String nombre,String apellido,String estado)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.estado=estado;
    }
    public void imprimir(){
        System.out.println("Mi padre con nombre : "+nombre+" Apellido:"+apellido+" Estado:"+estado);
    }
}

class Hija extends Padre {
    int anio;
    String parentesco;


    public Hija(String nombre, String apellido, String estado, int anio, String parentesco) {
        super(nombre, apellido, estado);
        this.anio = anio;
        this.parentesco = parentesco;
    }

    public void imprimirde() {
        super.imprimir();
        System.out.println("Año: " + anio + " Parentesco: "+parentesco);
    }
}

class Nieta extends Hija {
    int ci;
    String colegio;
    String geraquia;


    public Nieta(String nombre, String apellido, String estado, int anio, String parentesco, int ci, String colegio, String geraquia) {
        super(nombre, apellido, estado, anio, parentesco);
        this.ci = ci;
        this.colegio = colegio;
        this.geraquia = geraquia;
    }

    public void imprimirdesde() {
        super.imprimirde();
        System.out.printf(" Ci: " + ci + " Colegio: " + colegio+" Jerarquia de hijo:"+geraquia);
    }
}