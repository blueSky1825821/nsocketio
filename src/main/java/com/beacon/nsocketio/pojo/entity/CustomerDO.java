package com.beacon.nsocketio.pojo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DESCRIPTION:
 * <P>
 * </p>
 *
 * @author wangmin
 * @since 2022/6/23 20:24
 */
@Entity(name = "customer")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomerDO implements Serializable {
    @java.io.Serial
    private static final long serialVersionUID = 9160294186372352179L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    public CustomerDO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
