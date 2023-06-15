package ssam.Lol02;

// 이름뿐인 왕
// 국가에 왕이 있어야 나라가 돌아가는 것처럼 통로의 역할을 하지만
// 일은 전혀 하지 않는 무늬만 왕
// 신하들은 연결시키는 왕(연결고리)

abstract public class ProtossUnit {

    abstract public int getAttack();

    abstract public int getHp();

    abstract public void setHp(int hp);

    abstract public String getName();
}
