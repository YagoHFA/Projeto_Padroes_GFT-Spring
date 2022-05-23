package Segurança;

public class Cameras implements IAcesso {
    @Override
    public void acesso() {
        System.out.println("Identidade valida, acesso as cameras permitido");
    }


}
