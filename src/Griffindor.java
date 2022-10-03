public class Griffindor extends Hogwarts {
    private int nobleness;
    private int honour;

    private int bravery;

    public void compareCoFaculityStudents(Griffindor studentSecond) {
        int faculitySkillsOne = this.nobleness + this.honour + this.bravery;
        int faculitySkillsTwo = studentSecond.nobleness + studentSecond.honour + studentSecond.bravery;
        if (faculitySkillsOne > faculitySkillsTwo) {
            System.out.println(this.fullName + " лучше, чем " + studentSecond.fullName);
        } else if (faculitySkillsTwo > faculitySkillsOne) {
            System.out.println(studentSecond.fullName + " лучше, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }
    }

    public Griffindor(String fullname, int magicPower, int transgressionAbility, int nobleness, int honour, int bravery) {
        if (nobleness < 0 || nobleness > 100) {
            throw new RuntimeException("Неверное значение nobleness");
        }
        if (honour < 0 || honour > 100) {
            throw new RuntimeException("Неверное значение honour");
        }
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Неверное значение bravery");
        }
        super.fullName = fullname;
        super.magicPower = magicPower;
        super.transgressionAbility = transgressionAbility;
        this.nobleness = nobleness;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{ " + fullName + ": " +
                "nobleness=" + nobleness +
                ", honour=" + honour +
                ", bravery=" + bravery +
                ", magicPower=" + magicPower +
                ", transgressionAbility=" + transgressionAbility +
                '}';
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}