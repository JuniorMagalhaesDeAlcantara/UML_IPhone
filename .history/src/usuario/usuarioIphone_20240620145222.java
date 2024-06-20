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

        System.out.println("Musica\n");
        Ipod.selecionarMusica();
        Ipod.pausar();
        Ipod.tocar();
    }
}
