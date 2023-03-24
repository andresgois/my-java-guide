package application.enums;

public enum TipoContaDestinoEnum {
   
    CONTA_CORRENTE("CC"),
    CONTA_POUPANCA("PP"),
    CONTA_PAGAMENTO("PG");
    
    private String codigo;

    TipoContaDestinoEnum(String codigo) {
        this.codigo = codigo;
    }
    
    public static String getTipoConta(String codigo) {
        for (TipoContaDestinoEnum s : TipoContaDestinoEnum.values()) {
            if (s.toString().equalsIgnoreCase(codigo)) {
                return s.getCodigo();
            } 
        }
        return null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }  
}
