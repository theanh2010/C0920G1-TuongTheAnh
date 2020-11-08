package case_study.models.room;

import case_study.models.services.Services;

public class Room extends Services {
    String accompaniedService = "free";
    public Room(){}

    public Room(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public Room(String nameServices, String areaServices, String costServices, String quantityIncluded, String rentalType, String accompaniedService) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
        this.accompaniedService = accompaniedService;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String showInfor() {
        return null;
    }
}
