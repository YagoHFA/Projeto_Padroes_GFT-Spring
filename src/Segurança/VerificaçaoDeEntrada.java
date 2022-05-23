package Segurança;
import java.util.Scanner;
public class VerificaçaoDeEntrada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ID;
        identificacao identidade= new identificacao();
        Seguranca verificar = new Seguranca();
        Cameras camera = new Cameras();
        passe passagem = new passe();

        SistemaDeSeguranca sisseg = new SistemaDeSeguranca();
        System.out.println("Digitar ID");
        ID = scan.nextBoolean();
        if(ID == true){
            sisseg.setIacesso(identidade);
            sisseg.acesso();
            sisseg.setIacesso(verificar);
            sisseg.acesso();
            sisseg.setIacesso(camera);
            sisseg.acesso();
            sisseg.setIacesso(passagem);
            sisseg.acesso();
        }
        else{
            System.out.println("ID invalido");
        }
    }
}
