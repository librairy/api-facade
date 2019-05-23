package es.upm.oeg.librairy.api.facade.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reference extends es.upm.oeg.librairy.api.facade.model.avro.Reference{

    private static final Logger LOG = LoggerFactory.getLogger(Reference.class);

    public Reference(es.upm.oeg.librairy.api.facade.model.avro.Reference reference){
        try {
            if (reference!=null) BeanUtils.copyProperties(this,reference);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Reference(){}

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "document as reference")
    public DocReference getDocument() {
        es.upm.oeg.librairy.api.facade.model.avro.DocReference docRef = super.getDocument();
        if (docRef == null) return null;
        return new DocReference(docRef);
    }

    @Override
    @ApiModelProperty(value = "free-text as reference")
    public TextReference getText() {
        es.upm.oeg.librairy.api.facade.model.avro.TextReference textRef = super.getText();
        if (textRef == null) return null;
        return new TextReference(textRef);
    }


    public boolean isValid(){

        if ((getDocument() == null) && ( getText() == null)){
            LOG.warn("No reference document or text");
            return false;
        }

        return true;
    }

}
