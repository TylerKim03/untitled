public abstract class Vehicle {

    public abstract void sound();
    public abstract void light() throws Exception;

    public void maxSpeed(){

        System.out.println("your max speed is "+maximumSpeed);
    }

    int maximumSpeed;
    int currentSpeed;
    public Vehicle (int maximumSpeed, int currentSpeed){
        this.maximumSpeed = maximumSpeed;
        this.currentSpeed = currentSpeed;
    }

    public final void start(){
        System.out.println("you are in the start section");
    }
    public final void stop(){
        System.out.println("you are in the stop section");
    }






}
