package br.com.algaWorks.src.main.Aulas.enums.aritmetica;

public enum OperacaoAritmetica {

    ADICAO {
        public int operacao(int x, int y) {
            return x + y;
        }
    },
    SUBTRACAO {
        public int operacao(int x, int y) {
            return x - y;
        }
    };

    public abstract int operacao(int x, int y);

}
