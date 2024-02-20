package gradeOOP;

public class Grade {
    private String name;
    private String kor;
    private String eng;
    private String math;
    private String avg;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setKor(String kor){
        this.kor = kor;
    }
    public String getKor(){
        return this.kor;
    }
    public void setEng(String eng){
        this.eng = eng;
    }
    public String getEng(){
        return this.eng;
    }
    public void setMath(String math){
        this.math = math;
    }
    public String getMath(){
        return this.math;
    }
    public void setAvg(String avg){
        this.avg = avg;
    }
    public String getAvg(){
        return this.avg;
    }

}
