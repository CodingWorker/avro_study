package com.test.avro_study.impl;

import com.test.avro_study.Greeting;
import com.test.avro_study.Hello;
import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.*;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.hadoop.ipc.protocolPB.GenericRefreshProtocolClientSideTranslatorPB;
import sun.awt.windows.ThemeReader;

import javax.lang.model.SourceVersion;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.URL;

/**
 * Created by IntelliJ IDEA
 * Project: my-app-avro-maven
 * User: DaiYan
 * Date: 2017/10/21
 */
public class HelloImpl implements Hello {
    public Greeting hello(Greeting greeting) throws AvroRemoteException {
        System.out.println(greeting.getMsg());
        greeting.setMsg("from server");
        return greeting;
    }
}

class IPCHTTPTest{
    public static void main(String[] args) throws Exception{
        Server server=new HttpServer(new SpecificResponder(Hello.class,new HelloImpl()),8080);
        server.start();

        Thread.sleep(3000);

        HttpTransceiver client=new HttpTransceiver(new URL("http","localhost",8080,""));
        Hello proxy=(Hello)SpecificRequestor.getClient(Hello.class,client);
        Greeting req=new Greeting("from client");
        Greeting resp=proxy.hello(req);
        System.out.println(resp.getMsg());

    }
}

class IPCRPCTest{
    public static void main(String[] args)throws Exception {
        Server server=new NettyServer(new SpecificResponder(Hello.class,new HelloImpl()),new InetSocketAddress(8080));
        server.start();
        Thread.sleep(3000);

        NettyTransceiver client=new NettyTransceiver(new InetSocketAddress(8080));

        //client code attach to server and send msg
        Hello proxy=(Hello) SpecificRequestor.getClient(Hello.class,client);
        Greeting req=new Greeting("from client");
        Greeting resp=proxy.hello(req);
        System.out.println(resp.getMsg());

        client.close();
        server.close();

    }
}
