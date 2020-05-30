package com.macro.mall.portal.domain;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.SmsHomeAdvertise;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * First page content returns information encapsulation
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class HomeContentResult {
    //broadcast the announcement
    private List<SmsHomeAdvertise> advertiseList;
    //Brand promotion
    private List<PmsBrand> brandList;
    //before the second before the second
    private HomeFlashPromotion homeFlashPromotion;
    //New product recommendation
    private List<PmsProduct> newProductList;
    //Recommended for people
    private List<PmsProduct> hotProductList;
    //Push the question
    private List<CmsSubject> subjectList;
}
