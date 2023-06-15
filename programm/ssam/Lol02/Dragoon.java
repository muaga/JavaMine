package ssam.Lol02;

public class Dragoon extends ProtossUnit {
    int attack;
    int hp;
    String name;

    public Dragoon(int attack, int hp, String name) {
        this.attack = attack;
        this.hp = hp;
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public String getName() {
        return name;
    }

}
