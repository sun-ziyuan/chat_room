package org.ziyuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于登录响应回给浏览器的数据
 * @author sunziyuan
 * @date 2024/1/18 22:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    private boolean flag;
    private String message;
}

