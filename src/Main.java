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
        if (year >= 7 && year <= 17 ) {            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
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

        int numberOfPeople = 102;
        if(numberOfPeople <60) {
            int seat = 60 - numberOfPeople;
            int standing = 102 - 60;
            System.out.println("В вагоне осталось " + seat + " сидячих мест и " + standing + " стоячих мест");
        }
        else
            if (numberOfPeople >= 60 && numberOfPeople < 102) {
                int standing = 102 - numberOfPeople;
            System.out.println("В вагоне осталось " + standing + " стоячих мест, седячих не осталось"); }
            else {
            System.out.println("В вагоне не осталось мест");
            }

        int one = 4;
        int two = 4;
        int three = 4;
        if(one > two && one> three) {
            System.out.println("Число 'one', равное " + one + " больше числа 'two', равного " + two + " и больше числа 'three', равного " + three);
        }
        else if (two > one && two> three) {
            System.out.println("Число 'two', равное " + two + " больше числа 'one', равного " + one + " и больше числа 'three', равного " + three);
        }
        else if (three>one && three>two) {
            System.out.println("Число 'three', равное " + three + " больше числа 'one', равного " + one + " и больше числа 'two', равного " + two);
        }
        else if (one == two && one > three){
            System.out.println("Числа 'one' и 'two' равны " + one + ", и они больше числа 'three', равного " + three);
        }
        else if (one == three && one > two){
            System.out.println("Числа 'one' и 'three' равны " + one + ", и они больше числа 'two', равного " + two);
        }
        else if (three == two && two > one){
            System.out.println("Числа 'three' и 'two' равны " + two + ", и они больше числа 'one', равного " + one);
        }
        else {
            System.out.println("Все числа равны");
        }






    }
}