package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import es.upm.oeg.librairy.service.ApiModelPropertyExtended;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Credentials extends es.upm.oeg.librairy.api.facade.model.avro.Credentials{

    public Credentials(es.upm.oeg.librairy.api.facade.model.avro.Credentials credentials){
        try {
            if (credentials!=null) BeanUtils.copyProperties(this,credentials);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Credentials(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "user name")
    @ApiModelPropertyExtended(defaultValue = "user")
    public String getUser() {
        return super.getUser();
    }

    @Override
    @ApiModelProperty(value = "user password")
    @ApiModelPropertyExtended(defaultValue = "pwd")
    public String getPassword() {
        return super.getPassword();
    }

}
