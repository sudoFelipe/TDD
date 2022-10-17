package br.com.sudoFelipe.TDD.service;

import java.math.BigDecimal;

import br.com.sudoFelipe.TDD.enums.EnumDesempenho;
import br.com.sudoFelipe.TDD.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, EnumDesempenho desempenho) {
		
		if (desempenho.equals(EnumDesempenho.AH_DESEJAR)) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
			
		} else if (desempenho.equals(EnumDesempenho.BOM)) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
			
		} else {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
		}
	}

}
