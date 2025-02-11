public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 12566;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 36;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 15607;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 7637899;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 7.63789F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 7.6378969;
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Задание 2");
        double g = 27.12;
        System.out.println(g);
        long h = 987678965549L;
        System.out.println(h);
        double i = 27.86;
        System.out.println(i);
        short j = 569;
        System.out.println(j);
        short k = -159;
        System.out.println(k);
        short l = 27897;
        System.out.println(l);
        byte m = 36;
        System.out.println(m);
        System.out.println("Задание 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        System.out.println("На каждого ученика рассчитано " + 480 / (class1 + class2 + class3) +
                " листов бумаги");
        System.out.println("Задание 4");
        byte car = 8;
        int clock = 1;
        int minutes1 = (clock * 20);
        int minutes2 = (clock * 60) * 24;
        int minutes3 = ((clock * 60) * 24) * 3;
        int minutes4 = ((clock * 60) * 24) * 30;
        System.out.println("За 20 минут минут машина произвела " + (car * minutes1) +
                " штук бутылок");
        System.out.println("За сутки машина произвела " + (car * minutes2) +
                " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (car * minutes3) +
                " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (car * minutes4) +
                " штук бутылок");
        System.out.println("Задание 5");
        byte repair = 120;
        byte white = 2;
        byte brown = 4;
        int paintsClass = (white + brown);
        int quantityClass = (repair / paintsClass);
        int whitePaints = (quantityClass * white);
        int brownPaints = (quantityClass * brown);
        System.out.println("В школе,где " + quantityClass + " классов, нужно " + whitePaints +
                " банок белой краски и " + brownPaints + " банок коричневой краски");
        System.out.println("Задание 6");
        float banana = 80;
        float milk = 105;
        float iceCream = 100;
        float egg = 70;
        System.out.println((banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4) +
                " граммов спортзавтрака");
        System.out.println(((banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4)) / 1000 +
                " килограммов спортзавтрака");
        System.out.println("Задание 7");
        double weight = 7;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм в день, " +
                "то уйдет " + ((weight / 0.250)) + " дней на похудение");
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм в день, " +
                "то уйдет " + ((weight / 0.500)) + " дней на похудение");
        System.out.println("Потребуется в среднем " + ((weight / 0.250) - (weight / 0.500) / 2) +
                " дней в среднем чтобы добиться результата");
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int raisingSalaryMasha = (salaryMasha + salaryMasha * 10 / 100);
        int raisingSalaryDenis = (salaryDenis + salaryDenis * 10 / 100);
        int raisingSalaryKristina = (salaryKristina + salaryKristina * 10 / 100);
        //var box32 = (box29 - salaryMasha);
        //var box33 = (box30 - salaryDenis);
        //var box34 = (box31 - salaryKristina);
        System.out.println("Маша теперь получает " + raisingSalaryMasha + " рублей." +
                " Годовой доход вырос на " + (raisingSalaryMasha - salaryMasha) + " рублей");
        System.out.println("Денис теперь получает " + raisingSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + (raisingSalaryDenis - salaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + raisingSalaryKristina + " рублей. " +
                "Годовой доход вырос на " + (raisingSalaryKristina - salaryKristina) + " рублей");
        //System.out.println(box35);
        //System.out.println(box36);
        //System.out.println(box37);

    }
}