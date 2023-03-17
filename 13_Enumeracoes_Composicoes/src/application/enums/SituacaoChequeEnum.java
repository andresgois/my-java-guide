package application.enums;

public enum SituacaoChequeEnum {
    ZERO    (0, "BLOQUEADO"),
    UM      (1, "ENTREGUE_DESBLOQUEADO"),
    DOIS    (2, "COMPENSADO"),
    TRES    (3, "SAQUE_NO_CAIXA"),
    QUATRO  (4, "DEVOLVIDO_PODE_REAPRESENTAR"),
    CINCO   (5, "SUSTADO"),
    SEIS    (6, "CANCELADO"),
    SETE    (7, "BLOQUEADO_DEVOLVIDO_CORREIO"),
    OITO    (8, "DEVOLVIDO_NAO_REAPRESENTAR"),
    NOVE    (9, "FOLHA_CHEQUE_CANCELADA");
    
    private int codigo;
    private String descricao;


    private SituacaoChequeEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static String getByCodigo(int codigo) {
        for (SituacaoChequeEnum s : SituacaoChequeEnum.values()) {
            if (s.getCodigo() == codigo) {
                return s.getDescricao();
            }
        }
        return String.valueOf(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
