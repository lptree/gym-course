package com.letgym.gymcourse.core.logging;


import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import org.bson.Document;
/**
 * @Description:
 * @Author: lptree
 * @Date: Created in 2018/4/15 15:14
 */

public class MongoAppender extends UnsynchronizedAppenderBase<LoggingEvent> {
    private MongoClient mongo;
    private MongoDatabase db;
    private MongoCollection<Document> _collection;

    //写上自己的配置
    private String DbHost  = "127.0.0.3";
    private int DbPort= 27018;
    private String DbName = "logas";
    //private String DbCollectionName_Pre= "logs";
    private String DbCollectionName= "logs_date";
    private String user = "";
    private String pwd= "";

    private MongoCollection<BasicDBObject> logsCollection;

    @Override
    protected void append(LoggingEvent loggingEvent) {
        if(mongo == null) {
            String connectionUrl = String.format("mongodb://%s:%d/%s",  DbHost, DbPort,DbName);
            MongoClientURI connectionString = new MongoClientURI(connectionUrl);
            mongo = new MongoClient(connectionString);
            db = mongo.getDatabase(DbName);
            //_collection = db.getCollection(DbCollectionName);
            logsCollection = db.getCollection(DbCollectionName, BasicDBObject.class);
        }
        String jsonLog = loggingEvent.getFormattedMessage();
        //只将json格式的用户请求信息存入MongoDB，即用户请求信息--这里需要和后面的AOP配合
        if(jsonLog.startsWith("{")){
            BasicDBObject bsonLog = (BasicDBObject) JSON.parse(jsonLog);
            logsCollection.insertOne(bsonLog);
        }
    }

    @Override
    public void stop() {
        if(mongo != null) {
            mongo.close();
        }
    }

    public MongoClient getMongo() {
        return mongo;
    }

    public void setMongo(MongoClient mongo) {
        this.mongo = mongo;
    }

    public MongoDatabase getDb() {
        return db;
    }

    public void setDb(MongoDatabase db) {
        this.db = db;
    }

    public MongoCollection<Document> get_collection() {
        return _collection;
    }

    public void set_collection(MongoCollection<Document> _collection) {
        this._collection = _collection;
    }

    public String getDbHost() {
        return DbHost;
    }

    public void setDbHost(String dbHost) {
        DbHost = dbHost;
    }

    public int getDbPort() {
        return DbPort;
    }

    public void setDbPort(int dbPort) {
        DbPort = dbPort;
    }

    public String getDbName() {
        return DbName;
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    public String getDbCollectionName() {
        return DbCollectionName;
    }

    public void setDbCollectionName(String dbCollectionName) {
        DbCollectionName = dbCollectionName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

//    /// <summary>
//    /// GetCollection
//    /// </summary>
//    /// <returns></returns>
//    private MongoCollection GetCollection()
//    {
//        MongoDatabase database = this.GetDatabase();
//        var collection = database.GetCollection(string.Format("{0}_{1}", this.CollectionName, DateTime.Now.ToString("yyyyMMdd")));
//        if (!collection.IndexExistsByName("_logdate_"))
//        {
//            collection.CreateIndex(new IndexKeysBuilder().Descending("logdate"), new IndexOptionsBuilder().SetName("_logdate_"));
//        }
//        return collection;
//    }
}
