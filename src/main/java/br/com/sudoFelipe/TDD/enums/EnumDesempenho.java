package br.com.sudoFelipe.TDD.enums;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum EnumDesempenho {

	AH_DESEJAR("A Desejar") {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.03");
		}
	},
	BOM("Bom") {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.15");
		}
	},
	OTIMO("Ótimo") {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.2");
		}
	};
	
	@Getter private final String nome;
	
	public abstract BigDecimal percentualReajuste();
}
