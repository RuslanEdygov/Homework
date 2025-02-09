public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 12566;
        byte b = 36;
        short c = 15607;
        long d = 7637899;
        float e = 7.63789F;
        double f = 7.6378969;
        var box1 = ("Значение переменной a с типом int равно " + a);
        var box2 = ("Значение переменной b с типом byte равно " + b);
        var box3 = ("Значение переменной c с типом short равно " + c);
        var box4 = ("Значение переменной d с типом long равно " + d);
        var box5 = ("Значение переменной e с типом float равно " + e);
        var box6 = ("Значение переменной f с типом double равно " + f);
            System.out.println(box1);
            System.out.println(box2);
            System.out.println(box3);
            System.out.println(box4);
            System.out.println(box5);
            System.out.println(box6);
        System.out.println("Задание 2");
        double g = 27.12;
        long h = 987678965549L;
        double i = 27.86;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 36;
            System.out.println(g);
            System.out.println(h);
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            System.out.println(l);
            System.out.println(m);
        System.out.println("Задание 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        var box7 = ("На каждого ученика рассчитано " + 480/(class1 + class2 + class3) +
                " листов бумаги");
            System.out.println(box7);
        System.out.println("Задание 4");
        byte car = 8;
        int clock = 1;
        var box8 = (clock*20);
        var box9 = (clock*60)*24;
        var box10 = ((clock*60)*24)*3;
        var box11 = ((clock*60)*24)*30;
        var box12 = ("За " + box8 + " минут машина произвела" + (car*box8) + " штук бутылок");
        var box13 = ("За " + box9 + " минут машина произвела" + (car*box9) + " штук бутылок");
        var box14 = ("За " + box10 + " минут машина произвела" + (car*box10) + " штук бутылок");
        var box15 = ("За " + box11 + " минут машина произвела" + (car*box11) + " штук бутылок");
            System.out.println(box12);
            System.out.println(box13);
            System.out.println(box14);
            System.out.println(box15);
        System.out.println("Задание 5");
        byte repair = 120;
        byte white = 2;
        byte brown = 4;
        var box16 = (white+brown);
        var box17 = (repair/box16);
        var box18 = (box17*white);
        var box19 = (box17*brown);
        var box20 = ("В школе,где " + box17 + " классов, нужно " + box18 +
                " банок белой краски и " + box19 + " банок коричневой краски");
            System.out.println(box20);
        System.out.println("Задание 6");
        float banana = 80;
        float milk = 105;
        float iceCream = 100;
        float egg = 70;
        var box21 = ((banana*5)+(milk*2)+(iceCream*2)+(egg*4));
        var box22 = (box21/1000);
            System.out.println(box22);
        System.out.println("Задание 7");
        float weight = 7;
        var box23 = (weight/0.250);
        var box24 = (weight/0.500);
        var box25 = (box23-box24)/2;
        var box26 = ("Если спортсмен будет терять каждый день по 250 грамм в день, то уйдет " +
                box23 + " дней на похудение");
        var box27 = ("Если спортсмен будет терять каждый день по 500 грамм в день, то уйдет " +
                box24 + " дней на похудение");
        var box28 = ("Потребуется в среднем " + box25 +
                " дней в среднем чтобы добиться результата");
            System.out.println(box26);
            System.out.println(box27);
            System.out.println(box28);
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        var box29 = (salaryMasha + salaryMasha*10/100);
        var box30 = (salaryDenis + salaryDenis*10/100);
        var box31 = (salaryKristina + salaryKristina*10/100);
        var box32 = (box29 - salaryMasha);
        var box33 = (box30 - salaryDenis);
        var box34 = (box31 - salaryKristina);
        var box35 = ("Маша теперь получает " + box29 + " рублей. Годовой доход вырос на " +
                box32 + " рублей");
        var box36 = ("Денис теперь получает " + box30 + " рублей. Годовой доход вырос на " +
                box33 + " рублей");
        var box37 = ("Кристина теперь получает " + box31 + " рублей. Годовой доход вырос на " +
                box34 + " рублей");
            System.out.println(box35);
            System.out.println(box36);
            System.out.println(box37);

    }
}