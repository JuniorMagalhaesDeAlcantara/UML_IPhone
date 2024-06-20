package internet;
public class navegador implements internet {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
        
    }

}
