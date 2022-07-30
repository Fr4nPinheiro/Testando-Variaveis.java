package br.com.dio.Operadores_Aritmeticos.Variaveis;

public class Variaveis {

    public static void main(String[] args) {

        // ANALISANDO VARIÁVEIS DENTRO DO MÉTODO MAIN.

        int i;   // (Variável simpes, inteira, não gera erro, porém deve ser evitada, pois, não facilita a identificação)
//      int i;   // (Não pode haver 2 varáveis com o mesmo nome).
        int I;   // (Por ser case sensitive, "int = i" e "int = I", são variáveis diferentes por estarem em maiúscula e minúscula)
//      int 1a;   // (Não pode começar com números)
        int _1a;
        int $aq;
//      (Iniciar com "_" e "$", não gera erro de compilação, porém deve ser evitado por não ser uma boa prática)

        i = 5;
        I = 10;
        _1a = 15;
        $aq = 8;
//      (SEMPRE inserir valor inicial para as variáveis dentro de métodos)



        final int j = 10;   // (Varáveis com "final" tornam-se constantes. SEMPRE devem conter o valor)
//		j = 15   // (Esse valor não pode ser alterado, pois, foi pré definido desde o início)
        int asrn24678md;   // (Pode conter números no meio do nome, só não pode começar com número)
//      int asrn246 78md;   // (Não pode conter espaço)
        int asrn2$4678_md;   // ("_" e "$", não gera erro de compilação, porém devem ser evitados, pois, não é uma boa prática)
//      int asrn2$46%78_md = 10;   // (Não pode conter caracteres especiais)


        asrn24678md = 5;
        asrn2$4678_md = 10;



        int quantidadeProduto = 4;   // (Notação camelo, palavras seguintes à peimeira, devem começar com letra maiúscula)
//      int QuantidadeProduto;   // (Porém a primeira palavra deve começar com letra minúscula, não gera erro, porém, não é uma boa prática)
        final int NUMERO_DE_TENTATIVAS = 5;   //(Constantes, devem ser escritas com letras maiúsculas e separadas com "_", exceção à regra do uso do "_")
//      final int numeroTentativas = 5;   // (Não gera erro de compilação, porém não é uma boa prática)
//      int qtdProd;   // (Nomes de variáveis precisam ser expressivos, para facilitar a identificalção.não gera erro, porém, não é uma boa prática)
        int a;   // (Porém em laço de repetição, pode-se usar uma variável simples, pois ela será descartada ao final do laço)



        a = 9;



        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);


        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);


        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_DE_TENTATIVAS);
        System.out.println(a);



    }


}
