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
public class TextReference extends es.upm.oeg.librairy.api.facade.model.avro.TextReference{

    private static final Logger LOG = LoggerFactory.getLogger(TextReference.class);

    public TextReference(es.upm.oeg.librairy.api.facade.model.avro.TextReference textReference){
        try {
            if (textReference!=null) BeanUtils.copyProperties(this,textReference);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TextReference(){}

    public TextReference(String content, String model) {
        super(content, model);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "free-text")
    public String getContent() {
        return super.getContent();
    }

    @Override
    @ApiModelProperty(value = "model API endpoint")
    public String getModel() {
        return super.getModel();
    }

    public boolean isValid(){

        if (Strings.isNullOrEmpty(getContent())){
            LOG.warn("Content is empty");
            return false;
        }

        if (Strings.isNullOrEmpty(getModel())){
            LOG.warn("Model is empty");
            return false;
        }

        return true;
    }

}
