package com.smit.eclat_ai.entity;

import com.smit.eclat_ai.enums.SubscriptionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    User User;

    SubscriptionStatus status;

    Plan plan;

    String stripeCustomerId;                //stores the stripe payment info in dashboard
    String stripeSubscriptionId;

    Instant currentPeriodStart;             //when the plan period starts
    Instant currentPeriodEnd;               //when the plan period ends
    Boolean cancelAtPeriodEnd;              //if the plan has been canceled at period end

    Instant createdAt;
    Instant updatedAt;
}
