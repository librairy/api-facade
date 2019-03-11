package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
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
public class AnnotationsRequest extends es.upm.oeg.librairy.api.facade.model.avro.AnnotationsRequest{

    private static final Logger LOG = LoggerFactory.getLogger(AnnotationsRequest.class);

    public AnnotationsRequest(es.upm.oeg.librairy.api.facade.model.avro.AnnotationsRequest annotationsRequest){
        try {
            BeanUtils.copyProperties(this,annotationsRequest);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public AnnotationsRequest(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "notification email")
    @ApiModelPropertyExtended(defaultValue = "sample@mail.com")
    public String getContactEmail() {
        return super.getContactEmail();
    }

    @Override
    @ApiModelProperty(value = "model endpoint")
    @ApiModelPropertyExtended(defaultValue = "http://model-ip:8080/model-name")
    public String getModelEndpoint() {
        return super.getModelEndpoint();
    }

    @Override
    @ApiModelProperty(value = "data source")
    public DataSource getDataSource() {
        return new DataSource(super.getDataSource());
    }

    @Override
    @ApiModelProperty(value = "data sink")
    public DataSink getDataSink() {
        return new DataSink(super.getDataSink());
    }

    public boolean isValid(){

        if (Strings.isNullOrEmpty(getModelEndpoint())) {
            LOG.warn("Model Endpoint is empty");
            return false;
        }
        if (Strings.isNullOrEmpty(getContactEmail())){
            LOG.warn("Contact Email is empty");
            return false;
        }

        if (get("dataSource") == null) {
            LOG.warn("DataSource is empty");
            return false;
        }
        if (!getDataSource().isValid()) return false;

        if (get("dataSink") == null) {
            LOG.warn("Data Sink is empty");
            return false;
        }
        if (!getDataSink().isValid()) return false;

        return true;


    }

}
