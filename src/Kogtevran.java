public class Kogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public void compareCoFaculityStudents(Kogtevran studentSecond) {
        int faculitySkillsOne = this.intelligence + this.wisdom + this.wit + this.creativity;
        int faculitySkillsTwo = studentSecond.intelligence + studentSecond.wisdom + studentSecond.wit + studentSecond.creativity;
        if (faculitySkillsOne > faculitySkillsTwo) {
            System.out.println(this.fullName + " лучше, чем " + studentSecond.fullName);
        } else if (faculitySkillsTwo > faculitySkillsOne) {
            System.out.println(studentSecond.fullName + " лучше, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }
    }

    public Kogtevran(String fullname, int magicPower, int transgressionAbility, int intelligence, int wisdom, int wit, int creativity) {
        if (intelligence < 0 || intelligence > 100) {
            throw new RuntimeException("Неверное значение intelligence");
        }
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Неверное значение wisdom");
        }
        if (wit < 0 || wit > 100) {
            throw new RuntimeException("Неверное значение wit");
        }
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Неверное значение creativity");
        }
        this.fullName = fullname;
        this.magicPower = magicPower;
        this.transgressionAbility = transgressionAbility;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

}
