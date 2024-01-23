package com.beacon.nsocketio.dao;

import com.beacon.nsocketio.pojo.entity.CustomerDO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * DESCRIPTION:
 * <P>
 * </p>
 *
 * @author wangmin
 * @since 2022/6/23 20:28
 */
public interface CustomerRepository extends CrudRepository<CustomerDO, Long> {

    List<CustomerDO> findByLastName(String lastName);

    CustomerDO findById(long id);
}
