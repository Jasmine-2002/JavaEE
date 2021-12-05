public class Quiz2_7 {
    private long startTime;
    private long endTime;

    Quiz2_7(){
        startTime = System.currentTimeMillis();
    }

    void startTime(){
        startTime = System.currentTimeMillis();
    }

    void endTime(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}