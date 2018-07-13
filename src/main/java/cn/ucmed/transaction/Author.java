package cn.ucmed.transaction;

/**
 * Created by chenhong on 2018/4/28.
 */
public class Author {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String realName;
    private String nickName;

    public Author(){}
    public Author(String realName, String nickName){
        this.realName = realName;
        this.nickName = nickName;
    }
}
