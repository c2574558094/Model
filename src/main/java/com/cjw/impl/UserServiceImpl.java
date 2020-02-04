package com.cjw.impl;

import com.cjw.dao.SmbmsProviderMapper;
import com.cjw.pojo.SmbmsUser;
import com.cjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service()
public class UserServiceImpl implements UserService {
    @Autowired
    private SmbmsProviderMapper smbmsProviderMapper;

    @Override
    public List<SmbmsUser> queryProvider() {
        return smbmsProviderMapper.queryProviders();
    }

    @Override
    public int deleteProvider(int id) {
        return smbmsProviderMapper.deleteProvider(id);
    }

    @Override
    public int updateProvider(SmbmsUser smbmsUser) {
        return smbmsProviderMapper.updateProvider(smbmsUser);
    }

    @Override
    public int addSmbmsUser(SmbmsUser smbmsUser) {
        return smbmsProviderMapper.addSmbmsUser(smbmsUser);
    }

    @Override
    public SmbmsUser queryProvider(int id) {
        return smbmsProviderMapper.queryProvider(id);
    }
}