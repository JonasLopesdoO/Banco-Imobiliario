package Terreno.Residencia;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Localizacao;
import Model.TerrenoComercializavel;
import View.ViewMessages;

public class Casa82MadGear extends Casa{

	public Casa82MadGear() {
		Localizacao localizacao = new Localizacao(720,620); 
		setLocalizacao(localizacao);
		setDescricao("Mad Gear");
		setIndice(39);
	}

	public int valorTerrenoCasa() {
		// TODO Auto-generated method stub
		return 400;
	}

	public int valorConstrucaoCasa() {
		// TODO Auto-generated method stub
		return 200;
	}

	public int valorHipoteca() {
		// TODO Auto-generated method stub
		return 200;
	}

	public int valorAluguelNoCasa() {
		// TODO Auto-generated method stub
		return 80;
	}

	public int valorAluguel1Casas() {
		// TODO Auto-generated method stub
		return 200;
	}

	public int valorAluguel2Casas() {
		// TODO Auto-generated method stub
		return 600;
	}

	public int valorAluguel3Casas() {
		// TODO Auto-generated method stub
		return 1400;
	}

	public int valorAluguel4Casas() {
		// TODO Auto-generated method stub
		return 1700;
	}

	public int valorAluguelPredio() {
		// TODO Auto-generated method stub
		return 2000;
	}
	public void efeito(Jogador j) {
		if(getProprietario() != null){                 //Verificar se a propriedade possui algum propriet�rio
			if(!getProprietario().equals(j)){          //Verificar se o propriet�rio da propriedade n�o � o jogador da vez
				if(getHipotecada() == false){          //Verificar se o im�vel j� n�o est� hipotecado
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
