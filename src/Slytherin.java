public class Slytherin extends Hogwarts {
    public Slytherin(String name, int skillWizardry, int distanceTransgress, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, skillWizardry, distanceTransgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    //хитрость
    private int cunning;
    //решительность
    private int determination;
    //амбициозность
    private int ambition;
    //находчивость
    private int resourcefulness;
    //жажда власти
    private int lustForPower;

    public void outputAllStudentData() {
        showDetails();
        System.out.print("Хитрость:" + cunning + ". Решительность:" + determination +
                ". Амбициозность:" + ambition +
                ". Находчивость:" + resourcefulness + ". Жажда власти:" + lustForPower + ".");
    }
    public int calculateOverallLevelStudents() {
        return calculateOverallLevel() + this.cunning + this.determination + this.ambition + this.resourcefulness +
                this.lustForPower;
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
