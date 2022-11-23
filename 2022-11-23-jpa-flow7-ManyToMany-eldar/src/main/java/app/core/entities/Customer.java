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
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "coupons")
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;

	@ManyToMany
	@JoinTable(

			name = "customer_coupon",

			joinColumns = @JoinColumn(name = "customer_id"),

			inverseJoinColumns = @JoinColumn(name = "coupon_id")

	)
	private List<Coupon> coupons;

	public void addCoupon(Coupon coupon) {
		if (coupons == null) {
			coupons = new ArrayList<>();
		}
		coupons.add(coupon);
	}

}
