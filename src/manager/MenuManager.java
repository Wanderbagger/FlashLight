package manager;

import java.util.Scanner;

public class MenuManager {
    public void start(){
        while (true){
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - возбуждение нового уголовного дела");
            System.out.println("2 - произвести новые действия по старому делу");
            System.out.println("3 - посмотреть информацию базы уголовных дел");
            System.out.println("0 - выход");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                System.out.println(number);
                if(number == 0){
                    break;
                }
            } else {
                System.out.println("Неверная команда, повторите ввод");

            }
        }
    }
}
