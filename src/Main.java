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

        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild <= 14 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (ageChild > 14 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения");
        }

        int numberOfPeople = 103;
        if(numberOfPeople <=60) {
            System.out.println("Ваше место в очереди №" + numberOfPeople + ", оно сидячее");
        }
        else
            if (numberOfPeople > 60 && numberOfPeople <= 102) {
            System.out.println("Ваше место в очереди №" + numberOfPeople + ", оно стоячее"); }
            else {
            System.out.println("Ваше место в очереди №" + numberOfPeople + ", вы не попадаете в вагон");
            }

        int one = 1;
        int two = 2;
        int three = 3;
        if(one > two && one> three) {
            System.out.println("Число One, равное " + one + " больше числа two, равного " + two + " и больше числа three, равного " + three);
        }
        else if (two > one && two> three) {
            System.out.println("Число two, равное " + two + " больше числа one, равного " + one + " и больше числа three, равного " + three);
        }
        else if (three>one && three>two) {
            System.out.println("Число three, равное " + three + " больше числа one, равного " + one + " и больше числа two, равного " + two);
        }
        else {
            System.out.println("Есть минимум пара одинаковый числел");
        }





    }
}