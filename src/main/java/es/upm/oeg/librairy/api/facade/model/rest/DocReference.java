package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
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
public class DocReference extends es.upm.oeg.librairy.api.facade.model.avro.DocReference{

    private static final Logger LOG = LoggerFactory.getLogger(DocReference.class);

    public DocReference(es.upm.oeg.librairy.api.facade.model.avro.DocReference docReference){
        try {
            if (docReference!=null) BeanUtils.copyProperties(this,docReference);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DocReference(){}

    public DocReference(String id) {
        super(id);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "resource identifier")
    public String getId() {
        return super.getId();
    }

    public boolean isValid(){
        if (Strings.isNullOrEmpty(getId())){
            LOG.warn("DocReference ID is empty");
            return false;
        }

        return true;
    }

}
