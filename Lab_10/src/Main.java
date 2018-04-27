package ua.lpnuai.oop.brusentsov10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		CV cv1 = new CV(4, "к.т.н доцент кафедри СШІ", "15 років", "Вища, ЛНУ Івана Франка", "05.06.2003");
		CV cv2 = new CV(6, "Програміст Junior", "6 місяців", "Вища", "21.05.2018", 17000);
		System.out.println(cv1 + "\n" + cv2);
        }
	}
