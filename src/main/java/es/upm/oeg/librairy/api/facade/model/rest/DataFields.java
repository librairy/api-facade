package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.ApiModelPropertyExtended;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFields extends es.upm.oeg.librairy.api.facade.model.avro.DataFields{

    public DataFields(es.upm.oeg.librairy.api.facade.model.avro.DataFields dataFields){
        try {
            BeanUtils.copyProperties(this,dataFields);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DataFields(){}

    public DataFields(String id, String name, List<String> labels, List<String> text) {
        super(id, name, labels, text);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "document id")
    @ApiModelPropertyExtended(defaultValue = "id")
    public String getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "document name")
    @ApiModelPropertyExtended(defaultValue = "title")
    public String getName() {
        return super.getName();
    }
    @Override
    @ApiModelProperty(value = "document labels")
    @ApiModelPropertyExtended(defaultValue = "tags")
    public List<String> getLabels() {
        return super.getLabels();
    }

    @Override
    @ApiModelProperty(value = "document text")
    @ApiModelPropertyExtended(defaultValue = "content, description, title")
    public List<String> getText() {
        return super.getText();
    }


    public boolean isValid(){

        if (Strings.isNullOrEmpty(getId())) return false;

        if (get("text") == null) return false;
        if (getText().isEmpty()) return false;

        return true;
    }
}
