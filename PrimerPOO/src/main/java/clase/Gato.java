package clase;

public class Gato {
    /**
     * El nombre del gato
     **/
    private String nombre; //ESTO NO SE HACE
    /**
     * El genero del gatp, tiene que valer h - hombre, m - mujer o n - neutro
     **/
    private char genero;
    /**
     * El hambre del gatp de 0 a 100, siendo 0 muerto de hambre y 100 siendo atope de comida
     **/
    private byte hambre;
    /**
     * El sueño del gatp de 0 a 100...
     **/
    private byte sueño;
    /**
     * Lo warro que es el gato de 0 a 100...
     **/
    private byte suciedad;
    /**
     * El aburrimiento del gato de 0 a 100...
     **/
    private byte aburrimiento;
    /**
     * raza del gato
     **/
    private String raza;
    /**
     * pelaje del gato
     **/
    private String pelaje;
    /**
     * Dueño del gato
     **/
    private Sim dueño;
    /**
     * Es la tendencia conventirse en un diabolo
     **/
    private byte tendenciaAlCaos;

    public Gato(String nombre, String raza, String pelaje, char genero, byte hambre, byte sueño, byte suciedad, byte aburrimiento, Sim dueño, byte tendenciaAlCaos) {
        this.nombre = nombre;
        this.genero = genero;
        this.hambre = hambre;
        this.sueño = sueño;
        this.suciedad = suciedad;
        this.aburrimiento = aburrimiento;
        this.raza = raza;
        this.pelaje = pelaje;
        this.dueño = dueño;
        this.tendenciaAlCaos = tendenciaAlCaos;
    }

    public Gato(String nombre, String raza, String pelaje, char genero, Sim dueño) {
        this.nombre = nombre;
        this.genero = genero;
        this.hambre = 50;
        this.sueño = 50;
        this.suciedad = 50;
        this.aburrimiento = 50;
        this.raza = raza;
        this.pelaje = pelaje;
        this.dueño = dueño;
        this.tendenciaAlCaos = 99;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public byte getHambre() {
        return hambre;
    }

    public void setHambre(byte hambre) {
        this.hambre = hambre;
    }

    public byte getSueño() {
        return sueño;
    }

    public void setSueño(byte sueño) {
        this.sueño = sueño;
    }

    public byte getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(byte suciedad) {
        this.suciedad = suciedad;
    }

    public byte getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(byte aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Sim getDueño() {
        return dueño;
    }

    public void setDueño(Sim dueño) {
        this.dueño = dueño;
    }

    public byte getTendenciaAlCaos() {
        return tendenciaAlCaos;
    }

    public void setTendenciaAlCaos(byte tendenciaAlCaos) {
        this.tendenciaAlCaos = tendenciaAlCaos;
    }

    public void comer() {
        this.hambre -= 20;
    }

    public String toString() {
        String ret = "";
        ret += this.nombre + "-" + this.raza + "-" + this.pelaje + " (" +
                (genero == 'h' ? "Gato" : "Gata") +
                ")\n\t Sueño: " + this.sueño +
                "\n\t Hambre: " + this.hambre +
                "\n\t Suciedad: " + this.suciedad +
                "\n\t Aburrimiento:" + this.aburrimiento +
                "\n\t Modo diabolo:" + this.tendenciaAlCaos +
                "\n \t Su dueño es:"
                + (dueño != null ? this.dueño.getNombre() : "no tiene dueño");
        return ret;
    }
}
