import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static List<String> candidatosSelecionados = new ArrayList<>();
    static List<String> candidatos = new ArrayList<>();
    static double salarioBase = 2000.0;
    public static void main(String[] args) {
        candidatos.addAll(List.of("FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "PRDRO", "JOAO", "MALAQUIAS", "JULIANA"));
        selecionarCandidato(candidatos, salarioBase);
        imprimirSelecionados(candidatosSelecionados);
        for(String candidato:candidatosSelecionados){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.printf("Conseguimos contato com %s na %d tentativa\n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contato com %s, número máximo de tentativas %d\n", candidato, tentativasRealizadas);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(List<String> selecionados){
        System.out.println("Imprimindo lista de candidatos selecionados");
        for (int i = 0; i < selecionados.size(); i++) {
            System.out.printf("O candidato de nº %d - %s foi selecionado\n", i+1, selecionados.get(i));
        }
    }

    static void selecionarCandidato(List<String> candidatos, double salarioBase){
        int qtdeCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        while(qtdeCandidatosSelecionados < 5 && candidatoAtual < candidatos.size()){
            String candidato = candidatos.get(candidatoAtual);
            double salarioPretendido = valorPretendido();
            System.out.printf("O candidate %s solicitou este valor de salário %.2f\n", candidato, salarioPretendido);
            if (analisarCandidato(salarioPretendido, candidato)){
                qtdeCandidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean analisarCandidato(double salarioPretendido, String candidato){
        if (salarioBase >= salarioPretendido){
            candidatosSelecionados.add(candidato);
            return true;
        }
        return false;
    }

//    static void analisarCandidato(){
//        if(salarioBase > salarioretendido){
//            System.out.println("LIGAR PARA O CANDIDATO");
//        } else if(salarioBase==salarioretendido){
//            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
//        } else {
//            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
//        }
//    }
}