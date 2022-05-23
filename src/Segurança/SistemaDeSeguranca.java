package Segurança;

public class SistemaDeSeguranca {

    private IAcesso iacesso;

    public void setIacesso(IAcesso iacesso) {
        this.iacesso = iacesso;
    }
    public void acesso(){
        iacesso.acesso();
    }
}