package com.cjw.dao;

import com.cjw.pojo.SmbmsUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SmbmsProviderMapper {

    List<SmbmsUser> queryProviders();
    int deleteProvider(@Param("id") int id);

    int updateProvider(@Param("SmbmsUser") SmbmsUser smbmsUser);

    int addSmbmsUser(@Param("SmbmsUser") SmbmsUser smbmsUser);

    SmbmsUser queryProvider(@Param("id") int id);
}
