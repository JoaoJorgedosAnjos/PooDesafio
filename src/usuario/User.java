package usuario;

import aparalho.Iphone;
import aparalho.apps.AparalhoTelefonico;
import aparalho.apps.NavegadorInternet;
import aparalho.apps.ReprodutorMusical;

public class User {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        ReprodutorMusical reprodutorMusical = iphone1;
        AparalhoTelefonico aparalhoTelefonico = iphone1;
        NavegadorInternet navegadorInternet = iphone1;

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        aparalhoTelefonico.iniciarCorreioVoz();
        aparalhoTelefonico.atender();
        aparalhoTelefonico.ligar();

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarAba();
        navegadorInternet.adicionarAba();
    }
}
