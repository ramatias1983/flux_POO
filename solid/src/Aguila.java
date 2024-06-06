public class Aguila extends Ave {

    public Aguila(String tipo, String color, String tamaño) {
        super(tipo, color, tamaño);
    }

    @Override
    public void volarAve() {
        System.out.println("El pajaro está volando");
    }

}
