package org.example;

import PatterFactory.IcmsFactory;
import modelo.orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){

        orcamento orcamento new orcamento(new BigDecimal("1000.00"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_MG").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}
