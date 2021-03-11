package com.yiheng.look_assistant.db.repository;

import com.yiheng.look_assistant.db.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Yiheng
 * @since 2021/3/12 上午2:17
 *
 * 逻辑删除，重写删除方法。
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseModel> extends JpaRepository<T, Long> {

    default void logicDeleteById(Long id) {
        T t = getOne(id);
        t.setDelFlag(1);
        save(t);
    }

}
