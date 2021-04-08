package praktikum5.Student;

public class Student {
    String nim;
    String name;
    Integer practiceScore;
    Integer theoryScore;

    public Student(String nim, String name, Integer practiceScore, Integer theoryScore) {
        this.nim = nim;
        this.name = name;
        this.practiceScore = practiceScore;
        this.theoryScore = theoryScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(Integer practiceScore) {
        this.practiceScore = practiceScore;
    }

    public Integer getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(Integer theoryScore) {
        this.theoryScore = theoryScore;
    }

    public Integer getRata() {
        return (practiceScore + theoryScore) / 2;
    }
}
