import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {

        int clientAccount= 100;
        int replenishment = 1000;
        int replenishmentPlusBonus = replenishment + replenishment/100;
        if (replenishment < 1000) {
            clientAccount = clientAccount + replenishment;
        } else {
            clientAccount = clientAccount + replenishmentPlusBonus;
        }
        System.out.println("Баланс после зачисления: "+clientAccount);

        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
