import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        double salarioBase = 2000.0;
        //selecaoCandidatos(salarioBase);
        //candidatosSelecionados();
        ligandoCandidatos();
    }

    //Use Case 4
    static void ligandoCandidatos(){
        System.out.println("Use Case 4");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }        
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "° tentativa!");
        }else{
            System.out.println("Não conseguimos contato com " + candidato + " após as " + tentativasRealizadas + " tentativas!");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    //Use Case 3
    static void candidatosSelecionados(){
        System.out.println("Use Case 3");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato " + candidatos[i] + " foi selecionado!");
        }
    }

    //Use Case 2
    static void selecaoCandidatos( double salarioBase){
        System.out.println("Use Case 2");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniel", "João"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " deseja ter um salário de " + salarioPretendido);
            if(salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado!");
                candidatosSelecionados++;
            }
            System.out.println("O Candidato " + candidato + " não foi selecionado!");
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //Use Case 1
    static void analisarCandidato( double salarioPretendido, double salarioBase){
        System.out.println("Use Case 1");
        if(salarioBase >= salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase == salarioBase){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
