package hello.core.singleton;

public class SingletonService {

    //static으로 갖고 있기 때문에 딱 하나만 갖고 있게 됨
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){
        //생성자를 private으로 만들어서 다른 곳에서 new 키워드로 SingletonService를 생성하지 못하게 막는다.
    }

    public void logic(){
        System.out.println("싱글톤 객체 생성 완료");
    }
}
