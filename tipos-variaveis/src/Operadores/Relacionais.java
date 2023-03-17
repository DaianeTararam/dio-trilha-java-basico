package Operadores;

public class Relacionais {
    public static void main(String[] args){
        String nomeUm = "DAIANE";
        String nomeDois =  new String("DAIANE");
//Quando formos utilizar objetos, é interessante que utilizemos os equals
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 ==numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira.");
        }
        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 !=numero2;
        System.out.println("numeroUm é diferente do numeroDois?" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que o numeroDois?" + simNao);

    }
}
