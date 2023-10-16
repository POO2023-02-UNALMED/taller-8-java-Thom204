package futbol;

import static java.lang.Math.abs;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero (String nombre,int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos=golesRecibidos;
        this.dorsal=dorsal;
    }
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public int getEdad() {return this.edad;}
    public String getPosicion() {return this.posicion;}
    public void setGolesRecibidos(short golesRecibidos) {this.golesRecibidos = golesRecibidos;}
    public short getGolesRecibidos() {return golesRecibidos;}
    public void setDorsal(byte dorsal) {this.dorsal = dorsal;}
    public byte getDorsal() {return dorsal;}

    @Override
    public int compareTo(Object o) {
        Object a=o;
        return abs(this.golesRecibidos- ((Portero)a).getGolesRecibidos());
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public String toString(){
        return super.toString()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
    }
}
