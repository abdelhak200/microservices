package ch.flashcode.fraud;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(
            name = "fraud_id_sequence",
            sequenceName = "fraud_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence"
    )
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
    
	public FraudCheckHistory(Integer id, Integer customerId, Boolean isFraudster, LocalDateTime createdAt) {
		this.id = id;
		this.customerId = customerId;
		this.isFraudster = isFraudster;
		this.createdAt = createdAt;
	}

	public FraudCheckHistory() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Boolean getIsFraudster() {
		return isFraudster;
	}

	public void setIsFraudster(Boolean isFraudster) {
		this.isFraudster = isFraudster;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FraudCheckHistory other = (FraudCheckHistory) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "FraudCheckHistory [id=" + id + ", customerId=" + customerId + ", isFraudster=" + isFraudster + "]";
	}

}
