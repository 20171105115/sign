package com.edu.imnu.dao;

import com.edu.imnu.entity.SignItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "signItemDao")
public interface SignItemDao {
    void insert(SignItem signItem);

    void update(SignItem signItem);

    List<SignItem> selectByDetail(Integer signId);

    List<SignItem> selectBySelf(Integer signInId);
}
