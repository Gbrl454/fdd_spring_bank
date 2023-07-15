package dtec.bank.api.domain.conta;

import java.math.BigDecimal;

public record DadosDetalhamentoConta(Long id, Long idAgencia, Long idUsuario, Double saldo, TipoConta tipo,
                                     Boolean cartao_de_credito, Double saldo_cartao_de_credito, Boolean lis,
                                     Double saldo_lis) {
    public DadosDetalhamentoConta (Conta conta) {
        this(conta.getId(), conta.getAgencia().getId(), conta.getUsuario().getId(), conta.getSaldo(), conta.getTipo(), conta.getCartao_de_credito(), conta.getSaldo_cartao_de_credito(), conta.getLis(), conta.getSaldo_lis());
    }
}
