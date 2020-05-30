package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.CartPromotionItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Shopping Cart Management Service
 * Created by macro on 2018/8/2.
 */
public interface OmsCartItemService {
    /**
     * Check if the item is included in the cart, there is an increase in quantity, no addition to the cart
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * Get shopping cart list based on membership number
     */
    List<OmsCartItem> list(Long memberId);

    /**
     * Get a list of shopping carts with promotional information
     */
    List<CartPromotionItem> listPromotion(Long memberId);

    /**
     * Modify the number of items in a shopping cart
     */
    int updateQuantity(Long id, Long memberId, Integer quantity);

    /**
     * Bulk delete items from your shopping cart
     */
    int delete(Long memberId, List<Long> ids);

    /**
     * Get product information in your shopping cart to select product specifications
     */
    CartProduct getCartProduct(Long productId);

    /**
     * Modify the specifications of items in your shopping cart
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * Empty Shopping Cart
     */
    int clear(Long memberId);
}
