package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import es.upm.oeg.librairy.service.ApiModelPropertyExtended;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsRequest extends es.upm.oeg.librairy.api.facade.model.avro.ItemsRequest{

    private static final Logger LOG = LoggerFactory.getLogger(ItemsRequest.class);

    public ItemsRequest(es.upm.oeg.librairy.api.facade.model.avro.ItemsRequest itemsRequest){
        try {
            if (itemsRequest!=null) BeanUtils.copyProperties(this,itemsRequest);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public ItemsRequest(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "number of items")
    @ApiModelPropertyExtended(defaultValue = "10")
    public Integer getSize() {
        return super.getSize();
    }

    @Override
    @ApiModelProperty(value = "similar to this item")
    @ApiModelPropertyExtended(defaultValue = "10")
    public Reference getReference() {
        return new Reference(super.getReference());
    }

    @Override
    @ApiModelProperty(value = "data source")
    public DataSource getDataSource() {
        return new DataSource(super.getDataSource());
    }

    public boolean isValid(){
        if (get("reference") == null) {
            LOG.warn("Reference is empty");
            return false;
        }
        if (!getReference().isValid()) return false;

        if (get("dataSource") == null) {
            LOG.warn("Data Source is empty");
            return false;
        }
        if (!getDataSource().isValid()) return false;

        return true;
    }

}
