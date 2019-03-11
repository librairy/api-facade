package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import es.upm.oeg.librairy.api.facade.model.avro.WriterFormat;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.ApiModelPropertyExtended;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSink extends es.upm.oeg.librairy.api.facade.model.avro.DataSink{

    private static final Logger LOG = LoggerFactory.getLogger(DataSink.class);


    public DataSink(es.upm.oeg.librairy.api.facade.model.avro.DataSink datasink){
        try {
            BeanUtils.copyProperties(this,datasink);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DataSink(){}

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
    public WriterFormat getFormat() {return super.getFormat();}

    @Override
    @ApiModelProperty(value = "data credentials")
    public Credentials getCredentials() {
        return new Credentials(super.getCredentials());
    }

    public boolean isValid(){
        if (Strings.isNullOrEmpty(getUrl())) {
            LOG.warn("Data Sink URL is empty");
            return false;
        }
        return true;
    }

}
