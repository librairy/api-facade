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
public class Task extends es.upm.oeg.librairy.api.facade.model.avro.Task{

    public Task(es.upm.oeg.librairy.api.facade.model.avro.Task task){
        try {
            BeanUtils.copyProperties(this,task);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Task(){}

    public Task(String date, String status, String message) {
        super(date, status, message);
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "request date")
    public String getDate() {
        return super.getDate();
    }

    @Override
    @ApiModelProperty(value = "request status")
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    @ApiModelProperty(value = "request description")
    public String getMessage() {
        return super.getMessage();
    }


}
