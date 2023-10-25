public class Students {
    private  int id;
    private  String name;



    private double theoreticalScore;
    private double practicalScore;

    public Students(int id, String name, double theoreticalScore, double practicalScore) {
        this.id = id;
        this.name = name;
        this.theoreticalScore = theoreticalScore;
        this.practicalScore = practicalScore;
    }

    public Students() {
        this.id = 0;
        this.name = "";
        this.theoreticalScore = 0;
        this.practicalScore = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoreticalScore() {
        return theoreticalScore;
    }

    public void setTheoreticalScore(double theoreticalScore) {
        this.theoreticalScore = theoreticalScore;
    }

    public double getPracticalScore() {
        return practicalScore;
    }

    public void setPracticalScore(double practicalScore) {
        this.practicalScore = practicalScore;
    }

    public double calculateAvgScore(){
        return (practicalScore+theoreticalScore)/2;
    }

    public String toString() {
        return "Students{" +
                "id = " + id +
                ", tên = '" + name + '\'' +
                ", điểm lý thuyết = " + theoreticalScore +
                ", điểm thực hành = " + practicalScore +
                ", điểm trung bình = " + calculateAvgScore() +
                '}';
    }


}
