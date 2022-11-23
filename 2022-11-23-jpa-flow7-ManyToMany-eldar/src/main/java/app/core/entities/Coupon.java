package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private int amount;

	@ManyToMany
	@JoinTable(

			name = "customer_coupon",

			joinColumns = @JoinColumn(name = "coupon_id"),

			inverseJoinColumns = @JoinColumn(name = "customer_id")

	)
	private List<Customer> customers;

	public void addCustomer(Customer customer) {
		if (customers == null) {
			customers = new ArrayList<>();
		}
		customers.add(customer);
	}

}
