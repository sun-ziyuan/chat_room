package org.ziyuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 服务端发送给浏览器的webSocket数据
 * @author sunziyuan
 * @date 2024/1/18 22:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultMessage {
    private boolean isSystem;
    private String fromName;
    private Object message; // 如果是系统信息是数组
}
