package ssam.Earth01;

class 지구인 {
    int x;
    String name;

    public 지구인(int x, String name) {
        this.x = x;
        this.name = name;
    }
}

class 한국인 extends 지구인 {
    public 한국인(int x, String name) {
        super(x, name);
    }

}

class 유럽인 extends 지구인 {
    public 유럽인(int x, String name) {
        super(x, name);
    }

}

class 미국인 extends 지구인 {
    public 미국인(int x, String name) {
        super(x, name);
    }

}

public class Earth {

    // 각 나라에 몇 명이 살고 있는가
    // 두 나라를 합치면 총 몇명인가
    static void sum(지구인 a, 지구인 b) {
        int sum = a.x + b.x;
        System.out.println(a.name + "에는 " + a.x + "이 살고 있다.");
    }

    public static void main(String[] args) {

        지구인 a = new 한국인(10, "한쿸사람");
        지구인 b = new 미국인(20, "미쿸사람");

        sum(a, b);

    }

}
