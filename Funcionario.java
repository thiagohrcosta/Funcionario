import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, 
		// seu número de horas trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. 
		// A seguir, mostre o número e o salário do funcionário, 
		// com duas casas decimais.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salarioFuncionario = horasTrabalhadas * valorHora;
		
		System.out.println("O número do funcionário é " + funcionario + ", e o seu salário é de: $" + salarioFuncionario);
		sc.close();

	}

}
