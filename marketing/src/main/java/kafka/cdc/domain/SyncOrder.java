package kafka.cdc.domain;

import kafka.cdc.MarketingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="SyncOrder_table")
@Data

public class SyncOrder  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private Double price;
    
    
    
    
    
    private Long productId;


    public static SyncOrderRepository repository(){
        SyncOrderRepository syncOrderRepository = MarketingApplication.applicationContext.getBean(SyncOrderRepository.class);
        return syncOrderRepository;
    }






}
