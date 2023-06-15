package ssam.Lol03;

public class App {

    // a1의 공격력은 a1.attack이고, b1이 공격을 받아서 남은 hp는 b1.hp이다.
    // 공격력, 이름, hp, 그리고 남은 hp
    static void attack(ProtossUnit a1, ProtossUnit b1) {
        b1.hp = b1.hp - a1.attack;
        System.out.println(a1.name + "의 공격력은 " + a1.attack + "이고, " + b1.name + "이 공격을 받아서 남은 hp는" + b1.hp + "입니다.");

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot(100, 150, "질럿1");
        ProtossUnit d1 = new Dragoon(80, 100, "드라곤1");
        ProtossUnit d2 = new Dragoon(80, 90, "드라곤2");
        ProtossUnit t1 = new DarkTemple(90, 130, "다크1");

        attack(d2, t1);
        attack(d2, d1);
        attack(z1, t1);
    }

}
