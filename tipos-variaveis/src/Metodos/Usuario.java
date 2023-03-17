package Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        smartTv.desligar();
        smartTv.ligar();

        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
