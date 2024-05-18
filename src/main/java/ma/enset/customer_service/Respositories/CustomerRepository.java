package ma.enset.customer_service.Respositories;

import ma.enset.customer_service.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
