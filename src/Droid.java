public class Droid {

    //variable declarations
    private String serialNumber;
    private String modelType;
    private String purpose;

    //constructor
    public Droid(String serialNumber, String modelType, String purpose){
        this.serialNumber = serialNumber;
        this.modelType = modelType;
        this.purpose = purpose;
    }

    //method declarations

    //getter methods
    public String getSerialNumber(){
        return serialNumber;
    }

    public String getModelType(){
        return modelType;
    }

    public String getPurpose(){
        return purpose;
    }

    //setter methods
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setModelType(String modelType){
        this.modelType = modelType;
    }

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }

    //speak method
    public void speak(){
        System.out.println("beep, beep, beep, boop!");
    }

    //to string method
    @Override
    public String toString() {
        return "Droid{" +
                "serialNumber='" + serialNumber + '\'' +
                ", modelType='" + modelType + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
