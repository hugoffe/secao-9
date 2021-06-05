package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class RoomRental {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//define quantidade de quartos disponíveis para locação
		Rent[] room = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int unit = sc.nextInt();
			room[unit] = new Rent(name,email);
		}
		System.out.println();
		System.out.println("Busy Rooms:");
		for (int i=0; i<9; i++) {
			if (room[i]!= null)
				System.out.println(i + ": " + room[i].toString());
		}
		
		sc.close();
	} 
}
