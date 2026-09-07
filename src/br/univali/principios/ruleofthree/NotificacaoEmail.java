package br.univali.principios.ruleofthree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotificacaoEmail {

    public void enviarEmailConfirmacao(String destinatario, String mensagem) { // breakpoint aqui
        String dataFormatada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String mensagemLimpa = mensagem == null ? "" : mensagem.trim();
        String rodapePadrao = "Mensagem enviada automaticamente pelo Sistema";

        String corpoFinal = String.format("[%s] DESTINATÁRIO: %s\nCONTEÚDO: %s\n%s",
                dataFormatada, destinatario.toUpperCase(), mensagemLimpa, rodapePadrao);

        System.out.println("  [EMAIL ENVIADO]\n" + corpoFinal);
    }
}
