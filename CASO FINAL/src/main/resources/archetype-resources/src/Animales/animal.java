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

    public animal(String nombre, int edad, String especie, boolean sexo, float peso, String habitat, String alimentacion, String reproduccion, boolean enfermedades, boolean salud, boolean comportamiento, String id){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.sexo = sexo;
        this.peso = peso;
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
        Random r = new Random();
        for (int i = 0; i< 5; i++){
            id += r.nextInt(10);
        }
        return id;
    }
    public String getId(){
        return id;
    }  //tengo que hacer un setter para id?
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public boolean getSexo(){
        if(sexo= TRUE){
            return "Macho";
        }else{
            return "Hembra";
        }
    }
    public void setSexo(boolean sexo){
        this.sexo = sexo;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getAlimentacion(){
        return alimentacion;
    }
    public void setAlimentacion(String alimentacion)
    this.alimentacion = alimentacion;
    public String getReproduccion(){
        return reproduccion;
    }
    public void setReproduccion(String reproduccion){
        this.reproduccion = reproduccion;
    }
    public boolean getSalud(){
        return salud;
    }
    public void setSalud(boolean salud){
        this.salud = salud;
    }
    public boolean getComportamiento(){
        return comportamiento;
    }
    public void setComportamiento(boolean comportamiento){
        this.comportamiento = comportamiento;
    }
}
