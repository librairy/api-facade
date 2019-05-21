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
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicsRequest extends es.upm.oeg.librairy.api.facade.model.avro.TopicsRequest{

    private static final Logger LOG = LoggerFactory.getLogger(TopicsRequest.class);

    public TopicsRequest(es.upm.oeg.librairy.api.facade.model.avro.TopicsRequest topicsRequest){
        try {
            BeanUtils.copyProperties(this,topicsRequest);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TopicsRequest(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "topic model name")
    @ApiModelPropertyExtended(defaultValue = "my-model")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "topic model description")
    @ApiModelPropertyExtended(defaultValue = "my-data")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "topic model version")
    @ApiModelPropertyExtended(defaultValue = "1.0")
    public String getVersion() {
        return super.getVersion();
    }

    @Override
    @ApiModelProperty(value = "notification email")
    @ApiModelPropertyExtended(defaultValue = "sample@mail.com")
    public String getContactEmail() {
        return super.getContactEmail();
    }

    @Override
    @ApiModelProperty(value = "model parameters")
    public Map<String,String> getParameters() {
        return super.getParameters();
    }

    @Override
    @ApiModelProperty(value = "annotate documents with topic distribution")
    public Boolean getAnnotate() {return super.getAnnotate();}

    @Override
    @ApiModelProperty(value = "data source")
    public DataSource getDataSource() {
        return new DataSource(super.getDataSource());
    }

    @Override
    @ApiModelProperty(value = "docker-hub credentials")
    public Docker getDocker() {
        return new Docker(super.getDocker());
    }

    public boolean isValid(){

        if (Strings.isNullOrEmpty(getName())){
            LOG.warn("Name is empty");
            return false;
        }
        if (Strings.isNullOrEmpty(getContactEmail())) {
            LOG.warn("Contact Email is empty");
            return false;
        }
        if (Strings.isNullOrEmpty(getVersion())) {
            LOG.warn("Version is empty");
            return false;
        }

        if (get("dataSource") == null) {
            LOG.warn("Data Source is empty");
            return false;
        }
        if (!getDataSource().isValid()) return false;

        if (get("docker") == null) {
            LOG.warn("Docker credentials are empty");
            return false;
        }
        if (!getDocker().isValid()) return false;

        return true;


    }

}
