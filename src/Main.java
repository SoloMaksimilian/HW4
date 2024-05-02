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

        int year = 1;
        if (year < 2) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить рядом с мамой");
        }
        if (year >= 2 && year <= 6 ) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в садик");
        }
        if (year >= 7 && year <= 17 ) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
        }
        if (year >= 18 && year <= 24 ) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в университет");
        }
        if (year > 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить на работу");
        }



    }
}