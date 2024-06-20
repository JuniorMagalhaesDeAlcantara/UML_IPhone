import .internet;
import .reprodutorMusica;
import .telefone;

public class iphone implements reprodutorMusica, telefone, internet{

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo ipad");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo ipad");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo ipad");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo callControl");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correio de voz pelo callControl");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo callControl");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba pelo Navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pelo Navegador");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página pelo Navegador");
    }
}
