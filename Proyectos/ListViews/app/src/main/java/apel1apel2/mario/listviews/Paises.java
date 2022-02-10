package apel1apel2.mario.listviews;

public class Paises
{
    // ATRIBUTOS
    private String nombre;
    private String capital;

    public Paises(String nombre, String capital)
    {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
