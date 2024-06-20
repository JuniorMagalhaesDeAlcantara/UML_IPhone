public class callControl implements telefone {

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
        
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando Correio de Voz");
        
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo Ligação");
        
    }

}
