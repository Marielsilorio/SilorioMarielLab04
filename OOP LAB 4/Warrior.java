public class Warrior extends GameCharacter implements Defendable {
    private int armorRating;

    public Warrior(String name, int hp, int attackPower, int armorRating) {
        super(name, hp, attackPower);
        this.armorRating = armorRating;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " swings a sword with " + getAttackPower() + " attack power!");
    }

    @Override
    public String describeClass() {
        return getName() + " is a Warrior with armor rating " + armorRating;
    }

    @Override
    public void block() {
        System.out.println(getName() + " blocks with a shield!");
    }

    @Override
    public int getDefenseRating() {
        return armorRating;
    }
}
