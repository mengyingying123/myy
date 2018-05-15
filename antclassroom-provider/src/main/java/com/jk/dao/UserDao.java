package com.jk.dao;

import com.jk.model.Staff;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
@Repository
public interface UserDao {


    Staff querystaffname(@Param("staffname") String staffname);
}
