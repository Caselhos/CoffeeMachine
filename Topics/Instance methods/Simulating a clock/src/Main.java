class Clock {
    int hours;
    int minutes;
    public Clock() {
        this.hours=12;
        this.minutes=0;
    }

    public static void main(String[] args){
        Clock clock =new Clock();
        clock.next();
    }
    public void next() {
        if(minutes==59){
            hours++;
            minutes=0;
        }
        if(minutes<10){System.out.printf("the time is %d:0%d",this.hours,this.minutes);}
        else System.out.printf("the time is %d:%d",this.hours,this.minutes);
        // implement me
    }
}