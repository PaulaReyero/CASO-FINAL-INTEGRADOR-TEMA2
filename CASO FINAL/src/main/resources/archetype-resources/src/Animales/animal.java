package Animales;
import java.util.Random;

public class animal{
    String nombre;
    int edad;
    String especie;
    boolean sexo;
    float peso;
    String habitat;
    String alimentacion;
    String reproduccion;
    boolean salud;
    boolean comportamiento;
    String id;
    boolean esVivo;

    public class animal(String nombre, int edad, String especie, boolean sexo, float peso, String habitat, String alimentacion, String reproduccion, boolean enfermedades, boolean salud, boolean comportamiento, String id){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.sexo = sexo;
        boolean peso = peso;
        this.habitat = habitat;
        this.allimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.salud = salud;
        this.comportamiento = comportamiento;
        this.id = generarId();
        this.esVivo = true;
    }

    private String generarId(){
        String id ="";
        Random r = nnew Random();
        for (int i = 0; i< 5; i++){
            id += r.nextInt(10);
        }
        return id;
    }


}
