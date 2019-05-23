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
public class DocumentsRequest extends es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest{

    private static final Logger LOG = LoggerFactory.getLogger(DocumentsRequest.class);

    public DocumentsRequest(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest documentsRequest){
        try {
            if (documentsRequest!=null) BeanUtils.copyProperties(this,documentsRequest);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public DocumentsRequest(){}

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
    @ApiModelProperty(value = "data source")
    public DataSource getDataSource() {
        return new DataSource(super.getDataSource());
    }

    public boolean isValid(){
        if (Strings.isNullOrEmpty(getContactEmail())) {
            LOG.warn("Contact Email is empty");
            return false;
        }

        if (get("dataSource") == null) {
            LOG.warn("Data Source is empty");
            return false;
        }
        if (!getDataSource().isValid()) return false;

        return true;
    }

}
