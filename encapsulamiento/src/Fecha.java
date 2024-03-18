public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha (int d, int m, int a){
        dia = d;
        mes = m;
        anio = a;
    }

    //constructor sin argumentos
    public Fecha(){
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void addDias(int d){
        //convierto la fecha a días y le sumo d
        int sum= fechaToDias()+d;
        // la fecha resultante (sum) la separo en dia, mes y anio
        diasToFecha(sum);
    }

    // retornas la fecha expresada en dias
    private int fechaToDias(){
        return anio*360+mes*30+dia;
    }

    // asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i) {
        // dividimos por 360 y obtenemos el anio
        anio = i/360;
        // del resto de la division anterior
        // podremos obtener el mes y el dia
        int resto = i % 360;
        // el mes es el resto dividido 30
        mes = resto/30;
        // el resto de la division anterior son los dias
        dia = resto % 30;
        // ajuste por si dia quedo en cero
        if( dia == 0) {
            dia=30;
            mes--;
        }
        // ajuste por si el mes quedo en cero
        if( mes == 0) {
            mes=12;
            anio--;
        }
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
    }
}
