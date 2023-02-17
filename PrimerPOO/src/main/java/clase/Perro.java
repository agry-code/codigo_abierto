package clase;

/**
 * Clase de perro
 */
public class Perro {
    /** El nombre del perro**/
    private String nombre; //ESTO NO SE HACE
    /** El genero del perro, tiene que valer h - hombre, m - mujer o n - neutro**/
    private char genero;
    /** El hambre del perro de 0 a 100, siendo 0 muerto de hambre y 100 siendo atope de comida**/
    private byte hambre;
    /** El sueño del perro de 0 a 100...**/
    private byte sueño;
    /** Lo warro que es el perro de 0 a 100...**/
    private byte suciedad;
    /** El aburrimiento del perro de 0 a 100...**/
    private byte aburrimiento;
    /** raza del perro **/
    private String raza;
    /** pelaje del perro**/
    private String pelaje;
    /**Dueño del perro**/
    private Sim dueño;

    public Perro(String nombre,String raza, String pelaje, char genero, Sim dueño) {
        this.nombre = nombre;
        this.genero = genero;
        this.hambre = 50;
        this.sueño = 50;
        this.suciedad = 50;
        this.aburrimiento = 50;
        this.raza = raza;
        this.pelaje = pelaje;
        this.dueño = dueño;
    }
    //getter de String
    public String getNombre(){
        return this.nombre;
    }
    public char getGenero(){
        return this.genero;
    }
    public void setNombre(String n){
        this.nombre=n;
    }
    public Sim getDueño(){
        return this.dueño;
    }
    public void setDueño(Sim d){
        this.dueño=d;
    }
// NO TIENE SENTIDO ASI QUE LO ELIMINO
//    public void setGenero(char genero) {
//        this.genero = genero;
//    }

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

    public  void comer(){
        this.hambre-=20;
    }
    public String toString(){
        String ret="";
        ret+=this.nombre+"-"+this.raza +"-"+this.pelaje+" ("+
                (genero=='h'?"Perro":"Perra")+
                ")\n\t Sueño: "+this.sueño+
                "\n\t Hambre: "+this.hambre+
                "\n\t Suciedad: "+this.suciedad+
                "\n\t Aburrimiento:"+this.aburrimiento+
                "\n \t Su dueño es:"+(dueño!=null? this.dueño.nombre : "no tiene dueño");
        //si pongo this.dueño me da el toStringto de SIM o me da todas la info de todas las variables

        return ret;
    }
}
