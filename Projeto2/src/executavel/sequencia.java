package executavel;

import java.util.Scanner;

public class sequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade_Imprimidos;
		int num1 = 1, num2 = 0, num3 = 1, i;
		Scanner leia = new Scanner(System.in);
		System.out.println("digite a quantidade de numeros que serão imprimidos na sequencia:");
		quantidade_Imprimidos = leia.nextInt();

		for (i = 0; i < quantidade_Imprimidos; i++) {
			num1 = num3;
			num2 = num1 + num2;
			num3 = num1 + num2;
			System.out.println(num1);
			i++;
			if(i < quantidade_Imprimidos){
			System.out.println(num2);
			}
			}
	}

}
