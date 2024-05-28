import java.util.Scanner;

public class Contador 
{
	public static void main(String[] args)
     {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = input.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			
		}
        input.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroDois < parametroUm)
        {
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for(int i = 1; i <= contagem; i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
	}
}