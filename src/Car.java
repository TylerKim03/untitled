public class Car extends Vehicle{
    public Car (int x, int y){
        super(x,y);
    }

    @Override
    public void sound() {
        System.out.println("Vroom Vroom");
    }

    @Override
    public void light() throws Exception{
        String s = "Error";
        Exception e = new Exception();
        throw e;
    }
}
