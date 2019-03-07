package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reference extends es.upm.oeg.librairy.api.facade.model.avro.Reference{

    public Reference(es.upm.oeg.librairy.api.facade.model.avro.Reference reference){
        try {
            BeanUtils.copyProperties(this,reference);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Reference(){}

    public Reference(String id, String text) {
        super(id, text);
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

    @Override
    @ApiModelProperty(value = "free-text")
    public String getText() {
        return super.getText();
    }


    public boolean isValid(){
        return !Strings.isNullOrEmpty(getId()) || Strings.isNullOrEmpty(getText());
    }

}
