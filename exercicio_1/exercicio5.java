public class exercicio5 {
    public static void main(String[] args) {

        int idade;
        double salario;
        String nome;
        char sexo;

        idade = 27;
        salario = 500;
        nome = "Nathan Motta";
        sexo = 'M';

        System.out.println("O funcionário: " + nome);
        System.out.println("Do sexo: " + sexo);
        System.out.println("Recebe salário de: " + String.format("%.2f", salario) + " por mês.");

    }

}
