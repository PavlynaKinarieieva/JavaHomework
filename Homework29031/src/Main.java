import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что бы вы хотели приготовить?:");
        String dish = scanner.nextLine();

        switch (dish.toLowerCase()) {
            case "борщ":
                System.out.println("Рецепт борща: Подготовьте все неорбходимые ингредиенты. Говядину нарежьте кубиками. Свёклу, морковь и лук очистите и нарежьте мелко. Капусту нашинкуйте. Картофель нарежьте крупными кубиками.\n" +
                        "\n" +
                        "В большой кастрюле разогрейте масло и обжарьте мясо на сильном огне до золотистой корочки.\n" +
                        "\n" +
                        "Добавьте лук, морковь и свёклу и жарьте, помешивая, до мягкости лука.\n" +
                        "\n" +
                        "Добавьте томатную пасту, перемешайте и жарьте еще 2-3 минуты.\n" +
                        "\n" +
                        "Добавьте к кастрюле капусту, картофель, лавровый лист, черный перец, чеснок, соль и достаточно воды, чтобы покрыть все ингредиенты. Доведите до кипения, затем уменьшите огонь и варите на небольшом огне около 30-40 минут, пока все ингредиенты не станут мягкими.\n" +
                        "\n" +
                        "Добавьте уксус и перемешайте.\n" +
                        "\n" +
                        "Подавайте борщ со сметаной и свежей зеленью..");
                break;
            case "плов":
                System.out.println("Рецепт плова: Подготовьте все необходимые ингредиенты. Мясо нарежьте на кусочки примерно 2-3 см. Лук и морковь нарежьте соломкой. Чеснок мелко нарежьте.\n" +
                        "\n" +
                        "В казане (если у вас его нет, можно использовать глубокую сковороду с толстым дном) разогрейте растительное масло. Обжарьте мясо на сильном огне до золотистой корочки.\n" +
                        "\n" +
                        "Добавьте лук и морковь и жарьте, помешивая, до мягкости лука.\n" +
                        "\n" +
                        "Добавьте чеснок, зире и куркуму и жарьте еще 2-3 минуты, помешивая.\n" +
                        "\n" +
                        "Добавьте рис и перемешайте, чтобы он покрылся маслом.\n" +
                        "\n" +
                        "Добавьте горячую воду или бульон, чтобы покрыть все ингредиенты.\n" +
                        "\n" +
                        "Подождите, пока вода закипит, затем уменьшите огонь до минимума и накройте крышкой. Варите на небольшом огне около 20-30 минут, пока рис не будет готов.\n" +
                        "\n" +
                        "Убедитесь, что всю жидкость впитал рис и выключите огонь. Добавьте сливочное масло и перемешайте.\n" +
                        "\n" +
                        "Дайте плову настояться под крышкой еще 10-15 минут.\n" +
                        "\n" +
                        "Подавайте плов горячим, украсив свежей зеленью..");
                break;
            case "лазанья":
                System.out.println("Рецепт лазаньи: Подготовьте все необходимые ингредиенты. Лук нарежьте мелко, чеснок измельчите. Моцареллу нарежьте на тонкие ломтики.\n" +
                        "\n" +
                        "Разогрейте оливковое масло на среднем огне и обжарьте лук до мягкости.\n" +
                        "\n" +
                        "Добавьте чеснок и обжарьте еще 1-2 минуты.\n" +
                        "\n" +
                        "Добавьте мясной фарш и жарьте, помешивая, пока он не станет коричневым.\n" +
                        "\n" +
                        "Добавьте томатное соус и томатное пюре, перемешайте.\n" +
                        "\n" +
                        "Добавьте воду и перемешайте.\n" +
                        "\n" +
                        "Доведите соус до кипения, затем уменьшите огонь и варите на небольшом огне около 15-20 минут, пока соус не загустеет. Приправьте соус солью и черным перцем по вкусу.\n" +
                        "\n" +
                        "В кипящей подсоленной воде отварите листы лазаньи до готовности (около 8-10 минут). Откиньте на дуршлаг, чтобы удалить лишнюю воду.\n" +
                        "\n" +
                        "Смажьте дно противня для запекания маслом. Выложите один слой листов лазаньи на дно противня.\n" +
                        "\n" +
                        "Налейте половину мясного соуса на листы лазаньи. Разровняйте соус, чтобы он покрыл все листы.\n" +
                        "\n" +
                        "Выложите второй слой листов лазаньи на соус, затем налейте оставшийся мясной соус и разровняйте его.\n" +
                        "\n" +
                        "Посыпьте моцареллой и пармезаном сверху.\n" +
                        "\n" +
                        "Запекайте лазанью в разогретой духовке при температуре 180 градусов в течение 25-30 минут.");
                break;
            case "гуляш":
                System.out.println("Рецепт гуляша: Нарежьте мясо на небольшие кусочки.\n" +
                        "\n" +
                        "Обжарьте мясо в глубокой сковороде на растительном масле до золотистой корочки.\n" +
                        "\n" +
                        "Добавьте нарезанный лук и чеснок в сковороду и жарьте до мягкости.\n" +
                        "\n" +
                        "Посыпьте паприкой и томатной пастой, перемешайте и жарьте 2-3 минуты.\n" +
                        "\n" +
                        "Добавьте говяжий бульон и томатный сок, посолите и поперчите по вкусу.\n" +
                        "\n" +
                        "Приготовьте раствор муки: в стакане воды разведите муку, чтобы не было комков.\n" +
                        "\n" +
                        "Добавьте раствор муки в сковороду и варите гуляш на медленном огне, помешивая время от времени, пока соус не загустеет (около 20-25 минут).\n" +
                        "\n" +
                        "Добавьте кислую сметану и перемешайте. Прогрейте гуляш еще несколько минут, чтобы сметана равномерно прогрелась.\n" +
                        "\n" +
                        "Готовый гуляш можно подавать с картофелем, макаронами или рисом. Приятного аппетита!.");
                break;
            case "ризотто":
                System.out.println("Рецепт ризотто: Нагрейте куриный бульон в кастрюле и держите его на медленном огне, чтобы он оставался горячим в течение всей приготовки ризотто.\n" +
                        "\n" +
                        "В глубокой сковороде нагрейте масло и обжарьте лук и чеснок на среднем огне до прозрачности.\n" +
                        "\n" +
                        "Добавьте рис в сковороду и обжарьте его, постоянно помешивая, в течение 2-3 минут, пока он не станет прозрачным.\n" +
                        "\n" +
                        "Добавьте белое вино и дайте ему выкипеть. Потом начните добавлять горячий куриный бульон в небольших порциях, помешивая постоянно, пока рис не впитает жидкость. Продолжайте добавлять бульон и перемешивать, пока рис не будет готов (это займет около 18-20 минут).\n" +
                        "\n" +
                        "Последние 2-3 минуты добавьте тертый пармезан, посолите и поперчите по вкусу. Перемешайте, чтобы пармезан равномерно распределился.\n" +
                        "\n" +
                        "Снимите сковороду с огня и дайте ризотто настояться 2-3 минуты.\n" +
                        "\n" +
                        "Готовое ризотто можно подавать с добавками по вашему выбору, такими как жаренные грибы, морепродукты или кусочки копченой колбасы. Приятного аппетита!.");
                break;
            case "оливье":
                System.out.println("Рецепт оливье: Очистите и нарежьте картофель и морковь на кубики. Отварите их в подсоленной воде до мягкости (около 15-20 минут). Оставьте овощи остывать.\n" +
                        "\n" +
                        "Отварите яйца в течение 10 минут, затем остудите их в холодной воде, очистите и нарежьте на кубики.\n" +
                        "\n" +
                        "Нарежьте соленые огурцы и маринованные грибы на кубики.\n" +
                        "\n" +
                        "Смешайте овощи, яйца, огурцы и грибы в большой миске, добавьте горошек, посолите и поперчите по вкусу.\n" +
                        "\n" +
                        "Добавьте майонез и тщательно перемешайте, чтобы все ингредиенты были покрыты майонезом.\n" +
                        "\n" +
                        "Оставьте салат на несколько часов в холодильнике, чтобы он хорошо пропитался и настоялся.\n" +
                        "\n" +
                        "Перед подачей украсьте салат веточкой зелени или кусочками соленых огурцов. Приятного аппетита!.");
                break;
            case "салат цезарь":
                System.out.println("Рецепт салата цезарь: Разогрейте духовку до 180 градусов.\n" +
                        "\n" +
                        "Нарежьте белый хлеб на маленькие кубики и обжарьте их в духовке, пока они не станут золотистыми. Выньте из духовки и оставьте остывать.\n" +
                        "\n" +
                        "Нарежьте куриную грудку на кусочки и обжарьте на сильном огне до золотистой корочки. Оставьте на пару минут остывать, а затем нарежьте на более мелкие кусочки.\n" +
                        "\n" +
                        "Разломайте ромейн-салат на крупные куски и выложите на тарелку.\n" +
                        "\n" +
                        "Для соуса цезарь: в миске смешайте желтки, лимонный сок, горчицу, вустерширский соус и чеснок. Взбейте венчиком и медленно добавляйте оливковое масло, постоянно взбивая, пока соус не загустеет. Посолите и поперчите по вкусу.\n" +
                        "\n" +
                        "Полейте соусом цезарь ромейн-салат, добавьте куриную грудку и крошки хлеба. Посыпьте тертым пармезаном.\n" +
                        "\n" +
                        "Подайте салат сразу после приготовления. Приятного аппетита!.");
                break;
            case "пицца":
                System.out.println("Рецепт пиццы: В большой миске смешайте муку, дрожжи, сахар и соль. Добавьте оливковое масло и теплую воду и замесите тесто. Если тесто слишком сухое, добавьте еще немного воды. Если слишком мокрое, добавьте еще муки. Замесите тесто до тех пор, пока оно не станет гладким и эластичным.\n" +
                        "\n" +
                        "Покройте тесто полотенцем и оставьте на 1-2 часа, пока оно не вырастет в два раза.\n" +
                        "\n" +
                        "Разогрейте духовку до 220 градусов.\n" +
                        "\n" +
                        "Раскатайте тесто на толщину 0,5 см и выложите на противень, смазанный оливковым маслом.\n" +
                        "\n" +
                        "Полейте томатным соусом по всей поверхности теста, оставляя небольшой отступ по краям.\n" +
                        "\n" +
                        "Посыпьте тертым моцарелла по всей поверхности пиццы. Добавьте соль и свежемолотый перец по вкусу.\n" +
                        "\n" +
                        "Поставьте противень в духовку и выпекайте пиццу 10-15 минут, пока корочка не станет золотистой и сыр не расплавится.\n" +
                        "\n" +
                        "Посыпьте свежим базиликом и орегано перед подачей. Подайте пиццу горячей и нарежьте на кусочки. Приятного аппетита!.");
                break;
            default:
                System.out.println("К сожалению, рецепта на такое блюдо у нас нет.");
        }
    }
}