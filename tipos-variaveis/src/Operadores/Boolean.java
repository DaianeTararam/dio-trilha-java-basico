package Operadores;

public class Boolean {
    public static void main(String[] args){
        boolean variavel = true;
        //System.out.println(!variavel);
        //A variavel original continua sendo true, até que seja atribuida a ela um novo valor
        //Pra que seja falsa, ela deve ser ela mesma só que negando(!)
        variavel = !variavel;
        System.out.println(variavel);
    }
}
