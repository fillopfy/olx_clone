package com.alpha.olx.ads.ads.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ad {
    @Id
    @GeneratedValue
    private Long adId;
    private Long categoryId;
    private Long sellerId;
    private Long locationId;
}
