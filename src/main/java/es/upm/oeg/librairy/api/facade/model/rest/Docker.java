package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat;
import es.upm.oeg.librairy.service.ApiModelPropertyExtended;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Docker extends es.upm.oeg.librairy.api.facade.model.avro.Docker{

    private static final Logger LOG = LoggerFactory.getLogger(Docker.class);

    public Docker(es.upm.oeg.librairy.api.facade.model.avro.Docker docker){
        try {
            if (docker!=null) BeanUtils.copyProperties(this,docker);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Docker(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "docker-hub user name")
    @ApiModelPropertyExtended(defaultValue = "librairy")
    public String getUser() {
        return super.getUser();
    }

    @Override
    @ApiModelProperty(value = "docker-hub user email")
    @ApiModelPropertyExtended(defaultValue = "librairy.framework@gmail.com")
    public String getEmail() {return super.getEmail();}

    @Override
    @ApiModelProperty(value = "docker-hub password")
    @ApiModelPropertyExtended(defaultValue = "secret")
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    @ApiModelProperty(value = "docker-hub repository")
    @ApiModelPropertyExtended(defaultValue = "librairy/model")
    public String getRepository() {
        return super.getRepository();
    }

    public boolean isValid(){
        if (Strings.isNullOrEmpty(getRepository())) {
            LOG.warn("Docker repository is empty");
            return false;
        }

        if (Strings.isNullOrEmpty(getPassword())) {
            LOG.warn("Docker password is empty");
            return false;
        }

        if (Strings.isNullOrEmpty(getUser()) && Strings.isNullOrEmpty(getEmail())) {
            LOG.warn("Docker user/email is empty");
            return false;
        }

        return true;
    }

}
