public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 45, 12, 75, 88, 67);
        Griffindor ronWizzly = new Griffindor("Ron Wizzly", 32, 33, 34, 35, 90);
        Griffindor hermionaGranger = new Griffindor("Hermiona Granger", 45, 45, 45, 6, 30);
        Slizerin drakoMalfoy = new Slizerin("Drako Malfoy", 40, 67, 23, 34, 2, 67, 93);
        Slizerin grahamMontegue = new Slizerin("Graham Montegue", 4, 5, 13, 14, 22, 7, 8);
        Slizerin gregoryGoil = new Slizerin("Gregory Goil", 11, 22, 33, 44, 22, 7, 8);
        Puffenduy zakarySmith = new Puffenduy("Zakary Smith", 10, 15, 20, 25, 22);
        Puffenduy cedrikDiggory = new Puffenduy("Cedrik Diggory", 10, 15, 20, 25, 22);
        Puffenduy justinFinchFlatchly = new Puffenduy("Justin Finch-Flatchly", 5, 10, 15, 20, 25);
        Kogtevran choChang = new Kogtevran("Cho Chang", 35, 30, 35, 60, 55, 1);
        Kogtevran padmePatil = new Kogtevran("Padme Patil", 45, 5, 14, 13, 12, 2);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 1, 99, 20, 20, 20, 3);

        System.out.println(harryPotter);
        System.out.println(drakoMalfoy);
        System.out.println(zakarySmith);
        System.out.println(padmePatil);
        drakoMalfoy.compareCoFaculityStudents(gregoryGoil);
        hermionaGranger.compareCoFaculityStudents(ronWizzly);
        choChang.compareCoFaculityStudents(padmePatil);
        zakarySmith.compareCoFaculityStudents(cedrikDiggory);
        Hogwarts.compareStudents(marcusBelby, justinFinchFlatchly);
        Hogwarts.compareStudents(grahamMontegue, harryPotter);

    }
}