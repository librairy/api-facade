package org.librairy.service.nlp.facade;

import es.upm.oeg.librairy.api.facade.AvroClient;
import es.upm.oeg.librairy.api.facade.AvroServer;
import es.upm.oeg.librairy.api.facade.model.avro.*;
import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    private static final Logger LOG = LoggerFactory.getLogger(CommunicationTest.class);

    @Test
    public void exchange() throws InterruptedException, IOException {


        LibrairyApi customService = new LibrairyApi() {


            @Override
            public Task createTopics(TopicsRequest request) throws AvroRemoteException {
                return Task.newBuilder().setDate(new Date().toString()).setStatus("QUEUED").setMessage("new topic model queued").build();
            }

            @Override
            public Task createAnnotations(AnnotationsRequest request) throws AvroRemoteException {
                return Task.newBuilder().setDate(new Date().toString()).setStatus("QUEUED").setMessage("annotation tasks queued").build();
            }

            @Override
            public Task createDocuments(DocumentsRequest request) throws AvroRemoteException {
                return Task.newBuilder().setDate(new Date().toString()).setStatus("QUEUED").setMessage("adding documents queued").build();
            }

            @Override
            public List<Item> createItems(ItemsRequest request) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public Task cleanCache() throws AvroRemoteException {
                return Task.newBuilder().setDate(new Date().toString()).setStatus("ACCEPTED").setMessage("cache removed").build();
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);


        client.createTopics(TopicsRequest.newBuilder()
                .setName("tm1")
                .setDescription("test model")
                .setContactEmail("sample@mail.com")
                .setVersion("1.0")
                .setDataSource(
                        DataSource.newBuilder()
                                .setUrl("/src/test/resources/sample.csv")
                                .setSize(-1)
                                .setFormat(ReaderFormat.CSV)
                                .setDataFields(
                                        DataFields.newBuilder()
                                                .setId("id")
                                                .setText(Arrays.asList("title","content"))
                                                .build()
                                )
                                .build()

                )
                .build());
        client.cleanCache();

        client.createDocuments(DocumentsRequest.newBuilder()
                .setContactEmail("sample@gmail.com")
                .setDataSource(
                        DataSource.newBuilder()
                                .setUrl("/src/test/resources/sample.csv")
                                .setSize(-1)
                                .setFormat(ReaderFormat.CSV)
                                .setDataFields(
                                        DataFields.newBuilder()
                                                .setId("id")
                                                .setText(Arrays.asList("title","content"))
                                                .build()
                                )
                                .build()
                )
                .setDataSink(
                        DataSink.newBuilder()
                                .setUrl("/src/test/resources/sample.csv")
                                .setFormat(WriterFormat.SOLR_CORE)
                                .build()
                )
                .build());

        client.createItems(ItemsRequest.newBuilder()
                .setReference(
                        Reference.newBuilder()
                                .setDocument(
                                        DocReference.newBuilder().setId("docId").build()
                                ).build()
                )
                .setSize(5)
                .setDataSource(
                        DataSource.newBuilder()
                                .setUrl("/src/test/resources/sample.csv")
                                .setSize(-1)
                                .setFormat(ReaderFormat.CSV)
                                .setDataFields(
                                        DataFields.newBuilder()
                                                .setId("id")
                                                .setText(Arrays.asList("title","content"))
                                                .build()
                                )
                                .build()
                )
                .build());

        client.close();
        server.close();
    }

}
