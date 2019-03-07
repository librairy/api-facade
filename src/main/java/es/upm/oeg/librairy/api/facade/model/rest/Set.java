package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Set extends es.upm.oeg.librairy.api.facade.model.avro.Set{

    public Set(es.upm.oeg.librairy.api.facade.model.avro.Set set){
        try {
            BeanUtils.copyProperties(this,set);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Set(){}

    public Set(List<es.upm.oeg.librairy.api.facade.model.avro.Item> items) {
        super(items);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public List<es.upm.oeg.librairy.api.facade.model.avro.Item> getItems() {
        return super.getItems();
    }


}
