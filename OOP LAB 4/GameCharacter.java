public abstract class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    
    public String getName() { return name; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public int getAttackPower() { return attackPower; }

    
    public void rest() {
        hp += 10;
        System.out.println(name + " rests and recovers 10 HP. Current HP: " + hp);
    }

    
    public abstract void attack();
    public abstract String describeClass();
}
