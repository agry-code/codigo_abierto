package org.example;

import clase.Gato;
import clase.Perro;
import clase.Sim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase UpperCamelCase
        //variable lowerCamelCase
        //Declaración orientada a objeto:
        Scanner sc = new Scanner(System.in);
        //esto es una instancia de persona u objeto de persona (variable de tipo no basico inicializada)
       /* NO NOS HACE FALTA DECLARARLO EN EL MAIN, LO METEMOS EN EL ARGUMENTO
       pepe.nombre = "Pepe";
        pepe.apellido = "Gonzale";
        pepe.genero = 'h';
        pepe.hambre = 50;
        pepe.sueño = 50;
        pepe.aburrimiento = 50;
        pepe.suciedad = 50;*/
        //System.out.println(eufrasio.padre);//me imprime a pepe qe es su padre
        Sim pepe = new Sim("Pepe","Gonzale",'h',(byte) 50,(byte)50,(byte)50,(byte)50,null,null,null,null);
        Sim eufrasio=new Sim("Eufrasio","Buhero",'h');
        Sim elvira = new Sim("Elvira","Lapida",'m',null,pepe);
        Perro luffy = new Perro("luffy","Border-Collie","suavesito",'h',eufrasio);
        Gato mico = new Gato("Mico","Blanco","Multicolor",'h',elvira);

        System.out.println(luffy.getNombre());
        System.out.println(luffy.getGenero());
        luffy.setNombre("Zorro");

        //elvira.perros=new Perro[]{ luffy };
        elvira.perros = new Perro[1];
        elvira.perros[0] = luffy;
        pepe.madre = elvira;
        luffy.dueño = elvira;
        // System.out.println(eufrasio.padre.madre); //me imprime a elvira qe es su abuela

        pepe.gatos = new Gato[1];
        pepe.gatos[0] = mico;
        mico.dueño = pepe;
        System.out.println(elvira);
        System.out.println("//---------------------------\\\\");
        System.out.println(mico);
        System.out.println(luffy);

    }
}