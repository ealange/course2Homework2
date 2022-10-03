public abstract class Hogwarts {
    protected String fullName;
    protected int magicPower;
    protected int transgressionAbility;


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
        if (magicPower < 0 || magicPower > 100) {
            throw new RuntimeException("введено неверное значение magicPower");
        }
        this.magicPower = magicPower;
    }

    public int getTransgressionAbility() {
        return transgressionAbility;
    }

    public void setTransgressionAbility(int transgressionAbility) {
        if (transgressionAbility < 0 || transgressionAbility > 100) {
            throw new RuntimeException("введено неверное значение transgressionAbility");
        }
        this.transgressionAbility = transgressionAbility;
    }

}
