package musica;

public class Ipod implements reprodutorMusica {

    @Override
    public void pausar() {
        System.out.println("Pausando música");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
        
    }

}
