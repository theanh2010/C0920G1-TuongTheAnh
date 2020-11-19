package case_study.models.services;

public abstract class Services {

    String nameServices ;
    int areaServices ;
    int costServices ;
    int quantityIncluded;
    String rentalType;
    public Services(){}
    public Services( String nameServices, int areaServices, int costServices, int quantityIncluded, String rentalType) {
        this.nameServices = nameServices;
        this.areaServices = areaServices;
        this.costServices = costServices;
        this.quantityIncluded = quantityIncluded;
        this.rentalType = rentalType;

    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public int getAreaServices() {
        return areaServices;
    }

    public void setAreaServices(int areaServices) {
        this.areaServices = areaServices;
    }

    public int getCostServices() {
        return costServices;
    }

    public void setCostServices(int costServices) {
        this.costServices = costServices;
    }

    public int getQuantityIncluded() {
        return quantityIncluded;
    }

    public void setQuantityIncluded(int quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }



    public abstract String showInfor();

    @Override
    public String toString() {
        return  "Name Services : " + nameServices + '\n' +
                "Area Services : " + areaServices + '\n' +
                "Cost Services : " + costServices + '\n' +
                "Quantity Included : " + quantityIncluded + '\n' +
                "Rental Type : " + rentalType + '\n';
    }
}

