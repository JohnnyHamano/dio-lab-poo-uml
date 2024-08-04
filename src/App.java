import Dispositivo.Iphone;

public class App
{
	public static void main(String[] args)
	{
		Iphone iPhone = new Iphone();

		iPhone.tocar();
		iPhone.pausar();
		iPhone.selecionarMusica("Beethoven - 9th symphony.mp3");

		iPhone.ligar("11 99999-8888");
		iPhone.atender();
		iPhone.iniciarCorreioVoz();

		iPhone.exibirPagina("https://www.google.com/");
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
	}
}