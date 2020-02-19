package numeromagico;

import java.util.Random;

public class NumeroMagico {

    private  Random r;
    private int numeroMagico,intentos;
    
    public NumeroMagico(){
        r= new Random();
        numeroMagico=r.nextInt(100)+1;
        intentos=0;
    }
    public int acierto(int numero){
        int acierto;
        if(numero==numeroMagico){
            acierto=1;
        }else if(numero<numeroMagico){
            acierto=0;
        }else{
            acierto=-1;
        }
        intentos++;
        return acierto;
    }
    public int getIntentos(){
        return intentos;
    }
    public void nuevojuego(){
        numeroMagico=r.nextInt(100)+1;
        intentos=0;
    }

   
    
}
