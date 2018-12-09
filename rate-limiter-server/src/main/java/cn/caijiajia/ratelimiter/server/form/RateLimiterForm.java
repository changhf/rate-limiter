/**
 * Caijiajia confidential
 * <p/>
 * Copyright (C) 2015 Shanghai Shuhe Co., Ltd. All rights reserved.
 * <p/>
 * No parts of this file may be reproduced or transmitted in any form or by any means,
 * electronic, mechanical, photocopying, recording, or otherwise, without prior written
 * permission of Shanghai Shuhe Co., Ltd.
 */
package cn.caijiajia.ratelimiter.server.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @author wukaiqiang
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RateLimiterForm {
    /**
     * 令牌桶唯一标识
     */
    @NotBlank
    private String name;
    /**
     * 能够使用令牌桶的应用列表
     */
    @NotBlank
    private String context;
    /**
     * 令牌桶容量
     */
    @NotNull
    private Integer maxPermits;
    /**
     * 向令牌桶中添加令牌的速率
     */
    @NotNull
    private Integer rate;
}
