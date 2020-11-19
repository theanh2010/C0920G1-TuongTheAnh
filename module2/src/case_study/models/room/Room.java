package case_study.models.room;

import case_study.models.services.Services;

public class Room extends Services {
    String idRoom;
    String accompaniedService ;
    public Room(){}

    public Room(String idRoom,String accompaniedService) {
        this.idRoom = idRoom;
        this.accompaniedService = accompaniedService;
    }

    public Room(String idRoom,String nameServices, int areaServices, int costServices, int quantityIncluded, String rentalType, String accompaniedService) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
        this.accompaniedService = accompaniedService;
        this.idRoom = idRoom;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                "ID room : " +idRoom+ '\n' +
                "AccompaniedService : " + accompaniedService +"\n"+
                "--------------------------------------------------";
    }
}
