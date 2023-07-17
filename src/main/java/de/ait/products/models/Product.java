
package de.ait.products.models;

import lombok.*;
@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

        private String name;
        private Integer amount;
        private Boolean shelfLife;


}
