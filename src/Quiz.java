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

        Questao q7 = new Questao(
                "Em Harry Potter e o Cálice de Fogo, qual escola de magia competiu contra Hogwarts no Torneio Tribruxo?",
                "A) Beauxbatons",
                "B) Durmstrang",
                "C) Ilvermorny",
                "D) Castelobruxo",
                "E) Mahoutokoro",
                "B"
        );

        Questao q8 = new Questao(
                "Qual é o nome do animal de estimação de Hermione Granger?",
                "A) Errol",
                "B) Scabbers",
                "C) Crookshanks",
                "D) Hedwig",
                "E) Fawkes",
                "C"
        );

        Questao q9 = new Questao(
                "O que Harry Potter encontra no Triwizard Tournament (Torneio Tribruxo) em Harry Potter e o Cálice de Fogo ?",
                "A) Uma taça de ouro",
                "B) Uma pedra filosofal",
                "C) Um feitiço de proteção",
                "D) Uma varinha mágica",
                "E) Uma chave dourada",
                "A"
        );

        Questao q10 = new Questao(
                "Em Harry Potter e a Ordem da Fênix, qual é o nome da sociedade secreta formada por Harry para lutar contra as forças das trevas?",
                "A) A Ordem da Fênix",
                "B) A Armada de Dumbledore",
                "C) A Ordem dos Comensais da Morte",
                "D) A Liga dos Magos",
                "E) A Aliança de Hogwarts",
                "B"
        );

        Questao q11 = new Questao(
                "Quem é o responsável por envenenar Harry com uma poção em Harry Potter e o Enigma do Príncipe?",
                "A) Tom Riddle",
                "B) Severus Snape",
                "C) Bellatrix Lestrange",
                "D) Fenrir Greyback",
                "E) Draco Malfoy",
                "B"
        );

        Questao q12 = new Questao(
                "Qual é o nome da irmã de Ron Weasley?",
                "A) Fleur Delacour",
                "B) Luna Lovegood",
                "C) Ginny Weasley",
                "D) Hermione Granger",
                "E) Molly Weasley",
                "C"
        );

        // Criação da lista de questões
        List<Questao> questoes = new ArrayList<>();
        questoes.add(q1);
        questoes.add(q2);
        questoes.add(q3);
        questoes.add(q4);
        questoes.add(q5);
        questoes.add(q6);
        questoes.add(q7);
        questoes.add(q8);
        questoes.add(q9);
        questoes.add(q10);
        questoes.add(q11);
        questoes.add(q12);





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