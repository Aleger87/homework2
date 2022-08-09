public class Main {
    public static void main(String[] args) {
        byte    a = 1;
        short   b = 2;
        int     c = 5;
        long    d = 2L;
        float   e = 0.5F;
        double  f = 0.6;
        char    g = '!';
        boolean h = true;

        System.out.println("Задание №2____________________" );
        /* 2
        В боксе, перед каждым боем, спортсменов взвешивают – это делают для того,
        чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
        Вес одного боксера – 78,2 кг
        Вес второго боксера – 82,7 кг
        Подсчитайте и выведите в консоль общий вес двух бойцов.
        Подсчитайте и выведите в консоль разницу между весами бойцов.
         **/

        float boxer1 = 78.2F;
        float boxer2 = 82.7F;
        float totalWeight = boxer1 + boxer2;
        float differenceWeight = boxer1 - boxer2;


        System.out.println("Общий вес боксеров " + totalWeight + "\nРазница в весе " + differenceWeight);

        System.out.println("\nЗадание №3____________________" );
        /* 3
        За весом спортсмена следит не только сам спортсмен, но и его тренер.
        Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
        Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
        – Бананы – 5 штук (1 банан - 80 грамм);
        – Молоко – 200 мл (100 мл = 105 грамм);
        – Мороженое пломбир – 2 брикета по 100 грамм;
        – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        Смешать всё в блендере и готово.
        Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        Результат напечатайте в консоль
        **/

        int banana = 5;
        int bananaWeight = 80;
        int totalBananaWeight = banana * bananaWeight; //400

        int milk = 200;
        int milkWeight = 105;
        int totalMilkWeight = milk * milkWeight / 100; //210

        int iceCream = 2;
        int iceCreamWeight = 100;
        int totalIceCreamWeight = iceCream * iceCreamWeight; //200

        int eggs = 4;
        int eggsWeight = 70;
        int totalEggsWeight = eggs * eggsWeight; //280

        int breakfast = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        float breakfastInKg = breakfast / 1000F;
        System.out.println("Спорт-завтрак весит " + breakfast + " грамм, или " + breakfastInKg + " килограмм");


        System.out.println("\nЗадание №4____________________" );
        /* 4
        Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
        чтобы оставаться в своей весовой категории.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
        если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты подсчетов выведите в консоль.
        * */

        int weight = 7;
        weight = weight * 1000; //7000 грамм
        int loseWeightOne = 250;
        int loseWeightTwo = 500;
        int daysOne = weight / loseWeightOne; //28
        int daysTwo = weight / loseWeightTwo; //14
        System.out.println("Если спортсмен будет терять каждый день по 250 гр., то ему понадобится " + daysOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 гр., то ему понадобится " + daysTwo + " дней");
        int avgWeight = (loseWeightTwo + loseWeightOne) /2;//375
        int avgDays = (daysOne + daysTwo) / 2;//21
        System.out.println("Если в среднем спортсмен будет терять каждый день по " +avgWeight + " гр., то ему понадобится " + avgDays + " день");


        System.out.println("\nЗадание №5____________________" );
        /* 5
        Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:

        -Маша получает 67 760 рублей в месяц
        -Денис получает 83 690 рублей в месяц
        -Кристина получает 76 230 рублей в месяц

        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику.
        Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
        * */
        float increase = 0.1F;

        int masha = 67_760;
        int mashaInYar = masha * 12;
        int denis = 83_690;
        int denisInYar = denis * 12;
        int kristina = 76_230;
        int kristinaInYar = kristina * 12;


        float mashaIncrease =  masha * increase; //6776.0
        float denisIncrease =  denis * increase;//8369.0
        float kristinaIncrease =  kristina * increase;//7623.0
        System.out.println("Зарплата увеличится:" +
                                " \nУ Маши на " + mashaIncrease +" рублей " +
                                " \nу Дениса на " + denisIncrease +" рублей "+
                                " \nу Кристины на " + kristinaIncrease +" рублей"
                           );
        float mashaAfterIncrease = masha + mashaIncrease;//74536
        float mashaAfterIncreaseInYar = mashaAfterIncrease * 12;
        float denisAfterIncrease = denis + denisIncrease;//92056
        float denisAfterIncreaseInYar = denisAfterIncrease * 12;
        float kristinaAfterIncrease = kristina  + kristinaIncrease;//83853
        float kristinaAfterIncreaseInYar = kristinaAfterIncrease * 12;
        System.out.println("После повышения каждый из сотрудников будет получать:" +
                                " \nМаша " + mashaAfterIncreaseInYar +" рублей в месяц " +
                                " \nДенис " + denisAfterIncreaseInYar +" рублей в месяц"+
                                " \nКристина " + kristinaAfterIncreaseInYar +" рублей в месяц"
                            );

        float totalMashaIncrease = mashaAfterIncreaseInYar - mashaInYar;
        float totalDenisIncrease = denisAfterIncreaseInYar - denisInYar;
        float totalKristinaIncrease = kristinaAfterIncreaseInYar - kristinaInYar;

        System.out.println("Разница в год:" +
                            " \nМаша получит больше на  " + totalMashaIncrease +" рублей в год " +
                            " \nДенис получит больше на " + totalDenisIncrease +" рублей в год"+
                            " \nКристина получит больше на " + totalKristinaIncrease +" рублей в год"
                            );







    }
}