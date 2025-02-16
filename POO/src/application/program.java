package application;

import java.util.Scanner;

import entidade.triangulo;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		triangulo x,y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("");
		
		System.out.println("Digite as medidas do Triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do Triângulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("area triangulo X: %.4f%n", areaX);
		System.out.printf("area triangulo X: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("largura area: X");
		}else {
			System.out.println("largura area: Y");
		}
		
		sc.close();
		
	}
}
