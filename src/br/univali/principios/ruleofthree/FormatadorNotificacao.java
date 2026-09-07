package br.univali.principios.ruleofthree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorNotificacao {

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final String RODAPE_PADRAO = "Mensagem enviada automaticamente pelo Sistema";


    public static String formatarMensagem(String destinatario, String mensagem) { //breakpoint aqui
        String dataFormatada = LocalDateTime.now().format(FORMATO_DATA);
        String mensagemLimpa = mensagem == null ? "" : mensagem.trim();

        return String.format("[%s] DESTINATÁRIO: %s\nCONTEÚDO: %s\n%s",
                dataFormatada, destinatario.toUpperCase(), mensagemLimpa, RODAPE_PADRAO);
    }
}