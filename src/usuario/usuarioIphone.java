package usuario;
import internet.internet;
import iphone.iphone;
import musica.reprodutorMusica;
import telefone.telefone;


public class usuarioIphone {
    public static void main(String[] args) {
        iphone iphone = new iphone();
        reprodutorMusica Ipod = (reprodutorMusica) iphone;
        telefone telefone = (telefone) iphone;
        internet Internet = (internet) iphone;

        System.out.println("\nMusica\n");
        Ipod.selecionarMusica();
        Ipod.pausar();
        Ipod.tocar();
       
        System.out.println("\nTelefone\n");
        telefone.atender();
        telefone.correioDeVoz();
        telefone.ligar();

        System.out.println("\nInternet\n");
        Internet.adicionarNovaAba();
        Internet.atualizarPagina();
        Internet.exibirPagina();

        System.out.println("\nSucesso!\n");
    }
}
