package com.test.avro_study;

import com.test.avro_study.model.User;
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
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA
 * Project: my-app-avro-maven
 * User: DaiYan
 * Date: 2017/10/21
 */
public class Main {
    public static void maina(String[] args) throws Exception{
        User user0=new User();
        user0.setName("Daniel");
        user0.setFavoriteColor("color-blue");
        user0.setFavoriteNumber(12);

        System.out.println(user0);

        User user1=new User("Daniel",12,"color");
        System.out.println(user1);

        User user2=User.newBuilder()
                .setName("jack")
                .setFavoriteColor("all")
                .setFavoriteNumber(11)
                .build();
        System.out.println(user2);

        File file=new File("./src/main/avsc/user.avro");
        if(!file.exists()) file.createNewFile();
        if(file.exists()){
            DatumWriter<User> userDatumWriter=new SpecificDatumWriter<User>(User.class);
            DataFileWriter<User> dataFileWriter=new DataFileWriter<User>(userDatumWriter);
            dataFileWriter.create(User.getClassSchema(),file);
            dataFileWriter.append(user0);
            dataFileWriter.append(user1);
            dataFileWriter.append(user2);
            dataFileWriter.close();
        }

        //反序列化
        System.out.println("============反序列化===========");
        if(file.exists()){
            DatumReader<User> datumReader=new SpecificDatumReader(User.class);
            DataFileReader<User> dataFileReader=new DataFileReader<User>(file,datumReader);

            while(dataFileReader.hasNext()){
                User user=dataFileReader.next();
                System.out.println(user);
            }

            dataFileReader.close();
        }
    }

    public static void main(String[] args) throws Exception{
        InputStream inputStream=ClassLoader.getSystemResourceAsStream("avsc/person.avsc");
        Schema schema= new Schema.Parser().parse(inputStream);
        GenericRecord person=new GenericData.Record(schema);
        person.put("name","Daniel");
        person.put("age",12);
        person.put("email","email@example.com");

        File file=new File("./src/main/resources/data/person.avro");
        if(!file.exists()) file.createNewFile();
        if(file.exists()){
           DatumWriter datumWriter=new SpecificDatumWriter(schema);//新文件创建，否则直接append
           DataFileWriter dataFileWriter=new DataFileWriter(datumWriter);
           dataFileWriter.create(schema,file);
           dataFileWriter.append(person);
           dataFileWriter.close();
        }

        if(file.exists()){
            DatumReader datumReader=new SpecificDatumReader(schema);
            DataFileReader dataFileReader=new DataFileReader(file,datumReader);
            while(dataFileReader.hasNext()){
                GenericRecord inPerson=(GenericRecord)dataFileReader.next();
                System.out.println(inPerson);
                System.out.println(inPerson.get("name"));
                System.out.println(inPerson.get("age"));
                System.out.println(inPerson.get("email"));
            }
        }
    }
}
