package application.model;

//
///**
// * Created by matan on 09/05/2016.
// */
//

import application.enums.Platform;
import application.enums.Service;

import javax.persistence.Entity;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//
//

@Entity
public class ServiceUsage {

    private Service service;
    private long usageAmount;

    public ServiceUsage(Service service, long usageAmount)
    {
        this.service=service;
        this.usageAmount=usageAmount;
    }

    public void setService (Service service) {this.service=service;}
    public Service getService () {return service;}
    public void setUsageAmount (Long usageAmount) {this.usageAmount=usageAmount;}
    public Long getUsageAmount () {return  usageAmount;}

}
