package ch.flashcode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
    	FraudCheckHistory fraudCheckHistory = new FraudCheckHistory();
    	fraudCheckHistory.setCustomerId(customerId);
    	fraudCheckHistory.setIsFraudster(false);
    	fraudCheckHistory.setCreatedAt(LocalDateTime.now());
    	
        fraudCheckHistoryRepository.save(fraudCheckHistory);
        
        return false;
    }

}
