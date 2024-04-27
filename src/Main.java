//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int test;
        int lessonTime =  25 * (int) (1 + Math.random() * 10);
        int sections = lessonTime / 25;

        if (sections == 1) {
            System.out.println("Сегодня я учусь " + lessonTime + " минут!" + " Это " + sections + " секция по 25 мин.");
        } else if (sections >= 2 && sections <= 4) {
            System.out.println("Сегодня я учусь " + lessonTime + " минут!" + " Это " + sections + " секции по 25 мин.");
        } else if (sections >= 5) {
            System.out.println("Сегодня я учусь " + lessonTime + " минут!" + " Это " + sections + " секций по 25 мин.");
        }


        int min = 100;
        int max = 250;
        if (lessonTime == max) {
            System.out.println("Повезло, чубрик. Сегодня долго!");
        } else if (lessonTime <= min) {
            System.out.println("Запусти ещё раз, лентяй!");
        } else {
            System.out.println("Нормик!");
        }
    }
}