package JavaDocs;

public class Comentarios {
    // Olá, eu sou um comentário em uma única linha (one line)

    /* Olá,
    * Eu sou um comentário
    * que posso ser mais detalhado
    * quando necessário,
    * sou um comentario mais robusto (Mult line)
     */

/**
 * Estas duas estrelinhas
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação. (Documentation)
 * Que incrível!!!
 */

/*
* Este método foi elaborado as pressas
* por isso eu abreveei o nome das variaveis
* mas, ele tem a finalidade somar ou multiplicar
* dois números
 */
    public int somaMultiplica (int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { //M = multiplicação
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}

