package es.upm.oeg.librairy.api.facade;

import es.upm.oeg.librairy.api.facade.model.avro.*;
import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroClient {

    private static final Logger LOG = LoggerFactory.getLogger(AvroClient.class);

    NettyTransceiver client;
    LibrairyApi proxy;

    public void open(String host, Integer port) throws IOException {
        this.client = new NettyTransceiver(new InetSocketAddress(InetAddress.getByName(host),port));
        // client code - attach to the server and send a message
        this.proxy = (LibrairyApi) SpecificRequestor.getClient(LibrairyApi.class, client);
        LOG.info("Client built to " + host+":"+port+", got proxy");
    }

    public void close(){
        if (client != null) client.close();
    }

    public Task createTopics(TopicsRequest request) throws AvroRemoteException {

        LOG.debug("Calling proxy.createTopics");
        Task result= proxy.createTopics(request);
        LOG.debug("Result: " + result);
        return result;
    }

    public Task createAnnotations(AnnotationsRequest request) throws AvroRemoteException {

        LOG.debug("Calling proxy.createAnnotations");
        Task result= proxy.createAnnotations(request);
        LOG.debug("Result: " + result);
        return result;
    }

    public Task createDocuments(DocumentsRequest request) throws AvroRemoteException {

        LOG.debug("Calling proxy.createDocuments");
        Task result= proxy.createDocuments(request);
        LOG.debug("Result: " + result);
        return result;
    }

    public Set getSet(SetRequest request) throws AvroRemoteException {

        LOG.debug("Calling proxy.getSet");
        Set result= proxy.getSet(request);
        LOG.debug("Result: " + result);
        return result;
    }


    public Task cleanCache() throws AvroRemoteException {

        LOG.debug("Calling proxy.cleanCache ");
        Task result= proxy.cleanCache();
        LOG.debug("Result: " + result);
        return result;
    }
}
