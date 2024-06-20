import musica.reprodutorMusica;


public class usuarioIphone {
    public static void main(String[] args) {
        iphone iphone = new iphone();
        reprodutorMusica Ipod = (reprodutorMusica) iphone;
        telefone telefone = (telefone) iphone;

        System.out.println("Musica");
        Ipod.selecionarMusica();
        telefone.atender();
    }
}
