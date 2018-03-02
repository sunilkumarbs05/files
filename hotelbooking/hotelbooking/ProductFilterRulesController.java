package com.aegbt.gtr.productFilterRules.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aegbt.gtr.productFilterRules.constants.ProductTriggerRulesConstants;
import com.aegbt.gtr.productFilterRules.entity.AuditEntity;
import com.aegbt.gtr.productFilterRules.log.LoggerHelper;
import com.aegbt.gtr.productFilterRules.service.ProductFilterRulesService;
import com.aegbt.gtr.productFilterRules.utility.DateUtilty;

/**
 * @author skuma833
 *
 */
@RestController
public class ProductFilterRulesController {

    @Autowired
    ProductFilterRulesService productFilterRulesService;

    @RequestMapping(value = "/applyProductFilter", method = RequestMethod.POST, produces = "application/xml")
    public String applyRules(@RequestBody String xml, @RequestHeader(required = false) String processor,
            @RequestHeader(required = false) String tranId, @RequestHeader(required = false) String loglevel) {
    	LoggerHelper.setLogDetails(tranId, null, null, ProductTriggerRulesConstants.APPLYRULE, processor);
        List<AuditEntity> auditEntities = new ArrayList<AuditEntity>();
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setTransactionId(UUID.fromString(tranId));
        auditEntity.setStartTime(DateUtilty.getGMTTime());
        auditEntity.setComponentName(ProductTriggerRulesConstants.APPLYRULE);
        auditEntity.setComponentType("MS");
        auditEntity.setLogLevel(loglevel);
        auditEntity.setMode(ProductTriggerRulesConstants.OFFLINE);
        String response = productFilterRulesService.applyProductFilter(xml, auditEntity, tranId);
        auditEntity.setEndTime(DateUtilty.getGMTTime());
        auditEntity.setHostName(System.getenv("HOSTNAME"));
        auditEntity.setProcessTime(Integer.parseInt(Long
                .toString(auditEntity.getEndTime().getTime() - auditEntity.getStartTime().getTime())));
        if (StringUtils.isNoneBlank(loglevel) && loglevel.equalsIgnoreCase(ProductTriggerRulesConstants.INFO)) {
            auditEntities.add(auditEntity.clone(xml, response));
            auditEntity.setStartTime(DateUtilty.getGMTTime());
        }
        auditEntities.add(auditEntity);
        productFilterRulesService.saveAuditEntity(auditEntities);
        return response;
    }

}
