public class Pato extends Ave implements Caminador, Volador{

    public Pato(String tipo, String color, String tamaño) {
        super(tipo, color, tamaño);
    }


    @Override
    public void caminar() {
        System.out.println("el pato está caminando");
    }

    @Override
    public void volar() {
        System.out.println("el pato está volando");
    }
}
