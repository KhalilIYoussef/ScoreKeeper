package khaliliyoussef.scorekeeper;

/**
 * Created by Khalil on 9/23/2017.
 */

public class Team {

    //    remember all what you have to do just type the field and android studio will handle the rest
    //will generate the constructor getters and setters

    public int number;
    //the team name
    public String name;
    //the team score
    public int score;
    //number of fouls
    public int foul;

    public Team(int number, String name, int score, int foul) {
        this.number = number;
        this.name = name;
        this.score = score;
        this.foul = foul;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getFoul() {
        return foul;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setFoul(int foul) {
        this.foul = foul;
    }


}
