public class Tiger extends Animal{

    public Tiger(){
        super(100, "LAND");
    }
    public Tiger(int rawPower){
        super(rawPower, "LAND");

    }
    @Override
    public void speak(){
        System.out.println("GRAWRRRR!!! I'm a Tiger! " );
    }
}