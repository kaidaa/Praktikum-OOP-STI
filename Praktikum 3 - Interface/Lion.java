public class Lion extends Animal{

    public Lion(){
        super(150, "LAND");
    }
    public Lion(int rawPower){
        super(rawPower, "LAND");

    }
    @Override
    public void speak(){
        System.out.println("GRAWRRRR!!! I'm a Lion! " );
    }
}