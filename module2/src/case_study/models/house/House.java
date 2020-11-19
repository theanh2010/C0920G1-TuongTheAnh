package case_study.models.house;

import case_study.models.services.Services;

public class House extends Services {
    String standardHouse ;
    String comfortableDescriptionHouse ;
    int floorHouse ;
    String idHouse;
    public House(){}

    public House(String idHouse,String standardHouse, String comfortableDescriptionHouse, int floorHouse) {
        this.standardHouse = standardHouse;
        this.comfortableDescriptionHouse = comfortableDescriptionHouse;
        this.floorHouse = floorHouse;
        this.idHouse = idHouse;
    }

    public House(String idHouse ,String nameServices, int areaServices, int costServices, int quantityIncluded, String rentalType, String standardHouse, String comfortableDescriptionHouse, int floorHouse) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
        this.standardHouse = standardHouse;
        this.comfortableDescriptionHouse = comfortableDescriptionHouse;
        this.floorHouse = floorHouse;
        this.idHouse = idHouse;
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

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    public String getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(String idHouse) {
        this.idHouse = idHouse;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return   super.toString()+
                "ID House : " + idHouse + '\n'+
                "Standard House : " + standardHouse + '\n' +
                "Comfortable Description House : " + comfortableDescriptionHouse + '\n' +
                "Floor House : " + floorHouse + "\n" +
                "--------------------------------------------------";
    }
}
