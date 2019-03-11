/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package es.upm.oeg.librairy.api.facade.model.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface LibrairyApi {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"LibrairyApi\",\"namespace\":\"es.upm.oeg.librairy.api.facade.model.avro\",\"types\":[{\"type\":\"enum\",\"name\":\"ReaderFormat\",\"symbols\":[\"SOLR_CORE\",\"CSV\",\"CSV_TAR_GZ\",\"JSONL\",\"JSONL_TAR_GZ\"]},{\"type\":\"enum\",\"name\":\"WriterFormat\",\"symbols\":[\"SOLR_CORE\"]},{\"type\":\"record\",\"name\":\"Credentials\",\"fields\":[{\"name\":\"user\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"password\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"apikey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"DataFields\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]},{\"type\":\"record\",\"name\":\"DataSource\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":\"ReaderFormat\"},{\"name\":\"filter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"size\",\"type\":\"long\",\"default\":-1},{\"name\":\"offset\",\"type\":\"long\",\"default\":0},{\"name\":\"cache\",\"type\":\"boolean\",\"default\":false},{\"name\":\"credentials\",\"type\":[\"null\",\"Credentials\"],\"default\":null},{\"name\":\"dataFields\",\"type\":\"DataFields\"}]},{\"type\":\"record\",\"name\":\"DataSink\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":\"WriterFormat\"},{\"name\":\"credentials\",\"type\":[\"null\",\"Credentials\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"DocReference\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"TextReference\",\"fields\":[{\"name\":\"content\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"model\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"document\",\"type\":[\"null\",\"DocReference\"],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"TextReference\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"ItemsRequest\",\"fields\":[{\"name\":\"reference\",\"type\":\"Reference\"},{\"name\":\"size\",\"type\":\"int\",\"default\":10},{\"name\":\"dataSource\",\"type\":\"DataSource\"}]},{\"type\":\"record\",\"name\":\"DocumentsRequest\",\"fields\":[{\"name\":\"contactEmail\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"dataSource\",\"type\":\"DataSource\"},{\"name\":\"dataSink\",\"type\":\"DataSink\"}]},{\"type\":\"record\",\"name\":\"AnnotationsRequest\",\"fields\":[{\"name\":\"contactEmail\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"modelEndpoint\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"dataSource\",\"type\":\"DataSource\"},{\"name\":\"dataSink\",\"type\":\"DataSink\"}]},{\"type\":\"record\",\"name\":\"TopicsRequest\",\"fields\":[{\"name\":\"contactEmail\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"created by librAIry\"},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"1.0\"},{\"name\":\"parameters\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"default\":{}},{\"name\":\"annotate\",\"type\":\"boolean\",\"default\":false},{\"name\":\"dataSource\",\"type\":\"DataSource\"}]},{\"type\":\"record\",\"name\":\"Item\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"score\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"Task\",\"fields\":[{\"name\":\"date\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"thanks for using librAIry\"}]}],\"messages\":{\"createTopics\":{\"request\":[{\"name\":\"request\",\"type\":\"TopicsRequest\"}],\"response\":\"Task\"},\"createAnnotations\":{\"request\":[{\"name\":\"request\",\"type\":\"AnnotationsRequest\"}],\"response\":\"Task\"},\"createDocuments\":{\"request\":[{\"name\":\"request\",\"type\":\"DocumentsRequest\"}],\"response\":\"Task\"},\"createItems\":{\"request\":[{\"name\":\"request\",\"type\":\"ItemsRequest\"}],\"response\":{\"type\":\"array\",\"items\":\"Item\"}},\"cleanCache\":{\"request\":[],\"response\":\"Task\"}}}");
  es.upm.oeg.librairy.api.facade.model.avro.Task createTopics(es.upm.oeg.librairy.api.facade.model.avro.TopicsRequest request) throws org.apache.avro.AvroRemoteException;
  es.upm.oeg.librairy.api.facade.model.avro.Task createAnnotations(es.upm.oeg.librairy.api.facade.model.avro.AnnotationsRequest request) throws org.apache.avro.AvroRemoteException;
  es.upm.oeg.librairy.api.facade.model.avro.Task createDocuments(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest request) throws org.apache.avro.AvroRemoteException;
  java.util.List<es.upm.oeg.librairy.api.facade.model.avro.Item> createItems(es.upm.oeg.librairy.api.facade.model.avro.ItemsRequest request) throws org.apache.avro.AvroRemoteException;
  es.upm.oeg.librairy.api.facade.model.avro.Task cleanCache() throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends LibrairyApi {
    public static final org.apache.avro.Protocol PROTOCOL = es.upm.oeg.librairy.api.facade.model.avro.LibrairyApi.PROTOCOL;
    void createTopics(es.upm.oeg.librairy.api.facade.model.avro.TopicsRequest request, org.apache.avro.ipc.Callback<es.upm.oeg.librairy.api.facade.model.avro.Task> callback) throws java.io.IOException;
    void createAnnotations(es.upm.oeg.librairy.api.facade.model.avro.AnnotationsRequest request, org.apache.avro.ipc.Callback<es.upm.oeg.librairy.api.facade.model.avro.Task> callback) throws java.io.IOException;
    void createDocuments(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest request, org.apache.avro.ipc.Callback<es.upm.oeg.librairy.api.facade.model.avro.Task> callback) throws java.io.IOException;
    void createItems(es.upm.oeg.librairy.api.facade.model.avro.ItemsRequest request, org.apache.avro.ipc.Callback<java.util.List<es.upm.oeg.librairy.api.facade.model.avro.Item>> callback) throws java.io.IOException;
    void cleanCache(org.apache.avro.ipc.Callback<es.upm.oeg.librairy.api.facade.model.avro.Task> callback) throws java.io.IOException;
  }
}