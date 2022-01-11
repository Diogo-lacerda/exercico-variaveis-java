package br.com.exercicios.metodos;

import javax.swing.*;
import java.time.LocalDateTime;

/*
A partir da hora do dia, informe a mensagem adequada: bom dia, boa tarde ou boa noite.
 */
public class SegundoExercico {
    public static void main(String[] args) {
       // gerarMensagem(2);
        // LocalDateTime sistema = LocalDateTime.now();
        LocalDateTime sistema = LocalDateTime.of(2022, 1, 11,6 , 32);
        gerarMensagemComHoraDoSistema(sistema);

    }

    private static void gerarMensagemComHoraDoSistema(LocalDateTime horaSistema) {
        int hora = horaSistema.getHour();
        if (hora < 6){
            System.out.println("boa noite");
        }else if (hora <= 12){
            System.out.println("bom dia");
        }
        else if (hora < 18){
            System.out.println("boa tarde");
        }
        else  {
            System.out.println("boa noite");
        }

    }

    private static void gerarMensagem(int horaDoDia) {
        if (horaDoDia < 0 ||horaDoDia >24){
            System.out.println("informe uma hora entre 0 e 24 ");
        }
        else if (horaDoDia < 6){
            System.out.println("boa noite");
        }else if (horaDoDia <= 12){
            System.out.println("bom dia");
        }
        else if (horaDoDia < 18){
            System.out.println("boa tarde");
        }
        else  {
            System.out.println("boa noite");
        }

    }


}
