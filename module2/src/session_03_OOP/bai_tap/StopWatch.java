package session_03_OOP.bai_tap;

public class StopWatch {
    long starTime;
    long endTime;
    public StopWatch(){
        starTime =System.currentTimeMillis();
    }
    public long getEndTime() {
        return endTime;
    }
    public long getStarTime() {
        return starTime;
    }
    public long start(){
        return this.starTime =System.currentTimeMillis();
    }
    public long stop(){
        return  this.endTime =System.currentTimeMillis();
    }
    public long tinhThoiGian(){
        return  this.endTime -this.starTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        System.out.println(stopWatch.tinhThoiGian());
    }
}
