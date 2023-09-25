package modelo;

import java.math.BigDecimal;

public class orcamento {
    public BigDecimal valorOrcamento;
    public String icmsRegiao;

    public orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.icmsRegiao = icmsRegiao;
    }
}
