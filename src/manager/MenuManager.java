package manager;

import manager.investigatorManager.InvestigatorManager;

import java.util.Scanner;

public class MenuManager {
    public void start() {
        InvestigatorManager investigatorManager = new InvestigatorManager();
        while (true) {

            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - возбуждение нового уголовного дела");
            System.out.println("2 - произвести новые действия по старому делу");
            System.out.println("3 - посмотреть информацию базы уголовных дел");
            System.out.println("4 - выбрать следователя");
            System.out.println("0 - выход");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number == 1) {
                    System.out.println("ВОЗБУЖДЕНИЕ УГОЛОВНОГО ДЕЛА");
                } else if (number == 2) {
                    System.out.println("НОВЫЕ ДЕЙСТВИЯ");
                } else if (number == 3) {
                    System.out.println("ИНФОРМАЦИЯ");
                } else if (number == 4) {
                    System.out.println("Выбрать следователя");
                    investigatorManager.chooseInvestigator();

                } else if (number == 0) {
                    System.out.println("ВЫХОД");
                    break;
                } else {
                    System.out.println("Неверная команда, повторите ввод");

                }
            } else {
                System.out.println("Неверная команда, повторите ввод");
            }
        }
    }
}
