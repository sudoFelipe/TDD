package br.com.sudoFelipe.TDD.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.sudoFelipe.TDD.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
			throw new IllegalArgumentException("Funcionário não contém benefício!");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}
