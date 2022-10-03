public class Puffenduy extends Hogwarts {
    private int hardworkness;
    private int loyalty;
    private int sincerity;

    public void compareCoFaculityStudents(Puffenduy studentSecond) {
        int faculitySkillsOne = this.hardworkness + this.loyalty + this.sincerity;
        int faculitySkillsTwo = studentSecond.hardworkness + studentSecond.loyalty + studentSecond.sincerity;
        if (faculitySkillsOne > faculitySkillsTwo) {
            System.out.println(this.fullName + " лучше, чем " + studentSecond.fullName);
        } else if (faculitySkillsTwo > faculitySkillsOne) {
            System.out.println(studentSecond.fullName + " лучше, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }
    }

    public Puffenduy(String fullname, int magicPower, int transgressionAbility, int hardworkness, int loyalty, int sincerity) {
        if (hardworkness < 0 || hardworkness > 100) {
            throw new RuntimeException("Неверное значение hardworkness");
        }
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Неверное значение loyalty");
        }
        if (sincerity < 0 || sincerity > 100) {
            throw new RuntimeException("Неверное значение sincerity");
        }
        super.fullName = fullname;
        super.magicPower = magicPower;
        super.transgressionAbility = transgressionAbility;
        this.hardworkness = hardworkness;
        this.loyalty = loyalty;
        this.sincerity = sincerity;
    }

    @Override
    public String toString() {
        return "Puffenduy{ " + fullName + ": " +
                "hardworkness=" + hardworkness +
                ", loyalty=" + loyalty +
                ", sincerity=" + sincerity +
                ", magicPower=" + magicPower +
                ", transgressionAbility=" + transgressionAbility +
                '}';
    }

    public int getHardworkness() {
        return hardworkness;
    }

    public void setHardworkness(int hardworkness) {
        this.hardworkness = hardworkness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getSincerity() {
        return sincerity;
    }

    public void setSincerity(int sincerity) {
        this.sincerity = sincerity;
    }
}
