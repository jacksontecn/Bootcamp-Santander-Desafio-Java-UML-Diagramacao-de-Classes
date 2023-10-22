package src.aparelhoTelefone;

import java.util.ArrayList;
import java.util.List;

public class Phone{

    private List<Contatos> contatos;

    public Phone() {
        this.contatos = new ArrayList<>();
    }

    public void addContatos(String nome, long numero, String email){
        contatos.add(new Contatos(nome,numero,email));
    }

    public void ligar(){
        System.out.println("Ligando.");
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Você tem mensagens do(s) contato(s) : " + contatos.getNome());

    }


}
