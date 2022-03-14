package com.estacio.programacaoII;

import java.text.MessageFormat;

public class Usina {

    public Usina() {
        this.nome = "Sem nome";
        this.potenciaMaximaEmMegawatts = 0;
        this.geracaoAtualEmMegawatts = 0;
    }

    public Usina(
            String nome,
            double potenciaMaximaEmMegawatts,
            double geracaoAtualEmMegawatts) {
        this.nome = nome;
        this.potenciaMaximaEmMegawatts = potenciaMaximaEmMegawatts;
        this.geracaoAtualEmMegawatts = geracaoAtualEmMegawatts;
    }

    public String mostrarUsina() {
        return MessageFormat.format(
                "Nome: {0}; Potência Máxima: {1}; Geração Atual: {2} [Valores em Megawatts]",
                this.nome,
                this.potenciaMaximaEmMegawatts,
                this.geracaoAtualEmMegawatts);
    }

    private String nome;
    private double potenciaMaximaEmMegawatts;
    private double geracaoAtualEmMegawatts;

}
