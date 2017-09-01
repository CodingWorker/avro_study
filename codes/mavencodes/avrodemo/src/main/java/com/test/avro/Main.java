package com.test.avro;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import java.io.File;
import java.io.IOException;

/**
 * Created by daiya on 2017/9/1.
 */
public class Main {
    public static void main(String[] args)throws Exception{
//        serialize();
//        deserialize();
        testWithoutClass();
    }

    private static void testWithoutClass()throws Exception{
        Schema schema=new Schema.Parser().parse(new File("F:\\my\\mygit\\avro_study\\codes\\mavencodes\\avrodemo\\src\\main\\avscs\\user2.avsc"));

        GenericRecord user1=new GenericData.Record(schema);
        user1.put("name","Daniel");
        user1.put("age",12);
        user1.put("score",100);

        GenericRecord user2=new GenericData.Record(schema);
        user2.put("name","Jack");
        user2.put("age",10);
        user2.put("score",100);

        GenericRecord user3=new GenericData.Record(schema);
        user3.put("name","Lucy");
        user3.put("age",20);
        user3.put("score",100);

        //serialize
        DatumWriter<GenericRecord> datumWriter=new SpecificDatumWriter<GenericRecord>(schema);
        DataFileWriter<GenericRecord> dataFileWriter=new DataFileWriter<GenericRecord>(datumWriter);
        dataFileWriter.create(schema,new File("f:/users2.avro"));
        dataFileWriter.append(user1);
        dataFileWriter.append(user2);
        dataFileWriter.append(user3);
        dataFileWriter.close();
    }

    private static void deserialize()throws IOException{
        DatumReader<User> datumReader=new SpecificDatumReader(User.class);
        DataFileReader<User> dataFileReader=new DataFileReader<User>(new File("f:/users.avro"),datumReader);
        while (dataFileReader.hasNext()){
            User user= dataFileReader.next();
//            System.out.println(user.getName());
            System.out.println(user);
        }

        dataFileReader.close();
    }

    private static void serialize()throws IOException{
        //普通构建
        User user1=new User();
        user1.setName("Daniel");
        user1.setFavoriteNumber(256);

        //使用构造方法
        User user2=new User("jack",12,"red");

        //使用构建者模式
        User user3=User.newBuilder()
                .setName("Charlie")
                .setFavoriteNumber(10)
                .setFavoriteColor(null)
                .build();

        DatumWriter<User> userDatumWriter=new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter=new DataFileWriter<User>(userDatumWriter);
        dataFileWriter.create(user1.getSchema(),new File("f:/users.avro"));
        dataFileWriter.append(user1);
        dataFileWriter.append(user2);
        dataFileWriter.append(user3);
        dataFileWriter.close();
    }
}