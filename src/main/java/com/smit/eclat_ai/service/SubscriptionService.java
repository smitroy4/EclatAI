package com.smit.eclat_ai.service;

import com.smit.eclat_ai.dto.subscription.CheckoutRequest;
import com.smit.eclat_ai.dto.subscription.CheckoutResponse;
import com.smit.eclat_ai.dto.subscription.PortalResponse;
import com.smit.eclat_ai.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrenSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
