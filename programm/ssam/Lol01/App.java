package ssam.Lol01;

public class App {

    // a가 b를 공격해서 b의 hp는 얼마남았습니다.

    static void attack(Zealot a1, Dragoon b1) {
        b1.hp = b1.hp - a1.attack;
        System.out.println(a1.name + "의 공격으로 " + b1.name + "의 hp는 " + b1.hp + "가 남았습니다.");
    }

    static void attack(Zealot a1, DarkTemple b1) {
        b1.hp = b1.hp - a1.attack;
        System.out.println(a1.name + "의 공격으로 " + b1.name + "의 hp는 " + b1.hp + "가 남았습니다.");
    }

    static void attack(Dragoon a1, DarkTemple b1) {
        b1.hp = b1.hp - a1.attack;
        System.out.println(a1.name + "의 공격으로 " + b1.name + "의 hp는 " + b1.hp + "가 남았습니다.");
    }

    public static void main(String[] args) {
        Zealot a1 = new Zealot(100, 50, "질럿1");
        // Zealot의 생성자로 인수가 이동하여 상태에 저장.
        Dragoon d1 = new Dragoon(80, 120, "드라곤1");
        DarkTemple t1 = new DarkTemple(90, 80, "다크1");

        // a1.attck이 안되는 이유 : Zealot에 변수나 메소드가 구현되지 않아서.. 그럼 setter(return)을 하면 사용 가능
        attack(a1, d1);
        attack(a1, t1);
        attack(d1, t1);
    }
}
