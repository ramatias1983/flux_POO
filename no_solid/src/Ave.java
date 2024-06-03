public class Ave {

    private String tipo;
    private String color;
    private String tamaño;

    public Ave(String tipo, String color, String tamaño) {
        this.tipo = tipo;
        this.color = color;
        this.tamaño = tamaño;
    }

    //metodos
    public void volar(){
        System.out.println("El ave está volando");
    }

    public void nadar(){
        System.out.println("El ave está nadando");
    }

    public void caminar(){
        System.out.println("El ave está caminando");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}
