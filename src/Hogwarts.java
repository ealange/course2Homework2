public abstract class Hogwarts {
    private String fullName;
    private int magicPower;
    private int trangressionAbility;


    private int nobleness;
    private int honour;
    private int bravery;

    private int hardworkness;
    private int loyalty;
    private int sincerity;

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    private int trickery;
    private int resoluteness;
    private int ambition;
    private int inventiveness;
    private int lustForPower;

    public void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond) {
        int magicSkillsOne = studentFirst.magicPower + studentFirst.trangressionAbility;
        int magicSkillsTwo = studentSecond.magicPower + studentSecond.trangressionAbility;
        if (magicSkillsOne > magicSkillsTwo) {
            System.out.println(studentFirst.fullName + " обладает большей мощностью магии, чем " + studentSecond.fullName);
        } else if (magicSkillsTwo > magicSkillsOne) {
            System.out.println(studentSecond.fullName + " обладает большей мощностью магии, чем " + studentFirst.fullName);
        } else {
            System.out.println(studentFirst.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }

