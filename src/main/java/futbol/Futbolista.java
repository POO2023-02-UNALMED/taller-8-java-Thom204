package futbol;

public abstract class Futbolista implements Comparable<Object>{
    String nombre;
    int edad;
    final String posicion;

    public Futbolista(String nombre,int edad,String posicion){
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
    }
    public Futbolista(){
        this("Maradona",30,"delantero");
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public int getEdad() {return edad;}
    public String getPosicion() {return posicion;}

    public boolean equals(Futbolista f){
        if (this ==f){
            return true;
        }
        else{return false;}
    }

    @Override
    public int compareTo(Object o) {
        Object a= o;
        if (this== ((Futbolista)a)){
            return 0;
        }else{return 1;}
    }

    public abstract boolean jugarConLasManos();

    public String toString(){
        return("El futbolista "+this.nombre+" tiene "+this.edad+",y juega de "+this.posicion);
    }
}
