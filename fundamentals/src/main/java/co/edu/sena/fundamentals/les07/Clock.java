package co.edu.sena.fundamentals.les07;

public class Clock {

    int currentTime=1200;

    public void displayPartOfDay(){
        if (currentTime>801 && currentTime<=1200){
            System.out.println("Morning");
        }else if (currentTime>=1201 && currentTime<=1700){
            System.out.println("Afternoon");
        }else if (currentTime>=1701 && currentTime <= 2400){
            System.out.println("Evening");
        }else {
            System.out.println("Early Morning");
        }
    }

}
