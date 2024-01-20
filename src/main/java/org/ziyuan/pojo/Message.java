package org.ziyuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 浏览器发送给服务器的webSocket数据
 * @author sunziyuan
 * @date 2024/1/18 22:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private String toName;
    private String message;
}
