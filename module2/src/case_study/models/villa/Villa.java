package case_study.models.villa;

import case_study.models.services.Services;

public class Villa extends Services {
    String standardVilla ;
    String comfortableDescriptionVilla ;
    String floorVilla ;
    String areaPoolVilla ;

    public Villa(String standardVilla, String comfortableDescriptionVilla, String floorVilla, String areaPoolVilla) {
        this.standardVilla = standardVilla;
        this.comfortableDescriptionVilla = comfortableDescriptionVilla;
        this.floorVilla = floorVilla;
        this.areaPoolVilla = areaPoolVilla;
    }
    public Villa(){}

    public Villa(
            String nameServices, String areaServices, String costServices, String quantityIncluded, String rentalType, String standardVilla, String comfortableDescriptionVilla, String floorVilla, String areaPoolVilla) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
        this.standardVilla = standardVilla;
        this.comfortableDescriptionVilla = comfortableDescriptionVilla;
        this.floorVilla = floorVilla;
        this.areaPoolVilla = areaPoolVilla;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public String getComfortableDescriptionVilla() {
        return comfortableDescriptionVilla;
    }

    public void setComfortableDescriptionVilla(String comfortableDescriptionVilla) {
        this.comfortableDescriptionVilla = comfortableDescriptionVilla;
    }

    public String getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(String floorVilla) {
        this.floorVilla = floorVilla;
    }

    public String getAreaPoolVilla() {
        return areaPoolVilla;
    }

    public void setAreaPoolVilla(String areaPoolVilla) {
        this.areaPoolVilla = areaPoolVilla;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return super.toString()  +
                "Standard Villa : " + standardVilla + '\n' +
                "Comfortable Description Villa : " + comfortableDescriptionVilla + '\n' +
                "Floor Villa : " + floorVilla + '\n' +
                "Area Pool Villa : " + areaPoolVilla +"\n"+
                "---------------------------------------------------";
    }
}
