package 기본API클래스JavaLang;

public class Member {

    // 필드
    public String id;

    // 생성쟈
    public Member(String id)
    {
        this.id = id;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;

            if (id.equals(member.id))
                return true;
        }
        return false;
    }
}
