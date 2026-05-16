//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

            System.out.println("ДЗ");
            System.out.println("Задачи 1-3");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);

            System.out.println("Задача 4");
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);

            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);

            System.out.println("Задачи 6 и 7");
            var weightFirstBoxer = 78.2;
            var weightSecondBoxer = 82.7;
            var totalWeight = weightFirstBoxer + weightSecondBoxer;
            System.out.println(totalWeight);
            var weightDifference = weightFirstBoxer - weightSecondBoxer;
            System.out.println(weightDifference);
            var remainderFromDivision = weightSecondBoxer % weightFirstBoxer;
            System.out.println(remainderFromDivision);

            System.out.println("Задача 8");

            var workingHours = 640;
            var workingHoursOneWorker = 8;
            var totalWorkers = workingHours / workingHoursOneWorker;
            System.out.println("Всего работников в компании - " + totalWorkers + " человек");
            totalWorkers = totalWorkers + 94;
            workingHoursOneWorker = workingHours / totalWorkers;
            System.out.println("Если в компании работает " + totalWorkers + " человек, то всего "
                     + workingHoursOneWorker + " часов работы может быть поделено между сотрудниками");

    }
}