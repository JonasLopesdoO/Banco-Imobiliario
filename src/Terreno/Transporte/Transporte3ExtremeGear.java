package Terreno.Transporte;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Localizacao;
import Model.TerrenoComercializavel;
import View.ViewMessages;

public class Transporte3ExtremeGear extends Transporte{

	public Transporte3ExtremeGear() {
		Localizacao localizacao = new Localizacao(370,20); 
		setLocalizacao(localizacao);
		setDescricao("Extreme Gear");
		setIndice(25);
	}
	public void efeito(Jogador j) {
		if(getProprietario() != null){                 //Verificar se a propriedade possui algum propriet�rio
			if(!getProprietario().equals(j)){          //Verificar se o propriet�rio da propriedade n�o � o jogador da vez
				if(getHipotecada() == false){          //Verificar se o im�vel j� n�o est� hipotecado
					if(j.getSaldo() >= valorAluguel()){
						ViewMessages.getInstance().MensagemPagarAluguelTransporte(this, j);
						j.pedagio(getProprietario(),valorAluguel());
					}else{
						TerrenoComercializavel terrenoHipotecar = ViewMessages.getInstance().mensagemSaldoInsuficiente(j.getTerrenos().toArray());
						terrenoHipotecar.hipotecar();
						if(j.getSaldo() >= valorAluguel()){
							ViewMessages.getInstance().MensagemPagarAluguelTransporte(this, j);
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
			if(ViewMessages.getInstance().MensagemComprarPropriedadeTransporte(this, j) == JOptionPane.YES_OPTION){
				if(j.getSaldo() >= getValorTerrenoTransporte()){
					j.pagarTaxa(getValorTerrenoTransporte());
					j.addTerrenoAoPatrimonio(this);
				}else{
					ViewMessages.getInstance().mensagemSaldoInsuficienteComprarLogradouro();
				}
			}
		}
	}
	
}
