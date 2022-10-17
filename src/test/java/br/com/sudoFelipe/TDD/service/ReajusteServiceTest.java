package br.com.sudoFelipe.TDD.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.sudoFelipe.TDD.enums.EnumDesempenho;
import br.com.sudoFelipe.TDD.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario func;

	@BeforeEach	//	Executado antes de cada método de teste
	public void inicializar() {
		this.service = new ReajusteService();
		this.func = new Funcionario("Juninho", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@AfterEach	// 	Executado após cada método de teste
	public void finalizar() {
		System.out.println("Finalizou o Teste");
	}
	
	@BeforeAll	//	Executado uma única vez antes de todos os testes
	public static void anteriorTodos() {
		System.out.println("Execução Única Inicial");
	}
	
	@AfterAll	//	Executado uma única vez depois de todos os testes
	public static void posteriorTodos() {
		System.out.println("Execução Única Final");
	}
	
	@Test
	public void reajusteDesempenhoAhDesejar() {
		
		service.concederReajuste(func, EnumDesempenho.AH_DESEJAR);
		
		//	Verifica se a assertiva informada é verdadeira (Assertiva de igualdade)
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}
	
	@Test
	public void reajusteDesempenhoBom() {
		
		service.concederReajuste(func, EnumDesempenho.BOM);
		
		//	Verifica se a assertiva informa é verdadeira (Assertiva de igualdade)
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
	}
	
	@Test
	public void reajusteDesempenhoOtimo() {
		
		service.concederReajuste(func, EnumDesempenho.OTIMO);
		
		//	Verifica se a assertiva informa é verdadeira (Assertiva de igualdade)
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
	}
}
