package case_study.models.services;

public abstract class Services {
    String nameServices ;
    String areaServices ;
    String costServices ;
    String quantityIncluded;
    String rentalType;
    public Services(){}
    public Services(String nameServices, String areaServices, String costServices, String quantityIncluded, String rentalType) {
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

    public String getAreaServices() {
        return areaServices;
    }

    public void setAreaServices(String areaServices) {
        this.areaServices = areaServices;
    }

    public String getCostServices() {
        return costServices;
    }

    public void setCostServices(String costServices) {
        this.costServices = costServices;
    }

    public String getQuantityIncluded() {
        return quantityIncluded;
    }

    public void setQuantityIncluded(String quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String showInfor();
}

