/**
 * Created by West on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Repka repka = new Repka();
        int sum = 0;

        Employee[] employee = {new Grandfather(), new Grandmother(), new Granddaughter(), new Dog(), new Cat(),
                new Mouse()};
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getPower();
            System.out.println(fdf(repka, sum));
        }
    }

    public static String fdf(Repka repka, int sum) {
        return repka.getPower() == sum ? "pulled turnips " + sum : "not pulled turnips " + sum;

    }
}
