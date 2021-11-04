import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {

        int clientaccount= 100;
        int replenishment = 999;
        int replenishmentplusbonus = replenishment + replenishment/100;
        if (replenishment < 1000) {
            clientaccount = clientaccount + replenishment;
            System.out.println("Баланс после зачисления: "+clientaccount);
        } else {
            clientaccount = clientaccount + replenishmentplusbonus;
            System.out.println("Баланс после зачисления: "+clientaccount);
        }

        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
