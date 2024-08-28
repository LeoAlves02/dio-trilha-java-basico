public class ExemploForArray {

    public static void main(String[] args) {
        // Em arrays o índice começa em 0
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

    }
}