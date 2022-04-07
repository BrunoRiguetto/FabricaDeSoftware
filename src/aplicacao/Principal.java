package aplicacao;

import entidades.Cliente;
import entidades.Veiculo;

public class Principal {

	public static void main(String[] args) {
	    Cliente cliente = new Cliente("000000000", "Jose", "Rua tal", "0xx-1111-1111", "jose@dominio.com");
	    Veiculo veiculo = new Veiculo("RRR-0000", "Modelo tal", 1960, "fabricante tal", "Branco", cliente);
	    
   
	    
	    System.out.println("Cliente: " + veiculo.toString());
	    
	     }
	}