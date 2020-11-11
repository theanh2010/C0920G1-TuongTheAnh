package case_study.models.house;

import case_study.models.services.Services;

public class House extends Services {
    String standardHouse ;
    String comfortableDescriptionHouse ;
    String floorHouse ;
    public House(){}

    public House(String standardHouse, String comfortableDescriptionHouse, String floorHouse) {
        this.standardHouse = standardHouse;
        this.comfortableDescriptionHouse = comfortableDescriptionHouse;
        this.floorHouse = floorHouse;
    }

    public House(String nameServices, String areaServices, String costServices, String quantityIncluded, String rentalType, String standardHouse, String comfortableDescriptionHouse, String floorHouse) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
        this.standardHouse = standardHouse;
        this.comfortableDescriptionHouse = comfortableDescriptionHouse;
        this.floorHouse = floorHouse;
    }


    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public String getComfortableDescriptionHouse() {
        return comfortableDescriptionHouse;
    }

    public void setComfortableDescriptionHouse(String comfortableDescriptionHouse) {
        this.comfortableDescriptionHouse = comfortableDescriptionHouse;
    }

    public String getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(String floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return   super.toString()+
                "Standard House : " + standardHouse + '\n' +
                "Comfortable Description House : " + comfortableDescriptionHouse + '\n' +
                "Floor House : " + floorHouse + "\n" +
                "--------------------------------------------------";
    }
}
