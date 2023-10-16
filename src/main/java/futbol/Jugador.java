package futbol;

import static java.lang.Math.abs;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre,int edad,String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados=golesMarcados;
        this.dorsal=dorsal;
    }
    public Jugador(){
        super();
        this.golesMarcados=289;
        this.dorsal=7;
    }

    public void setGolesMarcados(short golesMarcados) {this.golesMarcados = golesMarcados;}
    public short getGolesMarcados() {return golesMarcados;}

    public void setDorsal(byte dorsal) {this.dorsal = dorsal;}
    public byte getDorsal() {return dorsal;}

    @Override
    public int compareTo(Object o) {
        Object a=o;
        return abs(this.edad-((Jugador)a).edad);
    }
    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados+".";
    }
}
