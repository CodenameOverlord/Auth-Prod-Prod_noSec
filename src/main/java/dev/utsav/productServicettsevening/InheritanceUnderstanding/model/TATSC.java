package dev.utsav.productServicettsevening.InheritanceUnderstanding.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ta_sc")
@DiscriminatorValue(value =  "3")
public class TATSC
        extends UsersSC
{
    private Double averageRating;

}
