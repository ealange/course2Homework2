public abstract class Hogwarts {
    String fullName;
    int magicPower;
    int transgressionAbility;


    public static void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond) {
        int magicSkillsOne = studentFirst.magicPower + studentFirst.transgressionAbility;
        int magicSkillsTwo = studentSecond.magicPower + studentSecond.transgressionAbility;
        if (magicSkillsOne > magicSkillsTwo) {
            System.out.println(studentFirst.fullName + " обладает большей мощностью магии, чем " + studentSecond.fullName);
        } else if (magicSkillsTwo > magicSkillsOne) {
            System.out.println(studentSecond.fullName + " обладает большей мощностью магии, чем " + studentFirst.fullName);
        } else {
            System.out.println(studentFirst.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }
    }

    public Hogwarts(String fullName, int magicPower, int transgressionAbility) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressionAbility = transgressionAbility;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionAbility() {
        return transgressionAbility;
    }

    public void setTransgressionAbility(int transgressionAbility) {
        this.transgressionAbility = transgressionAbility;
    }

}
