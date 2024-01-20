package org.ziyuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录类
 * @author sunziyuan
 * @date 2024/1/18 22:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String username;
    private String password;
}
