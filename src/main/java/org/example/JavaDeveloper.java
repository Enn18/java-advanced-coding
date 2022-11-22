package org.example;

import lombok.*;

/**
 * JavaDeveloper model inherited
 *
 * @author Vinod John
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JavaDeveloper extends org.example.Developer {
    private float yearsOfExperience;
    private boolean isOfficiallyCertified;

    //Method overloading: Same method name but different number of parameters
    public void setName(String firstName, String lastName) {
        super.setName(firstName.concat(lastName));
    }

}