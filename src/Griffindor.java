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

    public Griffindor( int nobleness, int honour, int bravery){
            if (nobleness < 0 || nobleness > 100) {
                throw new RuntimeException("Неверное значение nobleness")
            }
            if (honour < 0 || honour > 100) {
                throw new RuntimeException("Неверное значение honour")
            }
            if (bravery < 0 || bravery > 100) {
                throw new RuntimeException("Неверное значение bravery")
            }
            this.nobleness = nobleness;
            this.honour = honour;
            this.bravery = bravery;
        }


    }
