public abstract class Animal implements HavePower{
    private int rawPower;
    private String habitat;


    public Animal(int rawPower, String habitat){
        this.rawPower = rawPower;
        this.habitat = habitat;

    }

    public String getHabitat(){
        return this.habitat;
    }

    public int getRawPower(){
        return this.rawPower;
    }

    @Override 
    public boolean isStrongerThan(HavePower other){
        Animal otherAnimal = (Animal)other;
        return this.getRawPower() > otherAnimal.getRawPower();
    }

    public void fight(Animal lawan){
        String Home = this.getHabitat();
        String Away = lawan.getHabitat();
        if ((this.getRawPower() > lawan.getRawPower()) & (Home.equals(Away))) {
            this.rawPower += lawan.rawPower;
        }
    
    }

    public abstract void speak();

    
}

