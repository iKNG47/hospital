import hospital.Doctors;
import hospital.Hospital;
import hospital.Nursers;
import hospital.Workers;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while (true) {
            System.out.println("wprowadz liczbe(od 0 do 2)\n1 - zapisz pacjenta\n2 - wyświetlić wszystkich pacijentów\n0 - skoncz program");

            int sw = scanner.nextInt();
            scanner.nextLine();
            switch (sw) {
                case 0:
                    hospital.Hospital.Exit();
                    break;
                case 1:

                    System.out.print("Wpisz imie:");
                    String firstName = scanner.nextLine();
                    System.out.print("Wpisz nazwisko:");
                    String lastName = scanner.nextLine();
                    System.out.print("Wpisz wynagrodzenie:");
                    double reward = scanner.nextDouble();
                    System.out.print("Wpisz stanowisko(doctor, pielęgniarka):");
                    String position = scanner.nextLine();
                    if (position.equalsIgnoreCase("doctor")){
                        Workers worker =new Doctors(firstName,lastName, reward);
                        worker.addToList(worker);
                        break;
                    }
                    if (position.equalsIgnoreCase("pielęgniarka")){
                        System.out.print("Wpisz nadgodziny:");
                        double overtime=scanner.nextDouble();
                        Workers worker = new Nursers(firstName, lastName, reward, overtime);
                        worker.addToList(worker);
                        break;
                    }


                case 2:
                    Hospital hospital = new Hospital();
                    hospital.getList();
                    break;
            }
        }
    }
}