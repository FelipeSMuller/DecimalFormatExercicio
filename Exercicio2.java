package Formatação;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * Exercício 2: Formatação de Porcentagem Crie um programa que formate um número
		 * decimal como uma porcentagem, por exemplo, "25,50%".
		 */

		Double Porcentagem = null;

		String resultadoFormatado;

		while (true) {

			try {

				Porcentagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor em Porcentagem"));

				if (Porcentagem <= 0) {

					JOptionPane.showMessageDialog(null, " ERRO!!");

				}

				else {


					DecimalFormat df = new DecimalFormat("##,##%");

					resultadoFormatado = df.format(Porcentagem);

					JOptionPane.showMessageDialog(null, " Resultado = " + resultadoFormatado);

					break;

				}
			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null,
						"Entrada de dados inválida , ou o programa foi finalizado incorretamente");

			}

		}
	}

}
