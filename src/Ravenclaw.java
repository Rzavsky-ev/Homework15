public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int skillWizardry, int distanceTransgress, int intellect,
                     int wisdom, int wit, int levelCreativity) {
        super(name, skillWizardry, distanceTransgress);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.levelCreativity = levelCreativity;
    }

    //ум
    private int intellect;
    //мудрость
    private int wisdom;
    //остроумие
    private int wit;
    //уровень творчества
    private int levelCreativity;

    public void outputAllStudentData() {
        showDetails();
        System.out.print("Ум:" + intellect + ". Мудрость:" + wisdom + ". Остроумие:" + wit + ". Уровенть" +
                "творчества:" + levelCreativity);
    }

    public int calculateOverallLevelStudents() {
        return calculateOverallLevel() + this.intellect + this.wisdom + this.wit + this.levelCreativity;
    }

    public void compareStudentsOfFaculty(Ravenclaw student) {
        if (this.calculateOverallLevel() > student.calculateOverallLevel()) {
            System.out.println("На факультете сильнее:" + this.name + ".");
        } else if (this.calculateOverallLevel() < student.calculateOverallLevel()) {
            System.out.println("На факультете сильнее:" + student.name + ".");
        } else {
            System.out.println("На факультете сильнее ученики равны.");
        }
    }
}
