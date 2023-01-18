package kafka.cdc.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "marketing", url = "${api.url.marketing}")
public interface SyncOrderService {
    @RequestMapping(method= RequestMethod.GET, path="/syncOrders/{id}")
    public SyncOrder getSyncOrder(@PathVariable("id") Long id);
}
