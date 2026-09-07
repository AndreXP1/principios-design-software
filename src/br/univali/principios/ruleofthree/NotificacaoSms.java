package br.univali.principios.ruleofthree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotificacaoSms {

    public void enviarSmsAlerta(String numeroTelefone, String mensagem) { //breakpoint aqui

        String dataFormatada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String mensagemLimpa = mensagem == null ? "" : mensagem.trim();
        String rodapePadrao = "Mensagem enviada automaticamente pelo Sistema";

        String corpoFinal = String.format("[%s] DESTINATÁRIO: %s\nCONTEÚDO: %s\n%s",
                dataFormatada, numeroTelefone.toUpperCase(), mensagemLimpa, rodapePadrao);

        System.out.println("  [SMS ENVIADO]\n" + corpoFinal);
    }
}
