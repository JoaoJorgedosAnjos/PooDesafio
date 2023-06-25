package aparalho;

import aparalho.apps.AparalhoTelefonico;
import aparalho.apps.NavegadorInternet;
import aparalho.apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparalhoTelefonico {

    public void tocar() {
        System.out.println("TOCANDO UM MÚSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO UM MÚSICA");
    }

    public void ligar() {
        System.out.println("LIGANDO PARA...");
    }

    public void atender() {
        System.out.println("ATENDENDO A LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA...");
    }

    public void adicionarAba() {
        System.out.println("ADICIONANDO ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
}

