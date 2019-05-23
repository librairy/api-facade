package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import es.upm.oeg.librairy.service.ApiModelPropertyExtended;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFields extends es.upm.oeg.librairy.api.facade.model.avro.DataFields{

    private static final Logger LOG = LoggerFactory.getLogger(DataFields.class);


    public DataFields(es.upm.oeg.librairy.api.facade.model.avro.DataFields dataFields){
        try {
            if (dataFields!=null) BeanUtils.copyProperties(this,dataFields);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DataFields(){}

    public DataFields(String id, String name, List<String> labels, List<String> text, List<String> extra) {
        super(id, name, labels, text, extra);
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

    @Override
    @ApiModelProperty(value = "extra data")
    @ApiModelPropertyExtended(defaultValue = "extended fields")
    public List<String> getExtra() {
        return super.getExtra();
    }


    public boolean isValid(){

        if (Strings.isNullOrEmpty(getId())){
            LOG.warn("Data Field ID is empty");
            return false;
        }

        return true;
    }
}
