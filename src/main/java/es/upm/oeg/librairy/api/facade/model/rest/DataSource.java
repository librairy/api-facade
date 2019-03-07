package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.ApiModelPropertyExtended;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSource extends es.upm.oeg.librairy.api.facade.model.avro.DataSource{

    public DataSource(es.upm.oeg.librairy.api.facade.model.avro.DataSource datasource){
        try {
            BeanUtils.copyProperties(this,datasource);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DataSource(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "endpoint")
    @ApiModelPropertyExtended(defaultValue = "http://server/solr/core1")
    public String getUrl() {
        return super.getUrl();
    }

    @Override
    @ApiModelProperty(value = "data format")
    @ApiModelPropertyExtended(defaultValue = "SOLR_CORE")
    public ReaderFormat getFormat() {return super.getFormat();}

    @Override
    @ApiModelProperty(value = "document selection")
    @ApiModelPropertyExtended(defaultValue = "*:*")
    public String getFilter() {
        return super.getFilter();
    }

    @Override
    @ApiModelProperty(value = "number of documents")
    @ApiModelPropertyExtended(defaultValue = "-1")
    public Long getSize() {
        return super.getSize();
    }

    @Override
    @ApiModelProperty(value = "skip documents")
    @ApiModelPropertyExtended(defaultValue = "0")
    public Long getOffset() {
        return super.getOffset();
    }

    @Override
    @ApiModelProperty(value = "save datasource in cache")
    @ApiModelPropertyExtended(defaultValue = "false")
    public Boolean getCache() {
        return super.getCache();
    }

    @Override
    @ApiModelProperty(value = "document fields")
    public DataFields getDataFields() {
        return new DataFields(super.getDataFields());
    }

    @Override
    @ApiModelProperty(value = "data credentials")
    public Credentials getCredentials() {
        return new Credentials(super.getCredentials());
    }

    public boolean isValid(){
        if (Strings.isNullOrEmpty(getUrl())) return false;
        if (get("fields") == null) return false;

        return getDataFields().isValid();
    }

}
