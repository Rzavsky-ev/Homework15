public class Hogwarts {
    public Hogwarts(String name, int skillWizardry, int distanceTransgress) {
        this.name = name;
        this.skillWizardry = skillWizardry;
        this.distanceTransgress = distanceTransgress;
    }

    //имя
    protected String name;

    //умение колдовать
    protected int skillWizardry;

    //расстояние трансгрессированости
    protected int distanceTransgress;

    //Вывод всех данных ученика
    protected void showDetails() {
        System.out.print("Имя: " + name + ". Умение колдовать:" + skillWizardry + ". Расстояние на которое может трансгрессировать:" +
                distanceTransgress + ". ");
    }

    //Вычисление общего уровня
    protected int calculateOverallLevel() {
        return skillWizardry + distanceTransgress;
    }

    //Сравнение учеников по силе магии и расстоянию трансгрессированости
    protected void compareStudents(Hogwarts student) {
        if (this.calculateOverallLevel() > student.calculateOverallLevel()) {
            System.out.println("В сравнении по силе магии и расстоянию трансгрессированости сильнее ученик:" + this.name + ".");
        } else if (this.calculateOverallLevel() < student.calculateOverallLevel()) {
            System.out.println("В сравнении по силе магии и расстоянию трансгрессированости сильнее ученик:" + student.name + ".");
        } else {
            System.out.println("В сравнении по силе магии и расстоянию трансгрессированости ученики:" + this.name + " и " + student.name + " равны.");
        }
    }
}

