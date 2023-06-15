package ssam.Lol02;

// 왕 밑에서 일하는 신하들
// 그런데 왕은 일을 안해서 본인들이 일을 다하는 신하들
// 왕은 필요없다고 생각하지만, 국가의 우두머리로써 존재는 필요하다
// 신하들을 연결시켜주는 매개체
// 다른 나라에서 왕만 불려나가도 자동으로 호출되는 존재들
public class DarkTemple extends ProtossUnit {
    int attack;
    int hp;
    String name;

    public DarkTemple(int attack, int hp, String name) {
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
    // getter와 setter가 필요한 이유
    // 1. new를 통해 인수를 받아서
    // 2. 매개변수로 받은 인수를 this를 통해 초기화한 상태변수에 이동한 후
    // 3. get, set에 이동, return을 통하여 App의 attack 메소드로 이동.
    // 4. setHp는 매개변수를 통해(attack) 나온 결과값이 this를 통해 getHp로 이동
    // 5. attack의 계산된 값은 attack(z1,t1);으로 출력된다.

    // return : 본 클래스에서 나온 결과값을 받은 후 리턴을 하는 것

}