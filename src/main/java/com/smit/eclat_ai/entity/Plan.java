package com.smit.eclat_ai.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String stripePriceId;           //attach each plan with stripe price id
    Integer maxProjects;            //max no of projects of each plan
    Integer maxTokenPerDay;         //max llm tokens per day
    Integer maxPreview;             //max no of previews; consuming our resources; using the K8s pods
    Boolean unlimitedAi;            //max plan to have unlimited ai power

    Boolean active;                 //admin only; to make plans active / inactive

}
