public class Slizerin extends Hogwarts {
    private int trickery;
    private int resoluteness;
    private int ambition;
    private int inventiveness;
    private int lustForPower;

    public void compareCoFaculityStudents(Slizerin studentSecond) {
        int faculitySkillsOne = this.trickery + this.resoluteness + this.ambition + this.inventiveness + this.lustForPower;
        int faculitySkillsTwo = studentSecond.trickery + studentSecond.resoluteness + studentSecond.ambition + studentSecond.inventiveness + studentSecond.lustForPower;
        if (faculitySkillsOne > faculitySkillsTwo) {
            System.out.println(this.fullName + " лучше, чем " + studentSecond.fullName);
        } else if (faculitySkillsTwo > faculitySkillsOne) {
            System.out.println(studentSecond.fullName + " лучше, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " обладает такой же мощностью магии, как и " + studentSecond.fullName);
        }
    }

    public Slizerin(int trickery, int resoluteness, int ambition, int inventiveness, int lustForPower) {
        if (trickery < 0 || trickery > 100) {
            throw new RuntimeException("Неверное значение trickery")
        }
        if (resoluteness < 0 || resoluteness > 100) {
            throw new RuntimeException("Неверное значение resoluteness")
        }
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Неверное значение ambition")
        }
        if (inventiveness < 0 || inventiveness > 100) {
            throw new RuntimeException("Неверное значение inventiveness")
        }
        if (lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("Неверное значение lustForPower")
        }
        this.trickery = trickery;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }


    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}