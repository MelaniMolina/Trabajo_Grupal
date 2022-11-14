public class Mamiferos {
    String nombre_ani;
    String alimenta;
    String habitad;
    Mamiferos(){
        nombre_ani = "Jirafa";
        alimenta = "Hojas";
        habitad = "Selva";
    }

    public String getNombre_ani() {
        return nombre_ani;
    }

    public void setNombre_ani(String nombre_ani) {
        this.nombre_ani = nombre_ani;
    }

    public String getAlimenta() {
        return alimenta;
    }

    public void setAlimenta(String alimenta) {
        this.alimenta = alimenta;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
}
