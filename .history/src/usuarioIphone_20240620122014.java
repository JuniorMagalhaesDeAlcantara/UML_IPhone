import musica.reprodutorMusica;
import callControl;

public class usuarioIphone {
    public static void main(String[] args) {
        iphone iphone = new iphone();
        reprodutorMusica Ipod = (reprodutorMusica) iphone;
        callControl telefone = (callControl) iphone;

        System.out.println("Musica");
        Ipod.selecionarMusica();
        telefone.atender();
    }
}
