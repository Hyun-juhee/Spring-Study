package spring.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance; // 항상 같은 인스턴스 반환
    }

    private SingletonService() {
        // 다른데서 생성하지 못하도록 private으로 생성자 감춰버림
        // 생성은 못하고 꺼낼 수 있는건 getInstance뿐
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
