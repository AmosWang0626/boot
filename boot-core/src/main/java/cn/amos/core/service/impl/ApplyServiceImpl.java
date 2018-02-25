package cn.amos.core.service.impl;

import cn.amos.common.dto.TaoBaoLocationDTO;
import cn.amos.common.request.ApplyRequest;
import cn.amos.common.response.GeneralResponse;
import cn.amos.common.util.GenericIdUtil;
import cn.amos.common.util.IpUtil;
import cn.amos.core.service.ApplyService;
import cn.amos.dao.entity.ApplyEntity;
import cn.amos.dao.mappers.ApplyMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Component("applyService")
public class ApplyServiceImpl implements ApplyService {
    @Resource
    private ApplyMapper applyMapper;

    @Override
    public GeneralResponse generateApply(ApplyRequest applyRequest) {
        String ip = applyRequest.getIp();
        if (StringUtils.isBlank(ip) || applyRequest.getApplyAmt() == null
                || StringUtils.isBlank(applyRequest.getUserId())) {
            return GeneralResponse.PARAME_ERROR;
        }
        ApplyEntity applyEntity = new ApplyEntity();
        applyEntity.setUserId(applyRequest.getUserId());
        applyEntity.setApplyAmt(applyRequest.getApplyAmt());
        applyEntity.setApplyTime(applyRequest.getApplyTime());
        applyEntity.setApplyType(applyRequest.getApplyType());
        applyEntity.setApplyStatus(applyRequest.getApplyStatus());
        applyEntity.setReason(applyRequest.getReason());
        applyEntity.setIp(ip);

        applyEntity.setApplyNo(GenericIdUtil.genericApplyNo());
        GeneralResponse<TaoBaoLocationDTO> locationByTaoBao = IpUtil.getLocationByTaoBao(ip);
        if (locationByTaoBao.success()) {
            TaoBaoLocationDTO locationDTO = locationByTaoBao.getBody();
            applyEntity.setCity(locationDTO.getCity());
            applyEntity.setLocation(locationDTO.getArea() + locationDTO.getRegion() + locationDTO.getCity());
        }
        applyEntity.setCreateTime(new Date());

        applyMapper.insertApplyEntity(applyEntity);
        return GeneralResponse.SUCCESS;
    }
}
