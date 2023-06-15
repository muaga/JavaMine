package ssam.Lol02;

// 오버라이딩

public class App {

    // a의 공격력은 attack이며, b를 공격해서 b의 hp가 얼마 남았습니다.
    static void attack(ProtossUnit a1, ProtossUnit b1) {
        b1.setHp(b1.getHp() - a1.getAttack()); // setHp의 매개변수 (b1.getHp() - a1.getAttack())
        System.out.println(a1.getName() + "의 공격력은 " + a1.getAttack() + "이며, " + b1.getName() + "를 공격해서 hp는 "
                + b1.getHp() + "가 남았습니다.");
        // 남은 공격력을 setHp가 아닌 getHp를 주는 이유는 각 클래스에서 setHp를 this를 통해 getHp로 반환하기 때문

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot(80, 100, "질럿시뫄");
        ProtossUnit t1 = new DarkTemple(100, 150, "다크뉨");

        attack(z1, t1);
    }
}
