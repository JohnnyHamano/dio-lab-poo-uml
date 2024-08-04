package Dispositivo;

import Dispositivo.Recursos.AparelhoTelefonico;
import Dispositivo.Recursos.NavegadorInternet;
import Dispositivo.Recursos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
{
	public void tocar()
    {
        System.out.println("Tocar reprodutor musical.");
    }

	public void pausar()
    {
        System.out.println("Pausar reprodutor musical.");
    }
    
	public void selecionarMusica(String musica)
    {
        System.out.println("Selecionar música: " + musica);
    }
    
	public void ligar(String numero)
    {
        System.out.println("Realizar ligação para o número: " + numero);
    }
    
	public void atender()
    {
        System.out.println("Atender ligação.");
    }
    
	public void iniciarCorreioVoz()
    {
        System.out.println("Iniciar correio de voz.");
    }
    
	public void exibirPagina(String url)
    {
        System.out.println("Exibir página de internet: " + url);
    }
    
	public void adicionarNovaAba()
    {
        System.out.println("Adicionar nova aba do navegador de internet.");
    }
    
	public void atualizarPagina()
    {
        System.out.println("Atualizar página de internet.");
    }
}