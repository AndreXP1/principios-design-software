package br.univali.principios.ruleofthree;

public class Main {

    public static void main(String[] args){
        System.out.println("DEMONSTRAÇÃO: RULE OF THREE (REGRA DOS TRÊS)");

        System.out.println("\n1ª Ocorrência: Formatando e enviando E-mail...");
        NotificacaoEmail email = new NotificacaoEmail();
        email.enviarEmailConfirmacao("cliente@univali.br", " Seu pedido #1092 foi aprovado!");
        System.out.println("Apenas uma ocorrência.");

        System.out.println("\n2ª Ocorrência: Formatando e enviando SMS...");
        NotificacaoSms sms = new NotificacaoSms();
        sms.enviarSmsAlerta("+5547999998888", " Seu pedido #1092 saiu para entrega!");
        System.out.println("Repetição porém nao é necessario abstrair");

        System.out.println("\n3ª Ocorrência: Formatando e enviando Push Notification...");
        NotificacaoPush push = new NotificacaoPush();
        push.enviarPushNotification("TOKEN-DEV-99812", " Seu pedido #1092 foi entregue!");
        System.out.println("Terceira repetição ja é consideravel refatorar");

        System.out.println("\nAPLICANDO REFATORAÇÃO (classe FormatadorNotificacao)\n");

        String emailRefatorado = FormatadorNotificacao.formatarMensagem("cliente@univali.br", "Seu pedido #1092 foi aprovado!");
        System.out.println("  [EMAIL REFATORADO]\n" + emailRefatorado);

        String smsRefatorado = FormatadorNotificacao.formatarMensagem("+5547999998888", "Seu pedido #1092 saiu para entrega!");
        System.out.println("  [SMS REFATORADO]\n" + smsRefatorado);

        String pushRefatorado = FormatadorNotificacao.formatarMensagem("TOKEN-DEV-99812", "Seu pedido #1092 foi entregue!");
        System.out.println("  [PUSH REFATORADO]\n" + pushRefatorado);
    }
}
