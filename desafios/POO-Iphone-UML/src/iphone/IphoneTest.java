package iphone;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("DioSong - TrilhaJava");

        // Testando Aparelho Telefônico
        iphone.ligar("123-456-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
