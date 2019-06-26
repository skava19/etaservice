package etaservice;
import java.util.Map;
import java.util.Set;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtaController {
static int counter = 0;
    
    @RequestMapping("/DeliveryVanLocation")
    public EtaMessage getLocation( @RequestParam(value= "orderId", required = true) String inboundOrderId ) 
    {
        System.out.println("Location called with inboundOrderId = "+inboundOrderId+" "+counter++);
    	EtaMessage theMessage = new EtaMessage();
    	theMessage.setEta(10);
    	java.util.Date date = new java.util.Date();
    	theMessage.setLastHardFix(date.toString());
    	theMessage.setLattitude("72E");
    	theMessage.setLongitude("41N");
    	theMessage.setNotes("I am driving as fast as I can given all the tourists");
        theMessage.setTimestamp(date.toString());
        if (null != inboundOrderId)
        {
          theMessage.setOrderId(inboundOrderId);	
        }
    	return theMessage;
    }
    
   
}



