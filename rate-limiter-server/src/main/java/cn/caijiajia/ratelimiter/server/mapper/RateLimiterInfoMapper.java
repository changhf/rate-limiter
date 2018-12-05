package cn.caijiajia.ratelimiter.server.mapper;


import cn.caijiajia.ratelimiter.server.domain.RateLimiterInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wukaiqiang
 */
public interface RateLimiterInfoMapper {

    List<RateLimiterInfo> selectAll();

    void saveOrUpdate(@Param("name") String name, @Param("apps") String apps, @Param("maxPermits") Integer maxPermits, @Param("rate") Integer rate);

    RateLimiterInfo selectByName(@Param("name") String name);

    void deleteByName(@Param("name") String name);
}