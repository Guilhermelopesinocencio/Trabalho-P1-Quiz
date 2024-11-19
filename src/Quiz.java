import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UNIFAN - CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println("ALUNO: GUILHERME LOPES INOCENCIO");
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println(" ");
        System.out.println("BEM VINDO AO QUIZ DE PERGUNTAS SOBRE O FILME HARRY POTTER, O QUAL DEVERÁ RESPONDER 15 PERGUNTAS DE MÚLTIPLA ESCOLHA, CONTENDO SOMENTE UMA ALTERNATIVA CORRETA");
        System.out.println(" ");

        Questao q1 = new Questao(
                "Qual foi a primeira vez que Harry Potter viu Sirius Black no terceiro filme?",
                "A) Quando entram no Salgueiro Lutador",
                "B) Quando chegam em Hogwarts no terceiro filme",
                "C) Quando saiu de casa depois do incidente com Tia Guida",
                "D) Dentro do Noitibus Andante",
                "E) Quando utilizou o primeiro Patrono",
                "C"
        );

        Questao q2 = new Questao(
                "Qual foi a primeira vez que Harry Potter viu Sirius Black no terceiro filme?",
                "A) 4",
                "B) 7",
                "C) 5",
                "D) 9",
                "E) 2",
                "B"
        );

        // Criação da lista de questões
        List<Questao> questoes = new ArrayList<>();
        questoes.add(q1);
        questoes.add(q2);

        // Embaralhando as questões
        Collections.shuffle(questoes);

        int acertos = 0;
        int erros = 0;

        for (Questao questaoAtual : questoes) {
            questaoAtual.escrevaQuestao();

            System.out.print("Digite a sua resposta (A/B/C/D/E): ");
            String respostaUsuario = scanner.nextLine().toUpperCase();

            if (questaoAtual.isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Exibindo o resultado final
        int total = questoes.size();
        double porcentagemAcertos = (acertos / (double) total) * 100;
        double porcentagemErros = (erros / (double) total) * 100;

        System.out.println("Quiz finalizado!");
        System.out.println("Número de acertos: " + acertos + " (" + String.format("%.2f", porcentagemAcertos) + "%)");
        System.out.println("Número de erros: " + erros + " (" + String.format("%.2f", porcentagemErros) + "%)");

        scanner.close();
    }
}