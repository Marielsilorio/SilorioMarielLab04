public class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int hp, int attackPower, int arrowCount) {
        super(name, hp, attackPower);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " shoots an arrow! Remaining arrows: " + arrowCount);
        } else {
            System.out.println(getName() + " has no arrows left!");
        }
    }

    @Override
    public String describeClass() {
        return getName() + " is an Archer with " + arrowCount + " arrows.";
    }
}
