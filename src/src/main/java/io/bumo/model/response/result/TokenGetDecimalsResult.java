package io.bumo.model.response.result;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @Author riven
 * @Date 2018/7/6 15:25
 */
public class TokenGetDecimalsResult {
    @JSONField(name = "decimals")
    private Integer decimals;

    /**
     * @Author riven
     * @Method getDecimals
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/6 15:48
     */
    public Integer getDecimals() {
        return decimals;
    }

    /**
     * @Author riven
     * @Method setDecimals
     * @Params [decimals]
     * @Return void
     * @Date 2018/7/6 16:13
     */
    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }
}
