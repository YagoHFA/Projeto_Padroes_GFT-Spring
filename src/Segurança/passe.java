package Segurança;

public class passe implements IAcesso{

    @Override
    public void acesso() {
        System.out.println("Identidade valida, passagem livre");
    }
}
