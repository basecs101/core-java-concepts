public class Address {
    String flatNum;
    String lane1;
    String lane2;
    String city;
    int postCode;

    public Address(String flatNum, String lane1, String lane2, String city, int postCode) {
        this.flatNum = flatNum;
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.city = city;
        this.postCode = postCode;
    }

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNum='" + flatNum + '\'' +
                ", lane1='" + lane1 + '\'' +
                ", lane2='" + lane2 + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
