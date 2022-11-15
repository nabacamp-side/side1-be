//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.payment.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByConsumerId(Long consumerId);
    List<Payment> findBySellerId(Long sellerId);
    List<Payment> findByConsumerIdAndExpirationDateGreaterThan(Long consumerId, LocalDate localDate);
    List<Payment> findByConsumerIdAndExpirationDateIs(Long consumerId, LocalDate localDate);
    List<Payment> findByConsumerIdAndExpirationDateLessThan(Long consumerId, LocalDate localDate);

}
