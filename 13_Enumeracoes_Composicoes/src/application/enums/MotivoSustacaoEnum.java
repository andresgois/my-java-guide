package application.enums;

import java.util.HashMap;
import java.util.Map;

public enum MotivoSustacaoEnum {
    
    CO("CO", "ENVIO_CORREIO"),
    RO("RO", "ROUBO"),
    RM("RM", "ROUBO_MALOTE"),
    PE("PE", "PERDA"),
    EX("EX", "EXTRAVIO"),
    BJ("BJ", "BLOQUEIO_JUDICIAL"),
    BL("BL", "NAO_ENTREGUE"),
    CC("CC", "CANCELADO_PELO_CLIENTE"),
    OU("OU", "OUTROS"),
    FU("FU", "FURTO"),
    RC("RC", "ROUBO_MALOTE_CORREIOS"),
    MF("MF", "MUDANCA_FAIXA"),
    EM("EM", "ENCERRAMENTO_CONTA"),
    RN("RN", "ROUBO_TALAO_NAO_ENTREGUE"),
    TESTE_ESPACO("TESTE DE ESPACO", "Testes"),
    ID("ID", "INUTILIZACAO");
    
    // INICIALIZADOR ESTÁTICO DO JAVA CONTENDO A LÓGICA PARA POPULAR A CONSTANTE “FUNCAOPORVALOR”.
    private static final Map<String, MotivoSustacaoEnum> funcaoPorValor = new HashMap<>();
    private String codigo;
    private String descricao;
    
    static {
        for(MotivoSustacaoEnum motivo: MotivoSustacaoEnum.values()){
            funcaoPorValor.put(motivo.getCodigo(), motivo);
        }
    }
    // MÉTODO PEGAFUNCAOPORVALOR QUE RECEBE POR PARÂMETRO O VALOR.
    public static MotivoSustacaoEnum pegaFuncaoPorValor(String valor) {
        return funcaoPorValor.get(valor);
    }

    private MotivoSustacaoEnum(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        for (MotivoSustacaoEnum s : MotivoSustacaoEnum.values()) {
            if (s.getCodigo().equals(codigo)) {
                return s.getDescricao();
            }
        }
        return codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // IMPLEMENTAÇÃO
    // https://felixgilioli.medium.com/como-pegar-um-enum-pelo-valor-em-java-d49cdc9bac17
}
