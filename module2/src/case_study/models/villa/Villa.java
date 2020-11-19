package case_study.models.villa;

import case_study.models.services.Services;

public class Villa extends Services {
    String standardVilla ;
    String comfortableDescriptionVilla ;
    int floorVilla ;
    int areaPoolVilla ;
    String idVilla;

    public Villa(String idVilla,String standardVilla, String comfortableDescriptionVilla, int floorVilla, int areaPoolVilla) {
        this.standardVilla = standardVilla;
        this.comfortableDescriptionVilla = comfortableDescriptionVilla;
        this.floorVilla = floorVilla;
        this.areaPoolVilla = areaPoolVilla;
        this.idVilla = idVilla;
    }
    public Villa(){}

    public Villa(
            String idServices,String nameServices, int areaServices, int costServices, int quantityIncluded, String rentalType, String standardVilla, String comfortableDescriptionVilla, int floorVilla, int areaPoolVilla) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
        this.standardVilla = standardVilla;
        this.comfortableDescriptionVilla = comfortableDescriptionVilla;
        this.floorVilla = floorVilla;
        this.areaPoolVilla = areaPoolVilla;
        this.idVilla = idServices;
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

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    public int getAreaPoolVilla() {
        return areaPoolVilla;
    }

    public void setAreaPoolVilla(int areaPoolVilla) {
        this.areaPoolVilla = areaPoolVilla;
    }

    public String getIdVilla() {
        return idVilla;
    }

    public void setIdVilla(String idVilla) {
        this.idVilla = idVilla;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return super.toString()  +
                "ID Villa : " + idVilla+ '\n' +
                "Standard Villa : " + standardVilla + '\n' +
                "Comfortable Description Villa : " + comfortableDescriptionVilla + '\n' +
                "Floor Villa : " + floorVilla + '\n' +
                "Area Pool Villa : " + areaPoolVilla +"\n"+
                "---------------------------------------------------";
    }
}
