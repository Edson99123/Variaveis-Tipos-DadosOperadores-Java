package VariaveisDadosOperadores;

public class Operadores {

    public static void main(String[] args) {
        double valor = 40;
        double desconto = 5;

        // Aqui a multiplica��o acontece primeiro que a subtra��o
        double preco = valor - valor * desconto;

        // Usamos o operador de atribui��o e
        // adi��o ao mesmo tempo
        preco += preco * 0.5;

        // Usamos o operador de incremente e decremento
        // para modificar o valor de tweets
        int tweets = 10;

        // Ao final dessa instru��o tweets ter� valor 11
        tweets++;

        // Ao final dessa instru��o tweets ter� valor 10
        tweets--;

        // Aqui 250 � dividido por 1,
        // depois o valor de demao se torna 2
        int demao = 1;
        int redimentoPorDemao = 250/demao++;

        // Aqui primeiro o valor de demao se torna 2,
        // ent�o 250 � dividido por 2
        int demao1 = 1;
        int redimentoPorDemao1 = 250/++demao1;

        // O valor de resto ser� 5, 11 % 2
        // arredondado para baixo
        double resto = 11 % 2;

        double juros = 5;
        double selic = 10;

        // Testa se juros � maior ou igual a selic, false
        boolean maiorOuIgual = juros >= selic;

        // Testa se juros � igual a selic, false
        boolean igualA = juros == selic;

        // Teste se um boolean � maior que outro
        // resultando em erro de compila��o
        boolean maiorOuIgual1 = true > false;

        // Realiza a opera��o l�gica E entre boolean e int
        // resultando em erro de compila��o
        boolean teste1 = true && 0;

        // Realiza a opera��o l�gica E entre double e boolean
        // resultando em erro de compila��o
        boolean teste2 = true || (valor && true);
    }

}
