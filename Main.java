public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        System.out.println ("Задание 1");
        int cat = 5;
        System.out.println (cat);
        byte dog = 8;
        System.out.println (dog);
        short flower = 5;
        System.out.println (flower);
        long pear = 140L;
        System.out.println (pear);
        float apple = 5.4f;
        System.out.println (apple);
        double orange = 6.8;
        System.out.println (orange);
        //Задание 2
        System.out.println ("Задание 2");
        float sugarWeight = 27.12f;
        System.out.println (sugarWeight);
        long pepper = 987678965549L;
        System.out.println (pepper);
        double saltWeight = 2.786;
        System.out.println (saltWeight);
        boolean rice = false;
        System.out.println (rice);
        int flour = 569;
        System.out.println (flour);
        short boll = -159;
        System.out.println (boll);
        int fabricWeight = 27897;
        System.out.println (fabricWeight);
        int cheese = 67;
        System.out.println (cheese);
        char bar = 35;
        System.out.println(bar);
        byte door = 1;
        System.out.println(door);
        // Задание 3
        System.out.println ("Задание 3");
        short ludmilaPavlovna = 23;
        System.out.println (ludmilaPavlovna);
        short annaSergeevna = 27;
        System.out.println (annaSergeevna);
        short ekaterinaAndreevna = 30;
        System.out.println (ekaterinaAndreevna);
        short totalSheets = 480;
        System.out.println (totalSheets);
        int oneStudent = totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано "+ oneStudent + "листов бумаги");
        // Задание 4
        System.out.println("Задание 4");
        short efficiency = 16;
        System.out.println (efficiency);
        short time = 2;
        System.out.println (time);
        int perMinute = efficiency / time;
        System.out.println (perMinute);
        int minute = 20 * perMinute;
        System.out.println (minute);
        int perDay = 24 * perMinute;
        System.out.println (perDay);
        int inThreeDays = 3 * perDay * perMinute;
        System.out.println (inThreeDays);
        int oneMonth = 30 * perDay * perMinute;
        System.out.println (oneMonth);
        System.out.println ("За 20 минут машина произвела бутылок" + minute + "штук");
        System.out.println ("За сутки машина произвела бутылок" + perDay + "штук");
        System.out.println ("За 3 дня машина произвела бутылок" + inThreeDays + "штук");
        System.out.println ("За 1 месяц машина произвела бутылок" + oneMonth + "штук");
        //Задание 5
        System.out.println ("Задание 5");
        short totalCans = 120;
        short whitePaint = 2;
        short brownPaint =4;
        int theWholeClass = totalCans / (whitePaint + brownPaint);
        System.out.println (theWholeClass);
        int totalWhitePaint = whitePaint * theWholeClass;
        int totalBrownPaint = brownPaint * theWholeClass;
        System.out.println("В школе, где" + theWholeClass + "классов, нужно" + totalWhitePaint + "банок белой краска и" + totalBrownPaint + "банок коричневой краски");
        //Задание 6
        System.out.println ("Задание 6");
        int banana = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int egg = 70 * 4;
        int breakfastWeight = (banana + milk + iceCream + egg) / 1000;
        System.out.println (breakfastWeight);
        System.out.println ("Вес спорт-завтрака составил - " + breakfastWeight + "кг");
        //Задание 7
        System.out.println ("Задание 7");
        int loseWeight = 7 * 1000;
        int gram250 = 250;
        int gram500 = 500;
        int weightLoss250Grams = loseWeight / gram250;
        int weightLoss500Grams = loseWeight / gram500;
        System.out.println (weightLoss250Grams);
        System.out.println (weightLoss500Grams);
        System.out.println ("Если спортсмен будет худеть по 250 грамм в день, то результата он достигнет за" + weightLoss250Grams + "дней");
        System.out.println ("Если спортсмен будет худеть по 500 грамм в день, то результата он достигнет за" + weightLoss500Grams + "дней");
        int averageTime = (weightLoss250Grams + weightLoss500Grams) / 2;
        System.out.println ("В среднем потребуется" + averageTime + "день, что бы добится результата");
        //Задание 8
        System.out.println ("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaRaisingMoney = masha * 0.1f + masha;
        System.out.println (mashaRaisingMoney);
        float denisRaisingMoney = denis * 0.1f + denis;
        System.out.println (denisRaisingMoney);
        float kristinaRaisingMoney = kristina * 0.1f + kristina;
        System.out.println (kristinaRaisingMoney);
        System.out.println ("После увеличения маша будет получать" + mashaRaisingMoney+"рублей");
        System.out.println ("После увеличения денис будет получать" + denisRaisingMoney+"рублей");
        System.out.println ("После увеличения кристина будет получать" + kristinaRaisingMoney+"рублей");
        float differenceMasha = (mashaRaisingMoney * 12) - (masha * 12);
        System.out.println ("разница составит" + differenceMasha + "рублей");
        float differenceDenis = (denisRaisingMoney * 12) - (denis * 12);
        System.out.println ("разница составит" + differenceDenis + "рублей");
        float differenceKristina = (kristinaRaisingMoney * 12) - (kristina * 12);
        System.out.println ("разница составит" + differenceKristina + "рублей");


    }
}