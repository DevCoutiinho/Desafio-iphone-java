package DesafioPoo;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private int pagina = 0;

    @Override
    public void tocarMusica(){
        System.out.println("A música está tocando");
    }

    @Override
    public  void pausarMusica(){
        System.out.println("A música foi pausada");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("A música selecionada foi " + musica);
    }

    @Override
    public  void ligar(){
        System.out.println("Você está ligando para alguém");
    }

    @Override
    public  void atender(){
        System.out.println("ligação atendida");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Deixe sua mensagem no correio de voz");
    }

    @Override
    public void adicionarNovaAba() {
        pagina += 1;
        System.out.println("Você está na página " + pagina);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Seja bem vindo a página");
    }
}
