package clase;

/**
 * Clase que modela un SIM
 *
 * @author Adrian Navarro Gallardo
 */
public class Sim {
    //el nombre de la clase debe ser en SINGULAR
    //a las clases se le puede decir:lo que son(atributo) y lo que saben hacer(metodo)
    //atributo de las personas
    /**
     * El nombre del Sim
     **/
    private String nombre; //ESTO NO SE HACE
    /**
     * El apellido del Sim
     **/
    private String apellido;
    /**
     * El genero del Sim, tiene que valer h - hombre, m - mujer o n - neutro
     **/
    private char genero;
    /**
     * El hambre del Sim de 0 a 100, siendo 0 muerto de hambre y 100 siendo atope de comida
     **/
    private byte hambre;
    /**
     * El sueño del Sim de 0 a 100...
     **/
    private byte sueño;
    /**
     * Lo warro que es el Sim de 0 a 100...
     **/
    private byte suciedad;
    /**
     * El aburrimiento del Sim de 0 a 100...
     **/
    private byte aburrimiento;
    /**
     * padre de sim
     **/
    private Sim padre;
    /**
     * madre de sim
     **/
    private Sim madre;
    /**
     * Perros a su responsabilidad
     **/
    private Perro[] perros;
    private Gato[] gatos;
    //metodos: lo que las personas saben hacer

    //creando constructores
    public Sim(String nombre, String apellido, char g, byte hambre, byte sueño, byte suc, byte aburr, Sim padre, Sim madre, Perro[] perros, Gato[] gatos){
        //this. es obligatorio si la variable tiene el mismo nombre que el argumento
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=g;
        this.hambre=hambre;
        this.sueño=sueño;
        this.suciedad=suc;
        this.aburrimiento=aburr;
        this.madre=madre;
        this.padre=padre;
        this.perros=perros;
        this.gatos=gatos;
    }
    public Sim(String nombre, String apellido, char g){
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=g;
        this.hambre=50;
        this.sueño=50;
        this.suciedad=50;
        this.aburrimiento=50;
        this.madre=null;
        this.padre=null;
        this.perros=null;
        this.gatos=null;
        //da igual poner gatos=null porqe va a ser null;
    }
    public Sim(String nombre, String apellido, char g, Sim madre, Sim padre){
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=g;
        this.hambre=50;
        this.sueño=50;
        this.suciedad=50;
        this.aburrimiento=50;
        this.madre=madre;
        this.padre=padre;
        this.perros=null;
        this.gatos=null;
        //da igual poner gatos=null porqe va a ser null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
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

    public Sim getPadre() {
        return padre;
    }

    public void setPadre(Sim padre) {
        this.padre = padre;
    }

    public Sim getMadre() {
        return madre;
    }

    public void setMadre(Sim madre) {
        this.madre = madre;
    }

    public Perro[] getPerros() {
        return perros;
    }

    public void setPerros(Perro[] perros) {
        this.perros = perros;
    }

    public Gato[] getGatos() {
        return gatos;
    }

    public void setGatos(Gato[] gatos) {
        this.gatos = gatos;
    }

    /**
     * Funcion que resta 20 de hambre al sim qe la llame
     */
    public void comer() {
        this.hambre -= 20;
        //en este caso this es pepe, depende de la variable que lo llame
    }

    /**
     * Funcion que imprime formateados todos los datos de un sim
     *
     * @return todos los datos del sim en varias líneas de texto
     */
    public String toString() {
        String ret = "";
        ret += this.nombre + " " + this.apellido + " (" +
                (genero == 'h' ? "Hombre" : genero == 'm' ? "Mujer" : "Género Neutro") +
                ")\n\t Sueño: " + this.sueño +
                "\n\t Hambre: " + this.hambre +
                "\n\t Suciedad: " + this.suciedad +
                "\n\t Aburrimiento:" + this.aburrimiento;
        if(perros!=null||gatos!=null){
            ret+="\n\t Dueño de: ";
        }/*
                + (perros != null ? perros[0].nombre :"no tiene dueño, adoptalo")
                +"\n\t Dueño del gato: "
                + (gatos != null ? gatos[0].nombre : " no tiene dueño, adoptalo");*/
        if (perros != null) {
            for (byte i = 0; i < perros.length; i++) {
                ret += perros[i];
            }
            if (gatos != null) {
                for (byte i = 0; i < gatos.length; i++) {
                    ret += gatos[i];
                }
            }



        }return ret;
    }
}
