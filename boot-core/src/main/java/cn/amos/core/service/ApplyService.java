package cn.amos.core.service;

import cn.amos.common.request.ApplyRequest;
import cn.amos.common.response.GeneralResponse;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public interface ApplyService {

    /**
     * 生成会员编号
     *
     * @param applyRequest 用户id
     * @return 通用
     */
    GeneralResponse generateApply(ApplyRequest applyRequest);
}
