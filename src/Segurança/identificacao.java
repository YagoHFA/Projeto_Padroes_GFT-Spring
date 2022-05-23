package Segurança;

public class identificacao implements IAcesso{


    @Override
    public void acesso() {

        System.out.println("Identidade valida");
    }
}
