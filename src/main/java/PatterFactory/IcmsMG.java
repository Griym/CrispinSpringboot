package PatterFactory;

import modelo.orcamento;

import java.math.BigDecimal;

public class IcmsMG implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.18"));
    }
}
