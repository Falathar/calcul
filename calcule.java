calcule
=======
package perso.encelades;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Helloworld{
	public static void main (String[] args ){
		Scanner sc = new Scanner(System.in);
		char operation =' ';
		int stop;
		
		System.out.println("bienvenue sur ma calculette en console");
		System.out.println("a = + , b = *, c = Impair ou Pair");
		operation = sc.nextLine().charAt(0);
		
		
		if (operation =='a')
		{
			int nombre1;
			int nombre2;
			int resultat;
			System.out.println("Vous avez choisie l'addition");
			System.out.println("Entrez le premier nombre:");
			nombre1 = sc.nextInt();
			System.out.println("Entrez le deuxieme nombre");
			nombre2 = sc.nextInt();
			
			resultat = nombre1 + nombre2;
			System.out.println("Le resultat est:"+resultat);
		}
			
		else if(operation == 'b')
		{
		int nombre1;
		int nombre2;
		int resultat;
		System.out.println("Vous avez choisie la multiplication");
		System.out.println("Entrez le premier nombre:");
		nombre1 = sc.nextInt();
		System.out.println("Entrez le deuxieme nombre:");
		nombre2= sc.nextInt();
		
		resultat = nombre1 * nombre2;
		System.out.println("Le resultate est :"+resultat);
			
		}
		
	}
}
