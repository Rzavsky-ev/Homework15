public class Gryffindor extends Hogwarts {
    public Gryffindor(String name, int skillWizardry, int distanceTransgress, int nobility, int honor,
                      int bravery) {
        super(name, skillWizardry, distanceTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    //благородство
    private int nobility;
    //честь
    private int honor;
    //храбрость
    private int bravery;

    public void outputAllStudentData() {
        showDetails();
        System.out.print("Благородство:" + nobility + ". Честь:" + honor + ". Храбрость:" + bravery + ".");
    }

    public int calculateOverallLevelStudents() {
        return calculateOverallLevel() + this.nobility + this.honor + this.bravery;
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
