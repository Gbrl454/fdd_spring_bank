package dtec.bank.api.entity.dto;

import dtec.bank.api.entity.Agencia;
import dtec.bank.api.entity.Transferencia;

public record DadosDetalhamentoTransferencia() {
    public DadosDetalhamentoTransferencia (Transferencia transferencia) {
        this();
    }
}
