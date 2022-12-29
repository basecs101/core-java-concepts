public class Address {
    private String flatNumber;
    private String societyName;
    private int pinCode;

    public static Address getInstance() {
        return new Address();
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNumber='" + flatNumber + '\'' +
                ", societyName='" + societyName + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
