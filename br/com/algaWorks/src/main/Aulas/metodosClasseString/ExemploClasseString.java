package br.com.algaWorks.src.main.Aulas.metodosClasseString;

public class ExemploClasseString {

    public static void main(String[] args) {

        String nome = "Pedro";
        System.out.println(nome.toUpperCase());
        System.out.println(nome);

        nome = nome.toUpperCase();
        System.out.println(nome);

        System.out.println("\n# # # # # # # # # #\n");

        String s1 = "Pedro";
        String s2 = "Pedro";

        System.out.println("s1 == s2? " + (s1 == s2));

        String s3 = new String("Pedro");

        System.out.println("s3 == s2? " + (s3 == s2));

        System.out.println("s2.equals(s3)? " + (s2.equals(s3)));

        String s4 = "PeDrO";
        System.out.println("s1.equals(s4)? " + s1.equals(s4));

        System.out.println("\n# # # # # # # # # #\n");

        String s = "algaworks";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));

        /*
         * Procurar um valor maior que a String retornara um erro
         * 
         * System.out.println(s.charAt(99));
         */

        System.out.println("\n# # # # # # # # # #\n");

        String f = "Cursos online";

        System.out.println(f.length());

        // A contagem da String inicia no 0

        System.out.println(f.charAt(12));

        System.out.println("\n# # # # # # # # # #\n");

        char[] array = { 'o', 'l', 'A' };

        String a = new String(array);
        System.out.println(a);

        System.out.println("\n# # # # # # # # # #\n");

        /*
         * public String substring(int beginIndex)
         * public String substring(int beginIndex, int endIndex)
         */

        String j = "Desenvolvimento java";
        System.out.println(j.substring(16));
        System.out.println(j);

        String c = "cursos online de desenvovimento de software";
        // O endIndex pega a posicao inserida e exclui ela monstrando assim o anterior
        System.out.println(c.substring(7, 13));
        System.out.println(c);

        System.out.println("\n# # # # # # # # # #\n");

        String t = "     algaworks   ";
        System.out.println("Com o metodo trim: >" + t.trim() + "<");
        System.out.println("Sem o metodo trim: >" + t.trim() + "<");

        System.out.println("\n# # # # # # # # # #\n");

        String c2 = "Cursos_online_de_desenvolvimento_de_software";
        // String x = "12;40.30;12;";
        String[] arrayc2 = c2.split("_");

        for (int i = 0; i < arrayc2.length; i++) {
            System.out.println("[" + i + "]= " + arrayc2[i]);
        }

        System.out.println("\n# # # # # # # # # #\n");

        String off = "java";
        int indice = off.indexOf('a');
        System.out.println(indice);
        
        indice = off.lastIndexOf('a');
        System.out.println(indice);

        System.out.println("\n# # # # # # # # # #\n");
        
        String l = "Desenvolvimento java";
        System.out.println(l.replace("java", "de software"));

        System.out.println(l);
    }
}
