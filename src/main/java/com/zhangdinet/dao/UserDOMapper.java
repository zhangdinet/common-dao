package com.zhangdinet.dao;

import com.zhangdinet.domain.UserDO;
import java.util.List;

public interface UserDOMapper {

    UserDO getById(Long id);

    List<UserDO> getAll();
}