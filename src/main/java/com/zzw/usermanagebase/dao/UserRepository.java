package com.zzw.usermanagebase.dao;

import com.zzw.usermanage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @version: 1.0
 * @author: x.x@hand-china.com
 * @date: 2019/2/21
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(nativeQuery = true,
            value =
            "SELECT * FROM user_basic_data where userName = ?1")
    User getUserByUserName(String userName);


}
