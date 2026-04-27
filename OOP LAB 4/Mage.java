public class Mage extends GameCharacter implements CasterAbility {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " casts a magic bolt with " + getAttackPower() + " power!");
        mana -= 5;
    }

    @Override
    public String describeClass() {
        return getName() + " is a Mage with " + mana + " mana.";
    }

    @Override
    public void castSpell(String spellName) {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(getName() + " casts " + spellName + "! Mana left: " + mana);
        } else {
            System.out.println(getName() + " does not have enough mana!");
        }
    }

    @Override
    public int getMana() {
        return mana;
    }
}
