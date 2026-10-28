public class Enemigo {
    private String nombre;
    private int hp;
    private int maxdanio;
    private int daniobase;

    public Enemigo(String nombre, int hp, int maxdanio, int daniobase){
        this.nombre = nombre;
        this.hp = hp;
        this.maxdanio = maxdanio;
        this.daniobase = daniobase;
    }

    public void  recibirDano(int danio ){
        hp -= danio; 
    }
    public boolean estaDerrotado(){
        boolean estaDerrotado = false;
        if (hp <= 0){
            estaDerrotado = true;
        }
        return estaDerrotado;
    }
    public void atacar(){
        
    }

}
