package org.example;

import lombok.*;

import java.math.BigDecimal;

/**
 * Developer model inherited
 *
 * @author Vinod John
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Developer extends org.example.Person {
    private boolean isOnsite;
    private BigDecimal salaryExpected;

    public void setName(String concat) {
    }
}