package Segurança;

public class Seguranca implements IAcesso{


    @Override
    public void acesso() {
        System.out.println("Identidade valida, acesso ao sistema de seguranca");;
    }
}
