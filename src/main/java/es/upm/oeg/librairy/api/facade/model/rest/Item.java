package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item extends es.upm.oeg.librairy.api.facade.model.avro.Item{

    public Item(es.upm.oeg.librairy.api.facade.model.avro.Item item){
        try {
            if (item!=null) BeanUtils.copyProperties(this,item);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Item(){}

    public Item(String id, String name, String description, String url, Double score) {
        super(id, name, description, url, score);
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
    @ApiModelProperty(value = "label")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "details")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "reference")
    public String getUri() {
        return super.getUri();
    }

    @Override
    @ApiModelProperty(value = "relevance")
    public Double getScore() {
        return super.getScore();
    }


}
