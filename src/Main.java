public class Main {
    public static void main(String[] ags) {
        System.out.println("Задание 1");   //Задание №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        {
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }
        System.out.println("Задание 2");
        var box1 = dog + 4;
        var box2 = cat + 4;
        var box3 = paper + 4;
        {
            System.out.println(box1);
            System.out.println(box2);
            System.out.println(box3);
        }
        System.out.println("Задание 3");
        var box4 = dog - 3.5;
        var box5 = cat - 1.6;
        var box6 = paper - 7639;
        {
            System.out.println(box4);
            System.out.println(box5);
            System.out.println(box6);
        }
        System.out.println("Задание 4");   //Задание №4
        var friend = 19;
        var box7 = friend + 2;
        var box8 = (friend + 2)/7;
        {
            System.out.println(friend);
            System.out.println(box7);
            System.out.println(box8);
        }
        System.out.println("Задание 5");   //Задание №5
        var frog = 3.5;
        var box9 = frog * 10;
        var box10 = (frog * 10)/5;
        var box11 = ((frog * 10)/5)+4;
        {
            System.out.println(frog);
            System.out.println(box9);
            System.out.println(box10);
            System.out.println(box11);
        }
        System.out.println("Задание 6");   //Задание №6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var rezult1 = boxer1 + boxer2;
        var rezult2 = (boxer1 - boxer2) * (-1);
        var box12 = ("Общая масса " + rezult1 + "кг двух бойцов");
        var box13 = ("Разница масс " + rezult2 + "кг между бойцами");
        {
            System.out.println(box12);
            System.out.println(box13);
        }
        System.out.println("Задание 7");   //Задание №7
        var rezult3 = (boxer2 % boxer1);
        var box14 = ("Остаток от деления " + rezult3 + "кг. между двумя весами");
        {
            System.out.println(box14);
        }
        System.out.println("Задание 8");   //Задание №8
        var hours = 640;
        var employees = 8;
        var rezult4 = hours / employees;
        var box15 = ("Всего работников в компании " + rezult4 + " человек");
        var rezult5 = rezult4 + 94;
        var rezult6 = hours / rezult5;
        var box16 = ("Если в компании работает " + rezult5 + " человек, то всего " + rezult6 +
                " часов работы может быть поделено между сотрудниками ");
        {
            System.out.println(box15);
            System.out.println(box16);
        }
    }
}