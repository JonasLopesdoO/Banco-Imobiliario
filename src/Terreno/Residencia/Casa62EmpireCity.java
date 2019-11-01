package Terreno.Residencia;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Localizacao;
import Model.TerrenoComercializavel;
import View.ViewMessages;

public class Casa62EmpireCity extends Casa{

	public Casa62EmpireCity() {
		Localizacao localizacao = new Localizacao(495,20); 
		setLocalizacao(localizacao);
		setDescricao("Empire City");		
		setIndice(27);
	}

	public int valorTerrenoCasa() {
		// TODO Auto-generated method stub
		return 260;
	}

	public int valorConstrucaoCasa() {
		// TODO Auto-generated method stub
		return 150;
	}

	public int valorHipoteca() {
		// TODO Auto-generated method stub
		return 130;
	}

	public int valorAluguelNoCasa() {
		// TODO Auto-generated method stub
		return 40;
	}

	public int valorAluguel1Casas() {
		// TODO Auto-generated method stub
		return 110;
	}

	public int valorAluguel2Casas() {
		// TODO Auto-generated method stub
		return 330;
	}

	public int valorAluguel3Casas() {
		// TODO Auto-generated method stub
		return 800;
	}

	public int valorAluguel4Casas() {
		// TODO Auto-generated method stub
		return 975;
	}

	public int valorAluguelPredio() {
		// TODO Auto-generated method stub
		return 1150;
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
