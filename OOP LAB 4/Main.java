import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Create party members
        ArrayList<GameCharacter> party = new ArrayList<>();
        party.add(new Warrior("Aldric", 120, 18, 25));   // Warrior with armor rating
        party.add(new Mage("Elara", 70, 30, 100));       // Mage with mana
        party.add(new Archer("Kael", 85, 22, 30));       // Archer with arrows

        // 2. Polymorphic loop - all characters
        System.out.println("== Party Roster ==");
        for (GameCharacter c : party) {
            System.out.println(c.describeClass());
            c.attack();
            c.rest();
            System.out.println();
        }

        // 3. Interface-specific actions
        System.out.println("== Casters in the Party ==");
        for (GameCharacter c : party) {
            if (c instanceof CasterAbility) {
                CasterAbility caster = (CasterAbility) c;
                caster.castSpell("Fireball");
                System.out.println("Mana remaining: " + caster.getMana());
            }
        }

        System.out.println("== Defenders in the Party ==");
        for (GameCharacter c : party) {
            if (c instanceof Defendable) {
                Defendable d = (Defendable) c;
                d.block();
                System.out.println("Defense rating: " + d.getDefenseRating());
            }
        }

        // 4. Party summary
        int totalHp = 0;
        int casters = 0;
        int melee = 0;

        for (GameCharacter c : party) {
            totalHp += c.getHp();
            if (c instanceof CasterAbility) {
                casters++;
            } else {
                melee++;
            }
        }

        System.out.println("\n== Party Summary ==");
        System.out.println("Total party size: " + party.size());
        System.out.println("Total HP: " + totalHp);
        System.out.println("Casters: " + casters);
        System.out.println("Melee fighters: " + melee);
        System.out.println("Party is ready for battle!");
    }
}
