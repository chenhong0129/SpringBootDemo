package cn.ucmed.service;

import cn.ucmed.model.User;
import java.util.List;

/**
 * Created by ucmed on 2018/3/15.
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
