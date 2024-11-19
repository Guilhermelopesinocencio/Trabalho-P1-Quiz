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

        Questao q3 = new Questao(
                "Qual é o nome completo do professor de Poções em Harry Potter e a Pedra Filosofal?",
                "A) Horácio Slughorn",
                "B) Severus Snape",
                "C) Remo Lupin",
                "D) Filius Flitwick",
                "E) Gilderoy Lockhart",
                "B"
        );

        Questao q4 = new Questao(
                "Quem foi o responsável por salvar Harry de um ataque de dementadores em Harry Potter e o Prisioneiro de Azkaban?",
                "A) Alvo Dumbledore",
                "B) Sirius Black",
                "C) Remo Lupin",
                "D) Harry Potter",
                "E) James Potter",
                "C"
        );

        Questao q5 = new Questao(
                "Qual é o nome do elfo doméstico que servia a família Malfoy e mais tarde se junta a Harry Potter?",
                "A) Dobby",
                "B) Kreacher",
                "C) Winky",
                "D) Hokey",
                "E) Hagrid",
                "A"
        );

        Questao q6 = new Questao(
                "Em Harry Potter e a Câmara Secreta, qual é o nome do monstro que habita a Câmara Secreta?",
                "A) Basilisco",
                "B) Dragão",
                "C) Hidra",
                "D) Acromântula",
                "E) Thestral",
                "A"
        );

        // Criação da lista de questões
        List<Questao> questoes = new ArrayList<>();
        questoes.add(q1);
        questoes.add(q2);
        questoes.add(q3);
        questoes.add(q4);
        questoes.add(q5);
        questoes.add(q6);



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