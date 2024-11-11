public class Hufflepuff extends Hogwarts {
    public Hufflepuff(String name, int skillWizardry, int distanceTransgress, int hardWork,
                      int loyalty, int honesty) {
        super(name, skillWizardry, distanceTransgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    //трудолюбие
    private int hardWork;
    //верность
    private int loyalty;
    //честность
    private int honesty;

    public void outputAllStudentData() {
        showDetails();
        System.out.print("Трудолюбие:" + hardWork + ". Верность:" + loyalty + ". Честность:" + honesty + ".");
    }

    public int calculateOverallLevelStudents() {
        return calculateOverallLevel() + this.hardWork + this.loyalty + this.honesty;
    }

    public void compareStudents(Gryffindor student) {
        if (this.calculateOverallLevel() > student.calculateOverallLevel()) {
            System.out.println("Сильнее:" + this.name + ".");
        } else if (this.calculateOverallLevel() < student.calculateOverallLevel()) {
            System.out.println("Сильнее:" + student.name + ".");
        } else {
            System.out.println("Ученики равны.");
        }
    }
}

