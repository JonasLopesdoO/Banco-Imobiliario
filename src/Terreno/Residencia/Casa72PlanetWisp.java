package Terreno.Residencia;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Localizacao;
import Model.TerrenoComercializavel;
import View.ViewMessages;

public class Casa72PlanetWisp extends Casa{

	public Casa72PlanetWisp() {
		Localizacao localizacao = new Localizacao(720,175); 
		setLocalizacao(localizacao);
		setDescricao("Planet Wisp");
		setIndice(32);
	}

	public int valorTerrenoCasa() {
		// TODO Auto-generated method stub
		return 300;
	}

	public int valorConstrucaoCasa() {
		// TODO Auto-generated method stub
		return 150;
	}

	public int valorHipoteca() {
		// TODO Auto-generated method stub
		return 150;
	}

	public int valorAluguelNoCasa() {
		// TODO Auto-generated method stub
		return 50;
	}

	public int valorAluguel1Casas() {
		// TODO Auto-generated method stub
		return 130;
	}

	public int valorAluguel2Casas() {
		// TODO Auto-generated method stub
		return 390;
	}

	public int valorAluguel3Casas() {
		// TODO Auto-generated method stub
		return 900;
	}

	public int valorAluguel4Casas() {
		// TODO Auto-generated method stub
		return 1100;
	}

	public int valorAluguelPredio() {
		// TODO Auto-generated method stub
		return 1275;
	}
	public void efeito(Jogador j) {
		if(getProprietario() != null){                 //Verificar se a propriedade possui algum proprietário
			if(!getProprietario().equals(j)){          //Verificar se o proprietário da propriedade não é o jogador da vez
				if(getHipotecada() == false){          //Verificar se o imóvel já não está hipotecado
					if(j.getSaldo() >= valorAluguel()){
						ViewMessages.getInstance().MensagemPagarAluguel(this, j);
						j.pedagio(getProprietario(),valorAluguel());
					}else{
						TerrenoComercializavel terrenoHipotecar = ViewMessages.getInstance().mensagemSaldoInsuficiente(j.getTerrenos().toArray());
						terrenoHipotecar.hipotecar();
						if(j.getSaldo() >= valorAluguel()){
							ViewMessages.getInstance().MensagemPagarAluguel(this, j);
							j.pedagio(getProprietario(), valorAluguel());
						}else if((j.getSaldo() < valorAluguel()) && (j.jogadorPossuiTerrenos() == false)){
							ViewMessages.getInstance().mensagemFimDeJogo(j.getNome());
							j.fimDeJogo();
						}else{
							efeito(j);
						}
					}
				}
			}
		}else{
			if(ViewMessages.getInstance().MensagemComprarPropriedadeCasa(this, j) == JOptionPane.YES_OPTION){
				if(j.getSaldo() >= valorTerrenoCasa()){
					j.pagarTaxa(valorTerrenoCasa());
					j.addTerrenoAoPatrimonio(this);
				}else{
					ViewMessages.getInstance().mensagemSaldoInsuficienteComprarLogradouro();
				}
			}
		}
	}

}
