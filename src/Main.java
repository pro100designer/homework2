public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        System.out.println("Собака=" + dog + "кг");
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача №2");
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

        System.out.println("Задача №3");
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        System.out.println("Задача №4");
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        System.out.println("Задача №6");
        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var result=firstBoxer+secondBoxer;
        System.out.println("Общая масса - " + result);
        var differenceWeight= secondBoxer-firstBoxer;
        System.out.println("Разница масс - " + differenceWeight);

        System.out.println("Задача №7!");
        result=secondBoxer%firstBoxer;
        System.out.println("Остаток от деления масс- " + result);

        System.out.println("Задача №8!");
        var totalHoursOfOperation=640;
        var hours=8;
        var staff= totalHoursOfOperation/hours;
        System.out.println("Всего работников компании-" + staff + " сотрудников");
        staff=staff+94;
        totalHoursOfOperation=staff*hours;
        System.out.println("Если в компании работает "+staff+" человек,то всего "+ totalHoursOfOperation+ " часов работы может быть поделено между сотрудниками " );
    }
}