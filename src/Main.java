public class Main {
    public static void main(String[] args) {
        //////////////////////////////Гриффиндор////////////////////////////////////////////////////////
        Gryffindor potter = new Gryffindor("Гарри Поттер", 70, 50,
                60, 30, 20);
        Gryffindor granger = new Gryffindor(" Гермиона Грейнджер", 90, 95,
                70, 40, 50);
        Gryffindor weasley = new Gryffindor("Рон Уизли", 40, 30,
                20, 40, 25);

        //////////////////////////// Слизерин////////////////////////////////////////////////////
        Slytherin malfoy = new Slytherin("Драко Малфой", 60, 40,
                30, 80, 60, 50, 60);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", 20, 10,
                30, 80, 60, 30, 60);
        Slytherin goyle = new Slytherin("Грегори Гойл", 30, 40,
                30, 80, 60, 10, 60);

        /////////////////////////////Пуффендуй///////////////////////////////////////////////////////
        Hufflepuff smith = new Hufflepuff("Захария Смит", 30, 50,
                80, 60, 51);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", 40, 10,
                80, 60, 31);
        Hufflepuff finchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 40,
                50, 80, 70, 91);

        /////////////////////////Когтевран///////////////////////////////////////////////////////////////
        Hufflepuff chang = new Hufflepuff("Чжоу Чанг", 80, 90, 60,
                70, 30);
        Hufflepuff patil = new Hufflepuff("Падма Патил", 30, 40, 60,
                30, 80);
        Hufflepuff belby = new Hufflepuff("Маркус Белби", 80, 90, 60,
                70, 30);

        ////////////////////////////Проверка методов////////////////////////////////////////////////////////
        //Вывод данных
        potter.outputAllStudentData();
        System.out.println();
        //Сравнение учеников одного факультета
        potter.compareStudentsOfFaculty(granger);
        System.out.println();
        //Сравнение по по силе магии и расстоянию трансгрессированости
        potter.compareStudents(diggory);
    }
}

