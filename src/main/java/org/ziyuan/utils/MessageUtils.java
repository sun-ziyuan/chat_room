package org.ziyuan.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ziyuan.pojo.ResultMessage;

/**
 * @author sunziyuan
 * @date 2024/1/16 22:16
 */
public class MessageUtils {

    /**
     * 获取消息
     * @param isSystemMessage 系统消息
     * @param fromMessage 谁发送的消息
     * @param message 发送的具体消息
     * @return
     */
    public static String getMessage(boolean isSystemMessage,String fromMessage,Object message){
        try {
            ResultMessage result = new ResultMessage();
            result.setSystem(isSystemMessage);
            result.setMessage(message);
            if (fromMessage != null) {
                result.setFromName(fromMessage);
            }
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
