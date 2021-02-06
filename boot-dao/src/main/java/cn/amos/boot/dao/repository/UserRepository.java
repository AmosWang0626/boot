package cn.amos.boot.dao.repository;

import cn.amos.boot.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DESCRIPTION: UserRepository
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/6
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
