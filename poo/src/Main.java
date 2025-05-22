public class Main {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        // Testando o Reprodutor Musical
        meuIphone.selecionarMusica("Advogado Fiel- Bruna Karla");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuIphone.exibirPagina("www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
