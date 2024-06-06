public class Pato extends Ave implements Caminador {

    public Pato(String tipo, String color, String tamaño) {
        super(tipo, color, tamaño);
    }

    @Override
    public void volarAve() {
        System.out.println("el pato está volando");
    }

    @Override
    public void caminar() {
        System.out.println("el pato está caminando");
    }

}
