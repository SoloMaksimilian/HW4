public class Main {
    public static void main(String[] args) {
        int age = 18;
        boolean maturity = age >=18;
         if (maturity) {
             System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний");
         }
         else {System.out.println("Если возраст человека равен " + age + ",то он не достиг совершеннолетия, нужно немного подождать");
         }

        int temperature = 6;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature <5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature == 5) {
            System.out.println("На улице " + temperature + " градусов, шапку нужна взять с собой");
        }

        int speed = 61;
        boolean exceeding = speed >60;
        if (exceeding) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        }
        else {System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }


    }
}