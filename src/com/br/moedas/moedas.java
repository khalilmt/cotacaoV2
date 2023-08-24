package com.br.moedas;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class moedas {

    private BigDecimal valor;
    private static final String UNIDADE_REAL = "R$";
    private static final String UNIDADE_DOLLAR = "U$";
    private static final DecimalFormat REAL = new DecimalFormat(UNIDADE_REAL + " #,###,##0.00");
    private static final DecimalFormat DOLLAR = new DecimalFormat(UNIDADE_DOLLAR + " #,###,##0.00");

    public moedas(String valor) {
        this.valor = new BigDecimal(valor);
    }

    public BigDecimal getValor(){
        return valor;
    }

    public String getUnidadeReal() {
        return REAL.format(valor);
    }

    public String getUnidadeDollar() {
        return DOLLAR.format(valor);
    }

    public String converterParaDolar(BigDecimal cotacao) {
        BigDecimal valorEmDolares = valor.divide(cotacao, 2, BigDecimal.ROUND_HALF_EVEN);
        return DOLLAR.format(valorEmDolares);
    }

    public String converterParaReal(BigDecimal cotacao){
        BigDecimal valorEmReais = valor.multiply(cotacao).setScale(2,BigDecimal.ROUND_HALF_EVEN);
        return REAL.format(valorEmReais);
    }

}


