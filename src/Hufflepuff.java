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

    public void compareStudentsOfFaculty(Gryffindor student) {
        if (this.calculateOverallLevel() > student.calculateOverallLevel()) {
            System.out.println("На факультете сильнее:" + this.name + ".");
        } else if (this.calculateOverallLevel() < student.calculateOverallLevel()) {
            System.out.println("На факультете сильнее:" + student.name + ".");
        } else {
            System.out.println("На факультете сильнее ученики равны.");
        }
    }
}

