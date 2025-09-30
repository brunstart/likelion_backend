package Java.day29_250930;

import java.util.Optional;

class User{
    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class OptionalTest {
    public User findUser(int id) {
        if (id == 1) {
            return new User("carami");
        }
        return null;
    }

    public Optional<User> findUserOptional(int id){
        if (id == 1){
            return Optional.of(new User("carami"));
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        OptionalTest test = new OptionalTest();

        User findUser = test.findUser(2);

        // findUser가 null일 경우를 대비한 코드가 필요
        if (findUser != null) {
            System.out.println(findUser.getName());
        }else{
            System.out.println("찾을 수 없");
        }

        System.out.println("============ Optional 방식 =============");

        // 사용방법이 여러 개, null이 아니라면 앞에 람다식이 실행되고, null이면 뒤쪽이 실행
        test.findUserOptional(1).ifPresentOrElse(
                user -> System.out.println("사용자 이름 : " + user.getName()),
                ()-> System.out.println("사용자를 찾을 수 없습니다.")
        );

        // 가장 단순하지만 Optional의 장점을 이용할 수 없다. 값이 없을 경우 오류가 발생
        User user = test.findUserOptional(1).get(); // 그냥 꺼내줘

        System.out.println("============ orElse =============");
        User guest = test.findUserOptional(1).orElse(new User("guest"));    // 예외처리가 가능
        System.out.println(guest.getName());

        System.out.println("============= ifPresent ==============");
        // 값이 존재할 때만 뭔가 하고 싶다 -> ifPresent
        test.findUserOptional(1).ifPresent(u -> System.out.println("환영합니다. " + u.getName()));
    }
}
