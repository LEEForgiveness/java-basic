package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; //지역변수안에 nameField가 없어서 this.을 안쓰고 접근 가능(자바가 자동으로 해줌), this.을 적어도 됨
    }
}
