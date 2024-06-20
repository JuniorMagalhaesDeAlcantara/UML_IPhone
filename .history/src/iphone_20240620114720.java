public class iphone implements reprodutorMusica, telefone, internet{
    public static void main(String[] args) {
        iphone iphone = new iphone();
        reprodutorMusica reprodutorMusica = (reprodutorMusica) iphone;

        System.out.println("Ipod");
        reprodutorMusica.selecionarMusica();

    }
}
