public abstract class Hogwarts {
    String fullName;
    int magicPower;
    int trangressionAbility;


    public static void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond) {
        int magicSkillsOne = studentFirst.magicPower + studentFirst.trangressionAbility;
        int magicSkillsTwo = studentSecond.magicPower + studentSecond.trangressionAbility;
        if (magicSkillsOne > magicSkillsTwo) {
            System.out.println(studentFirst.fullName + " обладает большей мощностью магии, чем " + studentSecond.fullName);
        } else if (magicSkillsTwo > magicSkillsOne) {
            System.out.println(studentSecond.fullName + " обладает большей мощностью магии, чем " + studentFirst.fullName);
        } else {
            System.out.println(studentFirst.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }

    public Hogwarts(String fullName, int magicPower, int trangressionAbility){
            this.fullName = fullName;
            this.magicPower = magicPower;
            this.trangressionAbility = trangressionAbility;
        }

        public String getFullName () {
            return fullName;
        }

        public void setFullName (String fullName){
            this.fullName = fullName;
        }

        public int getMagicPower () {
            return magicPower;
        }

        public void setMagicPower ( int magicPower){
            this.magicPower = magicPower;
        }

        public int getTrangressionAbility () {
            return trangressionAbility;
        }

        public void setTrangressionAbility ( int trangressionAbility){
            this.trangressionAbility = trangressionAbility;
        }

