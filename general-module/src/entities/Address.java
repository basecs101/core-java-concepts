package entities;

public class Address {
    private String flatNum;
    private String lineNum;
    private String Taluka;
    private String district;
    private String State;


    public Address() {
    }

    public String getFlatNum(){
        return flatNum;
    }

    public void setFlatNum(String flatNum){
        this.flatNum = flatNum;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getTaluka() {
        return Taluka;
    }

    public void setTaluka(String taluka) {
        this.Taluka = taluka;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }

    @Override
    public String toString() {
        return "entities.Address{" +
                "flatNum='" + flatNum + '\'' +
                ", lineNum='" + lineNum + '\'' +
                ", Taluka='" + Taluka + '\'' +
                ", district='" + district + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
