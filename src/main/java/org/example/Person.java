package org.example;

import lombok.*;

/**
 * Person model
 *
 * @author Vinod John
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String email;
}