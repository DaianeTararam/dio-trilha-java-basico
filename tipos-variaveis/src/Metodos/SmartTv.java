package Metodos;
//Sistema de Smart TV
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: " + volume);
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Estamos no canal: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Estamos no canal: " + canal);
    }
}
