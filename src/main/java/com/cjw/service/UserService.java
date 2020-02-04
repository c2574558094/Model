package com.cjw.service;

import com.cjw.pojo.SmbmsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserService {
    List<SmbmsUser> queryProvider();
    int deleteProvider(@Param("id") int id);

    int updateProvider(@Param("SmbmsUser") SmbmsUser smbmsUser);

    int addSmbmsUser(@Param("SmbmsUser") SmbmsUser smbmsUser);

    SmbmsUser queryProvider(@Param("id") int id);
}
