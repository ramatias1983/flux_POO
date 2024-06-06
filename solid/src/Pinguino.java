public class Pinguino extends Ave implements Caminador, Nadador{

    public Pinguino(String tipo, String color, String tamaño) {
        super(tipo, color, tamaño);
    }


    @Override
    public void nadar() {
        System.out.println("el pinguino está nadando");
    }

    @Override
    public void caminar() {
        System.out.println("el pinguino está caminando");
    }
}
